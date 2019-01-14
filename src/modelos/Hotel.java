package modelos;

public class Hotel {

    String nomehotel;
    int classificacao;
    int txaDiaSemana;
    int txaFimSemana;

    public Hotel(String nomehotel, int classificacao, int txaDiaSemana, int txaFimSemana) {
        this.nomehotel = nomehotel;
        this.classificacao = classificacao;
        this.txaDiaSemana = txaDiaSemana;
        this.txaFimSemana = txaFimSemana;
    }

    public String getNomehotel() {
        return nomehotel;
    }

    public void setNomehotel(String nomehotel) {
        this.nomehotel = nomehotel;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getTxaDiaSemana() {
        return txaDiaSemana;
    }

    public void setTxaDiaSemana(int txaDiaSemana) {
        this.txaDiaSemana = txaDiaSemana;
    }

    public int getTxaFimSemana() {
        return txaFimSemana;
    }

    public void setTxaFimSemana(int txaFimSemana) {
        this.txaFimSemana = txaFimSemana;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nomehotel='" + nomehotel + '\'' +
                ", classificacao=" + classificacao +
                ", txaDiaSemana=" + txaDiaSemana +
                ", txaFimSemana=" + txaFimSemana +
                '}';
    }
}
