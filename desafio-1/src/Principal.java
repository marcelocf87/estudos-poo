public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Marcelo Custódio Freitas";
        funcionario.quantidadeFilhos = 2;

        ContratoTrabalho contratrabalho = new ContratoTrabalho();
        contratrabalho.funcionario = funcionario;
        contratrabalho.valorHoraNormal = 20;
        contratrabalho.valorHoraExtra = 30;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Holerite holerite = folhaPagamento.calcularSalario(40, 10, contratrabalho);

        holerite.imprimir();
    }
}
