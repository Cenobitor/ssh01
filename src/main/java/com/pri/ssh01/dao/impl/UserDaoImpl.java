package com.pri.ssh01.dao.impl;

import com.pri.ssh01.dao.UserDao;
import com.pri.ssh01.domain.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * @Author: KONG
 * @Description:
 * @Date: Created in 2:41 PM 10/03/2018
 * @Modified By:
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {


    @Override
    public User findUserById(Integer id) {
        return getHibernateTemplate().get(User.class,id);
    }
}
