package com.design.mode.pattern.structuralModel.prototype.shallowClone;

/**
 * 浅克隆 (不会克隆复合对象)
 */
public class Test {
    public static void main(String[] args) {
        User user = new User("111","111",new User1("2222","22222"));
        System.out.println(user.toString());
        for (int i =1 ; i<10 ;i++){
            User user1=(User) user.clone();
            System.out.println(user1.toString());
        }
    }
}
