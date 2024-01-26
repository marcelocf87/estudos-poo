public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Marcelo Custódio Freitas";
        funcionario.quantidadeFilhos = 1;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 20;
        contratoTrabalho.valorHoraExtra = 30;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Holerite holerite= folhaPagamento.calcularSalario(40, 10, contratoTrabalho);

        holerite.imprimir();
    }
}
