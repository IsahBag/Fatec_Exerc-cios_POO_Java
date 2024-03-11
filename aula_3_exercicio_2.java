// Aula 03 - Ex. 02: Verificar se os três valores dados formam um triângulo, informando, em caso afirmativo, se é escaleno, isósceles ou equilátero. 

import java.util.Scanner;

public class Ex02_aula03 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        float a;
        float b;
        float c;

        System.out.print("Digite o valor do lado A: ");
        a = input.nextFloat();

        System.out.print("Digite o valor do lado B: ");
        b = input.nextFloat();

        System.out.print("Digite o valor do lado C: ");
        c = input.nextFloat();

        if (a+b<c || a+c<b || b+c<a) 
            System.out.print("Não é possível formar um triângulo com as medidas dadas.");
        else{
            if (a!=b && b!=c && c!=a)
                System.out.print("Triângulo escaleno.");
            else if (a==b && b==c)
                System.out.print("Triângulo equilátero.");
            else
                System.out.print("Triângulo isósceles.");
        }
    }
}