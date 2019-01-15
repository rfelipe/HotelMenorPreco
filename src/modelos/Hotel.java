package modelos;

import java.util.ArrayList;

public class Hotel {

    String nomehotel;
    int classificacao;
    int txaDiaSemana;
    int txaFimSemana;

    public Hotel(){
    }
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

    public ArrayList<Hotel> hotelRegular(){
        ArrayList<Hotel> listaHoteisClientesRegular = new ArrayList<Hotel>();
        listaHoteisClientesRegular.add(new Hotel("Lakewood",3,110,90));
        listaHoteisClientesRegular.add(new Hotel("Bridgewood",4,160,60));
        listaHoteisClientesRegular.add(new Hotel("Ridgewood",5,220,150));

        return listaHoteisClientesRegular;
    }

    public ArrayList<Hotel> hotelReward() {
        ArrayList<Hotel> listaHoteisClientesReward = new ArrayList<Hotel>();
        listaHoteisClientesReward.add(new Hotel("Lakewood", 3, 80, 80));
        listaHoteisClientesReward.add(new Hotel("Bridgewood", 4, 110, 50));
        listaHoteisClientesReward.add(new Hotel("Ridgewood", 5, 100, 40));

        return listaHoteisClientesReward;
    }
}
