public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorToralHorasExtras;
    double valorAdicionalParaFilhos;

    double calcularValorTotal() {
        return valorTotalHorasNormais + valorToralHorasExtras + valorAdicionalParaFilhos;
    }

    void imprimir() {
        System.out.println("HOLERITE");
        System.out.println("-----------------");
        System.out.printf("Nome do funcionário: %s%n", funcionario.nome);
        System.out.printf("Valor das horas normais: %.2f%n", valorTotalHorasNormais);
        System.out.printf("Valor das horas extras: %.2f%n", valorToralHorasExtras);
        System.out.printf("Valor do adicional para filhos: %.2f%n", valorAdicionalParaFilhos);
        System.out.printf("Valor total: $ %.2f%n", calcularValorTotal());
    }



}
