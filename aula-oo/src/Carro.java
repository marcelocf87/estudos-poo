public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;

    void calcularValorCarro() {
        int tempoDeUsoEmAnos = 2024 - anoFabricacao;

        int vidaUtilEmAnos = 20;
        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        System.out.printf("Tempo de uso em (anos): %d%n", tempoDeUsoEmAnos);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);

    }

}
