package sos.sisho.myFirstServlet.user.service;

import sos.sisho.myFirstServlet.user.domain.User;

public class UserService {

    public  boolean isUserValid(String userName, String password){

        User user = new User(userName, password);
        return user.isUserValid();
    }
}
