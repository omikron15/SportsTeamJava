package models;

import javax.persistence.*;
import javax.xml.soap.Name;

@Entity
@Table(name = "managers")
public class Manager {

    private int id;
    private String name;
    private int age;
    private Team team;

    public Manager() {
    }

    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
        this.team = team;
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

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @OneToOne(mappedBy = "manager", cascade = CascadeType.PERSIST)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
