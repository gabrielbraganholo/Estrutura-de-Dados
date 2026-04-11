package aula_7;

import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String cpf, nome;
        Aluno alunoTMP;
        boolean flagSair;

        do {
            do {
                System.out.print("Digite o cpf: ");
                cpf = teclado.nextLine().toUpperCase();
                if (cpf.equals("FIM")) {
                    alunos.sort((a1, a2) -> a1.getNome().compareTo(a2.getNome()));
                    System.out.println("Alunos cadastrados....");
                    for (Aluno a : alunos) {
                        System.out.println(a);
                    }
                    System.exit(1);
                }
                if (Utils.cpfValido(cpf)) {
                    break;
                } else {
                    System.out.println("CPF invalido!!!");
                }
            } while (true);
            System.out.print("Nome: ");
            nome = teclado.nextLine().toLowerCase();
            alunoTMP = new Aluno(cpf, nome);
            if (!alunos.contains(alunoTMP)) {
                alunos.add(alunoTMP);
            } else {
                System.out.println("Aluno com este cpf ja cadastrado!!");
            }
        } while (true);
    }
}
