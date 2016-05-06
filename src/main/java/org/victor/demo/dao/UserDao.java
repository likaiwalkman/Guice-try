package org.victor.demo.dao;

import org.victor.demo.model.User;

public interface UserDao {
    User findById(Long id);
}
