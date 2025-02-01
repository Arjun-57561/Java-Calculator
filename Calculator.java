// This class implements all the mathematical operations.  
// It includes arithmetic operations, Fibonacci sequence, and statistical calculations. 
public class Calculator {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return a / b;
    }

    // Fibonacci sequence (Recursive)
    public int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Sum of array
    public double sum(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }

    // Mean of array
    public double mean(double[] arr) {
        return sum(arr) / arr.length;
    }

    // Variance of array
    public double variance(double[] arr) {
        double mean = mean(arr);
        double sumSquaredDiffs = 0;
        for (double num : arr) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }
        return sumSquaredDiffs / arr.length;
    }

    // Standard deviation of array
    public double standardDeviation(double[] arr) {
        return Math.sqrt(variance(arr));
    }
}
