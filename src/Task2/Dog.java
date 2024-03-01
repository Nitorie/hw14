package Task2;

public class Dog implements Animal{



    @Override
    public void sound() {
        System.out.println("Dog makes a bark");
    }

    @Override
    public void eat() {
        System.out.println("Dogs eat a feed, meat, cereals");
    }
}



