import java.util.Scanner;

public class CalculaPagamento {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = entrada.nextLine();

		System.out.print("Valor por hora: ");
		double valorHora = entrada.nextDouble();

		System.out.print("Horas trabalhadas: ");
		int horasTrabalhadas = entrada.nextInt();

		System.out.print("Valor dos descontos: ");
		double valorDescontos = entrada.nextDouble();

		double valorTotalTrabalhado = valorHora * horasTrabalhadas;
		double valorTotalDevido = valorTotalTrabalhado - valorDescontos;

		//System.out.printf("Segue resumo da Folha de pagamento do funcionario %s%n: %i% * %d%n: %d%n Total devido: %d", nome, resumo);

		System.out.printf("%nSegue resumo de pagamento do colaborador: %s%n", nome);
		System.out.printf("%d horas trabalhadas x R$%.2f por hora = R$%.2f%n", horasTrabalhadas, valorHora, valorTotalTrabalhado);
		System.out.printf("Descontos: R$%.2f%n", valorDescontos);
		System.out.printf("Valor total a pagar: R$%.2f%n", valorTotalDevido);

	}


}