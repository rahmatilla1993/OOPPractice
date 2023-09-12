package override.task2;

public class Duck extends Animal {

    public Duck() {}
    public Duck(String name) {
        super(name);
    }

    public String getName() {
        return String.format("Duck name is %s", name);
    }

    @Override
    public String sound() {
        return "Duck says quack quack";
    }
}
