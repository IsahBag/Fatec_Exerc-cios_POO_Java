// Faça um programa que leia os valores de uma data: o dia, o mês e o ano, com três variáveis inteiras. Faça a
// consistência da data. Considere:
// -Meses com 30 dias: 4, 6, 9, 11
// -Meses com 31 dias: 1, 3, 5, 7, 8, 10, 12
// -Ano bissexto: Divisível por 4, mas não por 100.

import java.util.Scanner;

public class DataValida {
    public static void main( String args[] ) {
        Scanner input = new Scanner( System.in);
        int dia, mes, ano;
 
        System.out.print("Digite o dia: ");
        dia = input.nextInt();
        System.out.print("Digite o mes: ");
        mes = input.nextInt();
        System.out.print("Digite o ano: ");
        ano = input.nextInt();
 
       if(data_valida(dia, mes, ano))
            System.out.printf( "A data %02d/%02d/%d é válida.", dia, mes, ano );
        else
            System.out.printf( "A data %02d/%02d/%d é inválida.", dia, mes, ano );
    }
 
    public static boolean data_valida(int dia, int mes, int ano)
    {
        switch (mes){
            case(1): 
            case(3):
            case(5):
            case(7):
            case(8):
            case(10):
            case(12):
                    if (dia > 0 && dia <= 31) 
                        return true;
                    else 
                        return false;
            case(4):
            case(6):
            case(9):
            case(11):
                    if (dia > 0 && dia <= 30) 
                        return true;
                    else 
                        return false;
            case(2): 
                    if (bissexto(ano)) {
                        if(dia > 0 && dia <= 29) 
                            return true;
                        else 
                            return false;
                    }
                    else {
                        if (dia > 0 && dia <= 28) 
                            return true;
                        else 
                            return false;
                    }                  
            default: return false;
       }         
    }
    
    public static boolean bissexto(int ano) {
        if ((ano % 400) == 0)
            return true;
        else if ((ano % 4) == 0 && (ano % 100) != 0)
            return true;
        else 
            return false;
    }
}