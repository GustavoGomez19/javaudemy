package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        /*
         * Ejercicio 1: Muestra los números múltiplos de 5, desde 0 a 100 utilizando
         * bucle for
         * System.out.println("*** MÚLTIPLOS DE 5, DE 0 A 100 CON BUCLE FOR ***");
         * for(int i = 0; i <= 100; i++){
         * if(i %5 == 0){
         * System.out.println("Número múltiplo de 5: " + i);
         * } else{
         * System.out.println("Número que no es múltiplo de 5: " + i);
         * }
         * }
         */

        /*
         * Ejerccio 2: Muestra los números múltiplos de 5, desde 0 a 100 utilizando
         * bucle while
         * System.out.println("*** MÚLTIPLOS DE 5, DE 0 A 100 CON BUCLE WHILE ***");
         * int flag = 0;
         * while (flag <= 100) {
         * if(flag %5 == 0){
         * System.out.println("Número múltiplo de 5: " + flag);
         * }
         * flag++;
         * }
         */

        /*
         * Ejerccio 3: Muestra los números múltiplos de 5, desde 0 a 100 utilizando
         * bucle do-while
         * System.out.println("*** MÚLTIPLOS DE 5, DE 0 A 100 CON BUCLE DO-WHILE ***");
         * int flag = 0;
         * do {
         * if(flag %5 == 0){
         * System.out.println("Número múltiplo de 5: " + flag);
         * }
         * flag++;
         * }while (flag <= 100);
         */

        /*
         * Ejercicio 4: Mostrar los números del 320 al 160, contando del 20 en 20 hacía
         * atras con un bucle for
         * System.out.
         * println("*** CONTEO REGRESIVO DE 20 EN 20 DESDE EL 320 AL 160 CON BUCLE FOR ***"
         * );
         * for(int i = 320; i >= 160; i-=20){
         * System.out.println("Número: " + i);
         * }
         */

        /*
         * Ejercicio 5: Mostrar los números del 320 al 160, contando del 20 en 20 hacía
         * atras con un bucle while
         * System.out.
         * println("*** CONTEO REGRESIVO DE 20 EN 20 DESDE EL 320 AL 160 CON BUCLE WHILE ***"
         * );
         * int num = 320;
         * while (num >= 160) {
         * System.out.println("Número: " + num);
         * num -=20;
         * }
         */

        /*
         * Ejercicio 6: Mostrar los números del 320 al 160, contando del 20 en 20 hacía
         * atras con un bucle while
         * System.out.
         * println("*** CONTEO REGRESIVO DE 20 EN 20 DESDE EL 320 AL 160 CON BUCLE DO-WHILE ***"
         * );
         * int num = 320;
         * do {
         * System.out.println("Número: " + num);
         * num -=20;
         * }while(num >= 160);
         */

        /*
         * Ejercicio 7: Realiza el control de acceso a una caja fuerte. La combinación
         * será un número de 4 cifras. El programa nos pedirá la combinación
         * para abrirla. Si no acertamos, se nos mostrará el mensaje
         * “Lo siento, esa no es la combinación” y si acertamos se nos dirá
         * “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
         * oportunidades para abrir la caja fuerte.
         
        System.out.println("*** APERTURA DE CAJA FUERTE ***");
        Scanner input = new Scanner(System.in);
        int passAcces = 2017;
        int attemps = 4;
        while (attemps <= 4) {
            System.out.print("Ingrese la clave de acceso de 4 digitos: ");
            int pass = input.nextInt();
            if (pass != passAcces) {
                System.out.println("Lo siento, clave incorrecta. Le quedan " + (attemps - 1) + " intentos.");
                attemps--;
                if (attemps == 0) {
                    System.out.println("Ha superado el límite de intentos.");
                    break;
                }
            } else {
                System.out.println("la caja fuerte se ha abierto correctamente.");
                break;
            }
        }*/

        /* Ejercicio 8: Mostrar la tabla de múltiplicar de un número ingresado por teclado 
        System.out.println("*** TABLE DE MÚLTIPLICAR ***");
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el número para saber la tabla de múltiplicar: ");
        int number = input.nextInt();
        System.out.println("Tabla de múltiplicar del número " + number);
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + number*i);
        }*/

        /* Ejercicio 9: Realizar un programa que indique cuantos digito tiene un número ingresado por teclado 
        System.out.println("*** TSABER LA ACNTIDAD DE DIGITOS DE UN NÚMERO ***");
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el número: ");
        String number = input.next();
        int amount = number.length();
        int counter = 0;
        for (int i = 0; i < amount; i++) {
            counter++;
        }
        System.out.println("La cantidad de digitos del número ingresado es: " + counter);*/

        /* Ejercicio 10: Escribe un programa que calcule la media de un conjunto de números
         * positivos introducidos por teclado. A priori, el programa no sabe
         * cuántos números se introducirán. El usuario indicará que ha terminado
         * de introducir los datos cuando meta un número negativo.
         
        System.out.println("*** CALCULAR LA MEDIA DE LOS NÚMEROS INGRESADOS ***");
        Scanner input = new Scanner(System.in);
        
        int number = 0;
        int amountNumbers = 0;
        double media = 0;
        int sumaNumbers = 0;
        while(number >= 0){
            System.out.print("Ingrese los números para calcular la media, para finalizar ingrese un número negativo: ");
            number = input.nextInt();
            amountNumbers++;
            sumaNumbers = sumaNumbers + number;

        }
        media = sumaNumbers / amountNumbers;
        System.out.println("El promedio es: " + media);*/

        /* Ejercicio 11: Escribe un programa que muestre en tres columnas, el cuadrado y
         * el cubo de los 5 primeros números enteros a partir de uno que se
         * introduce por teclado.
         */
        System.out.print("Ingrese el número: ");
        int number = Integer.parseInt(System.console().readLine());

        System.out.println("   n  |    n²   |    n³");
        System.out.println("===========================");
        for(int i = number; i < number+5; i++){
            System.out.printf("%5d |%8d |%9d\n", i, i * i, i * i * i);
        }

    }
}
