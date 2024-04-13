public class AplicacaoCirc
{
   public static void main( String args[] )
   {
      Circunferencia circ = new Circunferencia();
      circ.setRaio(5);
      System.out.printf( "Circunferencia = %.2f" +
                       "\nDiametro = %.2f" +
                       "\nArea = %.2f", circ.getCircunferencia(),  circ.getDiametro(), circ.getArea());
   }
}