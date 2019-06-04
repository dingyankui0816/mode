package com.design.mode.pattern.structuralModel.prototype.shallowClone;

public class User implements Cloneable {
    private String name;
    private String password;
    private User1 user1;

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

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
        /**empty**/
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", user1=" + user1 +
                '}';
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public User(String name, String password, User1 user1) {
        this.name = name;
        this.password = password;
        this.user1 = user1;
    }
}
