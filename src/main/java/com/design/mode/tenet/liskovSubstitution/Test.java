package com.design.mode.tenet.liskovSubstitution;

/**
 * 里式替换，因为son可以替代parent 所以 son是parent 的子类
 * 优点:代码共享，减少了工作量，提供重用性，提高可扩展性(只需集成父类 即可扩展)很多开源框架都通过接口继承父类来完成的
 * 缺点:继承是入侵式的。降低了代码的灵活度，增强了耦合性。当修改父类中的某些信息需要考虑子类的修改带来的影响
 */
public class Test {
    public static void main(String[] args) {
        Parent parent = new Son();
        parent.braisedRibs();
    }
}
