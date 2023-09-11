package inheritance.task1;

public class Main {
    public static void main(String[] args) {
        Doctor xirurg = new Xirurg("Ali", "Aliyev", 45, 10,
                "TashMI", "Neyroxirurg");
        Doctor lor = new Lor("Vali", "Valiyev", 44, 20, "SamPI", true);
        printInfo(xirurg, lor);
    }

    private static void printInfo(Doctor... doctors) {
        for (Doctor doctor : doctors) {
            doctor.info();
            System.out.println();
        }
    }
}
