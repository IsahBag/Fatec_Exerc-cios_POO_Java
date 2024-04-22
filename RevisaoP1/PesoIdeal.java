// Dados a altura e o sexo de uma pessoa, determine seu peso ideal de acordo com as fórmulas a seguir:
// · para homens o peso ideal é 72.7*altura - 58
// · para mulheres o peso ideal é 62.1*altura - 44.7
// Nota: Faça a leitura do sexo como um valor inteiro 1- para Homens e 2 – para Mulheres.

import java.util.Scanner;

public class PesoIdeal {
    
    public static void main(String args[]) {
        
        double altura, ideal = 0;
        int sexo;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        altura = input.nextDouble();

        System.out.print("Selecione o sexo: 1- Masculino ou 2- Feminino ");
        sexo = input.nextInt();

        if(sexo == 1)
            ideal = (72.7 * altura) - 58;
        else if(sexo == 2)
            ideal = (62.1 * altura) - 44.7;

        System.out.printf("Peso ideal: %4.1f", ideal);
    }
}
