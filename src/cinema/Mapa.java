package cinema;

public class Mapa {
    // Atributos
    private Assento[][] assentos;
    private int qtdFileiras;
    private int qtdCadeiras;

    // Construtor
    public Mapa(int qtdFileiras, int qtdCadeiras) {
        this.assentos = new Assento[qtdFileiras][qtdCadeiras];
        this.qtdFileiras = qtdFileiras;
        this.qtdCadeiras = qtdCadeiras;
        for (int i = 0; i < qtdFileiras; i++) {
            for (int j = 0; j < qtdCadeiras; j++) {
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

    public void mostrarMapa(Mapa mapa){
        for (int i = 0; i < mapa.getQtdCadeiras(); i++) {
            for (int j = 0; j < mapa.getQtdFileiras(); j++)
                System.out.print(mapa.getAssentos()[i][j]);
            System.out.println();
        }

    }

    public int calcularQuantidadeAssentosLivres(Mapa mapa){
        int assentosLivres = 0;
        for (int i = 0; i < mapa.getQtdFileiras(); i++) {
            for (int j = 0; j < mapa.getQtdCadeiras(); j++) {
                if (!mapa.getAssentos()[i][j].isOcupado())
                    assentosLivres++;
            }
        }
        return assentosLivres;
    }

    public int calcularQuantidadeAssentosOcupados(Mapa mapa){
        int assentosOcupados = 0;
        for (int i = 0; i < mapa.getQtdFileiras(); i++) {
            for (int j = 0; j < mapa.getQtdCadeiras(); j++) {
                if (mapa.getAssentos()[i][j].isOcupado())
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

    public int getQtdFileiras() {
        return qtdFileiras;
    }

    public void setQtdFileiras(int qtdFileiras) {
        this.qtdFileiras = qtdFileiras;
    }

    public int getQtdCadeiras() {
        return qtdCadeiras;
    }

    public void setQtdCadeiras(int qtdCadeiras) {
        this.qtdCadeiras = qtdCadeiras;
    }
}
