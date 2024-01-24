import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numDecimal = 0;
        try {
            numDecimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número entero"));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero.");
            main(args);
            System.exit(0);
        }
        System.out.println("numDecimal = " + numDecimal);

        JOptionPane.showMessageDialog(null, "número binario de " + numDecimal + " = " + Integer.toBinaryString(numDecimal) + "\n" +
                "número octal de " + numDecimal + " = " + Integer.toOctalString(numDecimal) + "\n" +
                "número hexadecimal de " + numDecimal + " = " + Integer.toHexString(numDecimal));

        int numBimario = 0b111110100;
        System.out.println("numBimario = " + numBimario); //Forma de declarar un número binario
        
        int numOctal = 0764;
        System.out.println("numOctal = " + numOctal); //Forma de declarar un número octal
        
        int numHexadecimal = 0x1f4;
        System.out.println("numHexadecimal = " + numHexadecimal); //Forma de declarar un número hexadecimal
        

    }
}
