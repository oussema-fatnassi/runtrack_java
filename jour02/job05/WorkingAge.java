package jour02.job05;

public class WorkingAge {
    public static void main(String[] args) {
        System.out.println("Working age");
        System.out.print("Give me your age: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 16) {
            System.out.println("You are a minor, you can't work yet");
        } 
        else if (age >= 16 && age <= 55) {
            System.out.println("You can work full-time");
        }
        else if (age > 55) {
            System.out.println("You are old, it's difficult to find a job for you");
        } 
        else if (age >= 67){
            System.out.println("You are retired, you can't work anymore");
        }
        scanner.close();
    }
}
