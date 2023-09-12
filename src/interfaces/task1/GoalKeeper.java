package interfaces.task1;

public class GoalKeeper extends FootballPlayer {
    private int countOfSaves;

    public GoalKeeper() {}

    public GoalKeeper(String nameOfPlayer, String sportType,
                      int numberPosition, String teamName,
                      int countOfRedCard, int countOfYellowCard,
                      int countOfGoals, int countOfSaves) {
        super(nameOfPlayer, sportType, numberPosition, teamName,
                countOfRedCard, countOfYellowCard, countOfGoals);
        this.countOfSaves = countOfSaves;
    }

    public int getCountOfSaves() {
        return countOfSaves;
    }

    public void setCountOfSaves(int countOfSaves) {
        this.countOfSaves = countOfSaves;
    }

    @Override
    public String getInfo() {
        return "GoalKeeper{" +
                "countOfSaves=" + countOfSaves +
                ", countOfRedCard=" + countOfRedCard +
                ", countOfYellowCard=" + countOfYellowCard +
                ", countOfGoals=" + countOfGoals +
                ", nameOfPlayer='" + nameOfPlayer + '\'' +
                ", sportType='" + sportType + '\'' +
                ", numberPosition=" + numberPosition +
                ", teamName='" + teamName + '\'' +
                '}';
    }

    @Override
    public String getTeamName() {
        return "Goal keeper team is " + teamName;
    }
}
