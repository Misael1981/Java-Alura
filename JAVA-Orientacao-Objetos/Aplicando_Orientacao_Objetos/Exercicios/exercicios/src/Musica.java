public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacao;

    void exibeFichaTecnica() {
        System.out.println("Nome do artista: " + artista);
        System.out.println("Nome da música: " + titulo);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        avaliacao += nota;
        numAvaliacao++;
    }
}
