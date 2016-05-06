package org.victor.demo.service;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.Test;
import org.victor.demo.dao.UserDao;
import org.victor.demo.model.User;
import org.victor.demo.modules.user.UserModule;

import static org.junit.Assert.*;

/**
 * Created by kai_li on 2016/5/6.
 */
public class UserServiceTest {
    @Test
    public void findById() throws Exception {
        Injector injector = Guice.createInjector(new UserModule());
        UserDao userDao = injector.getInstance(UserDao.class);
        User byId = userDao.findById((long) 0);
        Assert.assertNotNull(userDao);
        Assert.assertNull(byId);
    }

}