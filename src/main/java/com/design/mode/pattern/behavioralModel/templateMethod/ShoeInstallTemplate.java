package com.design.mode.pattern.behavioralModel.templateMethod;


/**
 * 模板方法（定义一个操作中的算法框架，将一些步骤延迟到子类中。使子类可以定义某些特殊步骤，而不改变算法结构）
 * 可以保证在我的模板下，你随意改变一些内部细节，最终在我的算法下执行
 * eg. Dubbo 运用了很多模板方法设计模式 (使得可以扩展很多注册中心)
 */
public abstract class ShoeInstallTemplate {
    //暴露给子类的特殊步骤
    public abstract void installSole();
    public abstract void installInsole();
    public abstract void installVamp();
    public abstract void installShoelace();

    //算法本身不变的结构
    public void installShot(){
        System.out.println("组装鞋子");
        // 组装鞋底
        installSole();
        // 组装鞋垫
        installInsole();
        // 组装鞋面
        installVamp();
        // 组装鞋带
        installShoelace();
    }
}
