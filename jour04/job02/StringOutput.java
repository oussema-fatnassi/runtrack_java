package jour04.job02;
import java.util.UUID;
import java.io.File;

public class StringOutput extends Thread{
    public static void main(String[] args) {

        Thread t = new StringOutput();
        t.start();
    }

    static String generateString(int n) {
        StringBuilder sb = new StringBuilder();
        
        while(sb.length() < n) {
            sb.append(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        return sb.substring(0, n);
    }

    static void writeStringToFile(String str) {
        try {
            File file = new File("jour04/job02/string.txt");
            java.io.FileWriter writer = new java.io.FileWriter(file);
            writer.write(str);
            writer.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        System.out.println("How many characters do you want in your string?");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        String generatedString = generateString(n);
        writeStringToFile(generatedString);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Generated string and wrote to file.");
        System.out.println("Execution time: " + duration + "ms");

        scanner.close();
    }
}
