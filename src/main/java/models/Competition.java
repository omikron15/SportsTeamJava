package models;

import java.util.ArrayList;
import java.util.List;

public class Competition {

    private int id;
    private String name;
    private List<Team> teams;

    public Competition() {
    }

    public Competition(int id, String name) {
        this.id = id;
        this.name = name;
        this.teams = new ArrayList<Team>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public void addTeam(Team team){
        this.teams.add(team);
    }
}
