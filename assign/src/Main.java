import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("You are an admin");
                break;
            case "moderator":
                System.out.println("moderator");
                break;
            default:
                System.out.println("You are a guest");
        }



    }
}