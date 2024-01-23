public class FolhaPagamento {

    double calcularSalario(double horasNormais, double horasExtras,
                           double valorHorasNormais, double valorHorasExtras) {

        double totalHorasNormais = horasNormais * valorHorasNormais;
        double totalHorasExtras = horasExtras * valorHorasExtras;

        return totalHorasNormais + totalHorasExtras;

    }
}
