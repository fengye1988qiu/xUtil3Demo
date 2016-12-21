package com.leo.xutil3demo.model;

/**
 * Created by Administrator on 12/21/2016.
 */
public class User {
    private String emnil;
    private String password;

    public User(String emnil, String password) {
        this.emnil = emnil;
        this.password = password;
    }

    public String getEmnil() {
        return emnil;
    }

    public void setEmnil(String emnil) {
        this.emnil = emnil;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
