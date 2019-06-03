package com.design.mode.tenet.dependencyInversion.v2.boss;

import com.design.mode.tenet.dependencyInversion.v2.IBoss;
import com.design.mode.tenet.dependencyInversion.v2.IStaff;
import com.design.mode.tenet.dependencyInversion.v2.staff.CStaff;
import com.design.mode.tenet.dependencyInversion.v2.staff.DStaff;

public class BBoss implements IBoss {
    private IStaff iStaff;

    public BBoss(IStaff iStaff) {
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
    public void ask(IBoss iBoss) {
        iBoss.shout();
    }
}
