package modelos;

import java.util.ArrayList;

public class MenorPreco {
    String nomehotel;
    int valorTotal;
    int classificacao;

    public MenorPreco(){
    }

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

    public String hotelMenorPreco(ArrayList<MenorPreco>listaMenorPreco){

        int verificamenor=0;
        String hotelMaisbarato="";
        int posicao=0;
        int i=0;

        for (MenorPreco m : listaMenorPreco) {

            if (m.getValorTotal() <= listaMenorPreco.get(posicao).getValorTotal()) {
                verificamenor = m.getValorTotal();
                hotelMaisbarato = m.getNomehotel();
                posicao = i;
            }
            if (m.getValorTotal() == listaMenorPreco.get(posicao).getValorTotal()) {
                if (m.getClassificacao() <= listaMenorPreco.get(posicao).getClassificacao()) {
                    verificamenor = m.getValorTotal();
                    hotelMaisbarato = m.getNomehotel();
                    posicao = i;
                }
                i++;
            }
        }
        return hotelMaisbarato;
    }
}
