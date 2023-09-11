package abstraction.task2;

public class Duck extends Animal {

    public String getName() {
        return String.format("Duck name is %s", name);
    }

    @Override
    public String sound() {
        return "Duck says quack quack";
    }
}
