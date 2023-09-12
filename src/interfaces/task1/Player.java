package interfaces.task1;

public abstract class Player implements Information {
    protected String nameOfPlayer;
    protected String sportType;
    protected int numberPosition;
    protected String teamName;

    public Player() {

    }

    public Player(String nameOfPlayer, String sportType,
                  int numberPosition, String teamName) {
        this.nameOfPlayer = nameOfPlayer;
        this.sportType = sportType;
        this.numberPosition = numberPosition;
        this.teamName = teamName;
    }

    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public int getNumberPosition() {
        return numberPosition;
    }

    public void setNumberPosition(int numberPosition) {
        this.numberPosition = numberPosition;
    }

    @Override
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
