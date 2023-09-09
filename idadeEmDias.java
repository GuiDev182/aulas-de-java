import java.util.Scanner;


   public class idadeEmDias {
      public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int idadeEmDias = scanner.nextInt();
         int anos = idadeEmDias / 365;
         int meses = (idadeEmDias % 365) / 30;
         int dias = (idadeEmDias % 365) % 30;
         System.out.println(anos + " ano(s)");
         System.out.println(meses + " mes(es)");
         System.out.println(dias + " dia(s)");
      }
   }
