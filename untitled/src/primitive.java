import java.awt.*;

public class primitive {
    public static void main(String[] args) {
        Point point1 = new Point(1,1);
        Point point2 = point1;
        //reference type Point1 and point2 refering to same thing Point (1,1)
        point1.x = 2;
        System.out.println(point2);
    }
}
