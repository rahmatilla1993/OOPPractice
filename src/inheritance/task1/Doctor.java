package inheritance.task1;

public class Doctor {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected int experiencedYear;
    protected String hospital;
    public Doctor(){}

    public Doctor(String firstName, String lastName, int age, int experiencedYear, String hospital) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.experiencedYear = experiencedYear;
        this.hospital = hospital;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperiencedYear() {
        return experiencedYear;
    }

    public void setExperiencedYear(int experiencedYear) {
        this.experiencedYear = experiencedYear;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public void info() {}
}
