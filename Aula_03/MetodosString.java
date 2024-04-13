//  Aula 03 - Ex. 01: Apresentar 3 métodos da classe String, exemplificando seu uso:

import java.util.Scanner;

public class MetodosString{
    public static void main(String args[]){

// 1. Retornando uma string formatada com format():

        int a = 2;
        int b = 3;
        int soma;

        soma = a + b;

        String resultado = String.format("%d + %d = %d", a, b, soma);

        System.out.println(resultado);

// 2. Convertendo uma string em letras minúsculas com toLowerCase():

        String saudacao = "BOM DIA!";
        String saudacao_lowercase = saudacao.toLowerCase();

        System.out.println(saudacao_lowercase);

// 3. Concatenando duas strings:

        String s1 = "Olá!";
        String s2 = s1.concat("Tudo bem?");

        System.out.println(s2);
    }
}