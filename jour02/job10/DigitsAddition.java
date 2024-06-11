package jour02.job10;

public class DigitsAddition {
    public static void main(String [] args){
        System.out.print("Give me a number: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        String numberString = Integer.toString(number);
        for (int i = 0; i < numberString.length(); i++) {
            sum += Character.getNumericValue(numberString.charAt(i));
        }
        System.out.println("The sum of the digits of your number is: " + sum);
        scanner.close();
    }
}
