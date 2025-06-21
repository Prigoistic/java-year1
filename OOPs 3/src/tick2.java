import java.util.Scanner;

// Player Class
class Player {
    private char symbol;

    public Player(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}

// Board Class
class Board {
    private static final int rows = 3;
    private static final int cols = 3;
    private char[][] board;

    public Board() {
        board = new char[rows][cols];
        startBoard();
    }

    public void startBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isValid(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols && board[row][col] == ' ';
    }

    public void makeMove(int row, int col, char player) {
        board[row][col] = player;
    }

    public char[][] getBoard() {
        return board;
    }

    public boolean isBoardFull() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

// GameRules Class
class GameRules {
    private Board board;

    public GameRules(Board board) {
        this.board = board;
    }

    public boolean isWinner(char player) {
        char[][] b = board.getBoard();
        for (int i = 0; i < 3; i++) {
            if (b[i][0] == player && b[i][1] == player && b[i][2] == player) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (b[0][j] == player && b[1][j] == player && b[2][j] == player) {
                return true;
            }
        }
        if (b[0][0] == player && b[1][1] == player && b[2][2] == player) {
            return true;
        }
        if (b[0][2] == player && b[1][1] == player && b[2][0] == player) {
            return true;
        }
        return false;
    }

    public boolean isGameOver() {
        return isWinner('X') || isWinner('O') || board.isBoardFull();
    }
}

// MainGame Class
public class tick2 {
    public static void main(String[] args) {
        Board board = new Board();
        GameRules rules = new GameRules(board);
        Player playerX = new Player('X');
        Player playerO = new Player('O');
        char currentPlayer = playerX.getSymbol();

        board.printBoard();

        while (!rules.isGameOver()) {
            System.out.println("Player " + currentPlayer + " your turn");
            Scanner scanner = new Scanner(System.in);
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            while (!board.isValid(row, col)) {
                System.out.println("Invalid move. Try again.");
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
            }

            board.makeMove(row, col, currentPlayer);
            board.printBoard();

            if (rules.isGameOver()) {
                break;
            }

            currentPlayer = (currentPlayer == playerX.getSymbol()) ? playerO.getSymbol() : playerX.getSymbol();
        }

        if (rules.isWinner(playerX.getSymbol())) {
            System.out.println("Winner is X");
        } else if (rules.isWinner(playerO.getSymbol())) {
            System.out.println("Winner is O");
        } else {
            System.out.println("It's a tie");
        }
    }
}
