public class Retangulo {
    
    private double base, altura;

    public Retangulo(double base, double altura){
        setBase(base);
        setAltura(altura);
    }

    public Retangulo(){
        setBase(1.0);
        setAltura(2.0);
    }

    public void setAltura(double altura){
        if (altura>0)
            this.altura = altura;
        else
            this.altura = 2.0;
    }
        
    public double getAltura(){
        return altura;
    }

    public void setBase(double base){
        if (base>0)
            this.base = base;
        else
            this.base = 1.0;
    }
    
    public double getBase(){
        return base;
    }

    public double getArea(){
        return base * altura;
    }

    public double getPerimetro(){
        return base * 2.0 + altura * 2.0;
    }

    public boolean eQuadrado(){
        if (base == altura)
            return true;
        else
            return false;
    }

    public void imprimeResultado(){
        System.out.println("Altura: " + getAltura());
        System.out.println("Base: " + getBase());
        System.out.println("Área: " + getArea());
        System.out.println("Perímetro: " + getPerimetro());

        if (eQuadrado())
            System.out.println("É um quadrado.");
        else
            System.out.println("Não é um quadrado.");
    }
}
