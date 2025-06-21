import java.util.Scanner;

public class tickpractice {
    private static final int rows= 3;
    private static final int cols = 3;
    private static char[][] board = new char[rows][cols];
    private static char currentplayer = 'X';

    private static void startboard(){
        for(int i=0;i<rows;i++){
            for (int j =0;j<cols;j++){
                board[i][j] = ' ';
            }
        }
    }
    private static void printboard(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static boolean isValid(int row,int col) {
        return row>=0 && row<rows && col>=0 && col<cols && board[row][col] ==' ';

    }
    private static void makeMove(int row, int col, char player){
        board[row][col] = player;
    }
    private static boolean isWinner(char player){
        for (int i=0;i<rows;i++){
            if (board[i][0]==player && board[i][1] == player && board[i][2] == player){
                return true;
            }
        }
        for (int j=0;j<cols;j++){
            if (board[0][j]==player && board[1][j]==player && board[2][j]==player){
                return true;
            }
        }
        if (board[0][0] == player && board[1][1]==player && board[2][2]==player){
            return true;
        }
        if (board[0][2] == player && board[1][1]==player && board[2][1]==player){
            return true;
        }
        return false;



    }
    private static boolean isBoardfull(){
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (board[i][j]== ' '){
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean isGameover(){
        return isWinner('X') || isWinner('O') || isBoardfull();
    }

    public static void main(String[] args) {
        startboard();
        printboard();

        while (!isGameover()){
            System.out.println("player " + currentplayer + " your turn");
            Scanner scanner = new Scanner(System.in);
            int row = scanner.nextInt()-1;
            int col = scanner.nextInt()-1;
            while (!isValid(row,col));

            makeMove(row,col,currentplayer);
            printboard();

            if (isGameover()){
                break;
            }
            currentplayer = (currentplayer== 'X') ? 'O' : 'X';
        }
        if (isWinner('X')){
            System.out.println("Winner is X");

        } else if (isWinner('O')) {
            System.out.println("Winner is O");

        }else {
            System.out.println("tie");
        }

    }





}
