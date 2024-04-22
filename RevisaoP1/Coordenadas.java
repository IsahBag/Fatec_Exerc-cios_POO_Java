// Considere um retângulo representado no sistema de coordenadas cartesianas e definido por dois pontos
// P1(x1, y1), que corresponde ao vértice superior esquerdo do retângulo e P2(x2, y2) que corresponde ao
// vértice inferior direito. Considere que o retângulo apresenta um lado paralelo ao eixo x e, conseqüentemente,
// outro lado paralelo ao eixo y.
// Escreva uma aplicação que leia x1, y1, x2, y2 e:
// (a) Determine a base do retângulo.
// (b) Determine a altura do retângulo.
// (c) Determine a área do retângulo.
// Crie uma estrutura de repetição que leia uma série de pontos:
// (a) Informe para cada um, se o mesmo encontra-se interno ao retângulo ou não.

import java.util.Scanner;

public class Coordenadas {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int opc;
        double x1, y1, x2, y2, base, altura, area;

        System.out.printf("Digite as coordenadas do ponto P1:\n" +
                          "x1: ");
        x1 = input.nextDouble();
        System.out.printf("y1: ");
        y1 = input.nextDouble();

        do{
            System.out.printf("Digite as coordenadas do ponto P2:\n" +
                               "x2: ");
            x2 = input.nextDouble();
            if(x2 == x1) 
                System.out.printf("Valor inválido. Inserir valor diferente de x1.");
            else
                System.out.printf("y2: ");  
                y2 = input.nextDouble();  
                if (x2 == x1) 
                    System.out.printf("Valor inválido. Inserir valor diferente de y1.");
        } while((x2 == x1) || (y2 == y1));
   
        base = (x1-x2 < 0) ? x2-x1:x1-x2;
        altura = (y1-y2 < 0) ? y2-y1:y1-y2;
        area = base * altura;
        
        System.out.printf( "Base   = %.2f\n" +
                           "Altura = %.2f\n" +
                           "Área   = %.2f\n", base, altura, area);
                          
        if ((opc = valida_opcao()) == 1)
            verifica_ponto(opc, x1, y1, x2, y2);
    }   
   
    public static int valida_opcao() {
        Scanner input = new Scanner( System.in );
        int opc;
        do{
            System.out.print("Gostaria de verificar se um ponto está dentro do Retângulo informado? 1-Sim 2-Não\n");
            opc = input.nextInt();
            if(opc!=1 && opc!=2)
                System.out.println("Valor inválido.");
        } while (opc != 1 && opc != 2);
        return opc;
    }
    
    public static void verifica_ponto(int opc, double x1, double y1, double x2, double y2) {
        Scanner input = new Scanner(System.in);
        double x,y;
        while (opc == 1) {
            System.out.printf("Insira as coordenadas do ponto P:\n" +
                               "x: ");
            x = input.nextDouble();
            System.out.printf("y: ");
            y = input.nextDouble();
            if (((x < x1 && x > x2) || (x < x2 && x > x1)) && ((y < y1 && y > y2) || (y < y2 && y > y1)))
                System.out.printf( "O ponto P (x = %.2f e y = %.2f) está dentro do Retângulo.\n", x, y );
            else
                System.out.printf( "O ponto P (x = %.2f e y = %.2f) não está dentro do Retângulo.\n", x, y );
            opc = valida_opcao();
        }
    }
}
