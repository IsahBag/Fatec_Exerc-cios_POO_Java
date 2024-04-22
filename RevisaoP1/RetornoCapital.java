// Escreva um programa que leia o valor de um capital investido e a taxa de juros mensais. Supondo que
// essa taxa seja constante ao longo de um ano, apresente o valor do investimento ao final de cada mês
// durante um ano.

import java.util.Scanner;
import java.lang.Math;

public class RetornoCapital {

    public static void main( String args[] ) {
        double capital, juros;
  
        capital = valida_valor();
        juros = valida_juros();

        for(int i = 1; i <= 12; i++) {
            System.out.printf( "O valor no final do %02dº mês é de R$ %.2f.\n", i, calcula_juros(capital, juros, i) );
        }
    }
 
    public static double valida_valor() {
        double valor;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Digite o valor do capital inicial: R$ ");
            valor =input.nextDouble();
            if(valor<0)
                System.out.println("Valor inválido. Insira um valor positivo.");
        } while (valor < 0);
        return valor;
    }
    
    public static double valida_juros() {
        double juros;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Digite o valor da taxa de juros mensal (%): ");
            juros = input.nextDouble();
            if(juros<0)
                System.out.println("Valor inválido.");
        } while (juros < 0);
        return juros;
    }
    
    public static double calcula_juros (double capital, double juros, int exp) {
        return (capital * Math.pow((1 + (juros/100) ), exp));
    }  
}