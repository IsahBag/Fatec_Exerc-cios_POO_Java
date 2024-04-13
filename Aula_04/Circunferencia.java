// Aula 04 - Ex. 02: Criar uma classe Circunferencia capaz de retornar o valor do diâmetro, da área e do perímetro, e um programa que
// teste a classe criada.

class Circunferencia
{
   private double raio;
   
   public Circunferencia()
   {
   }
   
   public Circunferencia( double r )
   {
      setRaio(r);
   }
   
   public void setRaio(double r)
   {
      if (r>0)
         raio = r;
      else
         raio = 0;
   }
   
   public double getRaio()
   {
      return raio;
   }
   
   public double getArea()
   {
      return 3.14*raio*raio;
   }
   
   public double getCircunferencia()
   {
      return 3.14*2*raio;
   }
   
   public double getDiametro()
   {
      return 2*raio;
   }
}