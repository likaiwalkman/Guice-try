package org.victor.demo.modules.user;

import com.google.inject.AbstractModule;
import org.victor.demo.dao.UserDao;
import org.victor.demo.dao.impl.UserDaoImpl;

public class UserModule extends AbstractModule {
    protected void configure() {
        bind(UserDao.class).to(UserDaoImpl.class);
    }
}
