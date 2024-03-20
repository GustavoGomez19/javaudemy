package ManejoExcepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Excepciones {

    public static void main(String[] args) {

        // Ejemplo try-catch y finally
        System.out.println("***** EJEMPLO TRY-CATCH Y FINALLY *****");
        try {
            int division = 10 / 0;
            System.out.println(division);
        } catch (Exception e) {
            System.out.println("Ocurrió una excepcion. " + e.getMessage() + ". No se puede dividir por 0");
        } finally {
            System.out.println("Fin de la ejecución del programa.");
        }

        /*
         * Bloque try: se utiliza para envolver el código a ejecutar y que puede generar
         * una excepción.
         * Bloque catch: Se utiliza para capturar la excpeción que se puede generar el
         * bloque try, se pueden
         * usar uno a más bloques catch asociados.
         * Bloque finally: Se utiliza para ejecutar código el cual se debe ejecutarse si
         * o si, independientemente
         * de si se ha presentado una excepción o no. Se usa para liberar recursos que
         * deben cerrarse, como conexiones
         * a bases de datos o archivos
         */
        System.out.println();

        System.out.println("***** EJEMPLO EXCEPCIONES VERIFICADAS *****");
        // Ejemplos con clases de excepciones
        // Checked Exceptions
        try {
            File file = new File("Archito.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo solicitado. " + e.getMessage());
        }

        System.out.println();

        System.out.println("***** EJEMPLO EXCEPCIONES PERSONALIZADAS *****");
        // Ejemplos con clases de excepciones
        // Custom Excpetions
        try {
            throw new MyException("Este es un mensaje excepción personalizada");
        } catch (MyException e) {
            System.out.println("Se ha producido una excpeción personalizada. " + e.getMessage());
        }
        /* Cuando es útil crear excepciones personalizadas: es util en varios escenarios. Se pueden crear
         * para capturar situaciones únicas 
         */

        System.out.println();

        System.out.println("***** EJEMPLO EXCEPCIONES NO VERIFICADAS *****");
        // Ejemplos con clases de excepciones
        // Unchecked Exceptions
        int[] arr = { 1, 2, 3 };
        System.out.println(arr[5]); // Genera excepción IndexArrayOutOfBoundExcpetion
        /*
         * La excepción IndexArrayOutOfBoundExcpetion es una excpeción no verificada, lo
         * que significa que no es
         * obligatorio manejarla explicitamente en un bloque try-catch. Esto se debe a
         * que es responsabilidad
         * del programador garantizar que se acceda a los elementos del array dentro de
         * sus límites válidos.
         */

    }

}

class MyException extends Exception {
    String mensaje;

    public MyException(String mensaje) {
        super(mensaje);

    }
}
