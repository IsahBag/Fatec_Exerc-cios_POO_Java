// Aula 07 - Ex. 01: 
// Modele e implemente uma classe que represente um Retângulo a partir de seus atributos: base a altura;
// Ela deve ser capaz de instanciar objetos a partir de 2 parâmetros (base a altura);
// Caso base a altura não sejam informados, instancie um retângulo de base = 2 e altura = 1;
// Cada instância deve ser capaz de i) devolver os valores de área, perímetro, base, altura; ii) informar se um objeto é um quadrado (boolen);
// Elaborar  o diagrama de classes. 

class Retangulo {
    
    private double base;
    private double altura;
    
    public Retangulo() {
        base = 2;
        altura = 1;
    }
   
    public Retangulo(double b, double a){
        setBase(b);
        setAltura(a);
    }

    public void setBase(double b) {
          base = b;
    }

    public double getBase(){
        return base;
    }

     public void setAltura(double a) {
          altura = a;
    }

    public double getAltura(){
        return altura;
    }

    public double getArea(){
        return base * altura;
    }

    public double getPerimetro(){
        return (base * 2) + (altura * 2);
    }

    public boolean ehQuadrado() {
        return base == altura;
    }

    public void mostrarResultado() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + getArea());
        System.out.println("Perímetro: " + getPerimetro());
        if (ehQuadrado()) {
            System.out.println("É um quadrado.");
        } else {
            System.out.println("Não é um quadrado.");
        }
    }
}