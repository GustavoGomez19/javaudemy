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

        // Ejemplo año bisiesto
        Scanner sc = new Scanner(System.in);
        String mes = "";
        int anio = 0;
        System.out.print("Ingrese el mes: ");
        mes = sc.next();
        System.out.print("Ingrese el año: ");
        anio = sc.nextInt();

        if (mes.equals("enero")) {
            System.out.println("El mes de " + mes + " tiene 31 días");
        } else if (mes.equals("febrero") && anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
            System.out.println("El mes de " + mes + " es bisiesto y tiene tiene 29 días");
        } else {
            System.out.println("El mes de " + mes + " tiene 28 días");
        }
        if (mes.equals("Marzo")) {
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
        }

        // Sentencia switch - case
        int dias = 30;
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
                System.out.println("Los mese no tienen menos de 28 días y tampoco mas de 31 días");
                break;
        }

        // Carpeta 05 - Flujos de control video 004

    }

}
