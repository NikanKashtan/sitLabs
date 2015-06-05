package by.bsuir.webphoto.buzhiskaya.dao;

import by.bsuir.webphoto.buzhiskaya.Entity.User;

/**
 * Created by Veronika on 24.03.2015.
 */
public interface UserDao {
    boolean validate(String name,String password);
    boolean createUser(User user);
}
