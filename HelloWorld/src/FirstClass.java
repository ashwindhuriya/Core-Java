public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        double var1 = 20.00d;
        double var2 = 80.00d;
        double res = (var1 + var2) * 100.00d;
        double rem = res % 40.00d;

        boolean isZero = rem == 0.00 ? true : false;

        System.out.println("boolean variable value: " + isZero);

        if(!isZero) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("Got nothing");
        }
    }
}
