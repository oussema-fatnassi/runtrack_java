package jour04.job04;

public class Counter extends Thread{
    public static void main (String[] args){
        System.out.print("How high do you want to count? ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= n; i++){
            Thread t = new Counter();
            t.start();
            System.out.println("Thread is counting: " + i);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + "ms");
    }
}
