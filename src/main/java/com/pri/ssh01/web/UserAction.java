package com.pri.ssh01.web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.pri.ssh01.domain.User;
import com.pri.ssh01.service.UserService;

/**
 * @Author: KONG
 * @Description:
 * @Date: Created in 2:44 PM 10/03/2018
 * @Modified By:
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{

    private User user;

    @Override
    public User getModel() {
        if (user==null){
            user = new User();
        }
        return user;
    }

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String findUserById(){

        user = userService.findUserById(user.getId());
        System.out.println(user);
        return SUCCESS;
    }
}
