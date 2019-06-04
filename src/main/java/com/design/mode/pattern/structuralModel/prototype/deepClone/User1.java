package com.design.mode.pattern.structuralModel.prototype.deepClone;

import java.io.Serializable;

public class User1 implements Serializable {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User1(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
