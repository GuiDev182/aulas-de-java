/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês
com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) */

import java.util.Scanner;


   public class idadeEmDias {
      public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int ano = in.nextInt(); // 365 dias
         int mes = in.nextInt(); // 30 dias
         int dias = in.nextInt();

         int quantidadeDias = (ano * 365) + (mes * 30) + dias;
         System.out.println("A quantidade de dias é: " + quantidadeDias);
         in.close();
      }

   }

   