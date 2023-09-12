package interfaces.task1;

public class PointGuard extends BasketballPlayer {
    private int countOfGuard;

    public PointGuard() {}

    public PointGuard(String nameOfPlayer, String sportType,
                      int numberPosition, String teamName,
                      int numberOfGoals, int countOfGuard) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfGoals);
        this.countOfGuard = countOfGuard;
    }

    public int getCountOfGuard() {
        return countOfGuard;
    }

    public void setCountOfGuard(int countOfGuard) {
        this.countOfGuard = countOfGuard;
    }

    @Override
    public String getInfo() {
        return "PointGuard{" +
                "countOfGuard=" + countOfGuard +
                ", numberOfGoals=" + numberOfGoals +
                ", nameOfPlayer='" + nameOfPlayer + '\'' +
                ", sportType='" + sportType + '\'' +
                ", numberPosition=" + numberPosition +
                ", teamName='" + teamName + '\'' +
                '}';
    }

    @Override
    public String getTeamName() {
        return "Point guard team name is " + teamName;
    }
}
