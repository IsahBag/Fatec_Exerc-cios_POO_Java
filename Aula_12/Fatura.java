public class Fatura implements Pagavel
{
    private int quantidade;
    private double preco;

    public Fatura(int quantidade, double preco)
    {
        if (quantidade < 0)
            System.out.println("Quantidade de itens deve ser maior que zero.");
        else
            this.quantidade = quantidade;

        if (preco < 0)
            System.out.println("O preço dos itens deve ser maior que zero.");
        else 
            this.preco = preco;
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    public double getPreco()
    {
        return preco;
    }

    public double getPagamento()
    {
        return quantidade * preco;
    }
}
