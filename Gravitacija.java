import java.util.Scanner;

public class Gravitacija {
    public static void main(String args[]) {
    }
    
    //spremenljivke potrebne za izracun gravitacijskega pospeska!
    private static double C = 6.674e-11;
    private static double M = 5.972e24;
    private static double r = 6.371e6;
    
    //nadmorskaVisina mora biti podana v metrih!
    public static double gravitacijskiPospesek(double nadmorskaVisina) {
        return (C * M) / ((r + nadmorskaVisina) * (r + nadmorskaVisina));
    }
}