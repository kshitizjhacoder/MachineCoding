// Game.java
import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private static Scanner scanner;

    public Game(Player p1, Player p2, Scanner scanner) {
        board = new Board();
        player1 = p1;
        player2 = p2;
        currentPlayer = p1;
        Game.scanner = scanner;
    }

    public void start() {
        System.out.println("Game Start!");
        board.displayBoard();

        while (true) {
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + ")");
            System.out.print("Enter row and column (0-indexed): ");
            int row = Game.scanner.nextInt();
            int col = Game.scanner.nextInt();

            if (!board.placeSymbol(row, col, currentPlayer.getSymbol())) {
                System.out.println(" Invalid move, try again.");
                continue;
            }

            board.displayBoard();

            if (board.checkWin(currentPlayer.getSymbol())) {
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            } else if (board.isFull()) {
                System.out.println(" It's a draw!");
                break;
            }

            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }

    }
}
