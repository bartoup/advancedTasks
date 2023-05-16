package Task20_21;

public class Rectangle extends Shape {
    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    double calculatePerimeter() {
        return (2*a)+(2*b);
    }
}
