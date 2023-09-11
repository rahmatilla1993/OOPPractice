package interfaces.task1;

public class Setter extends VolleyballPlayer {
    private int countOfSets;

    public Setter(String nameOfPlayer, String sportType,
                  int numberPosition, String teamName, int countOfSets) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.countOfSets = countOfSets;
    }

    @Override
    public String getInfo() {
        return "Setter{" +
                "countOfSets=" + countOfSets +
                ", numberOfPoints=" + numberOfPoints +
                ", nameOfPlayer='" + nameOfPlayer + '\'' +
                ", sportType='" + sportType + '\'' +
                ", numberPosition=" + numberPosition +
                ", teamName='" + teamName + '\'' +
                '}';
    }

    @Override
    public String getTeamName() {
        return "Setter team name is" + teamName;
    }
}
