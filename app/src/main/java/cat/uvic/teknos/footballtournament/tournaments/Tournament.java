package cat.uvic.teknos.footballtournament.tournaments;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import cat.uvic.teknos.footballtournament.teams.Team;

public class Tournament {
    private Team[] participants;
    private Schedule schedule;

    public String name;
    public LocalDate startsOn;
    public LocalDate endsOn;
    
    public void setParticipants(Team... participants) {
        this.participants = participants;
    }

    public Schedule getSchedule() {
        return this.schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Team[] getParticipants() {
        return participants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartsOn() {
        return startsOn;
    }

    public void setStartsOn(LocalDate startsOn) {
        this.startsOn = startsOn;
    }

    public LocalDate getEndsOn() {
        return endsOn;
    }

    public void setEndsOn(LocalDate endsOn) {
        this.endsOn = endsOn;
    }

    public void printDescription() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");

        System.out.printf(
                "Tournament %s starts on %s and ends on %s%n",
                name,
                getStartsOn().format(formatter),
                getEndsOn().format(formatter)
        );
    }
}
