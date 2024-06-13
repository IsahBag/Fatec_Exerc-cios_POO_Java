import java.util.Scanner;   

public class SistemaFinanceiro 
{
    public static void main(String args[]) 
    {
        int qtd_itens, matricula;
        double salario_mensal, preco_itens;
        String tipo, nome, cargo;

        Pagavel p;

        Scanner sInput = new Scanner(System.in);
        Scanner nInput = new Scanner(System.in);

        System.out.println("Tipo de pagamento? (f - fatura / s - salário)");        
        tipo = sInput.nextLine();

        if (!tipo.equalsIgnoreCase("f") && !tipo.equalsIgnoreCase("s"))
            System.out.println("Tipo de pagamento não identificado!");
        else
        {
            if(tipo.equalsIgnoreCase("f"))
            {
                System.out.println("Quantidade de itens: ");
                qtd_itens = nInput.nextInt();
                System.out.println("Valor unitário: ");
                preco_itens = nInput.nextInt();
                p = new Fatura(qtd_itens, preco_itens);
            }
            else 
            {
                System.out.println("Matrícula: ");
                matricula = nInput.nextInt();
                System.out.println("Nome: ");
                nome = nInput.nextLine();
                System.out.println("Cargo: ");
                cargo = nInput.nextLine();
                System.out.println("Salário: ");
                salario_mensal = nInput.nextDouble();
                p = new FuncionarioAssalariado(matricula, nome, cargo, salario_mensal);
            }
            System.out.println(p.getPagamento());
        }
    }
}
