package aula_8.recursaoJAVA;

import aula_7.MatrizesEspeciais.Dados;

import java.util.ArrayList;

public class Recursao {

    static void mostrarSequenciaDecrescenteR(int numero){
        if(numero >= 0){
            System.out.println(numero);
            mostrarSequenciaDecrescenteR(numero - 1);
        }
    }

    static void mostrarSequenciaCrescenteR(int numero){
        if(numero >= 0){
            mostrarSequenciaCrescenteR(numero - 1);
            System.out.println(numero);
        }
    }

    static void mostrarIntervaloR(int ini, int fim){
        if (ini <= fim){
            System.out.println(ini);
            mostrarIntervaloR(ini + 1, fim);
        }
    }

    static void mostrarListaR(ArrayList<Integer> lista, int tamanhoLista){
        if (tamanhoLista > 0){
            mostrarListaR(lista, tamanhoLista - 1);
            if(lista.get(tamanhoLista - 1) % 2 == 0){
                System.out.println(lista.get(tamanhoLista - 1));
            }
        }
    }

    static void subistiruirR(ArrayList<Integer> lista, int tamanhoLista, int substituido, int escolhido){
        if (tamanhoLista > 0){
            subistiruirR(lista, tamanhoLista - 1, substituido, escolhido);
            if(lista.get(tamanhoLista - 1) == substituido){
                System.out.println(escolhido);
            }
            else{
                System.out.println(lista.get(tamanhoLista - 1));
            }
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        // mostrarSequenciaCrescente(numero);   // mostrar a sequencia de 0 até o número
        // mostrarSequenciaDecrescente(numero); // mostrar a sequencia do número até o 0

        //mostrarIntervaloR(3, 6);

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(30);
        lista.add(41);
        lista.add(50);

        //mostrarListaR(lista, lista.size());

        subistiruirR(lista, lista.size(), 30, 100);
    }
}
