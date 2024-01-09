import java.util.Scanner;

public class ControlePesoAeronave {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Peso maximo da aeronave ");
		int pesoMaximo = entrada.nextInt();

		int pesoTotalPassageros = 0;
		
		while (true) {
			System.out.print("Peso do passageiro: ");
			int pesoPassageiro = entrada.nextInt();

			if (pesoTotalPassageros + pesoPassageiro > pesoMaximo) {
				System.out.println("Nao pode incluir passageiro. Peso excede o limite");
				continue; //pode ser substituido por um else
			}

			pesoTotalPassageros += pesoPassageiro;

			System.out.print("Incluir novo passageiro? ");
			if (!entrada.nextBoolean()) {
				break;
			}
		}

		System.out.printf("Peso maximo da aeronave: %d kg%n", pesoMaximo);
		System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageros);
		System.out.printf("Situacao da aeronave: %s%n", 
			pesoTotalPassageros > pesoMaximo ? "Peso excedido" : "Liberada");


	}
	
}