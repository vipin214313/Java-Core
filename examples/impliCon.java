public class impliCon {
    public static void main(String[] args) {
        //implicit conversion
        int num = 100;
        double d = num; // int automatically converted to double
        System.out.println(d); // Output: 100.0
        //explicit conversion
            double d2 = 100.99;
        int num2 = (int) d2; // double explicitly converted to int
        System.out.println(num2); // Output: 100 (fraction lost)

    }
}
