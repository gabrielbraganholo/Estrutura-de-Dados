package aula_6.colecoesJAVA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ficha {
    public static void main(String[] args) {
        Queue<Integer> filaNormal = new LinkedList<>();
        Queue<Integer> filaPrioritaria = new LinkedList<>();
        int contarNormal = 0;
        int contarPrioritario = 500;
        int totalAtendimentos = 0;

        Scanner sc = new Scanner(System.in);
        String opcao = "";
        String qualFila;

        do {
            System.out.println("------MENU------\n1 - Ficha Normal\n2 - Ficha Prioritária\n3 - Chamar Ficha\n4 - Mostrar Ficha\n5 - Sair");
            opcao = sc.nextLine();

            switch (opcao){
                case "1":
                    System.out.println("Gerando ficha normal...");
                    filaNormal.offer(contarNormal);
                    contarNormal++;
                    break;

                case "2":
                    System.out.println("Gerando ficha prioritária...");
                    filaPrioritaria.offer(contarPrioritario);
                    contarPrioritario++;
                    break;

                case "3":
                    int fichaAtendida = -1;
                    System.out.println("Chamando ficha...");

                    if (totalAtendimentos % 3 == 0) // a cada 3 chamadas prioritárias chama 1 normal
                    {
                        qualFila = "PRIORITARIA";
                    }
                    else // chamar normal
                    {
                        qualFila = "NORMAL";
                    }

                    //PELO NUMERO DE ATENDIMENTO EM PRIORITARIA
                    if(qualFila.equals("PRIORITARIA") && !filaPrioritaria.isEmpty())
                    {
                        fichaAtendida = filaPrioritaria.poll();
                        totalAtendimentos++;
                    }
                    //PELO NUMERO DE ATENDIMENTO EM NORMAL
                    else if (qualFila.equals("NORMAL") && !filaNormal.isEmpty())
                    {
                        fichaAtendida = filaNormal.poll();
                        totalAtendimentos++;
                    }
                    //QUANDO NORMAL ESTÁ VAZIO CHAMA TODOS OS PRIORITARIOS
                    else if (qualFila.equals("NORMAL") && filaNormal.isEmpty() && !filaPrioritaria.isEmpty())
                    {
                        qualFila = "PRIORITARIA";
                        fichaAtendida = filaPrioritaria.poll();
                        totalAtendimentos++;
                    }

                    if (fichaAtendida != -1)
                    {
                        System.out.println("Chamando ficha: " + qualFila + ": " + fichaAtendida);
                    }
                    else
                    {
                        System.out.println("Ninguém para ser atendido");
                    }
                    break;

                case "4":
                    System.out.println("Mostrando fichas faltantes...");
                    int totalNormalFaltantes = filaNormal.size();
                    int totalPrioritariaFaltantes = filaPrioritaria.size();

                    System.out.println("Fila normal: "+ filaNormal);
                    System.out.println("Total de fichas faltando: "+ totalNormalFaltantes);

                    System.out.println("Fila prioritária: "+filaPrioritaria);
                    System.out.println("Total de fichas faltando: "+ totalPrioritariaFaltantes);
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
