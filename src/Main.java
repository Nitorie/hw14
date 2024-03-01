import Task1.*;
import Task2.*;

public class Main {
    public static void main(String[] args) {
        ShapeS circle = new Circle(5);
        circle.S();
        ShapeS rectangle = new Rectangle(9,4);
        rectangle.S();
        ShapeS triangle = new Triangle(14,20);
        triangle.S();
        ShapeS square = new Square(8);
        square.S();

        System.out.println(" ");

        Animal dog = new Dog();
        dog.eat();
        dog.sound();

        System.out.println(" ");

        Animal cat = new Cat();
        cat.sound();
        cat.eat();

        System.out.println(" ");

        Animal bird = new Bird();
        bird.eat();
        bird.sound();

    }
}