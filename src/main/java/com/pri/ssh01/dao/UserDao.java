package com.pri.ssh01.dao;

import com.pri.ssh01.domain.User;

/**
 * @Author: KONG
 * @Description:
 * @Date: Created in 2:41 PM 10/03/2018
 * @Modified By:
 */
public interface UserDao {
    User findUserById(Integer id);
}
