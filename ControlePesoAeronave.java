import java.util.Scanner;

public class ControlePesoAeronave {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Peso máximo da aeronave ");
		int pesoMaximo = entrada.nextInt();

		System.out.print("Quantidade de passageiros: ");
		int totalPassageiro = entrada.nextInt();

		int pesoTotalPassageros = 0;

		for (int passageiroAtual = 1; passageiroAtual <= totalPassageiro; passageiroAtual++) {
			System.out.printf("Peso do passageiro #%d: ", passageiroAtual);
			int pesoPassageiro = entrada.nextInt();

			pesoTotalPassageros += pesoPassageiro;
		}

		System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
		System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageros);
		System.out.printf("Situação da aeronave: %s%n", 
			pesoTotalPassageros > pesoMaximo ? "Peso excedido" : "Liberada");


	}
	
}