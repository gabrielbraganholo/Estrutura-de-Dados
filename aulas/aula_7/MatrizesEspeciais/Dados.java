package aula_7.MatrizesEspeciais;

public class Dados {
    public int valor;
    public int linha;
    public int coluna;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public Dados(int valor, int linha, int coluna) {
        this.valor = valor;
        this.linha = linha;
        this.coluna = coluna;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dados dados = (Dados) o;
        return linha == dados.linha && coluna == dados.coluna;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "valor=" + valor +
                ", linha=" + linha +
                ", coluna=" + coluna +
                '}';
    }
}
