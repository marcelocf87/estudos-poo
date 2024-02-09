//Alterar uma variável do tipo primitivo passado como parâmetro de um método não surte qualquer efeito

public class Principal {

    public static void main(String[] args) {
        double precoCompraFornecedor = 140;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        double precoVenda = servicoDePrecificacao.calcularPreco(precoCompraFornecedor);

        System.out.printf("Preço: %.2f%n", precoVenda);
    }
}
