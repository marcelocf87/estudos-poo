public class Principal {

    public static void main (String[] args) {

        Pessoa eu = new Pessoa();
        eu.nome = "Marcelo Custódio";
        eu.cpf = "00100200300";
        eu.anoNascimento = 1987;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2018;
        meuCarro.cor = "Branco";
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Argo";
        meuCarro.precoCompra = 55000;
        meuCarro.proprietario = eu;

        meuCarro.proprietario = new Pessoa();
        meuCarro.proprietario.nome = "Marcelo Custódio Freitas";
        meuCarro.proprietario.cpf = "00100200300";
        meuCarro.proprietario.anoNascimento = 1987;

        Pessoa voce = new Pessoa();
        voce.nome = "Ana Carolina Cruz";
        voce.cpf = "00400500600";
        voce.anoNascimento = 1994;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2020;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "Hyundai";
        seuCarro.modelo = "HB20";
        seuCarro.precoCompra = 68000;
        seuCarro.proprietario = voce;

        seuCarro.proprietario = new Pessoa();
        seuCarro.proprietario.nome = "Ana Carolina Cruz";
        seuCarro.proprietario.cpf = "00400500600";
        seuCarro.proprietario.anoNascimento = 1994;

        meuCarro.imprimirResumo();
        meuCarro.imprimirResumoDepreciacao();
        seuCarro.imprimirResumo();
        seuCarro.imprimirResumoDepreciacao();

//        System.out.println("Meu carro");
//        System.out.println("---------");
//        System.out.printf("Fabricante: %s%n", meuCarro.fabricante);
//        System.out.printf("Modelo: %s%n", meuCarro.modelo);
//        System.out.printf("Ano: %s%n", meuCarro.anoFabricacao);
//        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);
//
//        System.out.println();

//        System.out.println("Meu carro");
//        System.out.println("---------");
//        System.out.printf("Fabricante: %s%n", seuCarro.fabricante);
//        System.out.printf("Modelo: %s%n", seuCarro.modelo);
//        System.out.printf("Ano: %s%n", seuCarro.anoFabricacao);
//        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);
//        System.out.printf("Tempo de uso em (anos): %d%n", 2024 - seuCarro.anoFabricacao);
//        System.out.printf("Valor de revenda: %6.2f%n", seuCarro.calcularValorCarro());

    }
}
