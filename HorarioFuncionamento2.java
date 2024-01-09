import java.util.Scanner;

public class HorarioFuncionamento {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um dia da semana (Ex: seg, ter, qua, qui, sex, sab, dom): ");
		String diaSemana = entrada.nextLine();
		
		String horarioFuncionamento = switch (diaSemana) {
			case "seg" -> horarioFuncionamento = "Fechado";
			case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 ás 18:00";
			case "sab", "dom" -> horarioFuncionamento = "08:00 ás 12:00";			
			default -> horarioFuncionamento = "Dia inválido";
		};

				

		//String horarioFuncionamento;

		// switch (diaSemana) {
		// 	case "seg" -> horarioFuncionamento = "Fechado";
		// 	case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 ás 18:00";
		// 	case "sab", "dom" -> {
		// 		horarioFuncionamento = "08:00 ás 12:00";
		// 	}
		// 	default -> horarioFuncionamento = "Dia inválido";
		// }

		System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);


	}
}