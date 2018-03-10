package com.pri.ssh01.service.impl;

import com.pri.ssh01.dao.UserDao;
import com.pri.ssh01.domain.User;
import com.pri.ssh01.service.UserService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: KONG
 * @Description:
 * @Date: Created in 2:43 PM 10/03/2018
 * @Modified By:
 */
@Transactional
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }
}
