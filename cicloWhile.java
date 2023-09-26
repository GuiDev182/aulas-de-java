import java.util.concurrent.ThreadLocalRandom;
public class cicloWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("doce do valor: :" + valorDoce + "adicionado no carrinho");
            mesada = mesada - valorDoce; 
            
        }
        System.out.println("mesada: " + mesada);
        System.out.println("joaozinho gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
