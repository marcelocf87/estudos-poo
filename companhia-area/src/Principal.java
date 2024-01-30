public class Principal {

    public static void main(String[] args) {
        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalAssentos = 100;

        aviaoGol.ativar();

        aviaoGol.reservarAssentos(10);

        System.out.printf("GOL (%s): %d assentos disponíveis%n",
                aviaoGol.ativo ? "Ativo" : "Inativo",
                aviaoGol.calcularAssentosDisponives());

        Aeronave aviaoAzul = new Aeronave();
        aviaoAzul.totalAssentos = 200;

        aviaoAzul.ativar();

        aviaoAzul.reservarAssentos(50);

        System.out.printf("Azul (%s): %d assentos disponíveis%n",
                aviaoAzul.ativo ? "Ativo" : "Inativo",
                aviaoAzul.calcularAssentosDisponives());





    }
}


