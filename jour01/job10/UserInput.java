package jour01.job10;

public class UserInput {
    
    public static void main(String[] args) {
        System.out.println("Enter your First Name: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String firstName = sc.nextLine();
        System.out.println("Enter your Last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Your name is " + firstName + " " + lastName);
        sc.close();
    }
}
