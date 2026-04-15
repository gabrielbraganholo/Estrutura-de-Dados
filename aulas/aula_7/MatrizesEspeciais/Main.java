package aula_7.MatrizesEspeciais;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int dimencao = 10;

        int matriz[][] = new int[dimencao][dimencao];

        matriz[2][4] = 1;
        matriz[1][9] = 1;
        matriz[4][7] = 1;
        matriz[1][2] = 1;
        matriz[2][5] = 1;

        Matrizes.inicialMatrizInteiro(matriz, dimencao, dimencao);
        Matrizes.exibirMatriz(matriz, dimencao, dimencao);

        List<Dados> matrizEspecial = new ArrayList<>();
        Matrizes.converter(matriz, dimencao, dimencao, matrizEspecial);

        Matrizes.exibirLista(matrizEspecial);
    }
}
