package aula_6.colecoesJAVA;

import java.util.*;

public class main {
    static void main(String[] args){

        Stack<Integer> pilha = new Stack<>();
        pilha.push(15);
        pilha.push(45);
        pilha.push(100);
        pilha.push(5);

        System.out.println(pilha);
        pilha.pop(); // comando somente da pilha -> remove o último adicionado

        System.out.println(pilha.contains(5)); // vai mostrar false
        System.out.println("Topo da pilha é: " +pilha.peek());

        //  exemplo simples para list no mesmo estilo
        List<Integer> lista = new ArrayList<>();
        lista.add(15);
        lista.add(45);
        lista.add(100);
        lista.add(5);

        System.out.println(lista);
        lista.remove(lista.size() - 1); // remove o último adicionado
        System.out.println(lista);

        lista.add(5);
        System.out.println(lista);
        lista.removeLast();
        System.out.println(lista);

        System.out.println(lista.contains(5)); //false
        System.out.println("Último da lista é: " + lista.getLast());

        Queue<Integer> fila = new LinkedList<>();
        pilha.add(15);
        pilha.add(45);
        pilha.add(100);
        pilha.add(5);
        //fila.sort(null); transformaria a fila em uma lista praticamente
        System.out.println(fila);

    }
}
