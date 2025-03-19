package Testing;


public class staticblock {
    static int a = 4;
    static int b = 5;

    static{
        System.out.println("I am in static block");
        b = a+2;
    }

    public static void main(String[] args) {
       staticblock obj = new staticblock();
        System.out.println(staticblock.a + " " + staticblock.b);
    }
}
