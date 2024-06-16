package jour04.job08;

import java.util.ArrayList;
import java.util.List;

class SumCalculator extends Thread {
    private long start;
    private long end;
    private long partialSum;

    public SumCalculator(long start, long end) {
        this.start = start;
        this.end = end;
        this.partialSum = 0;
    }

    @Override
    public void run() {
        for (long i = start; i <= end; i++) {
            partialSum += i;
        }
    }

    public long getPartialSum() {
        return partialSum;
    }
}

public class MultiThreadedSum {
    public static void main(String[] args) {
        final long range = 10_000_000L;
        final int numThreads = 10;  
        long chunkSize = range / numThreads;
        List<SumCalculator> threads = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numThreads; i++) {
            long start = i * chunkSize + 1;
            long end = (i == numThreads - 1) ? range : (i + 1) * chunkSize;
            SumCalculator thread = new SumCalculator(start, end);
            threads.add(thread);
            thread.start();
        }

        long totalSum = 0;
        for (SumCalculator thread : threads) {
            try {
                thread.join();
                totalSum += thread.getPartialSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Total Sum: " + totalSum);
        System.out.println("Duration: " + duration + " milliseconds");
    }
}
