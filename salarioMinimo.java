/*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um
usuário, calcule a quantidade de salários mínimos que esse usuário ganha e
imprima o resultado. (1SM=R$788,00) */
public class salarioMinimo {
    public static void main(String[] args) {
        double salarioMinimo = 788.00;
        double salario = 1650.00;
        double resultado = salario / salarioMinimo;
        System.out.println("O salário é " + resultado + " salários mínimos");
    }
}
