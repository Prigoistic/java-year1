import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        final byte MONTHS = 12;
        final byte PERCENT = 100;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal:  ");
        int Principal = scanner.nextInt();
        System.out.println("Annual Interest:  ");
        float Annual_Interest_Rate = scanner.nextFloat();
        float monthly_interest = Annual_Interest_Rate/ PERCENT / MONTHS;

        System.out.println("PERIODS:   ");
        int Period = scanner.nextInt();
        int numberOfpayments = Period * MONTHS;


        double Mortgage = Principal * ( monthly_interest * Math.pow(1 + monthly_interest, numberOfpayments)) / (Math.pow(1+ monthly_interest, numberOfpayments) -1);

        String MortgageFormated =  NumberFormat.getCurrencyInstance().format(Mortgage);

        System.out.println("Mortgage: " + MortgageFormated);










    }

}