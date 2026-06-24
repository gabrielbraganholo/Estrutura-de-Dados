package trabalho_03;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            int opcao;

            final String REPETIDAS_PESSOAIS = "trabalhos/trabalho_03/figuras_repetidas_pessoais.csv";
            final String DESEJADAS_PESSOAIS = "trabalhos/trabalho_03/figuras_desejadas_pessoais.csv";

            final String REPETIDAS_OUTRO = "trabalhos/trabalho_03/figuras_repetidas_outro.csv";
            final String DESEJADAS_OUTRO = "trabalhos/trabalho_03/figuras_desejadas_outro.csv";

            TreeSet<Figura> repetidasPessoais = Utilidades.popularArvore(REPETIDAS_PESSOAIS);
            TreeSet<Figura> desejadasPessoais = Utilidades.popularArvore(DESEJADAS_PESSOAIS);

            TreeSet<Figura> repetidasOutro = Utilidades.popularArvore(REPETIDAS_OUTRO);
            TreeSet<Figura> desejadasOutro = Utilidades.popularArvore(DESEJADAS_OUTRO);

            System.out.println("""
        ╔══════════════════════════════════════════════════╗
        ║              ÁLBUM DE FIGURINHAS                 ║
        ╠══════════════════════════════════════════════════╣
        ║ 1 - Cadastrar figurinhas repetidas pessoais      ║
        ║ 2 - Listar figurinhas repetidas pessoais         ║
        ║ 3 - Cadastrar figurinhas desejadas pessoais      ║
        ║ 4 - Listar figurinhas desejadas pessoais         ║
        ║ 5 - Carregar repetidas de outro colecionador     ║
        ║ 6 - Carregar desejadas de outro colecionador     ║
        ║ 7 - Sair                                         ║
        ╚══════════════════════════════════════════════════╝
        """);

            do {

                System.out.print("Digite uma opção: ");

                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {

                    case 1:
                        Utilidades.cadastrarFigurinhas(repetidasPessoais);
                        break;

                    case 2:
                        Utilidades.listarFiguras(repetidasPessoais);
                        break;

                    case 3:
                        Utilidades.cadastrarFigurinhas(desejadasPessoais);
                        break;

                    case 4:
                        Utilidades.listarFiguras(desejadasPessoais);
                        break;

                    case 5:
                        System.out.println("\nRepetidas do outro colecionador:");
                        Utilidades.listarFiguras(repetidasOutro);

                        System.out.println("\nFiguras que dão match com suas desejadas:");
                        Utilidades.match(repetidasOutro, desejadasPessoais);
                        break;

                    case 6:
                        System.out.println("\nDesejadas do outro colecionador:");
                        Utilidades.listarFiguras(desejadasOutro);

                        System.out.println("\nSuas repetidas que dão match com as desejadas dele:");
                        Utilidades.match(repetidasPessoais, desejadasOutro);
                        break;

                    case 7:
                        System.out.println("Encerrando o programa...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            } while (opcao != 7);

            sc.close();

        } catch (Exception e) {

            System.out.println("Detalhes: " + e.getMessage());

        }
    }
}
