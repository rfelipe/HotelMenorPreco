package modelosTest;

import modelos.Hotel;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
  public  void hotelRegular() {

        ArrayList<Hotel> listaHoteisClientesRegular = new ArrayList<Hotel>();
        ArrayList<Hotel>listaHotelTest =new ArrayList<Hotel>();

        listaHoteisClientesRegular.add(new Hotel("Lakewood",3,110,90));
        listaHotelTest.add(new Hotel("Lakewood",3,110,90));

       Assert.assertEquals(listaHotelTest.get(0).getNomehotel(),listaHoteisClientesRegular.get(0).getNomehotel());
       Assert.assertEquals(listaHotelTest.get(0).getClassificacao(),listaHoteisClientesRegular.get(0).getClassificacao());
       Assert.assertEquals(listaHotelTest.get(0).getTxaDiaSemana(),listaHoteisClientesRegular.get(0).getTxaDiaSemana());
       Assert.assertEquals(listaHotelTest.get(0).getTxaFimSemana(),listaHoteisClientesRegular.get(0).getTxaFimSemana());
    }

    @Test
    void hotelReward() {

        ArrayList<Hotel> listaHoteisClientesReward = new ArrayList<Hotel>();
        ArrayList<Hotel>listaHotelTest =new ArrayList<Hotel>();

        listaHoteisClientesReward.add(new Hotel("Ridgewood", 5, 100, 40));
        listaHotelTest.add(new Hotel("Ridgewood", 5, 100, 40));

        Assert.assertEquals(listaHotelTest.get(0).getNomehotel(),listaHoteisClientesReward.get(0).getNomehotel());
        Assert.assertEquals(listaHotelTest.get(0).getClassificacao(),listaHoteisClientesReward.get(0).getClassificacao());
        Assert.assertEquals(listaHotelTest.get(0).getTxaDiaSemana(),listaHoteisClientesReward.get(0).getTxaDiaSemana());
        Assert.assertEquals(listaHotelTest.get(0).getTxaFimSemana(),listaHoteisClientesReward.get(0).getTxaFimSemana());
    }
}