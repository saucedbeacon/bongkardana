package com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository;

import androidx.annotation.Keep;
import java.util.List;

@Keep
public class StageContentInfo {
    public StageAppInfo appInfo;
    public String contentType;
    public List<TagInfo> tagInfo;
}
