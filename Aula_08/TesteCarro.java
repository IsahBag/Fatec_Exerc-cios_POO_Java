public class TesteCarro {
    public static void main(String args[]) {

        Carro carro;
        carro = new Carro("Fiesta", "ABC1234", 2007, 34000, 4, 2008);
        carro.imprime();
        
        carro.deprecia(10);
        System.out.println("\nVeículo depreciado:");
        carro.imprime();
    }
}
