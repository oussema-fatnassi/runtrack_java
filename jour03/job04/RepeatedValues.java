package jour03.job04;

public class RepeatedValues {
    public static void main(String[] args) {
        int[] tab = {3, 7, 3, 9, 8};

        int[] uniqueValues = new int[tab.length];
        int[] occurrences = new int[tab.length];

        int uniqueCount = 0;

        for (int i = 0; i < tab.length; i++) {
            int nombre = tab[i];
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueValues[j] == nombre) {
                    occurrences[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueValues[uniqueCount] = nombre;
                occurrences[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        for (int i = 0; i < uniqueCount; i++) {
            System.out.println("The number " + uniqueValues[i] + " occures " + occurrences[i] + " times.");
        }
    }
}
