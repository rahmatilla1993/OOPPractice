package override.task1;

public class Trapezium extends GeometricFigure {

    private int a;
    private int b;
    private int high;

    public Trapezium() {
    }

    public Trapezium(int a, int b, int high) {
        this.a = a;
        this.b = b;
        this.high = high;
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

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    @Override
    public int area() {
        return (a + b) * high / 2;
    }

    @Override
    public int perimeter() {
        return 2 * (a + b);
    }
}
