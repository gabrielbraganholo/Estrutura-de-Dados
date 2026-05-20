package trabalho_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeSet;
import trabalho_03.Figura;

public class Utilidades {


    public TreeSet<Figura> popularArvore(String base){
        TreeSet<Figura> tree = new TreeSet<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(base));

            String linha;

            while((linha = br.readLine()) != null) {
                String[] partes =  linha.split(",");

                String nomeSelecao = partes[0];
                String nomeFigura = partes[1];
                String descricao = partes[2];
                int quantidade = Integer.parseInt(partes[3]);
                boolean rara = Boolean.parseBoolean(partes[4]);

                Figura figura = new Figura(nomeSelecao, nomeFigura, descricao, quantidade, rara);

                tree.add(figura);
            }
        }
        catch(Exception e) {
            System.out.println("Erro ao ler arquivo");
        }

        return tree;
    }

    public void cadastrarFigurinhas(TreeSet<Integer> tree) {

    }
}
