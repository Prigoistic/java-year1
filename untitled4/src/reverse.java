import java.util.Scanner;

public class reverse {
    public static void  main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String alpha = scanner.next();
        String bets = "";
        char ch;


        for (int i = 0; i<alpha.length();i++){
            ch = alpha.charAt(i);
            bets = ch + bets;

        }
        System.out.println(bets);


    }
}
