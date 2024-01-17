public class Principal {

    public static void main(String[] args) {
        FolhaPagamento folhaPagamento = new FolhaPagamento();

        double salarioTotal = folhaPagamento.CalcularSalario(40, 10, 20, 30);

        System.out.printf("Salário total: %.2f%n", salarioTotal);

    }


}