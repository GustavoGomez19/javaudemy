public class Buleano {
    public static void main(String[] args) {
        boolean datoLogico = false;
        System.out.println("datoLogico = " + datoLogico);
        
        double d= 1321.34e-3;
        System.out.println("d = " + d);
        float f = 13.2245e2F;
        System.out.println("f = " + f);
        
        datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);
        
        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);
    }
}
