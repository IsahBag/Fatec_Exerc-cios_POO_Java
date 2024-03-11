// Aula 03 - Ex. 03: Dado um número de conta n, exibir número de conta completo com dígito verificador:

import java.util.Scanner;

public class Ex03_aula03 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int n;
        int num;
        int digito;
        int soma = 0;        

        System.out.print("Digite o número da conta: ");
        n = input.nextInt();
        num = n;
           
        if (num > 999999)
            System.out.print("O número informado não pode ultrapassar 6 algarismos!");
        else{
            do{
                num = num/10;
                soma += n;
            }while (num!=0);

            digito = soma % 10;

            System.out.printf("Número da conta: %06d-%d", n, digito);
        } 
    }
}