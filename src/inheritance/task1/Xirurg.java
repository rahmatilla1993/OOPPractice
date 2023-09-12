package inheritance.task1;

public class Xirurg extends Doctor {

    //xirurgik mutaxassisligi
    private String surgicalSpeciality;
    public Xirurg() {}

    public Xirurg(String firstName,
                  String lastName,
                  int age, int experiencedYear,
                  String hospital,
                  String surgicalSpeciality) {
        super(firstName, lastName, age, experiencedYear, hospital);
        this.surgicalSpeciality = surgicalSpeciality;
    }

    public String getSurgicalSpeciality() {
        return surgicalSpeciality;
    }

    public void setSurgicalSpeciality(String surgicalSpeciality) {
        this.surgicalSpeciality = surgicalSpeciality;
    }

    @Override
    public void info() {
        System.out.printf("Xirurg=[fistName=%s, lastName=%s, age=%d, experiencedYear=%d," +
                        " hospital=%s, surgicalSpeciality=%s]", firstName, lastName, age, experiencedYear,
                hospital, surgicalSpeciality);
    }
}
