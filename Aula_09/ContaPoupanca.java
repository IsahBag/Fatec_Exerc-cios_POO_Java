public class ContaPoupanca extends Conta{
    
    private double taxa_juros;

    public ContaPoupanca(int numero_conta, String nome_titular, double saldo)
    {
        super(numero_conta, nome_titular, saldo);
    }

    public void atualizaSaldo(double taxa_juros)
    {
        setSaldo(saldo * (1 + taxa_juros));
    }

    @Override
    public double saque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return valor;
        } else {
            System.out.println("\nSaldo insuficiente para saque.");
            return 0;
        }
    }

    @Override
    public double deposito(double valor) {
        saldo += valor;
        return saldo;
    }
}
