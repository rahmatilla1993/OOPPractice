package interfaces.task1;

public class VolleyballPlayer extends Player {
    protected int numberOfPoints;

    public VolleyballPlayer(String nameOfPlayer, String sportType,
                            int numberPosition, String teamName) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
    }

    @Override
    public String getInfo() {
        return "VolleyballPlayer{" +
                "numberOfPoints=" + numberOfPoints +
                ", nameOfPlayer='" + nameOfPlayer + '\'' +
                ", sportType='" + sportType + '\'' +
                ", numberPosition=" + numberPosition +
                ", teamName='" + teamName + '\'' +
                '}';
    }

    @Override
    public String getTeamName() {
        return "Volleyball player teamName is " + teamName;
    }
}
