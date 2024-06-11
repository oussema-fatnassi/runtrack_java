package jour02.job12;

public class Dice {
    public static void main (String[] args) {
        int combinations = 0;
        for (int i=1; i<=6; i++) {
            for (int j=1; j<=6; j++) {
                for (int k=1; k<=6; k++) {
                    combinations++;
                    System.out.println("All the possible combinations are: " + "Dice1: " + i + " Dice2 : " + j + " Dice3 : " + k);
                }
            }
        }
        System.out.println("Number of combinations: " + combinations);
    }
}
