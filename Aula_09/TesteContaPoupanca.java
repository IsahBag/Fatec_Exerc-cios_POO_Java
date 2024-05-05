public class TesteContaPoupanca {
    public static void main(String args[]) {
      
        Conta conta = new ContaPoupanca(1234, "José Silva", 2000.00);
        conta.imprime();


        conta.saque(500);
        System.out.println("\nStatus da conta após saque:");
        conta.imprime();

        ((ContaPoupanca) conta).atualizaSaldo(0.05);
        System.out.println("\nStatus da conta após atualização:");
        conta.imprime();

        conta.deposito(200);
        System.out.println("\nStatus da conta após depósito:");
        conta.imprime();

        conta.saque(3000);
    }
}
