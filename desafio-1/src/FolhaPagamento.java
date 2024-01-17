public class FolhaPagamento {
    Holerite calcularSalario(double horasNormais, double horasExtras, ContratoTrabalho contrato) {
        Holerite holerite = new Holerite();
        holerite.funcionario = contrato.funcionario;
        holerite.valorTotalHorasNormais = horasNormais * contrato.valorHoraNormal;
        holerite.valorToralHorasExtras = horasExtras * contrato.valorHoraExtra;

        double subtotal = holerite.valorTotalHorasNormais + holerite.valorToralHorasExtras;

        if (contrato.possuiAdicionalParaFilhos()) {
            holerite.valorAdicionalParaFilhos = subtotal * 0.10;
        }

        return holerite;
    }

}