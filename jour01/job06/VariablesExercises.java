package jour01.job06;

public class VariablesExercises {
    int num1 = 5;
    int num2 = 10;
    int temp;

    public static void main(String[] args) {
        VariablesExercises ve = new VariablesExercises();
        System.out.println("The value of num1 is " + ve.num1 + " and the value of num2 is " + ve.num2);
        ve.temp = ve.num1;
        ve.num1 = ve.num2;
        ve.num2 = ve.temp;
        System.out.println("The value of num1 is " + ve.num1 + " and the value of num2 is " + ve.num2);
    }
}
