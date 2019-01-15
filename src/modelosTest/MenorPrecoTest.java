package modelosTest;

import modelos.MenorPreco;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MenorPrecoTest {

    @Test
    void hotelMenorPreco() {
        int verificamenor = 0;
        String hotelMaisbarato = "";
        int posicao = 0;
        int i = 0;

        ArrayList<MenorPreco> listaMenorPreco = new ArrayList<MenorPreco>();
        listaMenorPreco.add(new MenorPreco("Lakewood", 200, 2));
        listaMenorPreco.add(new MenorPreco("Bridgewood", 330, 3));
        listaMenorPreco.add(new MenorPreco("Ridgewood", 250, 2));

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
                Assert.assertEquals("Lakewood", hotelMaisbarato);
            }
        }
    }