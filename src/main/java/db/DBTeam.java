package db;

import models.Player;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class DBTeam {

    private static Session session;

    public List<Team> listAllPlayersOnTeam(Team team){
        List<Team> results = new ArrayList<Team>();
        session = HibernateUtil.getSessionFactory().openSession();

        try {
            Criteria criteria = session.createCriteria(Player.class);
            criteria.add(Restrictions.eq("team", team));
            results = criteria.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;

    }


}
