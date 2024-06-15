package jour04.job07;
import java.util.Random;

public class ArraySum extends Thread {
    int[] array;
    int start;
    int end;
    int partialSum = 0;

    public ArraySum(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            partialSum += array[i];
        }
    }

    public int getPartialSum() {
        return partialSum;
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

        int mid = n / 2;

        ArraySum firstHalfSum = new ArraySum(array, 0, mid);
        ArraySum secondHalfSum = new ArraySum(array, mid, n);

        long startTime = System.nanoTime();
        firstHalfSum.start();
        secondHalfSum.start();

        try {
            firstHalfSum.join(); 
            secondHalfSum.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = firstHalfSum.getPartialSum() + secondHalfSum.getPartialSum();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Sum: " + totalSum);
        System.out.println("The duration of the operation is: " + duration);
    }
}
