package aula_13.desafio;

public class Main {
    public static void main(String[] args) {
        // Troque para o caminho adequado do arquivo caso tente rodar em outra máquina
        String base = "C:/arquivos github/Estrutura-de-Dados/aulas/aula_13/desafio/mapa.csv";

        Grafo grafo = Utilidade.extrairArestas(base);

        System.out.println("--------------------Grafo--------------------");
        grafo.mostrarGrafo();
    }
}
