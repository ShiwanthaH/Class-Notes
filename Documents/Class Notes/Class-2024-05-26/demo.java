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

        System.out.println("A " + color + " color " + model + " has been created" + " in " + year + ".");
    }

    // Methods
    public void getColor() {
        System.out.println("The color of the car is " + color);
    }

    public void setColor(String color) {
        this.color = color;
    }

}


public class demo {
    // OOP - Object Oriented Programming
    // Class - BMW i8
    // Object - BMW i8 - ABC123 (An Instance of the class)

    // Properties - color, model, year, make, engine, doors, seats, wheels, windows, sunroof
    // Methods - start, stop, accelerate, decelerate, openDoors, closeDoors, openWindows, closeWindows, openSunroof, closeSunroof


    public static void main(String[] args) {
        // Create an object of the car class
        Car myCar = new Car("Red", "BMW i8", 2021); // Object of the Car class, Instance of the Car class

        // Access the properties of the object
        // System.out.println(myCar.color);
        // System.out.println(myCar.model);
        // System.out.println(myCar.year);

        // // Access the methods of the object
        // myCar.start();
        myCar.getColor();
        myCar.setColor("Blue");
        myCar.getColor();
    }
}
