//  Aula 04 - Ex. 01: Criar uma classe Conta que contenha os métodos abaixo, e um programa que teste a classe criada.
// - saldo(real)
// +Conta()
// +Conta(saldo)
// +saldo()
// +saque(valor)
// +deposito(valor)


class Conta
{
   private double saldo;
   
   public Conta(double valor)
   {
      deposito(valor);
   }

   public Conta()
   {
   }
   
   public double saldo()
   {
      return saldo;
   }
   
   public void saque(double valor)
   {
      saldo -= valor;
   }
   
   public void deposito(double valor)
   {
      saldo += valor;
   }
}