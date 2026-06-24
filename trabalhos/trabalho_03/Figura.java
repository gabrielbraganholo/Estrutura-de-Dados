package trabalho_03;

import java.util.TreeSet;

public class Figura implements Comparable<Figura> {

    private String nomeSelecao;
    private int numeroFigura;
    private String descricao;
    private int quantidade;
    private boolean rara;

    public String getNomeSelecao() {
        return nomeSelecao;
    }

    public void setNomeSelecao(String nomeSelecao) {
        this.nomeSelecao = nomeSelecao;
    }

    public int getNumeroFigura() {
        return numeroFigura;
    }

    public void setNumeroFigura(int numeroFigura) {
        this.numeroFigura = numeroFigura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isRara() {
        return rara;
    }

    public void setRara(boolean rara) {
        this.rara = rara;
    }

    public Figura (String nomeSelecao, int numeroFigura, String descricao, int quantidade, boolean rara) {
        this.nomeSelecao = nomeSelecao;
        this.numeroFigura = numeroFigura;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.rara = rara;
    }

    @Override
    public int compareTo(Figura outra) {

        int resultado = this.nomeSelecao.compareTo(outra.nomeSelecao);

        if (resultado != 0) {
            return resultado;
        }

        return Integer.compare(this.numeroFigura, outra.numeroFigura);
    }

    @Override
    public String toString() {
        return "Figura{" +
                "nomeSelecao='" + nomeSelecao + '\'' +
                ", numeroFigura=" + numeroFigura +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", rara=" + rara +
                '}';
    }
}
