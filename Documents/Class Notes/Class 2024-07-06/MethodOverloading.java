public class MethodOverloading {
    private void add(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
    }

    private void add(double a, double b) {
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        obj.add(5, 10);
        obj.add(10, 20);

        obj.add(2.5, 3.5);
    }

}
