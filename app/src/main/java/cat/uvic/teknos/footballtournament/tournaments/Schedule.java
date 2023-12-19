package cat.uvic.teknos.footballtournament.tournaments;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Round> rounds = new ArrayList<>();

    public void addRound(Round round) {
        rounds.add(round);
    }

    public Iterable<Round> getRounds() {
        return rounds;
    }
}
