// Exercício 4: faça um programa que leia e armazene as alturas de um grupo de 20 pessoas, calcule a média e
// indique quantas pessoas estão acima dessa média.

import java.util.Scanner;

public class MediaAltura
{
    public static void main(String args[])
    {
        int acima_media=0;
        double media=0, soma=0;
        double alturas[] = new double[20];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 20; i++)
        {
            System.out.printf("Insira a altura da pessoa nº %d: ",  i+1);
            alturas[i] = input.nextDouble();
            soma += alturas[i];
        }
        media = soma/(alturas.length);

        System.out.printf("A alura média da amostra é %.2f.\n",  media);

        for(int i = 0; i < (alturas.length); i++) 
        {
            if(alturas[i] < media)
                acima_media += 1;
        }

        System.out.printf("%d pessoas estão acima da média!\n",  acima_media);
    }
}