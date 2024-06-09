import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int[] numbers = {1, 2, 3, 4, 5};

        // System.out.println(numbers[1]); // 2

        // // for loop
        // for(int i = 0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }

        // int[] numbers2 = new int[5]; // {x, x, x, x, x} 4bytes * 5 = 20bytes

        // Input numbers into the array
        // System.out.println("Enter 5 numbers: ");
        // for(int i = 0; i < numbers2.length; i++) {
        //     System.out.print("Enter number " + (i + 1) + ": ");
        //     numbers2[i] = scanner.nextInt();
        // }

        // // Traverse the array and print the numbers
        // for (int i = 0; i < numbers2.length; i++) {
        //     // int item = numbers2[i];
        //     // if (item % 2 == 0) {
        //     //     System.out.println(item + " is even");
        //     // }
        //     System.out.print(numbers2[i] + " ");
        // }

        System.out.println();

        String[] names = {"John", "Doe", "Jane", "Doe"};

        names[0] = "Will";

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        scanner.close();
    }
}
