
public class WT5_GT1 {
    public static void main(String[] args) {
        int[][] matrix = {
            {9, 10, 11},
            {12, 13, 14},
            {15, 16, 17}
        };

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }
}