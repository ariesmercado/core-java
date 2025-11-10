public class Variables {

    public static void main(String[] args) {
        System.out.println("Example of int: " + getIntegerResult());
        System.out.println("Example of double: " + getDoubleResult());
        System.out.println("Example of float: " + getFloatResult());
        System.out.println("Example of char: " + getCharResult());
        System.out.println("Example of boolean: " + getBooleanResult());
        System.out.println("Example of byte: " + getByteResult());
        System.out.println("Example of short: " + getShortResult());
        System.out.println("Example of long: " + getLongResult());
        System.out.println("Example of String: " + getStringResult());
    }

    static int getIntegerResult() {
        int num1 = 2;
        int num2 = 3;
        return num1 + num2;
    }

    static double getDoubleResult() {
        double value1 = 5.75;
        double value2 = 2.25;
        return value1 * value2;
    }

    static float getFloatResult() {
        float radius = 3.5f;
        float area = 3.1416f * radius * radius;
        return area;
    }

    static char getCharResult() {
        char initial = 'A';
        return initial;
    }

    static boolean getBooleanResult() {
        int a = 10;
        int b = 5;
        return a > b;
    }

    static byte getByteResult() {
        byte smallNumber = 100;
        return smallNumber;
    }

    static short getShortResult() {
        short distance = 15000;
        return distance;
    }

    static long getLongResult() {
        long population = 7800000000L;
        return population;
    }

    static String getStringResult() {
        String greeting = "Hello, Java!";
        return greeting;
    }
}
