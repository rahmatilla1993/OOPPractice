package abstraction.task1;

public class Trapezium extends GeometricFigure {

    private int a;
    private int b;
    private int high;

    @Override
    public int area() {
        return (a + b) * high / 2;
    }

    @Override
    public int perimeter() {
        return 2 * (a + b);
    }
}
