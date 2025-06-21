public class towerofhanoi {
    public static void hanoi(int n, char source, char destination, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        hanoi(n - 1, source, aux, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        hanoi(n - 1, aux, destination, source);
    }

    public static void main(String[] args) {
        int n = 4;
        hanoi(n, 'A', 'C', 'B');
    }
}