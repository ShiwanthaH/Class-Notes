import java.util.Scanner;

public class activity1 {
    public static void main(String[] args) {
        // Take 5 numbers from the user and store them in an array
        // Print the numbers in the array
        // Create a new array and store 
        // 1.abs value of sum,
        // 2.average, 
        // 3.square root of sum,
        // 4.min between average and sqrt(sum) and 
        // 5.max between average and sqrt(sum)

        // Print the output

        // Example:

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers: ");

        // Input numbers into the array
        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println();

        // Traverse the array and print the numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // Calculate the sum of the numbers
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate the abs value of sum
        int absSum = Math.abs(sum);

        // Calculate the average
        double average = sum / numbers.length;

        // Calculate the square root of sum
        double sqrtSum = Math.sqrt(sum);

        // Calculate the min between average and sqrt(sum)
        double min = Math.min(average, sqrtSum);

        // Calculate the max between average and sqrt(sum)
        double max = Math.max(average, sqrtSum);

        double[] ans = {absSum, average, sqrtSum, min, max};

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

        scanner.close();
    }
}
