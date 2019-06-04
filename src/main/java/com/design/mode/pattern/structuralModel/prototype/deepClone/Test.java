package com.design.mode.pattern.structuralModel.prototype.deepClone;

/**
 * 深克隆 通过字节流的方式实现深克隆 (会克隆复合对象)
 * 有大量的对象创建或者类初始化消耗更多的资源
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
