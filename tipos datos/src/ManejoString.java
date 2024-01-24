public class ManejoString {
    public static void main(String[] args){
        String curso = "Me voy a convertir en programador Java";
        String curso2 = new String("Me voy a convertir en programador Java");
        System.out.println(curso2.toUpperCase());
        System.out.println(curso2 == curso);

        String curso3 = "Me voy a convertir en programador Java";

        String nombre = "Gustavo";
        String nombre2 = "Gustavo";

        System.out.println(nombre.equals(nombre2));
        System.out.println(curso2.length());
        System.out.println(curso2.substring(4, 20));

        System.out.println(nombre + " - " + "\"" +curso3 + "\"");
        
        String ejemplo = "Ejemplo"; //ejemplo de forma explisita
        String ejemplo2 = new String("Ejemplo"); //Ejemplo con operador new
        boolean esIgual = ejemplo == ejemplo2;
        System.out.println("esIgual = " + esIgual);

        int num1 = 10;
        int num2 = 5;

        System.out.println(nombre.concat(" ") + (num1 + num2));

        ejemplo2 = "Hola";
        System.out.println("ejemplo2 = " + ejemplo2);

        curso.transform(c -> {
            return c + " con " + nombre;
        });
        System.out.println("curso = " + curso);

    }
}
