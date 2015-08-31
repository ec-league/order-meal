package com.artisanstate.launch.model;

/**
 * Created by Ethan(baiyp) <br/>
 * Date: 2015/8/31.
 */
public class User implements Dao {
    private long uidpk;
    private String username;
    private String password;
    private String email;

    public long getUidpk() {
        return uidpk;
    }

    public void setUidpk(long uidpk) {
        this.uidpk = uidpk;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}