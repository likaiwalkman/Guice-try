package org.victor.demo.service.impl;

import com.google.inject.Inject;
import org.victor.demo.dao.UserDao;
import org.victor.demo.model.User;
import org.victor.demo.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Inject
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User findById(Long id) {
        userDao.findById(id);
        return null;
    }
}
