package jour02.job11;

public class Triangle {
    public static void main(String[] args) {
        System.out.print("Give me the height of the triangle: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int height = scanner.nextInt();

        for (int i = 1; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
