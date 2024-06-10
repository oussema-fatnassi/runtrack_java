package jour01.job13;

public class PrintNumbers {
    public static void main (String [] args) {
        System.out.print("Give me a number:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
