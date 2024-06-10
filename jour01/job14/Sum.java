package jour01.job14;

public class Sum {
    int num1;
    int num2;

    public Sum(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sum() {
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.print("Give me a number: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.print("Give me another number: ");
        int num2 = scanner.nextInt();

        Sum sum = new Sum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum.sum());
        scanner.close();
    }
}
