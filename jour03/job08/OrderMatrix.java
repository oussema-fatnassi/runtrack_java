package jour03.job08;

public class OrderMatrix {
    public static void main (String[] args){
        int[][] matrix = {
            {5, 9, 3},
            {7, 2, 8},
            {1, 6, 4}
        };

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] orderedMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                orderedMatrix[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < orderedMatrix.length; i++) {
            for (int j = 0; j < orderedMatrix[i].length; j++) {
                for (int k = 0; k < orderedMatrix.length; k++) {
                    for (int l = 0; l < orderedMatrix[k].length; l++) {
                        if (orderedMatrix[i][j] < orderedMatrix[k][l]) {
                            int temp = orderedMatrix[i][j];
                            orderedMatrix[i][j] = orderedMatrix[k][l];
                            orderedMatrix[k][l] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("Ordered Matrix:");
        for (int i = 0; i < orderedMatrix.length; i++) {
            for (int j = 0; j < orderedMatrix[i].length; j++) {
                System.out.print(orderedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
