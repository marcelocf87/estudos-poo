public class FolhaPagamento {

    Holerite calcularSalario(double horasNormais, double horasExtras, ContratoTrabalho contrato) {
        Holerite holerite = new Holerite();
        holerite.funcionario = contrato.funcionario;
        holerite.valorTotalHorasNormais = horasNormais * contrato.valorHoraNormal;
        holerite.valorTotalHorasExtras = horasExtras * contrato.valorHoraExtra;

        double subTotal = holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtras;

        if (contrato.adicionalFilhos()){
            holerite.valorAdicionalFilhos = subTotal * 0.10;
        }

        return holerite;

    }
}
