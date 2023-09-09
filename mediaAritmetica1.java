/**
 * mediaAritmetica
 */
public class mediaAritmetica1 {

    public static void main(String[] args) {
        final int a = 8;
        final int b = 9;
        final int c = 7;
        final int d = 4;
        final int e = 5;
        final int f = 6;

        int media = (a + b + c) / 3;

        System.out.println("a media aritmetica de " + a + ", " + b + " e " + c + " é: " + media);

        int media2 = (d + e + f) / 3;
        
        System.out.println("a media aritmetica de " + d + ", " + e + " e " + f + " é: " + media2);

        int soma = media + media2;
        System.out.println("a soma das medias é: " + soma);

        int media3 = soma / 2;
        System.out.println("a média das médias é: " + media3);
    }


}



