// Leia a idade de 20 pessoas e exiba a soma das idades.

public class idade20 {
    public static void main(String[] args) {
        int idade, soma = 0;
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade: ");
            idade = Integer.parseInt(System.console().readLine());
            soma += idade;
        }
        System.out.println("A soma das idades é: " + soma);
    }
}

