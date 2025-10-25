import java.util.Scanner;

public class Main{
    String player1;
    String player2;
    String symbol1;
    String symbol2;
    static final Scanner scanner = new Scanner(System.in); 

    public void getInput(){
        System.out.println("Enter name for Player 1:");
        player1 = scanner.nextLine();
        System.out.println("Enter symbol for Player 1:");
        symbol1 = scanner.nextLine();
        System.out.println("Enter name for Player 2:");
        player2 = scanner.nextLine();
        System.out.println("Enter symbol for Player 2:");
        symbol2 = scanner.nextLine();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.getInput();
        Player p1 = new Player(main.player1, main.symbol1);
        Player p2 = new Player(main.player2, main.symbol2);
        Game game = new Game(p1, p2,scanner);
        game.start();
        scanner.close();
    }
}