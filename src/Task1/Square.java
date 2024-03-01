package Task1;

public class Square implements ShapeS {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void S() {
        System.out.println("S (square) = " + a*a);
    }
}
