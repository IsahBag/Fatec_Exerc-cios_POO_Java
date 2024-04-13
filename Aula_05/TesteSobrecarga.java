// Aula 05 = Ex. 01: Elaborar um programa simples (sem criar classes) que tenha os métodos sobrecarregados para cálculo da área de um terreno
// nos formatos (a) quadrado; (b) retangular. Faça um programa demosntrando o uso destes métodos.

import java.util.Scanner;

public class TesteSobrecarga {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        double ret_ladoa, ret_ladob, quad_lados;

        System.out.print("Digite o valor de um dos lados do retângulo: ");
        ret_ladoa = input.nextDouble();
        System.out.print("Digite o valor do outro lado do retângulo: ");
        ret_ladob = input.nextDouble();
        System.out.print("Digite o valor do lado do quadrado: ");
        quad_lados = input.nextDouble();

        System.out.printf("Área do retângulo: %.2f m2\n", Area(ret_ladoa,ret_ladob));
        System.out.printf("Área do quadrado: %.2f m2\n", Area(quad_lados));
    }

    public static double Area(double ladoa, double ladob){
        return(ladoa*ladob);
    }

    public static double Area(double lado){
        return(lado*lado);
    }
}
