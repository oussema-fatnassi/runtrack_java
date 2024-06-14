package jour04.job05;

public class ParallelCounter extends Thread {
    private int start;
    private int end;

    public ParallelCounter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is counting: " + i);
        }
    }

    public static void main(String[] args) {
        System.out.print("How high do you want to count? ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int mid = n / 2;

        ParallelCounter counter1 = new ParallelCounter(0, mid);
        ParallelCounter counter2 = new ParallelCounter(mid, n);

        long startTime = System.currentTimeMillis();

        counter1.start();
        counter2.start();

        try {
            counter1.join();
            counter2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + "ms");
    }
}
