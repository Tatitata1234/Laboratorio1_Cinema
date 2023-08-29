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
    public boolean ocuparAssento(int possicaoFileira, int possicaoCadeira) {
        if (assentos[possicaoFileira][possicaoCadeira].isOcupado()) {
            assentos[possicaoFileira][possicaoCadeira].setOcupado(true);
            return true;
        }
        return false;
    }

    public boolean desocuparAssento(int possicaoFileira, int possicaoCadeira) {
        if (!assentos[possicaoFileira][possicaoCadeira].isOcupado()) {
            assentos[possicaoFileira][possicaoCadeira].setOcupado(false);
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
        for (int i = 0; i < qtdCadeiras; i++) {
            for (int j = 0; j < qtdFileiras; j++)
                System.out.print(assentos[i][j]);
            System.out.println();
        }

    }

    public int calcularQuantidadeAssentosLivres(){
        int assentosLivres = 0;
        for (int i = 0; i < qtdFileiras; i++) {
            for (int j = 0; j < qtdCadeiras; j++) {
                if (!assentos[i][j].isOcupado())
                    assentosLivres++;
            }
        }
        return assentosLivres;
    }

    public int calcularQuantidadeAssentosOcupados(){
        int assentosOcupados = 0;
        for (int i = 0; i < qtdFileiras; i++) {
            for (int j = 0; j < qtdCadeiras; j++) {
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
