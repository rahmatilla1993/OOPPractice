package abstraction.task1;

public class Rectangle extends GeometricFigure {

    private int a;
    private int b;

    @Override
    public int area() {
        return a * b;
    }

    @Override
    public int perimeter() {
        return 2 * (a + b);
    }
}
