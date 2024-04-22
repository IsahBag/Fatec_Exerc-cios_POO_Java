// Faça um programa que leia 3 valores inteiros, exiba os valores em ordem crescente.

import java.util.Scanner;

public class OrdemCrescente {
    
    public static void main(String args[]) {
        
        int num1, num2, num3, x;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();
        if(num1 > num2){
            x = num1;
            num1 = num2;
            num2 = x;
        }

        System.out.print("Digite o terceiro número: ");
        num3 = input.nextInt();
        if(num3 < num1){
            x=num1;
            num1 = num3;
            num3 = num2;
            num2 = x;
        }
        else if(num3 < num2){
            x=num2;
            num2 = num3;
            num3 = x;
        }
    System.out.printf("Ordem crescente: %d - %d - %d", num1, num2, num3);    
    }
}
