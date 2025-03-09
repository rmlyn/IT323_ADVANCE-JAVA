
public class WT5_SP1 {
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 4, 8},
            {1, 3, 5},
            {3, 6, 9}
        };

        System.out.println(isSymmetric(matrix) ? "Symmetric" : "Not Symmetric");
    }

    public static boolean isSymmetric(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Check only upper triangle
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}