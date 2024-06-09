final class Dog {
    private final String breed; // Constants

    public static int dogCount = 0; // Static

    public Dog(String breed) {
        this.breed = breed;
        dogCount++;
    }
}

abstract class Test {
    public abstract void test();
}

public class NonAccessModifiers {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bulldog");
        Dog dog2 = new Dog("Poodle");
        Dog dog3 = new Dog("Labrador");

        System.out.println("Total number of dogs: " + Dog.dogCount);

        // Test test = new Test();
    }
}
