package com.design.mode.pattern.behavioralModel.commandMode.v1;

/**
 * 非命令模式，将所有的代码写在客户端中，没有命令的请求者和接受者
 * 耦合性强,当增加命令的时候客户端会有大量的业务逻辑
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        receiver.doA();
        receiver.doB();
    }
}
