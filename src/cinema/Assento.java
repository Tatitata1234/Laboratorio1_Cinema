package cinema;

public class Assento {
    // Atributos
    private char fileira;
    private int cadeira;
    private boolean ocupado;

    // Construtor
    public Assento(char fileira, int cadeira, boolean ocupado) {
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
    public char getFileira() {
        return fileira;
    }

    public void setFileira(char fileira) {
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
