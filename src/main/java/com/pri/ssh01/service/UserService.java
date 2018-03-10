package com.pri.ssh01.service;

import com.pri.ssh01.domain.User;

/**
 * @Author: KONG
 * @Description:
 * @Date: Created in 2:43 PM 10/03/2018
 * @Modified By:
 */
public interface UserService {

    User findUserById(Integer id);
}
