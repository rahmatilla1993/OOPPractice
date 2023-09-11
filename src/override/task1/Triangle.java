package override.task1;

public class Triangle extends GeometricFigure {
    private int a;
    private int b;
    private int c;

    @Override
    public int area() {
        int midP = (a + b + c) / 2;
        return (int) Math.sqrt(midP * (midP - a) * (midP - b) * (midP - c));
    }

    @Override
    public int perimeter() {
        return a + b + c;
    }
}
