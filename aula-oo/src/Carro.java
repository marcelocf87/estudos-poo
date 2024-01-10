public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;

    void imprimirResumo(){
        System.out.printf("Fabricante: %s%n", fabricante);
        System.out.printf("Modelo: %s%n", modelo);
        System.out.printf("Ano: %s%n", anoFabricacao);
        System.out.printf("Proprietário: %s%n", proprietario.nome);
    }
    void imprimirResumoDepreciacao() {
//        double valorRevendaMeuCarro = calcularValorRevenda();
//        int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAnos();

        System.out.printf("Tempo de uso em (anos): %d%n", calcularTempoDeUsoEmAnos());
        System.out.printf("Valor de revenda: %6.2f%n", calcularValorRevenda());
        System.out.println();
    }

    double calcularIpva() {
        return calcularValorRevenda() * 0.04;
    }

    int calcularTempoDeUsoEmAnos() {
        return 2024 - anoFabricacao;
    }

    double calcularValorRevenda() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;

    }

}
