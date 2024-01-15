public class FolhaPagamento {

    double horasTrabalhadas;
    double horasExtrasTrabalhadas;
    int valorHoraNormal;
    int valorHoraExtra;

    double calcularFolhaPagamento() {
        double folhaCalculada = (horasTrabalhadas * valorHoraNormal) + (horasExtrasTrabalhadas * valorHoraExtra);

        return folhaCalculada;
    }

}
