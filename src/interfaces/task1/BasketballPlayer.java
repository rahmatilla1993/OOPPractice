package interfaces.task1;

public class BasketballPlayer extends Player {
    protected int numberOfGoals;

    public BasketballPlayer(String nameOfPlayer, String sportType,
                            int numberPosition, String teamName, int numberOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.numberOfGoals = numberOfGoals;
    }

    @Override
    public String getInfo() {
        return "BasketballPlayer{" +
                "numberOfGoals=" + numberOfGoals +
                ", nameOfPlayer='" + nameOfPlayer + '\'' +
                ", sportType='" + sportType + '\'' +
                ", numberPosition=" + numberPosition +
                ", teamName='" + teamName + '\'' +
                '}';
    }


    @Override
    public String getTeamName() {
        return "Basketball player team name is " + teamName;
    }
}
