package shape;

import java.util.Arrays;
import java.util.Comparator;
import comparator.CircleComparator;

public class Test {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles [0] = new Circle(3.0, "red", true);
        circles [1] = new Circle();
        circles [2] = new Circle(5.0, "green", false);

        System.out.println("Pre sort: ");

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
