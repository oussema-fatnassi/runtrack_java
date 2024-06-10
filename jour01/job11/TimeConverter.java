package jour01.job11;

public class TimeConverter {
    public static void main(String[] args) {
        System.out.println("Give me the duration in minutes:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int minutes = scanner.nextInt();

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        System.out.println(minutes + " minutes is " + hours + " hours and " + remainingMinutes + " minutes.");
        scanner.close();
    }
}
