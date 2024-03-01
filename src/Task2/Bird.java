package Task2;

public class Bird implements Animal{



    @Override
    public void sound() {
        System.out.println("Birds can make a wide variety of sounds");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eat bread, seeds and nuts");
    }
}
