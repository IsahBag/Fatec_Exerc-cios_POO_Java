public class TesteContaEmpresa {
    public static void main(String[] args) {
        
        Conta conta = new ContaEmpresa(1234, "José Silva", 2000.00, 5000.50);
        conta.imprime();

        ((ContaEmpresa) conta).emprestimo(2000.00);
        System.out.println("\nStatus da conta após empréstimo:");
        conta.imprime();
        
        ((ContaEmpresa) conta).emprestimo(6000.00);
    }
}