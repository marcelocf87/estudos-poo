public class FolhaPagamento {
    double calcularFolhaPagamento(double horasTrabalhadas, double horasExtrasTrabalhadas,
                                  double valorHoraNormal, double valorHoraExtra) {

        double totalHorasTrabalhadas = horasTrabalhadas * valorHoraNormal;
        double totalHorasExtras = horasExtrasTrabalhadas * valorHoraExtra;

        return totalHorasExtras + totalHorasTrabalhadas;
    }

}