package cat.uvic.teknos.footballtournament.emulators;

import cat.uvic.teknos.footballtournament.teams.Team;
import cat.uvic.teknos.footballtournament.tournaments.Statistics;
import cat.uvic.teknos.footballtournament.tournaments.Tournament;

public class TournamentEmulator {
    public static void play(Tournament tournament) {
        for (var round : tournament.getSchedule().getRounds()) {
            round.getMatches().forEach(match -> {
                Statistics statistics = MatchEmulator.play(match);

                Team challenger1 = match.getFirstChallenger();
                Team challenger2 = match.getSecondChallenger();

                int points1 = statistics.getFirstChallengerPoints();
                int points2 = statistics.getSecondChallengerPoints();

                if (points1 > points2) {
                    challenger1.setMatchesWon(challenger1.getMatchesWon() + 1);
                    challenger2.setMatchesLost(challenger2.getMatchesLost() + 1);
                } else if (points2 > points1) {
                    challenger2.setMatchesWon(challenger2.getMatchesWon() + 1);
                    challenger1.setMatchesLost(challenger1.getMatchesLost() + 1);
                } else {
                    challenger1.setMatchesDrawn(challenger1.getMatchesDrawn() + 1);
                    challenger2.setMatchesDrawn(challenger2.getMatchesDrawn() + 1);
                }

                challenger1.setGoalsConceded(challenger1.getGoalsConceded() + points1);
                challenger2.setGoalsConceded(challenger2.getGoalsConceded() + points2);

                statistics.printSummary();
            });
        }
    }
}
