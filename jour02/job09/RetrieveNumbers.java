package jour02.job09;

public class RetrieveNumbers {
    public static void main(String[] args) {
        System.out.print("Give me a number: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();
        String numberString = Integer.toString(number);
        for (int i = 0; i < numberString.length(); i++) {
            if(i==0)
                System.out.println("The first digit of your number is : " + numberString.charAt(i));
            else if (i == numberString.length() - 1)
                System.out.println("The last digit of your number is : " + numberString.charAt(i));
        }

        scanner.close();

    }
}
