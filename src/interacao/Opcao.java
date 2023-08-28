package interacao;

import cinema.Assento;
import cinema.Mapa;

//Escreva uma aplicação que apresente um menu de opções, permitindo fazer uma reserva, cancelar uma
//        reserva, mostrar quais assentos estão livres/ocupados (mapa) e mostrar o total de lugares livres/ocupados.
//        Usem sua criatividade para construir o software.
//        Procure separar as classes com base nas suas funcionalidades, inclusive nos pacotes que acharem
//        adequados.
//        Sugestão de classes: Menu, Opcoes (reservar, cancelar, mostrar mapa e quantidades), Mapa e Assento.
//        Dica: Para entrada de dados, sugiro usar a Classe Scanner, da API do Java.
public class Opcao {

    public static boolean reservar(int fileira, int cadeira, Mapa mapa){
        if (!mapa.getAssentos()[fileira][cadeira].isOcupado()){
            mapa.getAssentos()[fileira][cadeira].setOcupado(true);
            return true;
        }
        return false;
    }

    public static boolean cancelar(int fileira, int cadeira, Mapa mapa){
        if (mapa.getAssentos()[fileira][cadeira].isOcupado()){
            mapa.getAssentos()[fileira][cadeira].setOcupado(false);
            return true;
        }
        return false;
    }

    public static void mostrarMapa(){

    }

    public static int calcularQuantidadeAssentosLivres(Mapa mapa){

    }

    public static int calcularQuantidadeAssentosOcupados(Mapa mapa){

    }
}