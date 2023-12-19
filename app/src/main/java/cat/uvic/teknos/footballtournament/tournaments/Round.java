package cat.uvic.teknos.footballtournament.tournaments;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Round {
    private List<Match> matches = new ArrayList<>();
    private LocalDate scheduledOn;

    public List<Match> getMatches() {
        return this.matches;
    }

    public void addMatch(Match match) {
        this.matches.add(match);
    }

    public LocalDate getScheduledOn() {
        return this.scheduledOn;
    }

    public void setScheduledOn(LocalDate scheduledOn) {
        this.scheduledOn = scheduledOn;
    }
}
