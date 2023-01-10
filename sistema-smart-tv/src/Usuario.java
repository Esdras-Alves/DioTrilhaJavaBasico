public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);



        smartTv.ligar();
        System.out.println(" Novo Status -> TV ligada? " + smartTv.ligada);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        smartTv.mudarCanal(22);
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.desligar();
        System.out.println(" Novo Status -> TV ligada? " + smartTv.ligada);
    }
}
