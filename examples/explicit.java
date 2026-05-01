public class explicit {
    public static void main(String[] args) {
             double d = 123.456;
        float f = (float) d; // double → float
        long l = (long) f;   // float → long
        int i = (int) l;     // long → int
        short s = (short) i; // int → short
        byte b = (byte) s;   // short → byte

System.out.println("double value: " + d);
        System.out.println("float value: " + f);
        System.out.println("long value: " + l);
        System.out.println("int value: " + i);
        System.out.println("short value: " + s);
        System.out.println("byte value: " + b);
    }
}
