// Faça um programa que leia um dado n positivo e uma seqüência de n temperaturas em Celsius. Calcule e
// exiba seus valores correspondentes em Fahrenheit. (F = 32 + C * 5 / 9).

import java.util.Scanner;

public class ConverteTemperatura {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        int n;
        double celsius;
        
        do{
            System.out.print( "Digite a quantidade de entradas: ");
            n = input.nextInt();
            if(n<0)
                System.out.print("Valor inválido. Digite um número positivo.\n");
        }while (n < 0);

        for(int i = 0; i < n; i++){
            System.out.print("Digite a temperatura em Celsius:  ");
            celsius = input.nextDouble();
            System.out.printf("Temperatura em Fahrenheit: %.2fF\n", ((celsius*1.8)+32));
        }    
    }
} 