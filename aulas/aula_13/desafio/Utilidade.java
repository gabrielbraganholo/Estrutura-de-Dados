package aula_13.desafio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Utilidade {

    /**
     * Função estática que extrai as arestas de um arquivo
     * @param base caminho do arquivo que vai ser passado para função interna
     * @return retorna um grafo com os devidos vertices, arestas e custos
     */
    static Grafo extrairArestas(String base) {
        ArrayList<String> vertices = extrairVertices(base);
        Grafo grafo = new Grafo(vertices);

        ArrayList<String> linhas = leitor(base);

        assert linhas != null;
        for (String linha : linhas) {
            String[] vertice = linha.split(",");

            grafo.inserirAresta(grafo.pegarIndice(vertice[0]), grafo.pegarIndice(vertice[1]), Integer.parseInt(vertice[2]));
        }

        return grafo;
    }

    /**
     * Função estática que extrai as linhas de um arquivo .csv
     * @param base caminho do arquivo a ser extraido
     * @return retorna um ArrayList com as linhas do arquivo base
     */
    static ArrayList<String> leitor (String base) {
        ArrayList<String> linhas = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(new FileReader(base, StandardCharsets.UTF_8))) {

            String linha;
            while ((linha = leitor.readLine()) != null) {
                if (!linhas.contains(linha)) {
                    linhas.add(linha);
                }
            }

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
            return null;
        }

        return linhas;
    }

    /**
     * Função estática que extrai vértices a partir de uma lista de linhas
     * @param base caminho do arquivo que vai ser passada para função interna
     * @return retorna um ArrayList de vértices
     */
    static ArrayList<String> extrairVertices(String base) {

        ArrayList<String> linhas = leitor(base);
        ArrayList<String> vertices = new ArrayList<>();

        assert linhas != null;
        for (String linha : linhas) {
            String[] vertice = linha.split(",");

            if (!vertices.contains(vertice[0])) {
                vertices.add(vertice[0]);
            }
            if (!vertices.contains(vertice[1])) {
                vertices.add(vertice[1]);
            }
        }
        vertices.sort(String::compareTo);

        return vertices;
    }
}
