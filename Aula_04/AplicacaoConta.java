import java.util.Scanner;

public class AplicacaoConta
{
   public static void main (String args[])
   {
      Scanner input = new Scanner (System.in);
      Conta saldo = new Conta ();
      int escolha;
      do
      {
         System.out.println( "Ver Saldo - Digite 1" +
                           "\nDeposito  - Digite 2" +
                           "\nSaque     - Digite 3" +
                           "\nSair      - Digite 4" );
         escolha = input.nextInt();
                           
         switch (escolha)
         {
         case 1:
               System.out.printf("O Saldo total em conta e de RS%.2f\n",saldo.saldo()); 
               break;
         case 2:
               System.out.printf("O Saldo total em conta e de RS%.2f\n",saldo.saldo());
               System.out.print("Digite o valor do deposito: ");
               saldo.deposito(input.nextDouble());
               System.out.printf("O Saldo total em conta e de RS%.2f\n",saldo.saldo());
               break;
         case 3:
               System.out.printf("O Saldo total em conta e de RS%.2f\n",saldo.saldo());
               System.out.print("Digite o valor do saque: ");
               saldo.saque(input.nextDouble());
               System.out.printf("O Saldo total em conta e de RS%.2f\n",saldo.saldo());
               break;
         case 4:
               break;
         default:
               System.out.println("Opcao invalida\n"); 
               break;
         }
      }while( escolha != 4 );
   }
}