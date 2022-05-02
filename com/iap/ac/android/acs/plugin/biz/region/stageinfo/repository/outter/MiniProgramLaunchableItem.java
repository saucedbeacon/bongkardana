package com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository.outter;

import androidx.annotation.Keep;
import java.util.List;

@Keep
public class MiniProgramLaunchableItem extends LaunchableItem {
    public List<LaunchableCategory> categories;
    public List<String> iconBadgeLabels;
    public String iconURL;
    public String identifier;
    public String introduction;
    public boolean isFavorite;
    public boolean isUsed;
    public long lastUsedTimestamp;
    public String name;
    public String releaseVersion;
    public String slogan;
}
