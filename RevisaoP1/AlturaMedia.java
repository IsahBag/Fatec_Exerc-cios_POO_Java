// Exercício anterior: Dados a altura e o sexo de uma pessoa, determine seu peso ideal de acordo com as fórmulas a seguir:
// · para homens o peso ideal é 72.7*altura - 58
// · para mulheres o peso ideal é 62.1*altura - 44.7
// Nota: Faça a leitura do sexo como um valor inteiro 1- para Homens e 2 – para Mulheres.

// Altere o exercício anterior para ler uma seqüência de valores de pessoas de uma comunidade, determinando
// seu peso ideal de acordo com as fórmulas dadas no exercício anterior. Ao final (quando o usuário digitar altura
// igual a 0), informe a altura média das mulheres e dos homens.

import java.util.Scanner;

public class AlturaMedia {

    public static void main(String args[]) {
        
        double altura, ideal=0, totalm=0, totalf=0, mediam, mediaf;
        int sexo, contf=0, contm=0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Digite a altura: ");
            altura = input.nextDouble();

            if(altura != 0){
                System.out.print("Selecione o sexo: 1- Masculino ou 2- Feminino ");
                sexo = input.nextInt();

                if(sexo == 1){
                    ideal = (72.7 * altura) - 58;
                    totalm += altura;
                    contm += 1;
                }
                else if(sexo == 2){
                    ideal = (62.1 * altura) - 44.7;
                    totalf += altura;
                    contf += 1;
                }
        
                System.out.printf("Peso ideal: %4.1f\n", ideal);


            }
        } while (altura !=0);

        mediaf = totalf / contf;
        mediam = totalm / contm;

        System.out.printf("Média de altura dos homens: %5.2f\n", mediam);
        System.out.printf("Média de altura das mulheres: %5.2f\n", mediaf);
    }
    
}











