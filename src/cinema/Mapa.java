package cinema;

import static java.lang.System.*;

public class Mapa {
    // Atributos
    private Assento[][] assentos;
    private final int QUANTIDADE_FILEIRAS = 12;
    private final int QUANTIDADE_CADEIRAS = 14;

    private final String[] ALFABETO = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};

    // Construtor
    public Mapa() {
        this.assentos = new Assento[QUANTIDADE_FILEIRAS][QUANTIDADE_CADEIRAS];
        for (int i = 0; i < QUANTIDADE_FILEIRAS; i++) {
            for (int j = 0; j < QUANTIDADE_CADEIRAS; j++) {
                assentos[i][j] = new Assento(i, j,false);
            }
        }
    }

    // Métodos
    public boolean reservar(int fileira, int cadeira, Mapa mapa){
        if (!mapa.getAssentos()[fileira][cadeira].isOcupado()){
            mapa.getAssentos()[fileira][cadeira].setOcupado(true);
            return true;
        }
        return false;
    }

    public boolean cancelar(int fileira, int cadeira, Mapa mapa){
        if (mapa.getAssentos()[fileira][cadeira].isOcupado()){
            mapa.getAssentos()[fileira][cadeira].setOcupado(false);
            return true;
        }
        return false;
    }

    public boolean reservar(int fileira, int cadeira){
        if (!assentos[fileira][cadeira].isOcupado()){
            assentos[fileira][cadeira].setOcupado(true);
            return true;
        }
        return false;
    }

    public boolean cancelar(int fileira, int cadeira){
        if (assentos[fileira][cadeira].isOcupado()){
            assentos[fileira][cadeira].setOcupado(false);
            return true;
        }
        return false;
    }

    public void mostrarMapa(){
        for (int i = 0; i < QUANTIDADE_FILEIRAS; i++) {
            out.print(ALFABETO[i] + "\t");
            for (int j = 0; j < QUANTIDADE_CADEIRAS; j++) {
                out.print(assentos[i][j] + "\t");
                if (j == (QUANTIDADE_CADEIRAS-2)/2){
                    out.print(" \t");
                }
            }
            out.print(ALFABETO[i] + "\t");
            out.println();
        }
        out.print(" \t");
        for (int j = 1; j <= QUANTIDADE_CADEIRAS; j++) {
            out.print(j + "\t");
            if (j == (QUANTIDADE_CADEIRAS)/2){
                out.print(" \t");
            }
        }
        out.println();
        out.println();
    }

    public int calcularQuantidadeAssentosLivres(){
        int assentosLivres = 0;
        for (int i = 0; i < QUANTIDADE_FILEIRAS; i++) {
            for (int j = 0; j < QUANTIDADE_CADEIRAS; j++) {
                if (!assentos[i][j].isOcupado())
                    assentosLivres++;
            }
        }
        return assentosLivres;
    }

    public int calcularQuantidadeAssentosOcupados(){
        int assentosOcupados = 0;
        for (int i = 0; i < QUANTIDADE_FILEIRAS; i++) {
            for (int j = 0; j < QUANTIDADE_CADEIRAS; j++) {
                if (assentos[i][j].isOcupado())
                    assentosOcupados++;
            }
        }
        return assentosOcupados;
    }

    // Get e Set
    public Assento[][] getAssentos() {
        return assentos;
    }

    public void setAssentos(Assento[][] assentos) {
        this.assentos = assentos;
    }

    public int getQUANTIDADE_FILEIRAS() {
        return QUANTIDADE_FILEIRAS;
    }

    public int getQUANTIDADE_CADEIRAS() {
        return QUANTIDADE_CADEIRAS;
    }

}
