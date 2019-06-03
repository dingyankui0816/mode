package com.design.mode.tenet.dependencyInversion.v1;

public interface IStaff {
    default void work(){
        System.out.println("工作");
    }
}
