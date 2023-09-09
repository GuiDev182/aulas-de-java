/*Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor. */

public class antecessorSucessor {
    public static void main(String[] args) {
        int numero = 10;
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.println("O antecessor de " + numero + " é " + antecessor);
        System.out.println("O sucessor de " + numero + " é " + sucessor);
    }
}
