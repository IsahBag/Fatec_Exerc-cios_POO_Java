// Considere um objeto que tenha a capacidade de totalizar valores, isto é, um objeto que, a cada vez que receber
// uma mensagem para totalizar determinado valor, some este valor com o total que o mesmo contém até então.
// Este objeto conterá sempre uma soma (um total), a qual inicialmente será zero. A cada vez que for solicitado a
// totalizar determinado valor, o objeto deverá somá-lo com seu total, obtendo um novo total.
// O objeto também deve ter a capacidade de, quando solicitado, informar qual o montante totalizado, bem como,
// qual a média dos valores já totalizados.

public class Acumulador {
    
    private double soma;
    private int contagem, flag;
          
    public Acumulador()
    {
        soma = 0;
        contagem = 1;
        flag = 0;
    }
       
    public Acumulador( double n )
    {
        soma = n;
        contagem = 1;
        flag = 1;
    }
       
    public void totalize( double valor )
    {
        soma += valor;
        if (flag == 0)
            flag = 1;
        else
            contagem++;
    }
       
    public double informeTotal()
    {
        return soma;
    }
    public int informeContagem()
    {
        return contagem;
    }
       
    public double fornecaMedia()
    {
        return soma/contagem;
    }
}