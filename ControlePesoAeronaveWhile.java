import java.util.Scanner;

public class ControlePesoAeronave {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Peso maximo da aeronave ");
		int pesoMaximo = entrada.nextInt();

		// System.out.print("Quantidade de passageiros: ");
		// int totalPassageiro = entrada.nextInt();

		int pesoTotalPassageros = 0;
		Boolean incluirNovoPassageiro = true;
		//int passageiroAtual = 1;

		while (pesoTotalPassageros <= pesoMaximo && incluirNovoPassageiro) {
			System.out.printf("Peso do passageiro: ");
			int pesoPassageiro = entrada.nextInt();

			pesoTotalPassageros += pesoPassageiro;

			System.out.print("Incluir novo passageiro? ");
			incluirNovoPassageiro = entrada.nextBoolean();
		}

		System.out.printf("Peso maximo da aeronave: %d kg%n", pesoMaximo);
		System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageros);
		System.out.printf("Situacao da aeronave: %s%n", 
			pesoTotalPassageros > pesoMaximo ? "Peso excedido" : "Liberada");


	}
	
}