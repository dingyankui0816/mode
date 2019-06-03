package com.design.mode.tenet.interfaceSegregation.v1;

/**
 * 没有实现接口隔离(类之间的依赖应该建立在最小的接口上，应当将方法拆分到不同的接口上)
 */
public class WorkerA implements Work {
    @Override
    public void workA() {
        //该类员工只工作 A内容
    }

    @Override
    public void workB() {
    }

    @Override
    public void workC() {
    }

    @Override
    public void workD() {
    }
}
