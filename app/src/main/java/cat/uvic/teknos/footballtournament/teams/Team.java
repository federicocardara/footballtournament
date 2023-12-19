package cat.uvic.teknos.footballtournament.teams;

public abstract class Team {
    private int points;
    private int goals;
    /**
     * 
     * @return the name of the team
     */
    public abstract String getName();
    
    /**
     * 
     * @return the strenght of the team. It must be an int between 0 and 10.
     */
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
        //TODO: print <team name> scored <points> points and <goals> goals
    }
}
