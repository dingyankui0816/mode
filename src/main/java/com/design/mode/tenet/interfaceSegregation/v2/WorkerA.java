package com.design.mode.tenet.interfaceSegregation.v2;

/**
 * 实现了接口隔离(类之间的依赖建立在最小的接口上，将方法拆分到不同的接口上)
 * 接口隔离最重要的一点就是要根据实际情况，具体业务分析
 */
public class WorkerA implements WorkA {
    @Override
    public void workA() {
        //该类员工只工作 A内容
    }
}
