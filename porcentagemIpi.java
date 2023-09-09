/*Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido no valor das
peças - o código da peça 1, valor unitário da peça 1, quantidade de peças 1 - o
código da peça 2, valor unitário da peça 2, quantidade de peças 2 O algoritmo deve
calcular o valor total a ser pago e apresentar o resultado. Fórmula : (valor1*quant1 +
valor2*quant2)*(IPI/100 + 1) */

public class porcentagemIpi {
    public static void main(String[] args) {
        double porcentagemIpi = 0.0;
        int codigoPeca1 = 0;
        int codigoPeca2 = 0;
        double valorUnitarioPeca1 = 0.0;
        double valorUnitarioPeca2 = 0.0;
        int quantidadePeca1 = 0;
        int quantidadePeca2 = 0;
        double valorTotal = 0.0;

        porcentagemIpi = Double.parseDouble(System.console().readLine("Digite a porcentagem do IPI: "));
        codigoPeca1 = Integer.parseInt(System.console().readLine("Digite o código da peça 1: "));
        valorUnitarioPeca1 = Double.parseDouble(System.console().readLine("Digite o valor unitário da peça 1: "));
        quantidadePeca1 = Integer.parseInt(System.console().readLine("Digite a quantidade da peça 1: "));
        codigoPeca2 = Integer.parseInt(System.console().readLine("Digite o código da peça 2: "));
        valorUnitarioPeca2 = Double.parseDouble(System.console().readLine("Digite o valor unitário da peça 2: "));
        quantidadePeca2 = Integer.parseInt(System.console().readLine("Digite a quantidade da peça 2: "));

        valorTotal = (valorUnitarioPeca1 * quantidadePeca1 + valorUnitarioPeca2 * quantidadePeca2) * (porcentagemIpi / 100 + 1);

        System.out.println("O valor total a ser pago é: " + valorTotal);
    }
}
