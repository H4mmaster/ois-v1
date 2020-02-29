public class Gravitacija {
    public static void main(String args[]) {
        double visina = Double.parseDouble(args[0]);
        
        izpisNadmorskeVisineInPospeska(visina);
    }
    
    //spremenljivke potrebne za izracun gravitacijskega pospeska!
    private static double C = 6.674e-11;
    private static double M = 5.972e24;
    private static double r = 6.371e6;
    
    //nadmorskaVisina mora biti podana v metrih!
    public static double gravitacijskiPospesek(double visina) {
        return (C * M) / ((r + visina) * (r + visina));
    }
    
    
    public static void izpisNadmorskeVisineInPospeska(double visina){
        double pospesek = gravitacijskiPospesek(visina * 1000.0);
        
        System.out.printf("Na nadmorski višini %fkm je gravitacijski pospešek %fm/s^2\n", visina, pospesek);
        
    }
}