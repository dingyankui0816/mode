package com.design.mode.pattern.behavioralModel.commandMode.v2;

/**
 * 命令模式  (有命令的请求者和接收者) 降低了代码的耦合性。
 * 通过对行为的抽象，让新增其他行为变得清晰容易，增加了扩展性
 *
 * 将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化
 * ，对请求排队或者记录请求日志，可提供命令的撤销和回复功能
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setiCommand(new ConcreteCommandA(new ReceiverA()));
        invoker.runCommand();
    }
}
