package ManejoOperadores;

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
        System.out.println(a+=b);
        System.out.println(b*=b);
        System.out.println(a-=a);
        System.out.println(b*=a);
        //Operador incremento-decremento: (++, --). Sirve para incrementar el número
        //Preincremento: (++a). Primero incrementa y luego devuelve el valor, lo mismo hace con el pre-decremento
        System.out.println("Preincremento");
        int c = ++a;
        //Post-incremento: (a++). Primero devuelve el valor de la variable y luego la incrementa, lo mismo hace con el post-decremento
        System.out.println("Post-incremento");
        c = a++;
        //Operador ternario: Es una versión abreviada del if-else, tiene 3 operandos y por eso el nombre de ternario
        //si la condición de se cumple devuelve el primer valor, sino, devuelve el segundo "(condición) ? valor1:valor2;"
        int edad = 17;
        String mayor = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(mayor);
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
        //Video 008 - Precedencia de los operadores


    }
}
