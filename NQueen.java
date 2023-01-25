public class NQueen {
    static int countWays = 0;
    public static boolean placeQueens(int[][] board, int row) {
        if (row == board.length) {
            countWays++;
            System.out.println("way : " + countWays);
            printBoard(board);
        }

        for (int currCellIndex = 0; currCellIndex < board.length; currCellIndex++) {
            if (isSafeToPlace(board, row, currCellIndex)) {
                board[row][currCellIndex] = 1;

                boolean canPlaceQueen = placeQueens(board, row + 1);
                if (canPlaceQueen) {
                    return true;
                }

                // backtracking
                board[row][currCellIndex] = 0;
            }
        }

        return false;
    }

    private static void printBoard(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isSafeToPlace(int[][] board, int currRow, int currCellIndex) {
        for (int row = 0; row < currRow; row++) {
            if (board[row][currCellIndex] == 1) {
                return false;
            }
        }

        int i = currRow;
        int j = currCellIndex;

        while (i >= 0 && j >= 0) {
            if (board[i][j] == 1) {
                return false;
            }
            i--;
            j--;
        }

        i = currRow;
        j = currCellIndex;

        while (i >= 0 && j <= board[0].length - 1) {
            if (board[i][j] == 1) {
                return false;
            }
            i--;
            j++;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        placeQueens(board, 0);
    }
}
