package example.dao;

import example.vo.FatherEntity;
import example.vo.SonEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by MOMO on 2017/2/8.
 */
public class FatherDao {
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void add(){
        Session session=this.sessionFactory.openSession();
        FatherEntity f=new FatherEntity();
        f.setName("Fb");

        SonEntity s1=new SonEntity();
        s1.setSname("sa");
        s1.setFather(f);
        f.getSons().add(s1);

        SonEntity s2=new SonEntity();
        s2.setSname("sb");
        s2.setFather(f);
        f.getSons().add(s2);

        session.merge(f);

        session.flush();
        session.clear();
        session.close();
    }
}
