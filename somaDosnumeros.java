/**Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
números. */

import java.util.Scanner;
public class somaDosnumeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            int numero = in.nextInt();
            soma = soma + numero;
        }
        System.out.println("A soma dos números é: " + soma);
    }
}
