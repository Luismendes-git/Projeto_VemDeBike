/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BikeAPP;

import java.util.Scanner;
import BikeAPP.SistemaBikeAluguel;
import static BikeAPP.SistemaBikeAluguel.registrarEstudante;
import static BikeAPP.SistemaBikeAluguel.registrarUsuario;


public class Aluguel {
    public static final double DIARIA = 4.00;
    public static final double MENSAL = 100.00;

    public static double escolherOpcao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opções de Aluguel:");
        System.out.println("1. R$ 4,00 por dia");
        System.out.println("2. R$ 100,00 por mês");
        System.out.print("Escolha a opção (1 ou 2): ");
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                return DIARIA;
            case 2:
                return MENSAL;
            default:
                System.out.println("Opção inválida.");
                return escolherOpcao();
        }
    }
    
       
}
