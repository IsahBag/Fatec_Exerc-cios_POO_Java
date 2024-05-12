import java.lang.Math;

public class Circulo extends FormaGeometrica
{
    private double raio;

    public Circulo(double raio)
    {
        setRaio(raio);
    }
    
    public void setRaio(double raio)
    {
        if (raio<0)
            this.raio = 0;
        else
            this.raio = raio;
    }

    public double area()
    {
        return (Math.PI * Math.pow(raio,2));
    }

    public void imprime()
    {
        System.out.println("Dados do Círculo:");
        super.imprime();
        System.out.println("Raio: " + raio);
    }
}
