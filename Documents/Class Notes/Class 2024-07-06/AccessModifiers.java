import java.util.Scanner; // Package

class Car2 {
    public String color = "Red";
    private String model = "Toyota";
    String year = "2020";
    protected int speed = 100;

    public void moveForward() {
        System.out.println("Car is moving forward");
    } 

    public void showModel() {
        System.out.println("Car model is: " + model);
    }

    private void showColor() {
        System.out.println("Car color is: " + color);
    }   
}

public class AccessModifiers {
    public static void main(String[] args) {
        Car2 myCar = new Car2();

        System.out.println("Car color is: " + myCar.color);
        // System.out.println("Car model is: " + myCar.model);
        System.out.println("Car year is: " + myCar.year);
        System.out.println("Car speed is: " + myCar.speed);

        myCar.moveForward();
        myCar.moveForward();

        myCar.showModel();
        // myCar.showColor();
    }
}
