import java.sql.SQLOutput;
import java.util.Scanner;

public class tictaktoe {
    private static final int rows = 3;
    private static final int cols = 3;
    private static char[][] board = new char[rows][cols];
    private static char currentplayer = 'X';

    private static void startboard(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                board[i][j] = ' ';
            }
        }
    }
    private static void printtheboard(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }

    }
    private static boolean isValid(int row, int col){
        return row>=0 && row<rows && col>=0 && col<cols && board[row][col]== ' ';

    }
    private static void makeMove(int row, int col, char player) {

        board[row][col] = player;
    }
    private static boolean isWinner(char player){
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
    private static boolean NoWinner(){
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(board[i][j]==' ');
                return false;
            }
        }
        return true;
    }

    private static boolean GameOver(){
        return isWinner('X') || isWinner('O') || NoWinner();
    }

    public static void main(String[] args) {
        startboard();
        printtheboard();

        while(!GameOver()){
            System.out.println("Player"+ " " + currentplayer +" " + "your turn");
            Scanner scanner = new Scanner(System.in);
            int rows = scanner.nextInt()-1;
            int cols = scanner.nextInt() -1;
            while (!isValid(rows,cols)){
                makeMove(rows,cols,currentplayer);
                printtheboard();

                if (GameOver()){
                    break;
                }
                currentplayer = (currentplayer == 'X') ? 'O' : 'X';


            }
        }

        if (isWinner('x')){
            System.out.println("PLAYER X WINS");
        } else if (isWinner('O')) {
            System.out.println("PLayer 0 wins");

        }else{
            System.out.println("Tie");
        }

    }

}
