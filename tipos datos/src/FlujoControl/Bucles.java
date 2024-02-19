package FlujoControl;

import java.util.Scanner;

public class Bucles {
    // Estructura if-else
    public static void main(String[] args) {
        float promedio = 5.0f;
        if (promedio > 4) {
            System.out.println("Felicidades");
        } else {
            System.out.println("Promedio muy bajo");
        }

        /* Ejemplo año bisiesto
        Scanner sc = new Scanner(System.in);
        String mes = "";
        int anio = 0;
        boolean bisiesto = false;

        System.out.print("Ingrese el año: ");
        anio = sc.nextInt();
        if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
            System.out.println("El año " + anio + " es bisiesto.");
            bisiesto = true;
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }

        System.out.print("Ingrese el mes: ");
        mes = sc.next();
        if (mes.equals("enero")) {
            System.out.println("El mes de " + mes + " tiene 31 días");
        } else if (mes.equals("febrero") && bisiesto) {
            System.out.println("El mes de " + mes + " tiene 29 días");
        } else if (mes.equals("febrero")) {
            System.out.println("El mes de " + mes + " tiene 28 días");
        } else if (mes.equals("Marzo")) {
            System.out.println("El mes de " + mes + " tiene 31 días");
        } else if (mes.equals("abril")) {
            System.out.println("El mes de " + mes + " tiene 30 días");
        } else if (mes.equals("mayo")) {
            System.out.println("El mes de " + mes + " tiene 31 días");
        } else if (mes.equals("junio")) {
            System.out.println("El mes de " + mes + " tiene 30 días");
        } else if (mes.equals("julio")) {
            System.out.println("El mes de " + mes + " tiene 31 días");
        } else if (mes.equals("agosto")) {
            System.out.println("El mes de " + mes + " tiene 31 días");
        } else if (mes.equals("septiembre")) {
            System.out.println("El mes de " + mes + " tiene 30 días");
        } else if (mes.equals("octubre")) {
            System.out.println("El mes de " + mes + " tiene 31 días");
        } else if (mes.equals("noviembre")) {
            System.out.println("El mes de " + mes + " tiene 30 días");
        } else if (mes.equals("diciembre")) {
            System.out.println("El mes de " + mes + " tiene 31 días");
        } else{
            System.out.println("El dato ingresado no corresponde a un mes válido!");
        }*/

        /* Sentencia switch - case
        System.out.print("Ingrese el número de días: ");
        int dias = sc.nextInt();
        switch (dias) {
            case 30:
                System.out.println("Los meses que tienen 30 días son: Abril, Junio, Septiembre, Noviembre");
                break;
            case 31:
                System.out.println("Los meses que tienen 31 días son: Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre");
                break;
            case 28:
                System.out.println("El mes que tiene 28 días es Febrero");
                break;
            case 29:
                System.out.println("Febrero tiene 29 días cuando es año bisiesto");
                break;
            default:
                System.out.println("Los meses no tienen menos de 28 días y tampoco mas de 31 días");
                break;
        }*/

        /* Sentencia while: primero se pregunta la condición y se cumple entra el bloque de código
        * while(condición){
        *   Bloque de código a ejecutar
        * }*/


        /*Sentencia do-while: primero ejecuta el bloque de código y luego valida la condición
        * do{
        *   Bloque de código a ejecutar
        * }while(condición);*/


        /*Sentencia for: Es muy comunmente utilizado para iterar un arreglo
        * for(inicialización; condición; incremento/decremento){
        *   bloque de código a ejecutar
        * }
        for (int i = 0; i <= 9; i++){
            System.out.println("Hola:" + i);
        }*/

        // Sentencia for con arreglos
        Scanner input = new Scanner(System.in);
        String[] nombres = new String[5];
        for (int names = 0; names < nombres.length; names++){
            System.out.print("Ingrese el nombre de la persona "+ (names+1) + ": ");
            nombres[names] = input.nextLine();
        }
        System.out.println("**RESULTADOS**");
        for (int names = 0; names < nombres.length; names++){
            System.out.println("El nombre de la persona " + (names+1) + " es: " + nombres[names]);
        }

        System.out.print("Ingrese el nombre a buscar: ");
        String search = input.nextLine();
        boolean founded = false;
        for(int s = 0; s < nombres.length; s++){
            if (search.equalsIgnoreCase(nombres[s])) {
                founded = true;
                System.out.println("El nombre " + search + " se encuentra en la lista.");
                break;
            } else if(founded) {
                System.out.println("El nombre " + search + " no se encuentra en la lista.");
            }
        }
        //Carpeta 05 video 009

    }

}
