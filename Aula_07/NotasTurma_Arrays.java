import java.util.Scanner;

public class NotasTurma_Arrays {
    public static void main(String[] args) {
        final int alunos = 5;
        final int provas = 2;

        int lin, col;
        double media, mediaTurma;
        double[][] notas = new double[alunos][provas+1];
        Scanner input = new Scanner(System.in);

        mediaTurma = 0;
        for (lin = 0; lin < alunos; lin++) {
            media = 0;
            System.out.printf("Digite as notas do %do aluno: ", lin + 1);
            for (col = 0; col < provas+1; col++) {
                if (col <= 1){
                    notas[lin][col] = input.nextDouble();
                    media += notas[lin][col];
                }
                else 
                    notas[lin][col] = media/provas;
            }
            mediaTurma += media/provas;
        }
        mediaTurma /= alunos;

        System.out.println();
        System.out.println("Notas e Média");
        
        for (lin = 0; lin < alunos; lin++) {
            System.out.printf("\nAluno %d: ", lin + 1);

            for (col = 0; col < provas+1; col++) {
                if (col <= 1)
                    System.out.printf("%2.2f ", notas[lin][col]);
                else 
                    System.out.printf("- Média %.2f", notas[lin][col]);

                if (col == 2){
                    if (notas[lin][col] < mediaTurma)
                        System.out.print(" - Abaixo da média");
                    else if (notas[lin][col] == mediaTurma)
                        System.out.print(" - Na média");
                    else 
                    System.out.print(" - Acima da média");
                }                    
            }
        }
        System.out.printf("\nMédia da turma: %2.2f", mediaTurma);
    }
}