public class FolhaPagamento {

    double calcularSalario(double horasNormais, double horasExtras, ContratoTrabalho contrato) {

        double totalHorasNormais = horasNormais * contrato.valorHoraNormal;
        double totalHorasExtras = horasExtras * contrato.valorHoraExtra;

        double valorTotal = totalHorasNormais + totalHorasExtras;

        if (contrato.adicionalFilhos()){
            valorTotal *= 1.10;
        }

        return valorTotal;

    }
}
