package Task2;

public class Cat implements Animal {



    @Override
    public void sound() {
        System.out.println("The cat makes a meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat meat, cereals and feed");
    }
}
