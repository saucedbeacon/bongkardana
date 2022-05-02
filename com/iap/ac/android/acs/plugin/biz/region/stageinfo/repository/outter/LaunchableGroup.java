package com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.outter;

import androidx.annotation.Keep;
import java.util.List;

@Keep
public class LaunchableGroup {
    public String code;
    public String displayName;
    public List<LaunchableGroup> launchableGroups;
    public List<MiniProgramLaunchableItem> launchableItems;
}
