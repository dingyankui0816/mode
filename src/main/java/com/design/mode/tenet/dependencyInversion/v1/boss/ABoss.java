package com.design.mode.tenet.dependencyInversion.v1.boss;

import com.design.mode.tenet.dependencyInversion.v1.IBoss;
import com.design.mode.tenet.dependencyInversion.v1.staff.AStaff;
import com.design.mode.tenet.dependencyInversion.v1.staff.BStaff;

public class ABoss implements IBoss {
    private AStaff aStaff = new AStaff();
    private BStaff bStaff = new BStaff();
    @Override
    public void shout() {
        aStaff.work();
        bStaff.work();
    }

    @Override
    public void ask(IBoss bBoss) {
        bBoss.shout();
    }
}
