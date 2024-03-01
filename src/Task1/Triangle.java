package Task1;

public class Triangle implements ShapeS{
    private int a;
    private int b;

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void S() {
        System.out.println("S (triangle) = " + 0.5*(a*b));
    }
}
