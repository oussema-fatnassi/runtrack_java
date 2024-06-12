package jour03.job02;

public class MyArray {
    public static void main (String [] args) {
        int[] array = {12, 6, 76, 89};
        for(int number : array) {
            System.out.println(number);
        }

        for(int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
        System.out.println("Array with changed values:");
        for(int number : array) {
            System.out.println(number);
        }

    }
}
