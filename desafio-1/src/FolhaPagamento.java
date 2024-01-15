public class FolhaPagamento {

    double horasTrabalhadas;
    double horasExtrasTrabalhadas;
    int valorHoraNormal;
    int valorHoraExtra;

    double calculaFolhaPagamento() {
        double folhaCalculada = (horasTrabalhadas * valorHoraNormal) + (horasExtrasTrabalhadas * valorHoraExtra);

        return folhaCalculada;
    }

}
