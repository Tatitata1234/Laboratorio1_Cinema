package interacao;

// Escreva uma aplicação que apresente um menu de opções, permitindo fazer uma reserva, cancelar uma
//        reserva, mostrar quais assentos estão livres/ocupados (mapa) e mostrar o total de lugares livres/ocupados.
//        Usem sua criatividade para construir o software.
//        Procure separar as classes com base nas suas funcionalidades, inclusive nos pacotes que acharem
//        adequados.
//        Sugestão de classes: Menu, Opcoes (reservar, cancelar, mostrar mapa e quantidades), Mapa e Assento.
//        Dica: Para entrada de dados, sugiro usar a Classe Scanner, da API do Java.
public class Opcao {
    // Atributos
    private String[] opcoes = {"Reservar Assentos", "Cancelar Reservas", "Mostrar Mapa da Sala", "Mostrar Quantidade de Assentos Disponiveis"};

    // Métodos
    public void imprimirOpcoes() {
        for (int i = 0; i < opcoes.length; i++) {
            int numOpcao = i + 1;
            System.out.println(numOpcao + " - " + opcoes[i]);
        }
    }

    public void tratarEntrada(String entrada) {
        //NumberUtils.isNumeric(entrada);
    }
}
