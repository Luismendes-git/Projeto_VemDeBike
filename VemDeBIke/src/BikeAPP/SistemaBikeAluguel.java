/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BikeAPP;

import BikeAPP.Estudante;
import BikeAPP.User;
import BikeAPP.Cartao;
import java.util.Scanner;

public class SistemaBikeAluguel {
    
    public static User registrarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        return new User(nome, cpf, telefone);
        
        
    }
    
    public  static Estudante registrarEstudante(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Carteira: ");
        String carteira = scanner.nextLine();
        
        return new Estudante(nome, cpf, telefone, carteira);
                
    }
    
    public static Cartao registrarCartao(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome do Tilular: ");
        String titular = scanner.nextLine();
        System.out.print("Numero do Cartão: ");
        String Numero = scanner.nextLine();
        System.out.print("Validade: ");
        String validade = scanner.nextLine();
        System.out.print("CVC: ");
        String cvc = scanner.nextLine();
        
        return new Cartao(titular, Numero, validade, cvc);
    }
    
    
    public static boolean tipo() {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Você é estudante? (sim/não):");
        
        String opcao = scanner.nextLine().trim().toLowerCase();  
        // Verifica a resposta do usuário
        if (opcao.equals("sim")) {
            
                registrarEstudante();
                return true; 
        }   else if (opcao.equals("não")) {
                registrarUsuario();
                return false;
        }   else {

            System.out.println("Resposta inválida. Por favor, digite 'sim' ou 'não'.");
            return tipo();  
            }
       
        
        }
    
    


    public static void main(String[] args){
        System.out.println("Bem-vindo ao Vem De Bike!");
        System.out.println("Inicie o seu cadastro.");
        boolean tipo = tipo();
        System.out.println("Insira os dados do Cartão:");
        Cartao cartao = registrarCartao();
        
        if(tipo){
            double valorAluguel = AluguelEstudante.escolherOpcaoEstudante();
        } else{
            double valorAluguel = Aluguel.escolherOpcao();
        }
        
        System.out.println("Reserva registrada com sucesso!" );
       
    }
}
