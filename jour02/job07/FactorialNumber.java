package jour02.job07;

public class FactorialNumber {
    public static void main (String[] args) {
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(System.console().readLine());
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}