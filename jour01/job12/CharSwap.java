package jour01.job12;

public class CharSwap {
    public static void main(String[] args) {
        System.out.println("Give me the first caracter chain:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String firstChar = scanner.next();
        System.out.println("Give me the second caracter chain:");
        String secondChar = scanner.next();
        System.out.println("Before swap: firstChar = " + firstChar + ", secondChar = " + secondChar);

        firstChar = firstChar + secondChar;
        secondChar = firstChar.substring(0, firstChar.length() - secondChar.length());
        firstChar = firstChar.substring(secondChar.length());

        System.out.println("After swap: firstChar = " + firstChar + ", secondChar = " + secondChar);
        scanner.close();
    }
}
