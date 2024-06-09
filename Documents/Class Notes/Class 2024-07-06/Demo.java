class Car1 {
    ///

    private String color;
    private String model;

    public Car1(String color, String model) {
        this.color = color;
        this.model = model;

        System.out.println("Car is created with color: " + color + " and model: " + model);

        moveForward();
    } // Constructor

    public void moveForward() {
        System.out.println("Car is moving forward");
    } // Method
}

///

public class Demo {
    // myCar
    public static void main(String[] args) {
        Car1 myCar = new Car1("Red", "Toyota");

        myCar.moveForward();
        myCar.moveForward();

    }
}