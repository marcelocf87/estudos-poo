public class Principal {

    public static void main(String[] args) {
        FolhaPagamento folhaPagamento = new FolhaPagamento();

        double salarioDevido = folhaPagamento.calcularSalario(40, 10, 20, 30);

        System.out.printf("Salário devido: %.2f%n", salarioDevido);
    }
}
