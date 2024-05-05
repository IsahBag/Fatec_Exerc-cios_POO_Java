/**Suponha um banco fictício que tenha dois tipos de conta: poupança e conta empresa. Elaborar um programa com elaboração de classe e reuso.
- A poupança tem um taxa de juros para a atualização do valor investido
- A conta empresa tem um limite de empréstimo
Pede-se:
- Elaborar as classes Conta, ContaPoupança e ContaEmpresa.
- Fazer uma aplicação que leia os dados de uma conta de cada tipo e exiba os dados da conta.**/

public abstract class Conta{
    
    protected int numero_conta;
    protected String nome_titular;
    protected double saldo;

    public Conta(int numero_conta, String nome_titular, double saldo)
    {
        setNumConta(numero_conta);
        setNomeTitular(nome_titular);
        setSaldo(saldo);
    }

    public void setNumConta(int numero_conta)
    {
        this.numero_conta = numero_conta;
    }

    public int getNumConta()
    {
        return numero_conta;
    }

    public void setNomeTitular(String nome_titular)
    {
        this.nome_titular = nome_titular;
    }

    public String getNomeTitular()
    {
        return nome_titular;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public abstract double saque(double valor);
    public abstract double deposito(double valor);

    public void imprime() {
        System.out.printf("Sr(a). %s\nNúmero da conta: %d\nSaldo: R$ %.2f\n", nome_titular, numero_conta, saldo);
    }    
}