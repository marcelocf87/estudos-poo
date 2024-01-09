import java.util.Scanner;

public class AnosBissextos {
	
	public static void main(String []args) {
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Digite o ano: ");
		int ano = entrada.nextInt();

		boolean anoBissexto = ano % 400 == 0 || (ano % 4 ==0 && ano % 100 != 0);

		System.out.printf("Bissexto: %b%n:", anoBissexto);


	}
}