package jour02.job08;

public class NumberLength {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(System.console().readLine());
        int length = 0;
        while (number > 0) {
            number /= 10;
            length++;
        }
        System.out.println("Your number has " + length + " digits.");
    }
}
