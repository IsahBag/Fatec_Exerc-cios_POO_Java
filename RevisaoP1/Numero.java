// Considere um objeto que represente um número inteiro positivo. Este objeto deve ter a capacidade de:
// (a) Informar se o mesmo é ou não um número par.
// (b) Informar se o mesmo é ou não um número primo.
// (c) Fornecer o seu fatorial.
// Codifique uma classe Java que represente este objeto e um programa para testá-la.

import java.lang.Math;

public class Numero {

    private int num;

    public Numero(){
    }

    public Numero(int num){
        setNumero(num);
    }
    
    public void setNumero(int num){
        do {
            if (num>0)
                this.num = num;
            else
                System.out.println("Digite um número positivo maior que 0.");
        } while (num<=0);
    }

    public int getNumero(){
        return num;
    }

    public boolean ehPar(){
        if(num%2==0)
            return true;
        else
            return false;
    }

    public boolean ehPrimo(){
        int cont = 0;
        for(int i = 2; i < (int)Math.round(Math.sqrt(num)); i++){
            if(num%i == 0)
                cont += 1;
        }
        if(cont == 0 && num >= 2)
            return true;
        else
            return false;
    }

    public int Fatorial(){
        int fat = 1;
        for(int i = num; i > 0; i --)
            fat *= i;
        return fat;
    }

    public void mostraResultado(){
        if(ehPar())
            System.out.println("O número é par!");
        else
            System.out.println("O número é ímpar!");
        if(ehPrimo())
            System.out.println("O número é primo!");
        else
            System.out.println("O número não é primo!");
        System.out.printf("Fatorial: %d", Fatorial());
    }
}
