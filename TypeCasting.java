public class TypeCasting {
    public static void main(String[] args) {
        // type casting example below - byte to integer
        byte a = 127;
        int b = 256;
        b = a;

        System.out.println(b);

        // another type casting example below - integer to byte
        byte l = 127;
        int m = 256;
        l = (byte) m;
        System.out.println(l);
    }
}
