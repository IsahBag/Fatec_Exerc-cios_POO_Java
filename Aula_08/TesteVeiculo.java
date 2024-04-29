public class TesteVeiculo {
    public static void main(String args[]) {

        Veiculo veiculo;
        veiculo = new Veiculo("Fiesta", "ABC1234", 2007, 34000);
        veiculo.imprime();
        
        veiculo.deprecia(10);
        System.out.println("\nVeículo depreciado:");
        veiculo.imprime();
    }
}
