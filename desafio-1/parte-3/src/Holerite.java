public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdicionalFilhos;

    double calcularValorTotal() {
        return valorTotalHorasNormais + valorTotalHorasExtras + valorAdicionalFilhos;
    }

    void imprimir() {
        System.out.println("HOLERITE");
        System.out.println("-----------------");
        System.out.printf("Nome do funcionário: %s%n", funcionario.nome);
        System.out.printf("Valor das horas normais: %.2f%n", valorTotalHorasNormais);
        System.out.printf("Valor das horas extras: %.2f%n", valorTotalHorasExtras);
        System.out.printf("Valor do adicional para filhos: %.2f%n", valorAdicionalFilhos);
        System.out.printf("Valor total: $ %.2f%n", calcularValorTotal());
    }

}




