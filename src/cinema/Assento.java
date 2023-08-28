package cinema;

public class Assento {
    // Atributos
    private int fileira;
    private int cadeira;
    private boolean ocupado;

    // Construtor
    public Assento(int fileira, int cadeira, boolean ocupado) {
        this.fileira = fileira;
        this.cadeira = cadeira;
        this.ocupado = ocupado;
    }

    // Métodos


    @Override
    public String toString() {
        if (ocupado) {
            return "■";
        }
        return "▢";
    }

    // Get e Set
    public int getFileira() {
        return fileira;
    }

    public void setFileira(int fileira) {
        this.fileira = fileira;
    }

    public int getCadeira() {
        return cadeira;
    }

    public void setCadeira(int cadeira) {
        this.cadeira = cadeira;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
