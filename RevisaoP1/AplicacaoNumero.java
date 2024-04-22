import java.util.Scanner;

public class AplicacaoNumero {
    public static void main(String args[]){

        int n;
        Scanner input = new Scanner( System.in );

        System.out.print( "Digite um número: " );
        n = input.nextInt();

        Numero numero = new Numero(n);
        numero.mostraResultado();
    }
}
