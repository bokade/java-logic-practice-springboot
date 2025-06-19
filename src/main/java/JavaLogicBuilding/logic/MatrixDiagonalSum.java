package JavaLogicBuilding.logic;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 12}
        };

        int n = matrix.length;
        int leftDiagonal = 0, rightDiagonal = 0;

        for (int i = 0; i < n; i++) {
            leftDiagonal += matrix[i][i];
            rightDiagonal += matrix[i][n - 1 - i];
        }

        System.out.println("Left Diagonal Sum = " + leftDiagonal);
        System.out.println("Right Diagonal Sum = " + rightDiagonal);
    }
}

