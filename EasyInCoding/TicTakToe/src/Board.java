public class Board {
    private String[][] board;
    private final int SIZE = 3;

    public Board() {
        board = new String[SIZE][SIZE];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = " ";
            }
        }
    }

    public boolean placeSymbol(int row, int col, String symbol) {
        if (row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col].equals(" ")) {
            board[row][col] = symbol;
            return true;
        }
        return false;
    }

    public void displayBoard() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            System.out.println("-------");
        }
    }

    public boolean checkWin(String symbol) {
        // Check rows and columns
        for (int i = 0; i < SIZE; i++) {
            if ((board[i][0].equals(symbol) && board[i][1].equals(symbol) && board[i][2].equals(symbol)) ||
                (board[0][i].equals(symbol) && board[1][i].equals(symbol) && board[2][i].equals(symbol))) {
                return true;
            }
        }
        // Check diagonals
        if ((board[0][0].equals(symbol) && board[1][1].equals(symbol) && board[2][2].equals(symbol)) ||
            (board[0][2].equals(symbol) && board[1][1].equals(symbol) && board[2][0].equals(symbol))) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }
    
}
