package com.design.mode.tenet.dependencyInversion.v1.boss;

import com.design.mode.tenet.dependencyInversion.v1.IBoss;
import com.design.mode.tenet.dependencyInversion.v1.staff.CStaff;
import com.design.mode.tenet.dependencyInversion.v1.staff.DStaff;

public class BBoss implements IBoss {
    private CStaff cStaff = new CStaff();
    private DStaff dStaff = new DStaff();
    @Override
    public void shout() {
        cStaff.work();
        dStaff.work();
    }

    @Override
    public void ask(IBoss iBoss) {
        iBoss.shout();
    }
}
