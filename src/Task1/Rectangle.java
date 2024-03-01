package Task1;

public class Rectangle implements ShapeS {

    private int a;

    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void S() {
        System.out.println("S (rectangle) = " + a*b);
    }
}
