package interfaces.task1;

public class FootballPlayer extends Player {
    protected int countOfRedCard;
    protected int countOfYellowCard;
    protected int countOfGoals;

    public FootballPlayer() {

    }

    public FootballPlayer(String nameOfPlayer, String sportType,
                          int numberPosition, String teamName,
                          int countOfRedCard, int countOfYellowCard, int countOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.countOfRedCard = countOfRedCard;
        this.countOfYellowCard = countOfYellowCard;
        this.countOfGoals = countOfGoals;
    }

    public int getCountOfRedCard() {
        return countOfRedCard;
    }

    public void setCountOfRedCard(int countOfRedCard) {
        this.countOfRedCard = countOfRedCard;
    }

    public int getCountOfYellowCard() {
        return countOfYellowCard;
    }

    public void setCountOfYellowCard(int countOfYellowCard) {
        this.countOfYellowCard = countOfYellowCard;
    }

    public int getCountOfGoals() {
        return countOfGoals;
    }

    public void setCountOfGoals(int countOfGoals) {
        this.countOfGoals = countOfGoals;
    }

    @Override
    public String getInfo() {
        return "FootballPlayer{" +
                "countOfRedCard=" + countOfRedCard +
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
        return "Football player team name is " + teamName;
    }
}
