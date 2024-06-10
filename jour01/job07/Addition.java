package jour01.job07;

public class Addition {
    double num1 = 3;
    double num2 = 73;
    double result;

    public static void main (String [] args) {
        Addition add = new Addition();
        add.result = add.num2 / add.num1;
        System.out.println(add.num2 + " / " + add.num1 + " = " + add.result);
    }
}
