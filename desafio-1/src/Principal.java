public class Principal {

    public static void main(String[] args) {
        FolhaPagamento funcionario = new FolhaPagamento();
        funcionario.horasTrabalhadas = 40;
        funcionario.horasExtrasTrabalhadas = 10;
        funcionario.valorHoraNormal = 20;
        funcionario.valorHoraExtra = 30;

        double folha = funcionario.calculaFolhaPagamento();

        System.out.printf("Folha de pagamento: %.2f%n", folha);

    }
}
