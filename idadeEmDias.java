/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês
com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) */

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

   