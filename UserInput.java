import java.util.Scanner;

// This class handles user input for numbers, arrays, and operation selection.  
// It ensures data collection is structured and efficient.  

public class UserInput {
    private Scanner scanner = new Scanner(System.in);

    // Function to get two numbers from the user
    public double[] getTwoNumbers() {
        double[] nums = new double[2];
        System.out.print("Enter first number: ");
        nums[0] = scanner.nextDouble();
        System.out.print("Enter second number: ");
        nums[1] = scanner.nextDouble();
        return nums;
    }

    // Function to get an array from the user
    public double[] getArrayInput() {
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        double[] arr = new double[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
        }
        return arr;
    }
}
