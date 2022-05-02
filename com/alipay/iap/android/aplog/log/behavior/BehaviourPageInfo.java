package com.alipay.iap.android.aplog.log.behavior;

public class BehaviourPageInfo {
    private String endTime;
    private String lastPage;
    private String loadingUrl;
    private String pageID;
    private String startTime;
    private String viewID;

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public String getLoadingUrl() {
        return this.loadingUrl;
    }

    public void setLoadingUrl(String str) {
        this.loadingUrl = str;
    }

    public String getPageID() {
        return this.pageID;
    }

    public void setPageID(String str) {
        this.pageID = str;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public String getLastPage() {
        return this.lastPage;
    }

    public void setLastPage(String str) {
        this.lastPage = str;
    }

    public String getViewID() {
        return this.viewID;
    }

    public void setViewID(String str) {
        this.viewID = str;
    }
}
