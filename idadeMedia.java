// Leia a idade de 20 pessoas e exiba a média das idades.

public class idadeMedia {
    public static void main(String[] args) {
        int idade, soma = 0;
        float media;
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade = Integer.parseInt(System.console().readLine());
            soma += idade;
        }
        media = soma / 20;
        System.out.println("A média das idades é: " + media);
    }
}
