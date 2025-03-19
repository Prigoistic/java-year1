import java.util.Scanner;

public class tick {
    private static final int rows = 3;
    private static final int cols = 3;
    private static char[][] board = new char[rows][cols];
    private static char currentPlayer = 'X';



    private static void startBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = ' ';
            }

        }
    }

    private static void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValid(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols && board[row][col] == ' ';
    }

    private static void makeMove(int row, int col, char player) {
        board[row][col] = player;
    }

    private static boolean isWinner(char player) {

        for (int i = 0; i < rows; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }


        for (int j = 0; j < cols; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }


        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isGameOver() {
        return isWinner('X') || isWinner('O') || isBoardFull();
    }
    public static void main(String[] args) {
        startBoard();
        printBoard();

        while (!isGameOver()) {
            System.out.print("Player " + currentPlayer + ", enter your move (row, col): ");
            Scanner scanner = new Scanner(System.in);
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;
            while (!isValid(row, col));

            makeMove(row, col, currentPlayer);
            printBoard();

            if (isGameOver()) {
                break;
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }


        if (isWinner('X')) {
            System.out.println("Player X wins");
        } else if (isWinner('O')) {
            System.out.println("Player O wins");
        } else {
            System.out.println("tie");
        }
    }
}