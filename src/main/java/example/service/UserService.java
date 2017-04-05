package example.service;

import example.dao.UserDao;

/**
 * Created by MOMO on 2017/2/7.
 */
public class UserService {
    private UserDao dao=new UserDao();
    public void add(String username,String password){
        dao.add(username,password);
    }
}
