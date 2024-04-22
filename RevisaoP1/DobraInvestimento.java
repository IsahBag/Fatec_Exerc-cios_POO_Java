// Escreva um programa que, a partir do capital e taxa de juros informados, calcule em quantos anos (e meses)
// seu investimento dobrará. Considere juros constantes.

import java.util.Scanner;
import java.lang.Math;

public class DobraInvestimento {
    public static void main(String args[]) {
        
        double capital, juros;
 
        capital = valida_valor();
        juros = valida_juros();

        System.out.printf("O tempo necessário para dobrar o valor R$ %.2f, com juros de %.2f%% ao mês, é de %d anos e %d mês(es).", 
                           capital, juros, (int)calcula_tempo(juros)/12,(int)calcula_tempo(juros)%12);
    }
 
    public static double valida_valor() {
        double capital;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Digite o valor do capital inicial: R$ ");
            capital = input.nextDouble();
            if(capital<0)
                System.out.println("Valor inválido. Digite um valor positivo.");
        } while(capital<0);
        return capital;
    }
    
    public static double valida_juros() {
        double juros;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Digite a taxa de juros mensal (%): ");
            juros = input.nextDouble();
            if(juros<0)
                System.out.println("Valor inválido. Digite um valor positivo.");
        } while (juros < 0);
        return juros;
    }
    
    public static double calcula_tempo (double juros) {
        return Math.round ( Math.log(2)/Math.log(1+(juros/100.0)) );
    }
}