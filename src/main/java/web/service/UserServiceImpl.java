package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getListUser() {
        return userDao.getListUser();
    }

    @Override
    @Transactional
    public void updateUserById(int id, User upUser) {
        userDao.updateUserById(id, upUser);
    }

    @Override
    @Transactional
    public void removeUserById(int id) {
        userDao.removeUserById(id);

    }

    @Override
    @Transactional(readOnly = true)
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
}

