package com.design.mode.tenet.dependencyInversion.v2;

public interface IStaff {
    default void work(){
        System.out.println("工作");
    }
}
