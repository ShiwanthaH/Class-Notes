class Car {
    // private, public, (protected, default) (Access Modifiers)
    // private - only accessible within the class
    // public - accessible from anywhere

    // Properties
    private String color;
    private String model;
    private int year;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;

        System.out.println("A " + color + "  color " + model + " has been created" + " in " + year + ".");
    }

}


public class constructs {
      public static void main(String[] args) {
        // Create an object of the car class
        Car car = new Car("Red", "BMW i8", 2021); // Object with constructor
    }
}
