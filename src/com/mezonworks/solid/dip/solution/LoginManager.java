package com.mezonworks.solid.dip.solution;

// High level

public class LoginManager{
    Authenticator authenticate;

    public LoginManager(Authenticator authenticate) {
        this.authenticate = authenticate;
    }

    public void Login(User user) {
        authenticate.authenticate(user);
    }
}
