package com.iap.ac.android.acs.plugin.biz.region.stageinfo.repository;

import androidx.annotation.Keep;
import java.util.List;

@Keep
public class StageInfo {
    public List<StageContentInfo> contentInfoList;
    public String displayName;
    public String stageCode;
    public List<StageInfo> subStageList;
}
