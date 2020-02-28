public class Gravitacija {
    public static void main(String args[]) {
        int visina = Integer.parseInt(args[0]);
        
        System.out.println(gravitacijskiPospesek);
    }
    
    //spremenljivke potrebne za izracun gravitacijskega pospeska!
    private static double C = 6.674e-11;
    private static double M = 5.972e24;
    private static double r = 6.371e6;
    
    //nadmorskaVisina mora biti podana v metrih!
    public static double gravitacijskiPospesek(double visina) {
        return (C * M) / ((r + visina) * (r + visina));
    }
    
    
    public static double izpisNadmorskeVisineInPospeska(double visina){
        double pospesek = gravitacijskiPospesek(visina * 1000.0);
        
        System.out.printf("%dkm %d", visina, pospesek);
        
    }
}