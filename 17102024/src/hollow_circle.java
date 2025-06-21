public class hollow_circle {
    public static void main(String[] args) {
        int radius = 6;
        int diameter = radius * 2;

        for (int i = 0; i <= diameter; i++) {
            for (int j = 0; j <= diameter; j++) {
                double distance = Math.sqrt(Math.pow(i - radius, 2) + Math.pow(j - radius, 2));
                if (distance > radius - 0.5 && distance < radius + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}