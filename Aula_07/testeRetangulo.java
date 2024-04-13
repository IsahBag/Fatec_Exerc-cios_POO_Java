public class testeRetangulo   
{
   public static void main( String args[] )
   {
      Retangulo retangulo1 = new Retangulo();
      Retangulo retangulo2 = new Retangulo(3, 3);

      System.out.println("Retângulo 1:");
      retangulo1.mostrarResultado();
      System.out.println();

      System.out.println("Retângulo 2:");
      retangulo2.mostrarResultado();
   }
}