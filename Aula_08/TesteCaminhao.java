public class TesteCaminhao {
    public static void main(String args[]) {

        Caminhao caminhao;
        caminhao = new Caminhao("FMX", "ABC1234", 2013, 340000, 4, 3);
        caminhao.imprime();
        
        caminhao.deprecia(10);
        System.out.println("\nVeículo depreciado:");
        caminhao.imprime();
    }    
}