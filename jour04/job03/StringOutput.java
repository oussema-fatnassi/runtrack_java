package jour04.job03;

import java.util.UUID;
import java.io.File;

public class StringOutput extends Thread {
    private int length;
    private String result;

    public StringOutput(int length) {
        this.length = length;
    }

    public static void main(String[] args) {
        System.out.println("How many characters do you want in your string?");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int halfLength = n / 2;

        StringOutput t1 = new StringOutput(halfLength);
        StringOutput t2 = new StringOutput(n - halfLength);

        long startTime = System.currentTimeMillis();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String combinedResult = t1.result + t2.result;

        writeStringToFile(combinedResult);

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Execution time: " + duration + "ms");
    }

    static String generateString(int n) {
        StringBuilder sb = new StringBuilder();

        while (sb.length() < n) {
            sb.append(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return sb.substring(0, n);
    }

    static void writeStringToFile(String str) {
        try {
            File file = new File("jour04/job03/string.txt");
            java.io.FileWriter writer = new java.io.FileWriter(file);
            writer.write(str);
            writer.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        result = generateString(length);
    }
}