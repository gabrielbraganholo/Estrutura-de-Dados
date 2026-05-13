package aula_9.continuacaoRecursaoJAVA;

// Recursão é um recurso computacional de programação que substitui as instruções de repetição
// Toda repetição obedece a 3 pontos:
// 1 - Inicialização de variável de controle
// 2 - Teste de parada com a variável de controle
// 3 - Transformação da variável de controole

import java.util.ArrayList;
import java.util.Random;

public class Recursao {
    public static void  popular(ArrayList<Integer> lista, int quantidade){
        Random random = new Random();
        int numero;

        for(int i = 0; i < quantidade; i++){
            numero = random.nextInt(100);
            lista.add(i, numero);
        }
    }

    public static void exibir(ArrayList<Integer> lista){
        for (Integer i : lista) {
            System.out.println(i);
        }
    }

    public static void exibirR(ArrayList<Integer> lista, int tamanho){
        if (tamanho > 0) {
            // código antes do empilhamento
            //System.out.println(lista.get(tamanho -1);     -> printa de trás pra frente da lista
            exibirR(lista, tamanho - 1);
            //código depois do empilhamento
            System.out.println(lista.get(tamanho - 1));  // -> printa na ordem da lista
        }
    }

    static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        int quantidade = 5;
        popular(lista, quantidade);
        //exibir(lista);
        exibirR(lista, lista.size());
    }
}
