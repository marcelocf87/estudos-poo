public class FolhaPagamento {
    double calcularFolhaPagamento(double horasTrabalhadas, double horasExtrasTrabalhadas, double valorHoraNormal, double valorHoraExtra) {
        double folhaCalculada = (horasTrabalhadas * valorHoraNormal) + (horasExtrasTrabalhadas * valorHoraExtra);

        return folhaCalculada;
    }

}
