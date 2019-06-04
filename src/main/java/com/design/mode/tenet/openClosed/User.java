package com.design.mode.tenet.openClosed;

/**
 * 开闭原则，类、模块、函数应该对扩展开放，对修改封闭
 */
public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
