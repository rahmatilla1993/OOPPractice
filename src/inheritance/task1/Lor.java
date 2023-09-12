package inheritance.task1;

public class Lor extends Doctor {
    private boolean isOtolaryngologist; // Lor otolaringologmi?

    public Lor() {}

    public Lor(String firstName, String lastName,
               int age, int experiencedYear,
               String hospital, boolean isOtolaryngologist
    ) {
        super(firstName, lastName, age, experiencedYear, hospital);
        this.isOtolaryngologist = isOtolaryngologist;
    }

    public boolean isOtolaryngologist() {
        return isOtolaryngologist;
    }

    public void setOtolaryngologist(boolean otolaryngologist) {
        isOtolaryngologist = otolaryngologist;
    }

    @Override
    public void info() {
        System.out.printf("Xirurg=[fistName=%s, lastName=%s, age=%d, experiencedYear=%d," +
                        " hospital=%s, isOtolaryngologist=%b]", firstName, lastName, age, experiencedYear,
                hospital, isOtolaryngologist);
    }
}
