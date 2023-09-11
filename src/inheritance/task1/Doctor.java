package inheritance.task1;

public class Doctor {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected int experiencedYear;
    protected String hospital;

    public Doctor(String firstName, String lastName, int age, int experiencedYear, String hospital) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.experiencedYear = experiencedYear;
        this.hospital = hospital;
    }

    public void info() {}
}
