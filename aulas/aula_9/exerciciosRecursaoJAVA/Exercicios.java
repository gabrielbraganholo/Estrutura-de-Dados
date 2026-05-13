package aula_9.exerciciosRecursaoJAVA;

import java.util.ArrayList;
import java.util.Random;

/*
    Faça métodos recursivos que:

1) receba uma lista, seu tamanho, valor de pesquisa. Caso o valor de pesquisa ocorra na lista, retornar quantas vezes ele aparece

2) receba uma lista, seu tamanho, valor de pesquisa, valor de substituição. Caso o valor ocorra na lista, substituir o valor de pesquisa pelo valor de substituição

3) receba uma lista, seu tamanho e retorne TRUE se a lista ordenada, FALSE se a lista desordenada

4) receba uma lista e seu tamanho. O método deve exibir todos os números múltiplos de 4

 */

public class Exercicios {

    public static void  popular(ArrayList<Integer> lista, int quantidade){
        Random random = new Random();
        int numero;

        for(int i = 0; i < quantidade; i++){
            numero = random.nextInt(7);
            lista.add(i, numero);
        }
    }

    public static void exibir(ArrayList<Integer> lista){
        for (Integer i : lista) {
            System.out.println(i);
        }
    }

    static int quantidadeEmListaR(ArrayList<Integer> lista, int tamanho, int pesquisa) {
        if(tamanho > 0){
            if(lista.get(tamanho - 1) == pesquisa){
                int soma = 1 + quantidadeEmListaR(lista, tamanho - 1, pesquisa);
                return soma;
            }
            else{
                int soma = quantidadeEmListaR(lista, tamanho - 1, pesquisa);
                return soma;
            }
        }
        return 0;
    }

    static void substituirElementoR(ArrayList<Integer> lista, int tamanho, int pesquisa, int substituto) {
        if(tamanho > 0){
            if(lista.get(tamanho - 1) == pesquisa){
                lista.set(tamanho - 1, substituto);
                substituirElementoR(lista, tamanho - 1, pesquisa, substituto);
            }
            else{
                substituirElementoR(lista, tamanho - 1, pesquisa, substituto);
            }
        }
    }

    static boolean verificarOrdenadaCrescenteR(ArrayList<Integer> lista, int tamanho){
        if(tamanho > 1){
            if(lista.get(tamanho - 1) >= lista.get(tamanho - 2)){
                return verificarOrdenadaCrescenteR(lista, tamanho - 1);
            }
            else{
                return false;
            }
        }

        return true;
    }

    static boolean verificarOrdenadaDecrescenteR(ArrayList<Integer> lista, int tamanho){
        if(tamanho > 1){
            if(lista.get(tamanho - 1) <= lista.get(tamanho - 2)){
                return verificarOrdenadaDecrescenteR(lista, tamanho - 1);
            }
            else{
                return false;
            }
        }

        return true;
    }


    static void exibirMultiplosR(ArrayList<Integer> lista, int tamanho, int analizador){
        if(tamanho > 0) {
            if (lista.get(tamanho - 1) % analizador == 0  && lista.get(tamanho - 1) != 0) {
                System.out.println(lista.get(tamanho - 1));
                exibirMultiplosR(lista, tamanho - 1, analizador);
            } else {
                exibirMultiplosR(lista, tamanho - 1, analizador);
            }
        }
    }

    static void ordenarCrescente(ArrayList<Integer> lista, int tamanho){
        for(int i = 0; i < tamanho; i++){
            for(int j = i + 1; j < tamanho; j++){
                if(lista.get(i) > lista.get(j)){
                    int temp = lista.get(i);

                    lista.set(i, lista.get(j));
                    lista.set(j, temp);
                }
            }
        }
    }

    static void ordenarDecrescente(ArrayList<Integer> lista, int tamanho){
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                if(lista.get(i) > lista.get(j)){
                    int temp = lista.get(i);

                    lista.set(i, lista.get(j));
                    lista.set(j, temp);
                }
            }
        }
    }


    static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        int pesquisa = 1;
        int substituto = 10;
        int analizador = 2;

        popular(lista, 15);
        exibir(lista);
        System.out.println("\nQuantidade de vezes que o " + pesquisa + " aparece: " + quantidadeEmListaR(lista, lista.size(), pesquisa) + "\n");

        substituirElementoR(lista, lista.size(), pesquisa, substituto);
        exibir(lista);

        //verificarOrdenadaR(lista, lista.size());

        System.out.println("\nMultiplos de " + analizador + ":");
        exibirMultiplosR(lista, lista.size(), analizador);

        System.out.println("\nLista crescente: "+verificarOrdenadaCrescenteR(lista, lista.size()));
        System.out.println("Lista decrescente: "+verificarOrdenadaDecrescenteR(lista, lista.size()) + "\n");

        ordenarCrescente(lista, lista.size());
        exibir(lista);
        System.out.println("\nLista crescente: "+verificarOrdenadaCrescenteR(lista, lista.size()));
        System.out.println("Lista decrescente: "+verificarOrdenadaDecrescenteR(lista, lista.size()) + "\n");

        ordenarDecrescente(lista, lista.size());
        exibir(lista);
        System.out.println("\nLista crescente: "+verificarOrdenadaCrescenteR(lista, lista.size()));
        System.out.println("Lista decrescente: "+verificarOrdenadaDecrescenteR(lista, lista.size()));
    }
}
