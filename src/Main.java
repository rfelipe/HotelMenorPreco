import modelos.Hotel;
import modelos.MenorPreco;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Hotel hotel;

        String entradaDeDados="";
        int soma=0;
        int verificaEscolha;
        Scanner digitar= new Scanner(System.in);


        ArrayList<Hotel> listaHoteisClientesRegular = new ArrayList<Hotel>();
        listaHoteisClientesRegular.add(new Hotel("Lakewood",3,110,90));
        listaHoteisClientesRegular.add(new Hotel("Bridgewood",4,160,60));
        listaHoteisClientesRegular.add(new Hotel("Ridgewood",5,220,150));

        ArrayList<Hotel> listaHoteisClientesReward = new ArrayList<Hotel>();
        listaHoteisClientesReward.add(new Hotel("Lakewood",3,80,80));
        listaHoteisClientesReward.add(new Hotel("Bridgewood",4,110,50));
        listaHoteisClientesReward.add(new Hotel("Ridgewood",5,100,40));

        ArrayList<MenorPreco> listaMenorPreco = new ArrayList<MenorPreco>();



        System.out.println("Escolha o tipo de entrada para buscar hotel mais barato:");
        System.out.println("1 : Digitar a busca manualmente");
        System.out.println("2 : ler um arquivo");
        verificaEscolha=digitar.nextInt();

        if(verificaEscolha==1){
            System.out.println("Digite a busca ex.: Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)\n");
            digitar.nextLine();
            entradaDeDados=digitar.nextLine();
        }
        else if (verificaEscolha==2) {
            try {
                String linha;
                int line = 0;
                int contaCliente = 0;
                int contaVendedores = 0;
                String idvenda = "";
                String nomevendedor = "";

                File arquivos[];
                File diretorio = new File("dados/in/");
                arquivos = diretorio.listFiles();


                for (int i = 0; i < arquivos.length; i++) {
                    FileReader reader = new FileReader(arquivos[i]);
                    BufferedReader leitor = new BufferedReader(reader);

                    while ((linha = leitor.readLine()) != null) {
                        entradaDeDados=linha;
                        line++;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        entradaDeDados=entradaDeDados.replace(" ","");
        String entradasSeparadas[] = entradaDeDados.split(",|:");


        if(entradasSeparadas[0].equals("Regular")){
            for (Hotel u : listaHoteisClientesRegular) {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("soma fora "+soma);
                    if (entradasSeparadas[i].substring(10, 13).equals("sat") || entradasSeparadas[i].substring(10, 13).equals("sun")) {
                        soma = soma+u.getTxaFimSemana();
                    } else {
                        soma = soma+u.getTxaDiaSemana();
                    }
                }
                listaMenorPreco.add(new MenorPreco(u.getNomehotel(),soma,u.getClassificacao()));
                soma=0;
            }
        }
        else{
            for (Hotel u : listaHoteisClientesReward) {
                for (int i = 1; i <= 3; i++) {
                    if (entradasSeparadas[i].substring(10, 13).equals("sat") || entradasSeparadas[i].substring(10, 13).equals("sun")) {
                        soma += u.getTxaFimSemana();
                    } else {
                        soma += u.getTxaDiaSemana();
                    }
                }
                listaMenorPreco.add(new MenorPreco(u.getNomehotel(),soma,u.getClassificacao()));
                soma=0;
            }
        }

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
           if (m.getValorTotal() <= listaMenorPreco.get(posicao).getValorTotal()) {
                if (m.getClassificacao() <= listaMenorPreco.get(posicao).getClassificacao()) {
                    verificamenor = m.getValorTotal();
                    hotelMaisbarato = m.getNomehotel();
                    posicao = i;
                }
            }
            i++;
        }

        System.out.println(hotelMaisbarato);
    }
}
