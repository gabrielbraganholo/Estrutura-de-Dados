package trabalho_03;

import java.util.TreeSet;

public class Figura {

    private String nomeSelecao;
    private String nomeFigura;
    private String descricao;
    private int quantidade;
    private boolean rara;

    public String getNomeSelecao() {
        return nomeSelecao;
    }

    public void setNomeSelecao(String nomeSelecao) {
        this.nomeSelecao = nomeSelecao;
    }

    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
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

    public Figura (String nomeSelecao, String nomeFigura, String descricao, int quantidade, boolean rara) {
        this.nomeSelecao = nomeSelecao;
        this.nomeFigura = nomeFigura;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.rara = rara;
    }

}
