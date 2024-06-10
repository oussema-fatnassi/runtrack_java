package jour01.job04;

public class VariableDeclaration {
    int a, b, c;

    public VariableDeclaration() {
        a = b = c = 0;
    }

    public static void main(String[] args) {
        VariableDeclaration vd = new VariableDeclaration();
        System.out.println("a = " + vd.a);
        System.out.println("b = " + vd.b);
        System.out.println("c = " + vd.c);
    }
}
