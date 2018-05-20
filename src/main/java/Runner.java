import db.DBHelper;
import models.Competition;
import models.Manager;
import models.Player;
import models.Team;

public class Runner {

    public static void main(String[] args) {

        Manager manager1 = new Manager("Manager 1", 50);
        DBHelper.save(manager1);
        Manager manager2 = new Manager("Manager 2", 25);
        DBHelper.save(manager2);
        Manager manager3 = new Manager("Manager 3", 55);
        DBHelper.save(manager3);
        Manager manager4 = new Manager("Manager 4", 100);
        DBHelper.save(manager4);

        Team team1 =  new Team("Team 1", manager1);
        DBHelper.save(team1);
        Team team2 =  new Team("Team 2", manager2);
        DBHelper.save(team2);
        Team team3 =  new Team("Team 2", manager3);
        DBHelper.save(team3);

        Player player1 = new Player("Player 1", 25, team1);
        DBHelper.save(player1);
        Player player2 = new Player("Player 2", 25, team1);
        DBHelper.save(player2);
        Player player3 = new Player("Player 3", 25, team2);
        DBHelper.save(player3);
        Player player4 = new Player("Player 4", 25, team2);
        DBHelper.save(player4);
        Player player5 = new Player("Player 5", 25, team3);
        DBHelper.save(player5);
        Player player6 = new Player("Player 6", 25, team3);
        DBHelper.save(player6);

        Competition competition1 = new Competition("Competition 1");
        DBHelper.save(competition1);
        Competition competition2 = new Competition("Competition 2");
        DBHelper.save(competition2);

        DBHelper.addTeamToCompetition(team1, competition1);
        DBHelper.addTeamToCompetition(team2, competition1);
        DBHelper.addTeamToCompetition(team3, competition1);
        DBHelper.addTeamToCompetition(team1, competition2);
        DBHelper.addTeamToCompetition(team2, competition2);

        DBHelper.delete(manager4);

    }
}
