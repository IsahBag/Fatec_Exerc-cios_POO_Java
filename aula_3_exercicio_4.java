// Aula 03 - Ex. 04: Fazer um programa que leia os preços das mercadorias compradas por um cliente, caculando o total e aplicando o desconto.

import java.util.Scanner;

public class Ex04_aula03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float valor;
        float total = 0;  

        do {
            System.out.print("Digite o valor do produto: ");
            valor = input.nextFloat();
            if (valor <= 50.0)
                total += valor * 0.95;
            else if (valor <= 100.0)
                total += valor * 0.9;
            else if (valor <= 200.0)
                total += valor * 0.85;
            else
                total += valor * 0.8;
        } while (valor != 0.0);     
    
        System.out.printf("Total da compra: %.2f", total);
    } 
}