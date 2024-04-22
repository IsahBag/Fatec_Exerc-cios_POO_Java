import java.util.Scanner;

public class ProgramaData {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Data data = new Data(2024);
        int dia, mes, ano;
        boolean sair = false;
        
        while(!sair) {
            System.out.printf( "Selecione uma opção: 1- Adicionar data\n" +
                               "                     2- Verificar data\n" + 
                               "                     3- Sair\n");
        switch(input.nextInt()) {
            case 1: System.out.printf( "Digite a data: \n" +
                                       "Dia: " );
                    dia = input.nextInt();
                    System.out.printf( "Mês: " );
                    mes = input.nextInt();
                    System.out.printf( "Ano: " );
                    ano = input.nextInt();
                    data.setData(dia,mes,ano);
                    break;                 
            case 2: data.mostraData(); 
                    break;
            case 3: sair = true;
                    break;
            default: System.out.println( "Opção inválida.\n" );
            }
        }
    }
}