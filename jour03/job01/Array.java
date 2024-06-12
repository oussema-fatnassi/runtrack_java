package jour03.job01;

public class Array {
    public static void main(String[] args) {
        int[] array = {10, 0, 2, 0, 69};
        System.out.print("Array values: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Value at index 1 is : "+array[1]);
    }
}
