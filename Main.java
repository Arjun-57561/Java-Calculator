// Name: Bontha Mallikarjun Reddy
// PRN: 23070126026
// Batch: SY AIML A1


// This is the entry point of the Calculator program.  
// It manages user interactions and invokes operations from the Calculator class.  

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect Operation:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            System.out.println("5. Fibonacci Sequence\n6. Sum of Array\n7. Mean of Array");
            System.out.println("8. Variance of Array\n9. Standard Deviation of Array\n10. Exit");
            int choice = scanner.nextInt();

            if (choice == 10) {
                System.out.println("Exiting program...");
                break;
            }

            switch (choice) {
                case 1:
                    double[] numsAdd = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.add(numsAdd[0], numsAdd[1]));
                    break;
                case 2:
                    double[] numsSub = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.subtract(numsSub[0], numsSub[1]));
                    break;
                case 3:
                    double[] numsMul = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.multiply(numsMul[0], numsMul[1]));
                    break;
                case 4:
                    double[] numsDiv = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.divide(numsDiv[0], numsDiv[1]));
                    break;
                case 5:
                    System.out.print("Enter n for Fibonacci: ");
                    int n = scanner.nextInt();
                    System.out.println("Fibonacci(" + n + ") = " + calculator.fibonacci(n));
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    double[] arr = userInput.getArrayInput();
                    if (choice == 6) System.out.println("Sum: " + calculator.sum(arr));
                    else if (choice == 7) System.out.println("Mean: " + calculator.mean(arr));
                    else if (choice == 8) System.out.println("Variance: " + calculator.variance(arr));
                    else if (choice == 9) System.out.println("Standard Deviation: " + calculator.standardDeviation(arr));
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
        scanner.close();
    }
}
