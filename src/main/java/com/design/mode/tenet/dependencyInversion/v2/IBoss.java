package com.design.mode.tenet.dependencyInversion.v2;

public interface IBoss {
     void shout();
     void ask(IBoss iBoss);
}
