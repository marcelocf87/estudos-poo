public class ContratoTrabalho {

    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean adicionalFilhos() {
        return funcionario.possuiFilhos();
    }

}
