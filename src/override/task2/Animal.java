package override.task2;

public class Animal {
    protected String name;
    public Animal() {}
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sound() {
        return "";
    }
}
