package cat.uvic.teknos.footballtournament.emulators;

import cat.uvic.teknos.footballtournament.tournaments.Tournament;

public class TournamentEmulator {
    public static void play(Tournament tournament) {
        for (var round : tournament.getSchedule().getRounds()) {
            round.getMatches().forEach(match -> {
                var statistics = MatchEmulator.play(match);

                statistics.printSummary();
            });
        }
    }
}
