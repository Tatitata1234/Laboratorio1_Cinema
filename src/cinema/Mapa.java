package cinema;

public class Mapa {
    // Atributos
    private Assento[][] assentos;
    private int qtdFileiras;
    private int qtdCadeiras;

    // Construtor
    public Mapa(int qtdFileiras, int qtdCadeiras) {
        this.assentos = new Assento[this.qtdCadeiras][qtdFileiras];
        this.qtdFileiras = qtdFileiras;
        this.qtdCadeiras = this.qtdCadeiras;
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
