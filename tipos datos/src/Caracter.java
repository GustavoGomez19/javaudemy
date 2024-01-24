public class Caracter {
    public static void main(String[] args) {
        char caracter = '\u0021';
        char caracter2 = '!';
        System.out.println("caracter = " + caracter);
        System.out.println("caracter = " + caracter2);
        System.out.println("caracter = caracter2 = " + (caracter == caracter2));

        System.out.println("char corresonde en byte = " + Character.BYTES);
        System.out.println("char corresonde en bites = " + Character.SIZE);
        System.out.println("char valor minìmo = " + Character.MIN_VALUE);
        System.out.println("char vaor maximo = " + Character.MAX_VALUE);
    }
}
