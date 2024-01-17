public class FolhaPagamento {

    double CalcularSalario(double horasNormais, double horasExtras, double valorHoraNormal, double valorHoraExtra) {
        double totalHoraNormal = horasNormais * valorHoraNormal;
        double totalHoraExtra = horasExtras * valorHoraExtra;

        return totalHoraNormal + totalHoraExtra;

    }
}
