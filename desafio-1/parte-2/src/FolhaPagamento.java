public class FolhaPagamento {

    double CalcularSalario(double horasNormais, double horasExtras, ContratoTrabalho contrato){
        double totalHorasNormais = horasNormais * contrato.valorHoraNormal;
        double totalHorasExtras = horasExtras * contrato.valorHoraExtra;

        double valorTotal = totalHorasNormais + totalHorasExtras;

        Funcionario funcionario = new Funcionario();

        if (contrato.adicionalPossuiFilhos()) {
            valorTotal *= 1.10;
        }

        return valorTotal;

    }

}
