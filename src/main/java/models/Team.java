package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "teams")
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
        this.players = new ArrayList<Player>();
        this.competitions = new ArrayList<Competition>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "team")
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @OneToOne(mappedBy = "team", cascade = CascadeType.PERSIST)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "team_competition",
            inverseJoinColumns = {@JoinColumn(name = "competition_id", nullable = false, updatable = false)},
            joinColumns = {@JoinColumn(name = "team_id", nullable = false, updatable = false)})
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
