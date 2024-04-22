import java.util.Scanner;

public class AplicRetangulo {
    public static void main(String args[]){

        double a, b;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a medida da base do retângulo: ");
        b = input.nextDouble();
        System.out.print("Digite a medida da altura do retângulo: ");
        a = input.nextDouble();

        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo(4.0, 4.0);
        Retangulo retangulo3 = new Retangulo(b,a);

        System.out.println("Triângulo 1:");
        retangulo1.imprimeResultado();
        System.out.println();

        System.out.println("Triângulo 2:");
        retangulo2.imprimeResultado();
        System.out.println();

        System.out.println("Triângulo 3:");
        retangulo3.imprimeResultado();





    }
}
