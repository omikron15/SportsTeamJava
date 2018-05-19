package models;

import java.util.List;

public class Team {

    private int id;
    private String name;
    private List<Player> players;
    private Manager manager;
    private List<Competition> competitions;

    public Team() {
    }

    public Team(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
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

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }

    public void addCompetition(Competition competition){
        this.competitions.add(competition);
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }



}
