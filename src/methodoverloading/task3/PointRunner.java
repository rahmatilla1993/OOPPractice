package methodoverloading.task3;

import java.util.Scanner;

public class PointRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        Point point = new Point(x, y, z);
        System.out.println(point);
    }
}
