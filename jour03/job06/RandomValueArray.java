package jour03.job06;

public class RandomValueArray {
    public static void main (String[] args){
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 100);
        }

        System.out.println("This is the array: ");
        for (int number : tab) {
            System.out.print(number + " ");
        }
        System.out.println();    
    }
}
