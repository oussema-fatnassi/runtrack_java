package jour02.job06;

public class AddEvenNumbers {
    public static void main (String[] args) {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of even numbers from 0 to 100 is: " + sum);
    }
}
