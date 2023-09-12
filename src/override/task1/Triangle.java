package override.task1;

public class Triangle extends GeometricFigure {
    private int a;
    private int b;
    private int c;
    public Triangle() {}

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

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
