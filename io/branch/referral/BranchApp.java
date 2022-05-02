package io.branch.referral;

import android.app.Application;
import android.content.Context;
import o.getMenuName;

public class BranchApp extends Application {
    public void onCreate() {
        super.onCreate();
        if (!getMenuName.setMin(this)) {
            Branch.setMin((Context) this);
        } else {
            Branch.length((Context) this);
        }
    }
}
