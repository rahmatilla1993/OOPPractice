package abstraction.task2;

public class Dog extends Animal {
    @Override
    public String getName() {
        return String.format("Dog name is %s", name);
    }

    @Override
    public String sound() {
        return "Dog says bow bow";
    }
}
