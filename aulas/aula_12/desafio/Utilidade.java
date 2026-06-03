package aula_12.desafio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Utilidade {
    static ArrayList<String> extrairVertices(String base) {
        ArrayList<String> vertices = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(new FileReader(base, StandardCharsets.UTF_8))) {

            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] vertice = linha.split(",");

                if (!vertices.contains(vertice[0])) {
                    vertices.add(vertice[0]);
                } else if (!vertices.contains(vertice[1])) {
                    vertices.add(vertice[1]);
                }
            }

            vertices.sort(String::compareTo);

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
            System.exit(1);
        }

        return vertices;
    }

    static Grafo extrairArestas(String base) {
        ArrayList<String> vertices = new ArrayList<>();
        Grafo grafo = new Grafo(extrairVertices(base));

        try (BufferedReader leitor = new BufferedReader(new FileReader(base, StandardCharsets.UTF_8))) {

            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] vertice = linha.split(",");

                grafo.inserirAresta(grafo.pegarIndice(vertice[0]), grafo.pegarIndice(vertice[1]));
            }

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
            return null;
        }

        return grafo;
    }
}
