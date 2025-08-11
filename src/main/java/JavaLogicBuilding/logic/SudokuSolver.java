package JavaLogicBuilding.logic;

public class SudokuSolver {

    private static final int SIZE = 9; // Sudoku is 9x9

    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solve(board)) {
            System.out.println("Sudoku Solved Successfully:");
            printBoard(board);
        } else {
            System.out.println("No solution exists!");
        }
    }

    // Backtracking function
    public static boolean solve(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                // Empty cell found
                if (board[row][col] == 0) {
                    // Try placing numbers 1 to 9
                    for (int num = 1; num <= SIZE; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num; // Place number

                            if (solve(board)) {
                                return true; // If next steps lead to solution
                            }

                            // Backtrack
                            board[row][col] = 0;
                        }
                    }
                    return false; // No valid number found → backtrack
                }
            }
        }
        return true; // No empty cell left → solved
    }

    // Check if placing num in (row,col) is valid
    public static boolean isSafe(int[][] board, int row, int col, int num) {
        // Row check
        for (int x = 0; x < SIZE; x++) {
            if (board[row][x] == num) return false;
        }

        // Column check
        for (int x = 0; x < SIZE; x++) {
            if (board[x][col] == num) return false;
        }

        // 3x3 subgrid check
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }
        return true;
    }

    // Print Sudoku board
    public static void printBoard(int[][] board) {
        for (int r = 0; r < SIZE; r++) {
            for (int d = 0; d < SIZE; d++) {
                System.out.print(board[r][d] + " ");
            }
            System.out.println();
        }
    }
}
