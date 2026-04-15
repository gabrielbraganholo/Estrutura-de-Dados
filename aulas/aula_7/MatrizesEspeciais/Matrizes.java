package aula_7.MatrizesEspeciais;

import java.util.List;

public class Matrizes {
    /**
     * método de classe que inicializa com zero a matriz
     * @param matriz - matriz de inteiros que será inicializada com zeros
     * @param linhas - quantidade de linhas da matriz
     * @param colunas - quantidade de colunas da matriz
     */
    public static void inicialMatrizInteiro(int matriz[][], int linhas, int colunas) {
        for (int lin = 0; lin < linhas; linhas++) {
            for (int col = 0; col < colunas; col++) {
                matriz[lin][col] = 0;
            }
        }
    }

    /**
     * método de classe que exibe uma matriz
     * @param matriz - matriz de inteiros que será exibida
     * @param linhas - quantidade de linhas da matriz
     * @param colunas - quantidade de colunas da matriz
     */
    public static void exibirMatriz(int matriz[][], int linhas, int colunas) {
        for (int lin = 0; lin < linhas; lin++) {
            for (int col = 0; col < colunas; col++) {
                System.out.printf(matriz[lin][col] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * método de classe que recebe uma matriz com muitos valores nulos e a converte para uma lista de matrizes especiais
     * @param matriz - matriz com valores nulos ou sua maioria
     * @param linhas - quantidade de linhas da matriz
     * @param colunas - quantidade de colunas da matriz
     * @param lista - lista que armazena os valores não nulos da matriz
     */
    public static void converter(int matriz[][], int linhas, int colunas, List<Dados> lista) {
        for (int lin = 0; lin < linhas; lin++) {
            for (int col = 0; col < colunas; col++) {
                if(matriz[lin][col] != 0) {
                    lista.add(new Dados(matriz[lin][col], lin, col));
                }
            }
        }
    }

    /**
     * método de classe que exibe uma lista
     * @param lista - lista a ser exibida
     */
    public static void exibirLista(List<Dados> lista) {
        for (Dados item : lista) {
            System.out.println(item);
        }
        System.out.println("Total de elementos não nulos: "+ lista.size());
    }
}
