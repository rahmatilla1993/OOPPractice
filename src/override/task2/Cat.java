package override.task2;

public class Cat extends Animal{

    public String getName() {
        return String.format("Cat name is %s", name);
    }

    @Override
    public String sound() {
        return "Cat says meow meow";
    }
}
