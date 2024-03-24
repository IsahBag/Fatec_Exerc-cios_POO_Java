// Aula 02 - Ex. 02: Dada uma temperatura em Celcius, corvertê-la para Fahrenheit.

public class ConversorTemperatura{
    public static void main(String args[]) {
        
        Scanner input = new Scanner (System.in);
        float c;
        float f;

        System.out.print("Digite a temperatura em Celcius: ");

        c = input.nextFloat();
        f = 32 + c * 9/5;

        System.out.printf("A temperatura correspondente em Fahrenheit é de %4.1f\n",f);
    }
}