package methodoverloading.task2;

public class Triangle {
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float perimeter() {
        return a + b + c;
    }

    public float area() {
        return (a * b) / 2;
    }
}
