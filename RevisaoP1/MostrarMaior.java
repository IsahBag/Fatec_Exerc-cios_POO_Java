// Faça um programa que leia 3 valores inteiros, encontre e exiba o maior deles.

import java.util.Scanner;

public class MostrarMaior {
    
    public static void main(String args[]) {
        
        int num, maior;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num = maior = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num = input.nextInt();
        if(num > maior)
            maior = num;

        System.out.print("Digite o terceiro número: ");
        num = input.nextInt();
        if(num > maior)
            maior = num;

    System.out.printf("Maior: %d", maior);    
    }
}