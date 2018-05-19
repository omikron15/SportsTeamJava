import db.DBHelper;
import models.Competition;
import models.Manager;
import models.Player;
import models.Team;

public class Runner {

    public static void main(String[] args) {

        Manager manager1 = new Manager("Manager 1", 50);
        DBHelper.save(manager1);

        Team team1 =  new Team("Team 1", manager1);
        DBHelper.save(team1);

        Player player1 = new Player("Player 1", 25, team1);
        DBHelper.save(player1);

        Competition competition1 = new Competition("Competition 1");
        DBHelper.save(competition1);



    }
}
