/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BikeAPP;

/**
 *
 * @author GUIGAS
 */
public class Estudante extends User {
        
        private final String carteira;
        
        public Estudante(String nome, String cpf, String telefone, String carteira) {
            super(nome, cpf,telefone);
            this.carteira = carteira;
           
        }
    public String getCarteira() {
        return carteira;
    }    
    }
