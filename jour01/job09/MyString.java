package jour01.job09;

public class MyString {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = new String("Hello World");

        char c[] = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        String str3 = new String(c);

        StringBuilder sb = new StringBuilder("Hello World");
        String str4 = sb.toString();

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
