package modelos;

public class MenorPreco {
    String nomehotel;
    int valorTotal;
    int classificacao;


    public MenorPreco(String nomehotel, int valorTotal, int classificacao) {
        this.nomehotel = nomehotel;
        this.valorTotal = valorTotal;
        this.classificacao = classificacao;
    }


    public String getNomehotel() {
        return nomehotel;
    }

    public void setNomehotel(String nomehotel) {
        nomehotel = nomehotel;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        valorTotal = valorTotal;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "MenorPreco{" +
                "nomehotel='" + nomehotel + '\'' +
                ", valorTotal=" + valorTotal +
                ", classificacao=" + classificacao +
                '}';
    }
}
