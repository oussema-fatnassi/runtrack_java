package jour04.job06;
import java.util.Random;

public class ArraySum extends Thread {
    int[] array;
    int sum = 0;

    public ArraySum(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int value : array) {
            sum += value;
        }
    }

    public static void main(String[] args) {
        System.out.print("How many numbers do you want in the array? ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();

        int[] array = new int[n];
        System.out.println("Generated Array Elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " "); 
        }
        System.out.println(); 

        scanner.close();

        ArraySum arraySumThread = new ArraySum(array);
        
        long startTime = System.nanoTime();
        arraySumThread.start();

        try {
            arraySumThread.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Sum: " + arraySumThread.sum);
        System.out.println("The duration of the operation is: " + duration + "nanoseconds");
    }
}
