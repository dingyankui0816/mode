package com.design.mode.tenet.dependencyInversion.v1;

public interface IBoss {
     void shout();
     void ask(IBoss iBoss);
}
