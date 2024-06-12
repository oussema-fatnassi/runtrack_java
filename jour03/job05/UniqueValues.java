package jour03.job05;

public class UniqueValues {
    public static void main(String[] args) {
        int[] tab = {1, 23, 5, 4, 1, 45, 4, 10};

        System.out.println("This is the array: ");
        for (int number : tab) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Unique values in the array:");
        for (int i = 0; i < tab.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < tab.length; j++) {
                if (i != j && tab[i] == tab[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(tab[i] + " ");
            }
        }
    }
}

