// superclass (parent class)
// subclass (child class)

class Vehicle {
    String brand;
    String color;
    String model;

    public Vehicle() {
        System.out.println("Vehicle is created");
    }

    public void moveForward() {
        System.out.println("Vehicle is moving forward");
    }

    public void moveBackward() {
        System.out.println("Vehicle is moving backward");
    }
}

class Bike extends Vehicle {
    int wheels = 2;

    public Bike() {
        System.out.println("Bike is created");
    }

    public void moveForward() {
        System.out.println("Bike is moving forward using 2 wheels");
    }

}

class Car extends Vehicle {
    int wheels = 4;

    public Car() {
        System.out.println("Car is created");
    }
}

class DirtBike extends Bike {
    public DirtBike() {
        this.brand = "KTM";
        this.color = "Orange";
        this.model = "Duke";

        System.out.println("DirtBike is created with brand: " + brand + ", color: " + color + " and model: " + model);
    }

    public void moveForward() {
        System.out.println("DirtBike is moving forward using 2 wheels in a off-road terrain");
    }
}

class SportsCar extends Car {
    public SportsCar() {
        this.brand = "Ferrari";
        this.color = "Red";
        this.model = "F8 Tributo";

        System.out.println("SportsCar is created with brand: " + brand + ", color: " + color + " and model: " + model);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        DirtBike myDirtBike = new DirtBike();

        myDirtBike.moveForward();
        myDirtBike.moveBackward();
    }
}
