public class Literals {
    public static void main(String args[]) {
        // Binary literal (prefix 0b or 0B)
        int binary = 0b101;  // equivalent to 5
        System.out.println("Binary literal (0b101): " + binary);

        // Octal literal (prefix 0)
        int octal = 07;  // equivalent to 7 in decimal
        System.out.println("Octal literal (07): " + octal);

        // Decimal literal (no prefix)
        int decimal = 123;  // standard base 10
        System.out.println("Decimal literal (123): " + decimal);

        // Hexadecimal literal (prefix 0x or 0X)
        int hex = 0x7E;  // equivalent to 126 in decimal
        System.out.println("Hexadecimal literal (0x7E): " + hex);
    }
}
