public class Principal {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Marcelo Custódio Freitas";
        funcionario.quantidadeFilhos = 2;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 20;
        contratoTrabalho.valorHoraExtra = 30;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        double totalSalario = folhaPagamento.CalcularSalario(40, 10, contratoTrabalho);

        System.out.println("## HOLERITE ##");
        System.out.printf("Colaborador: %s%n", funcionario.nome);
        System.out.printf("Salário total: %.2f%n", totalSalario);

    }
}
