package aula_12.desafio;

public class Main {
    public static void main(String[] args) {
        // Troque para o caminho adequado do arquivo caso tente rodar em outra máquina
        String base = "C:/arquivos github/Estrutura-de-Dados/aulas/aula_12/desafio/mapa.csv";

        Grafo grafo = Utilidade.extrairArestas(base);

        if (grafo != null) {
            System.out.println("Matriz: ");
            grafo.mostrarMatriz();
            System.out.println();

            System.out.println("Grafo: ");
            grafo.mostrarGrafo();
        }
    }
}
