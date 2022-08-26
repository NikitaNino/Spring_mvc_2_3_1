package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    List<User> getListUser();

    void updateUserById(int id, User user);

    void removeUserById(int id);

    User findUserById(int id);
}
