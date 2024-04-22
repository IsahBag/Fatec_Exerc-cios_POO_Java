// Faça um programa que leia o consumo de energia mensal de uma residência, calcule e exiba o valor da
// conta seguindo os seguintes critérios:
// - Consumo até 50kWh: taxa mínima de R$ 10,00
// - Consumo até 100kWh: além da taxa mínima de R$ 10,00 paga 0,20 por kWh que exceder 50.
// - Consumo até 200kWh: segue o critério anterior mais 0,25 por kWh que exceder 100.
// - Consumo maior que 200kWh: segue o critério anterior mais 0,35 por kWh que exceder 200.
// Exemplo: Consumo de 130 kWh = 50 + 50 + 30 custa 10,00 + 50*0,20 + 30*0,25 = 27,50.

import java.util.Scanner;

public class ConsumoEnergia {
    
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        double kwh, valor;
        int cont;

        System.out.print("Digite o consumo de energia do mês em kWh: ");
        kwh = input.nextDouble();
        valor = 10.0;
        cont = 0;

        if (kwh <= 50.0) {
        }
        else if (kwh <= 100.0) {
            cont = (int) (kwh - 50); 
            valor += (cont * 0.2);
        }
        else if (kwh <= 200.0) {
            cont = (int) (kwh - 100); 
            valor += (50 * 0.2) + (cont * 0.25);
        }
        else {
            cont = (int) (kwh - 200); 
            valor += (50 * 0.2) + (100 * 0.25) + (cont * 0.35);
        }

        System.out.printf("Valor da conta: %.2f", valor);
    } 
}