package com.iap.ac.config.lite.endcomputing.model;

import java.io.Serializable;
import java.util.List;

public class ConfigKeyGrayInfos implements Serializable {
    private List<ConfigValueGrayInfo> infos;
    private String key;
    private long lastResponseTime;

    public List<ConfigValueGrayInfo> getInfos() {
        return this.infos;
    }

    public String getKey() {
        return this.key;
    }

    public long getLastResponseTime() {
        return this.lastResponseTime;
    }

    public void setInfos(List<ConfigValueGrayInfo> list) {
        this.infos = list;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLastResponseTime(long j) {
        this.lastResponseTime = j;
    }
}
