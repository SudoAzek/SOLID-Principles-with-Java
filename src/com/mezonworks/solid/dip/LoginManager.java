package com.mezonworks.solid.dip;

// High level

public class LoginManager {
    SimpleLogin simpleLogin = new SimpleLogin();

    public void Login(User user) {
        simpleLogin.authenticate(user);
    }
}
