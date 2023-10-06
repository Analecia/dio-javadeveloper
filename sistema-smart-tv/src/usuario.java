public class usuario {
    public static void main(String[] args) throws Exception {

        smartTv SmartTv = new smartTv();
        
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.aumentarVolume();
        SmartTv.mudarCanal(07);


        System.out.println("Tv Ligada? " + SmartTv.ligada);
        System.out.println("Canal Atual? " + SmartTv.canal);
        System.out.println("Volume atual? " + SmartTv.volume);

        SmartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada? " + SmartTv.ligada);

        SmartTv.desligar ();
        System.out.println("Novo Status -> TV Ligada? " + SmartTv.ligada);

    }
}
