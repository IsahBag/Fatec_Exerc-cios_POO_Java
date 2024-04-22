// Faça um programa que leia as 2 notas de um aluno, calcule e exiba a média aritmética das notas e a
// situação final do aluno (MF >= 7 - APROVADO, MF >= 4 E MF < 7 - EXAME, MF < 4 - REPROVADO).

import java.util.Scanner;

public class NotasAluno {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        float nota1, nota2, media;
        String situacao = "";

        System.out.print("Digite a nota 1 do aluno: ");
        nota1 = input.nextFloat();
        System.out.print("Digite a nota 2 do aluno: ");
        nota2 = input.nextFloat();

        media = (nota1 + nota2) / 2;

        if(media >= 7.0)
            situacao = "Aprovado(a)";
        else if(media >= 4)
            situacao = "Exame";
        else
            situacao = "Reprovado(a)";

        System.out.printf("Média final do(a) aluno(a): %5.2f\n", media);        
        System.out.printf("Situação: " + situacao);     
    }
}