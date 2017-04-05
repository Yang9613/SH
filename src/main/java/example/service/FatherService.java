package example.service;

import example.dao.FatherDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MOMO on 2017/2/8.
 */
public class FatherService {
    private FatherDao dao=null;
    @Before
    public void init(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        dao=(FatherDao) context.getBean("fdao");
    }
    @Test
    public void add(){

        dao.add();
    }
}
