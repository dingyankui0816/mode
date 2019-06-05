package com.design.mode.pattern.behavioralModel.commandMode.v2;

/**
 * 命令模式  (有命令的请求者和接收者) 降低了代码的耦合性？？？？？？？
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setiCommand(new ConcreteCommandA(new ReceiverA()));
        invoker.runCommand();
    }
}
