package aula_6.colecoesJAVA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ficha {
    static void main(String[] args) {
        Queue<Integer> filaNormal = new LinkedList<>();
        Queue<Integer> filaPrioritaria = new LinkedList<>();
        int contarNormal = 0;
        int contarPrioritario = 500;
        int totalAtendimentos = 0;

        Scanner sc = new Scanner(System.in);
        String opcao = "";

        do {
            System.out.println("------MENU------\n1 - Ficha Normal\n2 - Ficha Prioritária\n3 - Chamar Ficha\n4 - Mostrar Ficha\n5 - Sair");
            opcao = sc.nextLine();

            switch (opcao){
                case "1":
                    System.out.println("Gerando ficha normal...");
                    break;
                case "2":
                    System.out.println("Gerando ficha prioritária...");
                    break;
                case "3":
                    System.out.println("Chamando ficha...");
                    break;
                case "4":
                    System.out.println("Mostrando fichas faltantes...");
                    break;
                case "5":
                    System.out.println("Sistema fechando...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (!opcao.equals("5"));
    }
}
