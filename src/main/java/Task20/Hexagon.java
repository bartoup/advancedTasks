package Task20;

public class Hexagon extends Shape {
    private final int a;

    public Hexagon(int a, int b, int c, int d, int e, int f) {
        this.a = a;
    }

    @Override
    double calculatePerimeter() {
        return a * 6;
    }
}
