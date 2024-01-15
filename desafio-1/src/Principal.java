public class Principal {

    public static void main(String[] args) {

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        double horasTrabalhadas = 40;
        double horasExtrasTrabalhadas = 10;
        double valorHoraNormal = 20;
        double valorHoraExtra = 30;

        double resumoFolha = folhaPagamento.calcularFolhaPagamento(horasTrabalhadas, horasExtrasTrabalhadas, valorHoraNormal, valorHoraExtra);

        System.out.printf("Folha de pagamento: %.2f%n", resumoFolha);

    }
}
