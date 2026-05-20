package aula_9.exerciciosRecursaoJAVA;

import java.util.ArrayList;

public class TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<Integer> tree = new java.util.TreeSet<>();
        ArrayList<Integer> lista = new ArrayList<>();
        int quantidade = 10000000;

        long inicio = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            int numero = (int) (Math.random() * quantidade);
            tree.add(numero);
        }
        long fim = System.currentTimeMillis();
        long tempoDecorrido = fim - inicio;
        System.out.println("Tempo de execução em tree: " + tempoDecorrido + " ms");

        inicio = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            int numero = (int) (Math.random() * quantidade);
            lista.add(numero);
        }
        fim = System.currentTimeMillis();
        tempoDecorrido = fim - inicio;
        System.out.println("Tempo de execução lista: " + tempoDecorrido + " ms");

        //pesquisando na árvore
        inicio = System.currentTimeMillis();
        System.out.println("Verificando se o número -9 está presente na árvore: " + tree.contains(-9));
        fim = System.currentTimeMillis();
        tempoDecorrido = fim - inicio;
        System.out.println("Tempo de execução de pesquisa em árvore: " + tempoDecorrido + " ms");

        //pesquisando na lista
        inicio = System.currentTimeMillis();
        System.out.println("Verificando se o número -9 está presente na lista: " + lista.contains(-9));
        fim = System.currentTimeMillis();
        tempoDecorrido = fim - inicio;
        System.out.println("Tempo de execução de pesquisa em lista: " + tempoDecorrido + " ms");
    }
}
