package cat.uvic.teknos.footballtournament.tournaments;

import java.time.LocalDate;

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


    //TODO: create getters and setters
}
