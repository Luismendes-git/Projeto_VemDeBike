/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BikeAPP;

import java.util.Scanner;

public class User {
    private String nome;
    private String cpf;
    private String telefone;
    

    public User(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
       
    }
   
    public String getNome() {
        return nome;
    }
    
   
    
}
