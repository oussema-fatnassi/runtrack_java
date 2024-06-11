package jour02.job03;

public class MoltiplicationTables {
    public static void main(String[] args) {
        System.out.println("Tables de multiplication");
        System.out.print("Give me a number: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
        scanner.close();
    }
}
