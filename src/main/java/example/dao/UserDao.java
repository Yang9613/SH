package example.dao;

import example.vo.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by MOMO on 2017/2/7.
 */
public class UserDao {
    Configuration cfg=null;
    SessionFactory sessionFactory=null;
    Session session=null;
    Transaction tx=null;
    public UserDao(){
        cfg=new Configuration().configure("hibernate.cfg.xml");
        sessionFactory=cfg.buildSessionFactory();
    }

    public void add(String username,String password){
        session=sessionFactory.openSession();
        tx=session.beginTransaction();
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        session.save(user);
        tx.commit();
        session.flush();
        session.close();
    }
}
