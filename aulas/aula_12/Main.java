package aula_12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> vertices = new ArrayList<>();

        vertices.add("a");
        vertices.add("b");
        vertices.add("c");
        vertices.add("d");
        vertices.add("e");

        Grafo gAssimetrico = new Grafo(vertices);
        gAssimetrico.mostrarMatriz();

        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("a"), gAssimetrico.pegarIndice("b"));
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("a"), gAssimetrico.pegarIndice("c"));
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("a"), gAssimetrico.pegarIndice("d"));
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("b"), gAssimetrico.pegarIndice("e"));
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("c"), gAssimetrico.pegarIndice("a"));
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("d"), gAssimetrico.pegarIndice("b"));
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("d"), gAssimetrico.pegarIndice("c"));
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("e"), gAssimetrico.pegarIndice("d"));

        System.out.println();
        gAssimetrico.mostrarMatriz();
        System.out.println();
        gAssimetrico.mostrarGrafo();
    }
}
