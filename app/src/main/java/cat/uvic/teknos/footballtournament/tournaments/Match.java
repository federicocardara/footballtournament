package cat.uvic.teknos.footballtournament.tournaments;

import java.time.LocalDate;

import cat.uvic.teknos.footballtournament.teams.Team;

public class Match {
    private Team firstChallenger;
    private Team secondChallenger;
    private LocalDate scheduledOn;

    public Match(Team firstChallenger, Team secondCHallenger, LocalDate scheduledOn) {
        this.firstChallenger = firstChallenger;
        this.secondChallenger = secondCHallenger;
        this.scheduledOn = scheduledOn;
    }
     
    public Team getFirstChallenger() {
        return firstChallenger;
    }
    
    public Team getSecondChallenger() {
        return secondChallenger;
    }
}
