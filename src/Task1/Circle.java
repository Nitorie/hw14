package Task1;

import Task1.ShapeS;

public class Circle implements ShapeS {

    private int a;

    public Circle(int a) {
        this.a = a;
    }

    @Override
    public void S() {
        System.out.println("S (circle) = " + Math.PI*a);
    }
}
