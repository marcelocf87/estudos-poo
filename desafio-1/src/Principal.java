public class Principal {

    public static void main(String[] args) {
        FolhaPagamento funcionario = new FolhaPagamento();

        double folha = funcionario.calcularFolhaPagamento(40, 10,
                20, 30);

        System.out.printf("Folha de pagamento: %.2f%n", folha);

    }
}
