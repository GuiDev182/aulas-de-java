//Informar um saldo e imprimir o saldo com reajuste de 1%.



public class informarSaldo {
   public static void main(String[] args) {
    double saldo = 1000;
    double reajuste = (saldo * 0.01);
    System.out.println("Seu saldo é: " + saldo);

    double saldoTotal = saldo + reajuste;
    System.out.println("Seu saldo reajustado é: " + saldoTotal);
  

   }
}
