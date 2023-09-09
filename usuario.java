public class usuario {
    public static void main(String[] args) {
       SmartTv smartTv = new SmartTv();

       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.aumentarVolume();


       smartTv.escolherCanal(13);
    System.out.println("volume atual:" + smartTv.volume);


       System.out.println("tv ligada?" + smartTv.ligada);
       System.out.println("canal atual:" + smartTv.canal);
       System.out.println("volume atual:" + smartTv.volume);


       smartTv.ligar();
       System.out.println("tv ligada?" + smartTv.ligada);

    }
}

