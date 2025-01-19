public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnicaDoCarro() {
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("O ano do carro é: " + ano);
        System.out.println("A cor do carro é: " + cor);
    }

    int retornaIdadeDoCarro() {
        return 2025 - ano;
    }
}
