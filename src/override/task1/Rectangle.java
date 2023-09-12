package override.task1;

public class Rectangle extends GeometricFigure{

    private int a;
    private int b;
    public Rectangle() {}

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int area() {
        return a * b;
    }

    @Override
    public int perimeter() {
        return 2 * (a + b);
    }
}
