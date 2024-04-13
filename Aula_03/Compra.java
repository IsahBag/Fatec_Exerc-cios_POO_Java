// Aula 03 - Ex. 04: Fazer um programa que leia os preços das mercadorias compradas por um cliente, caculando o total e aplicando o desconto.

import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float valor;
        float total = 0;  

        do {
            System.out.print("Digite o valor do produto: ");
            valor = input.nextFloat();
            total += valor;
        } while (valor != 0.0);     

        if (total <= 50.0)
            total *= 0.95;
        else if (total <= 100.0)
            total *= 0.9;
        else if (total <= 200.0)
            total *= 0.85;
        else
            total *= 0.8;
    
        System.out.printf("Total da compra: %.2f", total);
    } 
}