/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BikeAPP;

import static BikeAPP.Aluguel.DIARIA;
import static BikeAPP.Aluguel.MENSAL;
import java.util.Scanner;

/**
 *
 * @author GUIGAS
 */
public class AluguelEstudante extends Aluguel {
        public static final double DESCONTO = 0.50;

        public static double calcularDiaria() {
            return DIARIA * (1 - DESCONTO);
    }

        public static double calcularMensal() {
            return MENSAL * (1 - DESCONTO);
    }

        public static double escolherOpcaoEstudante() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Opções de Aluguel para Estudante:");
            System.out.println("1. R$ " + calcularDiaria() + " por dia");
            System.out.println("2. R$ " + calcularMensal() + " por mês");
            System.out.print("Escolha a opção (1 ou 2): ");
            int opcao = scanner.nextInt();
        
            switch (opcao) {
                case 1:
                    return calcularDiaria();
                case 2:
                    return calcularMensal();
                default:
                    System.out.println("Opção inválida.");
                    return escolherOpcaoEstudante();
            }
        }
        
        
    }
