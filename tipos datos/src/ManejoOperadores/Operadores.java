package ManejoOperadores;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        //Operadores arítmeticos: (+, -, *, /, %, ++, --, -(Menos unario))
        int a = 1, b = 2;
        System.out.println("Suma: " + a + b);
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("modulo: " + (a % b));
        System.out.println("Menos unario: " + (-(a + b)));

        //Operadores combinados: (+=, -=, *=, /=), sriven para simplificar una expresión
        System.out.println(a += b);
        System.out.println(b *= b);
        System.out.println(a -= a);
        System.out.println(b *= a);

        //Operador incremento-decremento: (++, --). Sirve para incrementar el número
        //Preincremento: (++a). Primero incrementa y luego devuelve el valor, lo mismo hace con el pre-decremento
        System.out.println("Preincremento");
        int c = ++a;

        //Post-incremento: (a++). Primero devuelve el valor de la variable y luego la incrementa, lo mismo hace con el post-decremento
        System.out.println("Post-incremento");
        c = a++;

        //Operador ternario: Es una versión abreviada del if-else, tiene 3 operandos y por eso el nombre de ternario
        //si la condición de se cumple devuelve el primer valor, si no, devuelve el segundo "(condición) ? valor1:valor2;"
        Scanner entrada = new Scanner(System.in);
        float matematicas = 0.0F;
        float ingles = 0.0F;
        float ciencias = 0.0F;
        String estado = "";
        System.out.print("Ingrese la nota de matemáticas: ");
        matematicas = entrada.nextFloat();
        System.out.print("Ingrese la nota de íngles: ");
        ingles = entrada.nextFloat();
        System.out.print("Ingrese la nota de ciencias: ");
        ciencias = entrada.nextFloat();

        float promedioNotas = (matematicas + ingles + ciencias) / 3;

        estado = promedioNotas >= 5.0F ? "Aprobado" : "Reprobado";
        System.out.println("Su promedio fue " + promedioNotas + ", su estado es " + estado);

        //Operadores relacionales: Comprueban relaciones de igualdad (mayor que, menor que), devuelven un valor booleano
        //(>, <, >=, <=, ==, !=)
        System.out.println(a < b);
        System.out.println(b > a);
        System.out.println(b == a);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(b <= a);

        //Operadores lógicos: permiten evaluar expresiones lógicas (AND &&, OR ||, NOT !,)
        boolean b1 = a < b && b < a;
        System.out.println("b1 = " + b1);

        // Ejemplo de login con operadores lógicos
        Scanner sc = new Scanner(System.in);
        String userName = "Gustavo";
        String pass = "12345";
        String userName2 = "Katerine";
        String pass2 = "123456";

        System.out.print("Ingrese el nombre del usuario:");
        String user = sc.nextLine();
        System.out.print("Ingrese la contraseña: ");
        String password = sc.nextLine();
       /* if (userName.equals(userName) && pass.equals(password) || userName2.equals(user) && pass2.equals(password)){
            System.out.println("Acceso concedido. " + user +  " ¡bienvenido al sistema!");
        } else {
            System.out.println("Usuario o clave no validos");
        }*/

        // Ejemplo de login usando arreglos
        String[] userNames = {"María", "José"};
        String[] passwords = {"123", "123456"};

        for (int i = 0; i < userNames.length; i++) {
            if (userNames[i].equals(user) && passwords[i].equals(password)) {
                System.out.println("Acceso concedido. " + user + " ¡bienvenido al sistema!");
                break;
            }
        }
        System.out.println("Usuario o clave no validos");

        // Número máximo con operador ternario
        int max = 0;
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = sc.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        System.out.println("Los números ingresados fueron: \n Número uno:" + num1 +
                "\n Número dos: " + num2 + "\n Número tres: " + num3 +
                "\n El número máximo es: " + max);

        // Operador instanceOf
        String texto1 = "Creando objeto de la clase String";
        Integer numero = 17;

        boolean b5 = texto1 instanceof String;

        // Carpeta 04 - video 015

    }
}
