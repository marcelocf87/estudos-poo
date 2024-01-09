import java.util.Scanner;

public class CalculadoraImc {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Peso: ");
		int peso = entrada.nextInt();

		System.out.print("Altura: ");
		double altura = entrada.nextDouble();

		double imc = peso / (altura * altura);

		//boolean abaixoPesoIdeal = imc < 18.5;

		if (imc < 18.5) {
			System.out.println("Abaixo do peso ideal");
			System.out.println("Procure um nutricionista");			
		} else if (imc < 25) {
			System.out.println("Peso ideal");
		} else if (imc < 30) {
			System.out.println("Acima do peso");
		} else if (imc < 35) {
			System.out.println("Obesidade 1");
		} else if (imc < 40) {
			System.out.println("Obesidade 2");
		} else {
			System.out.println("Obesidade 3");
		}
		// if (imc >= 25 && imc < 30) {
		// 	System.out.println("Acima do peso");			
		// }
		// if (imc >= 30 && imc < 35) {
		// 	System.out.println("Obesidade grau I");			
		// }
		// if (imc >= 35 && imc < 40) {
		// 	System.out.println("Obesidade grau II");			
		// }
		// if (imc > 40) {
		// 	System.out.println("Obesidade grau III");			
		// }

		System.out.println("Fim do programa");
	}
	
}