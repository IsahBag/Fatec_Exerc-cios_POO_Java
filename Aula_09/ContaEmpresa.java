public class ContaEmpresa extends Conta{
    
    private double limite_emprestimo;
    
    public ContaEmpresa(int numero_conta, String nome_titular, double saldo, double limite_emprestimo)
    {
        super(numero_conta, nome_titular, saldo);
        setLimiteEmprestimo(limite_emprestimo);
    }
    
    public void setLimiteEmprestimo(double limite_emprestimo)
    {
        if (limite_emprestimo < 0)
            this.limite_emprestimo = 1500.00;
        else
            this.limite_emprestimo = limite_emprestimo;
    }
    
    public double getLimiteEmprestimo()
    {
        return limite_emprestimo;
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

    public void emprestimo(double valor) {
        if (valor <= limite_emprestimo) {
            saldo += valor;
        } else {
            System.out.println("\nLimite de empréstimo excedido.");
        }
    }
}