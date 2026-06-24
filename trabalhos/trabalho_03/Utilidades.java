package trabalho_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeSet;
import trabalho_03.Figura;

public class Utilidades {


    public static TreeSet<Figura> popularArvore(String base){
        TreeSet<Figura> tree = new TreeSet<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(base));

            String linha;

            while((linha = br.readLine()) != null) {
                String[] partes =  linha.split(",");

                String nomeSelecao = partes[0];
                int numeroFigura = Integer.parseInt(partes[1]);
                String descricao = partes[2];
                int quantidade = Integer.parseInt(partes[3]);
                boolean rara = Boolean.parseBoolean(partes[4]);

                Figura figura = new Figura(nomeSelecao, numeroFigura, descricao, quantidade, rara);

                verificarQuantidade(tree, figura, quantidade);
            }
        }
        catch(Exception e) {
            System.out.println("Erro ao ler arquivo");
            e.printStackTrace();
        }

        return tree;
    }

    public static void verificarQuantidade(TreeSet<Figura> tree, Figura figura, int quantidade){
        Figura existente = tree.floor(figura);

        if (existente != null && existente.compareTo(figura) == 0) {
            existente.setQuantidade(existente.getQuantidade() + quantidade);
        } else {
            tree.add(figura);
        }
    }

    public static void cadastrarFigurinhas(TreeSet<Figura> tree) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o COMPLETO EM PORTUGUÊS da seleção");
        String nomeSelecao = sc.nextLine();

        if (!nomeSelecao.isBlank()) {
            nomeSelecao = nomeSelecao.substring(0, 1).toUpperCase() + nomeSelecao.substring(1).toLowerCase();
        } else {
            nomeSelecao = null;
        }

        System.out.println("Digite o número da figura:");
        int numeroFigura = sc.nextInt();
        sc.nextLine(); // limpa o Enter

        System.out.println("Digite a descrição da figura:");
        String descricao = sc.nextLine();

        System.out.println("Digite a quantidade:");
        int quantidade = sc.nextInt();

        System.out.println("A figura é rara? (true/false)");
        boolean rara = sc.nextBoolean();

        Figura figura = new Figura(nomeSelecao, numeroFigura, descricao, quantidade, rara);

        verificarExistencia(tree, figura);
    }

    public static void verificarExistencia(TreeSet<Figura> tree, Figura figura) {

        Figura existente = tree.floor(figura);

        if (existente != null && existente.compareTo(figura) == 0) {
            existente.setQuantidade(existente.getQuantidade() + figura.getQuantidade());
        } else {
            tree.add(figura);
        }
    }

    public static void match(TreeSet<Figura> tree_procurar, TreeSet<Figura> tree_desejada) {
        boolean flag = false;

        for (Figura figura : tree_procurar) {
            if (tree_desejada.contains(figura)) {
                System.out.println(figura);
                flag = true;
            }
        }

        if (!flag) {
            System.err.println("Nenhum figura foi encontrada");
        }
    }

    public static void listarFiguras(TreeSet<Figura> tree) {

        for (Figura figura : tree) {
            System.out.println(figura);
        }
    }
}
