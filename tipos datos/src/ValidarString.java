public class ValidarString {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        if (!esNulo){
            System.out.println(curso.toUpperCase());
        }
    }
}
