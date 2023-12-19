package cat.uvic.teknos.footballtournament.emulators;

import java.security.SecureRandom;

import cat.uvic.teknos.footballtournament.teams.Team;
import cat.uvic.teknos.footballtournament.tournaments.Match;
import cat.uvic.teknos.footballtournament.tournaments.Statistics;

public class MatchEmulator {
    private static SecureRandom random = new SecureRandom();
    public static Statistics play(Match match) {
        var firstChallengerGoals = simulateGoalsScored(match.getFirstChallenger());
        var secondChallengerGoals = simulateGoalsScored(match.getSecondChallenger());

        var statistics = new Statistics(
            match.getFirstChallenger(), 
            match.getSecondChallenger(), 
            firstChallengerGoals, 
            secondChallengerGoals);
        
        match.getFirstChallenger().addGoals(firstChallengerGoals);
        match.getSecondChallenger().addGoals(secondChallengerGoals);
        match.getFirstChallenger().addPoints(statistics.getFirstChallengerPoints());
        match.getFirstChallenger().addGoals(statistics.getSecondChallengerPoints());

        // TODO: update here the team attributes goalsConceded, matchesWon, matchesLost and matchesDrawn 
        
        return statistics;
    }

    private static int simulateGoalsScored(Team team) {
        var randomValue = random.nextInt(6);

        return (int)Math.floor(randomValue * ((double)team.getStrength() / 10));
    }
}
