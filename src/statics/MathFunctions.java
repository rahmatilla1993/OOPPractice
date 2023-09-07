package statics;

public class MathFunctions {
    private static final double PI;
    private static final double e;

    static {
        PI = 3.14159265359;
        e = 2.71828182846;
    }

    public static double getCircleArea(double r) {
        return PI * r * r;
    }

    public static double getPowExp(double pow) {
        return Math.pow(e, pow);
    }

    public static double getTriangleArea(double a, double b, double c) {
        double midP = (a + b + c) / 2;
        return Math.sqrt(midP * (midP - a) * (midP - b) * (midP - c));
    }
}
