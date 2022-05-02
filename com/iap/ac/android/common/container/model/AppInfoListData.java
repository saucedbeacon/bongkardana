package com.iap.ac.android.common.container.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppInfoListData implements Serializable {
    private List<AppInfoData> appInfoList;
    public String errorCode;
    public String errorMessage;
    private List<String> exceedAppIdList;
    public Map<String, String> extendInfo = new HashMap();
    public boolean success = false;
    private int totalCount;

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }

    public List<AppInfoData> getAppInfoList() {
        return this.appInfoList;
    }

    public void setAppInfoList(List<AppInfoData> list) {
        this.appInfoList = list;
    }

    public List<String> getExceedAppIdList() {
        return this.exceedAppIdList;
    }

    public void setExceedAppIdList(List<String> list) {
        this.exceedAppIdList = list;
    }
}
