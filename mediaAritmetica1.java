/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média
dos números 4, 5 e 6. A soma das duas médias. A média das médias.*/
public class mediaAritmetica1 {

    public static void main(String[] args) {
        float  a = 8;
        float  b = 9;
        float  c = 7;
        float  d = 4;
        float  e = 5;
        float  f = 6;

        float media = (a + b + c) / 3;

        System.out.println("a media aritmetica de " + a + ", " + b + " e " + c + " é: " + media);

        float media2 = (d + e + f) / 3;
        
        System.out.println("a media aritmetica de " + d + ", " + e + " e " + f + " é: " + media2);

        float soma = media + media2;
        System.out.println("a soma das medias é: " + soma);

        float media3 = soma / 2;
        System.out.println("a média das médias é: " + media3);
    }


}




