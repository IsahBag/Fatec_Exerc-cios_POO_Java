import java.util.Scanner;

public class ProgramaAcumulador {
    public static void main(String args[] ){
        Scanner input = new Scanner( System.in );
        Acumulador acum = new Acumulador();
        int flag = 1;
       
        while (flag == 1) {
            System.out.printf( "Digite uma opçãoo:\n" + 
                               "1- Adicionar um valor\n" +
                               "2- Verificar o total\n" + 
                               "3- Verificar a média.\n" +
                               "4- Sair\n");
            switch(input.nextInt()) {
                case 1: System.out.print( "Digite o valor cumulativo: " );
                        acum.totalize(input.nextDouble()); 
                        break;
                case 2: System.out.printf( "O total acumulado é: %.2f\n", acum.informeTotal() ); break;
                case 3: System.out.printf( "A média acumulada é: %.2f\n", acum.fornecaMedia() );break;
                case 4: flag = 2;
                        break;
                default: System.out.println( "Opção inválida.\n" );
            }
        }
    }
}

