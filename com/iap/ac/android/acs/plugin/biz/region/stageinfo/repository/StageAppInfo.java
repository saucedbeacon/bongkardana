package com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository;

import androidx.annotation.Keep;
import java.util.List;

@Keep
public class StageAppInfo {
    public String appDesc;
    public String appId;
    public String appName;
    public String appSlogan;
    public List<CategoryInfo> categoryInfos;
    public String deployVersion;
    public boolean favorite;
    public String iconUrl;
    public boolean isUsed;
    public long lastUsedTime;
}
