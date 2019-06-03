package com.design.mode.tenet.dependencyInversion.v2.boss;

import com.design.mode.tenet.dependencyInversion.v2.IBoss;
import com.design.mode.tenet.dependencyInversion.v2.IStaff;
import com.design.mode.tenet.dependencyInversion.v2.staff.AStaff;
import com.design.mode.tenet.dependencyInversion.v2.staff.BStaff;

public class ABoss implements IBoss {
    private IStaff iStaff;

    public ABoss(IStaff iStaff) {
        this.iStaff = iStaff;
    }

    public IStaff getiStaff() {
        return iStaff;
    }

    public void setiStaff(IStaff iStaff) {
        this.iStaff = iStaff;
    }

    @Override
    public void shout() {
        iStaff.work();
    }

    @Override
    public void ask(IBoss bBoss) {
        bBoss.shout();
    }
}
