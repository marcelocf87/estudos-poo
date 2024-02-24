public class Principal {

    public static void main(String[] args) {

//        Cliente cliente = new Cliente();
//        cliente.idade = Integer.valueOf(20);

        //Forma simplificada a partir do Java 5
        Cliente cliente = new Cliente();
        cliente.idade = 20;

        System.out.printf("Idade: %d%n", cliente.idade);

    }
}
