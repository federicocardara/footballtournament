package cat.uvic.teknos.footballtournament.teams;

public abstract class Team {
    private int points;
    private int goals;
    private int goalsConceded;
    private int matchesWon;
    private int matchesLost;
    private int matchesDrawn;

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }

    public int getMatchesLost() {
        return matchesLost;
    }

    public void setMatchesLost(int matchesLost) {
        this.matchesLost = matchesLost;
    }

    public int getMatchesDrawn() {
        return matchesDrawn;
    }

    public void setMatchesDrawn(int matchesDrawn) {
        this.matchesDrawn = matchesDrawn;
    }

    public abstract String getName();

    public abstract int getStrength();

    public void addPoints(int points) {
        this.points += points;  
    }

    public void addGoals(int goals) {
        this.goals += goals;  
    }

    public int getGoals() {
        return goals;
    }

    public int getPoints() {
        return points;
    }

    public void printStatistics() {
        System.out.printf("%s scored %d points and %d goals | goals conceded: %d; won: %d; lost: %d; drawn: %d%n",
                getName(), getPoints(), getGoals(), getGoalsConceded(), getMatchesWon(), getMatchesLost(), getMatchesDrawn());
    }
}
