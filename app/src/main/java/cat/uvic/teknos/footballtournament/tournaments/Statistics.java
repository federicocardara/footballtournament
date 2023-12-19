package cat.uvic.teknos.footballtournament.tournaments;

import cat.uvic.teknos.footballtournament.teams.Team;
import java.time.LocalDate;

public class Statistics {
    private Team firstChallenger;
    private Team secondChallenger;
    private int firstChallengerScoredGoals;
    private int secondChallengerScoredGoals;

    public Statistics(Team firstChallenger, Team secondChallenger, int firstChallengerScoredGoals, int secondChallengerScoredGoals) {
        this.firstChallenger = firstChallenger;
        this.secondChallenger = secondChallenger;
        this.firstChallengerScoredGoals = firstChallengerScoredGoals;
        this.secondChallengerScoredGoals = secondChallengerScoredGoals;
    }

    public String getResult() {
        var result = "%s and %s drew %d to %d".formatted(secondChallenger.getName(), firstChallenger.getName(), secondChallengerScoredGoals, firstChallengerScoredGoals);
        if (firstChallengerScoredGoals > secondChallengerScoredGoals) {
            result = "%s beats %s %d to %d".formatted(firstChallenger.getName(), secondChallenger.getName(), firstChallengerScoredGoals, secondChallengerScoredGoals);
        } else if (firstChallengerScoredGoals < secondChallengerScoredGoals){
            result = "%s beats %s %d to %d".formatted(secondChallenger.getName(), firstChallenger.getName(), secondChallengerScoredGoals, firstChallengerScoredGoals);
        }

        return result;
    } 

    public int getFirstChallengerPoints() {
        int points = 0;

        if (firstChallengerScoredGoals > secondChallengerScoredGoals) {
            points = 3;
        } else if (firstChallengerScoredGoals == secondChallengerScoredGoals) {
           points = 1;
        }

        return points;
    }

    public int getSecondChallengerPoints() {
        int points = 0;

        if (firstChallengerScoredGoals < secondChallengerScoredGoals) {
            points = 3;
        } else if (firstChallengerScoredGoals == secondChallengerScoredGoals) {
           points = 1;
        }

        return points;
    }

    public void printSummary() {
        System.out.println(getResult());
    }


}
