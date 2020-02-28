import java.util.Scanner;

public class Gravitacija {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Muricas fuck ye");
    }
    
    
    public static double izpisNadmorskeVisineInPospeska(double nadmorskaVisina){
        double pospesek = gravitacijskiPospesek(nadmorskaVisina * 1000.0);
        
        System.out.printf("%dkm %d", nadmorskaVisina, pospesek);
        
    }
}