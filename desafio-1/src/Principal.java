public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Marcelo Custódio Freitas";
        funcionario.quantidadeFilhos = 2;

        ContratoTrabalho contratrabalho = new ContratoTrabalho();
        contratrabalho.funcionario = funcionario;
        contratrabalho.valorHoraNormal = 20;
        contratrabalho.valorHoraExtra = 30;

        FolhaPagamento folhaPagamentogamento = new FolhaPagamento();

        double salarioDevido = folhaPagamentogamento.calcularFolhaPagamento(40, 10,
                contratrabalho);

        System.out.print("Funcionario: ");
        System.out.println(funcionario.nome);
        System.out.printf("Salário devido: $ %.2f%n", salarioDevido);

    }
}
