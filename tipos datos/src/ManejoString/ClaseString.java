package ManejoString;

public class ClaseString {

    public static void main(String[] args){
        /*Los ´String´ son objetos de Java, del tipo referencia
        * Para incluir comillas dobles, se debe escapar ""\"
        * Los carácteres de un String se codifican usando Unicode
        * Son inmutables*/

        /*String nombre = "Gustavo"; //Se crea la instancia en la literal
        String nombre2 = new String("Gustavo"); //Se crea con la instancia
        String tema = new String(" aprnde manejo de \"String\"");
        String otroString = "  hola  ";
        String concatenacion = nombre + tema;
        System.out.println(concatenacion);

        *//*Comparación de String, los String no son tipos de datos primitivos
        * Por lo tanto no se pueden comparar con el operador relacional de igualdad (==)
        * Si se compara con == no se compara por valor como lo hace en los primitivos
        * Para compara se debe utilizar el método .equals()*//*

        //Hace la comparación si son el mismo objeto
        System.out.println("Son el mismo objetos? " + (nombre==nombre2));

        //Hace la comparación si son el mismo valor
        System.out.println("Tienen el mismo valor? " + nombre.equals(nombre2));*/

        /*Métodos de la clase String:
        * (int) length(): Muestra el número de carácteres
        * (boolean) equals(String b): Compara por valor si ambos Strings son iguales
        * (boolean) equalsIgnoreCase(String b): Compara por valor si ambos Strings son iguales,
        * Sin importar mayúsculas o minúsculas
        * (int) compareTo(String b): Compara contra la cadena del argumento devolviendo:
        *   - un valor negativo si la cadena es anterior a 'b'
        *   - cero (0) si la cadena es igual a 'b'
        *   - un valor positivo si la cadena es posterior a 'b'
        * (String) trim(): Crea un nuevo objeto eliminando el espacio en blanco que pudiera haber
        * Al principio o al final
        * (char) charAt(): Extrae el carácter en la posición indicada
        * (char) toCharArray(): Convierte la cadena en arreglo de cráteres
        * (String) substring(int a, int b): Extrae la subcadena entre las posiciones a y b
        * (String) substring(int desde): Extrae la subcadena desde la posición indicada
        * (int) indexOf(String cadena): Indican en qué posición se encuentra el carácter
        * (o cadena) indicado por primera vez, buscando desde el principio
        * (int) lastIndexOf(String cadena): Indican en qué posición se encuentra el carácter
        * (o cadena) indicado por primera vez, buscando desde el final
        * (boolean) startsWith(String prefijo): Dice si la cadena empieza con el prefijo indicado
        * (boolean) andsWitH(String sufijo): Dice si la cadena acaba con el sufijo indicado
        * (String[]) split(String patron): Divide la cadena en varias subcadenas utilizando el patrón
        * Indicado como separador*/

        /*System.out.println(nombre.length());
        System.out.println("Tienen el mismo valor? " + nombre.equals(nombre2));
        System.out.println("Tienen el mismo valor? " + nombre.equalsIgnoreCase(nombre2));
        System.out.println(nombre2.compareTo(tema));
        System.out.println(otroString.trim());
        System.out.println(nombre.charAt(4));

        String curso = "Programación Java"; //Se crea la instancia en la literal
        String curso2 = new String("Programación Java"); //Se crea con la instancia
        //Comparaciones
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual); // Compara por objeto
        esIgual = curso.equals(curso2); // Compara por valor
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);*/

        /* CONCATENACIÓN
        String nombre = "Gustavo";
        String apellido = "Gustavo";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("nombre completo = " + nombreCompleto);
        int numA = 10;
        int numB = 15;
        System.out.println("Concatenación String + entero: " + nombreCompleto + " " + "("+(numA + numB)+")");
        System.out.println(numA + numB+ " " + nombreCompleto);*/

        /*INMUTABILIDAD DEL STRING: Una característica del String es que su valor es inmutable, cuando se cambia el
        * Valor, lo que se hace es crear un nuevo objeto y se guarda en esa variable
        String nombre = "Gustavo";
        String apellido = "Gomez";
        String nombreCompleto = nombre.concat(apellido);
        System.out.println("nombre = " + nombreCompleto);

        Forma de transformar expresiones lambda conocida como función flecha, recibe como parámetro el String, se modifica
        * y luego se retorna el resultado
        String nombreCompleto2 = nombre.transform(n -> {
            return n + " " + apellido;
        });
        System.out.println("nombre completo = " + nombreCompleto2);
        // REEMPLAZAR UN CARÁCTER
        String apellidoModificado = apellido.replace("o", "ó");
        System.out.println("apellido = " + apellidoModificado);*/

        /* TEST RENDIMIENTO DE CONCATENACIÓN
        String textoA = "Gustavo";
        String textoB = "Gomez";
        String textoC = textoA;

        // Instancia del StringBuilder que recibe un parámetro. Permite crear un String, anexar elementos con el método append()
        // y con el método toString() se genera el String completo, le SB es mutable
        StringBuilder sb = new StringBuilder(textoC);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 500; i++){
            //textoC = textoC.concat(textoA).concat(textoB).concat("\n"); 3 milisegundos
            //textoC += textoA + textoB + "\n"; 11 milisegundos
            sb.append(textoA).append(textoB).append("\n"); //0 milisegundos
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println(textoC);
        System.out.println(sb.toString());*/

        /* VALIDAR LOS STRING
        * Saber si la instancia es 'null', si tiene alguna referencia la variable del tipo String
        * o si tiene algún largo, un contenido o solo tiene un espacio en blanco
        String nombre = null; // Sin instancia
        // Validación null, si se trata de hacer alguna operación con una variable 'null', el resultado es NullPointerException
        boolean esNull = nombre == null;
        System.out.println("esNull = " + esNull);

        if(esNull){
            nombre = "";
        }
        boolean esVacio = nombre.length() == 0; // Valida que no esté vacío
        boolean esEmpty = nombre.isEmpty(); // Valida que no esté vacío
        boolean esBlanco = nombre.isBlank(); // Valida que no esté en blanco o esté vacío
        if (!esBlanco){
            System.out.println(nombre.toUpperCase());
            System.out.println("Hola ".concat(nombre));
        }*/

        /* EJEMPLO STRING MÉTODOS */
        String nombreCompleto = "Gustavo Adolfo Gómez Quiñones";
        // Conocer el número de carácteres de una cadena
        System.out.println("Cantidad de carácteres: " + nombreCompleto.length());
        // Convertir la cadena a MAYÚSCULA
        System.out.println("Cadena en mayúscula: " + nombreCompleto.toUpperCase());
        // Convertir la cadena a minúscula
        System.out.println("Cadena en minúscula: " + nombreCompleto.toLowerCase());
        // Comparación de String a nivel de valor
        System.out.println("Gustavo".equals(nombreCompleto));
        // Comparación de String a nivel de valor ignorando mayúsculas
        System.out.println("gustavo adolfo gómez quiñones".equalsIgnoreCase(nombreCompleto));
        // Comparación de carácteres. Comparación de orden léxico - gráfico
        // Si el valor es 0 las cadenas son iguales
        System.out.println("Gustavo Adolfo Gómez Quiñones".compareTo(nombreCompleto));
        // Si el valor es negativo la cadena es menor a 'nombreCompleto'
        System.out.println("Gustavo".compareTo(nombreCompleto));
        // Si el valor es positivo la cadena es mayor a "Gustavo"
        System.out.println(nombreCompleto.compareTo("Gustavo"));
        // Obtener un carácter en especial
        System.out.println("Carácter del indice 5: " + nombreCompleto.charAt(5));
        // Obtener de forma dinámica el último carácter
        System.out.println("Último carácter: " + nombreCompleto.charAt(nombreCompleto.length()-1));
        // Obtener un fragmento del String .subString(int a, int b) puede recibir 1 o 2 argumentos
        // y siempre el primer argumento es inclusive
        System.out.println("subString con un argumento: " + nombreCompleto.substring(15));
        System.out.println("subString con dos argumentos: " + nombreCompleto.substring(0, 14));

        // Carpeta 03 - video 008

    }

}
