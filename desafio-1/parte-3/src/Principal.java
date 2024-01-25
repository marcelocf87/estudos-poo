public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Marcelo Custódio Freitas";
        funcionario.quantidadeFilhos = 1;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 20;
        contratoTrabalho.valorHoraExtra = 30;

        double salarioDevido = folhaPagamento.calcularSalario(40, 10, contratoTrabalho);

        System.out.printf("Colaborador: %s%n", funcionario.nome);
        System.out.printf("Salário devido: %.2f%n", salarioDevido);
    }
}
