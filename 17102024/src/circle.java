public class circle{

    public static void main(String[] args) {
        int radius = 4;
        printCircle(radius);
    }

    public static void printCircle(int radius) {
        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (i * i + j * j <= radius * radius) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
