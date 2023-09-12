package override.task2;

public class Dog extends Animal {
    public Dog() {}
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return String.format("Dog name is %s", name);
    }

    @Override
    public String sound() {
        return "Dog says bow bow";
    }
}
