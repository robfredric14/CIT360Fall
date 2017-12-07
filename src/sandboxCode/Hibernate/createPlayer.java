package sandboxCode.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class createPlayer {

    public static void main(String[] args) {


        Configuration config = new Configuration();

        config.configure("hibernate.cfg.xml");

        SessionFactory worker = config.buildSessionFactory();

        Session session = worker.openSession();

        Transaction transaction = session.beginTransaction();

        Player addPlayer = new Player();
        addPlayer.setTeam("Seattle Mariners");
        addPlayer.setAge(44);
        addPlayer.setName("Edgar Martinez");
        addPlayer.setLeague("American");
        addPlayer.setNumber(11);

        session.save(addPlayer);
        transaction.commit();

        System.out.println("Player Added");

    }
}