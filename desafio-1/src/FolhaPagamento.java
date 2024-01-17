public class FolhaPagamento {
    double calcularFolhaPagamento(double horasTrabalhadas, double horasExtrasTrabalhadas, ContratoTrabalho contrato) {

        double totalHorasTrabalhadas = horasTrabalhadas * contrato.valorHoraNormal;
        double totalHorasExtras = horasExtrasTrabalhadas * contrato.valorHoraExtra;

        double valorTotal = totalHorasTrabalhadas + totalHorasExtras;

        if (contrato.possuiAdicionalParaFilhos()) {
            valorTotal *= 1.10;
        }

        return valorTotal;
    }

}