// Aula 02 - Ex. 01: Dado um valor em reais, convertê-lo para dólar.

import java.util.Scanner;

public class ConversorMoeda{
	public static void main(String args[]) {

		Scanner input = new Scanner (System.in);
        double real;
        double dolar;

        System.out.print("Digite o valor em reais: R$ ");

        real = input.nextDouble();
        dolar = real * 4.96;

        System.out.printf("O valor correspondente em dólar é $ %7.2f\n", dolar);
	}
}