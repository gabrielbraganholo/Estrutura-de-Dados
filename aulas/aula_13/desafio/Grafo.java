package aula_13.desafio;

import java.util.ArrayList;

public class Grafo {
    int matrizADJ[][];
    int qtdVertices;
    ArrayList<String> vertices;

    /**
     * construtor
     * @param vertices para indicar a quantidade de linhas e colunas da matriz
     */
    public Grafo(ArrayList<String> vertices) {
        this.vertices = new ArrayList<>();
        this.vertices.addAll(vertices); // passagens por clonagem
        this.qtdVertices = vertices.size();
        this.matrizADJ = new int[qtdVertices][qtdVertices];

        //inicializar com 0 a matriz que representa o grafo
        for(int i = 0; i < qtdVertices; i++) {
            for(int j = 0; j < qtdVertices; j++) {
                this.matrizADJ[i][j] = 0;
            }
        }
    }

    /**
     * Exibe a matrizADJ do grafo em formato de matriz
     */
    void mostrarMatriz() {
        for (String v : vertices){
            System.out.print("   " + v);
        }
        System.out.println();
        for(int i = 0; i < qtdVertices; i++) {
            System.out.print(this.vertices.get(i) + "  ");
            for(int j = 0; j < qtdVertices; j++) {
                System.out.print(this.matrizADJ[i][j] + "   ");
            }
            System.out.println();
        }
    }

    /**
     * Exibe as arestas do grafo
     */
    void mostrarGrafo() {
        for(int i = 0; i < this.qtdVertices; i++) {
            System.out.print(this.vertices.get(i) + ":  ");
            for(int j = 0; j < this.qtdVertices; j++) {
                if (this.matrizADJ[i][j] != 0) {
                    System.out.print(this.vertices.get(j) + "(" +  this.matrizADJ[i][j] + ")  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Retorna o indice na lista de vértices de um vértice
     * @param vertice vertice / nó / nodo
     * @return posição do vertice
     */
    int pegarIndice(String vertice) {
        return vertices.indexOf(vertice);
    }

    /**
     * Dado uma origem e destino é definida uma aresta
     * @param origem representa a linha
     * @param destino representa a coluna
     */
    void inserirAresta(int origem, int destino, int custo) {
        if(this.matrizADJ[origem][destino] == 0){
            this.matrizADJ[origem][destino] = custo;
        }
    }
}
