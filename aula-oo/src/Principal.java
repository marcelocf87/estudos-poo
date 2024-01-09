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

        meuCarro.calcularValorCarro();
//        meuCarro.proprietario = new Pessoa();
//        meuCarro.proprietario.nome = "Marcelo Custódio Freitas";
//        meuCarro.proprietario.cpf = "00100200300";
//        meuCarro.proprietario.anoNascimento = 1987;

//        Carro seuCarro = new Carro();
//        seuCarro.anoFabricacao = 1969;
//        seuCarro.cor = "Cinza";
//        seuCarro.fabricante = "Shelby";
//        seuCarro.modelo = "Mustang";

        //System.out.printf("Meu carro");
        //System.out.println("---------");
        //System.out.printf("Fabricante: %s%n", meuCarro.fabricante);
        //System.out.printf("Modelo: %s%n", meuCarro.modelo);
        //System.out.printf("Ano: %s%n", meuCarro.anoFabricacao);
        //System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);

//        System.out.println();
//
//        System.out.println("Seu carro");
//        System.out.println("---------");
//        System.out.printf("Modelo: %s%n", seuCarro.modelo);
//        System.out.printf("Fabricante: %s%n", seuCarro.fabricante);
//        System.out.printf("Ano: %s%n", seuCarro.anoFabricacao);

    }
}
