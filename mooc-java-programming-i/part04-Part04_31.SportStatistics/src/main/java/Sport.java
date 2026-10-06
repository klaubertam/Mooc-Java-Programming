public class Sport {
    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;

    public Sport(String homeTeam, String visitingTeam, int homePoints, int visitingPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
    }

    public boolean involvesTeam(String team) {
        return homeTeam.equals(team) || visitingTeam.equals(team);
    }

    public boolean didTeamWin(String team) {
        if (homeTeam.equals(team)) {
            return homePoints > visitingPoints;
        } else if (visitingTeam.equals(team)) {
            return visitingPoints > homePoints;
        }
        return false;
    }
}
