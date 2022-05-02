package com.alibaba.griver.api.model;

import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.Map;

public class APIContext implements Serializable {
    public Map<String, String> extendedInfo;
    public MiniProgramMetaData miniProgramInfo;
    public String source;

    public APIContext(String str, @Nullable MiniProgramMetaData miniProgramMetaData, @Nullable Map<String, String> map) {
        this.source = str;
        this.miniProgramInfo = miniProgramMetaData;
        this.extendedInfo = map;
    }

    public APIContext(String str, @Nullable Map<String, String> map) {
        this(str, (MiniProgramMetaData) null, map);
    }

    public APIContext(String str) {
        this(str, (MiniProgramMetaData) null, (Map<String, String>) null);
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String str) {
        this.source = str;
    }

    @Nullable
    public MiniProgramMetaData getMiniProgramInfo() {
        return this.miniProgramInfo;
    }

    public void setMiniProgramInfo(MiniProgramMetaData miniProgramMetaData) {
        this.miniProgramInfo = miniProgramMetaData;
    }

    public Map<String, String> getExtendedInfo() {
        return this.extendedInfo;
    }

    public void setExtendedInfo(Map<String, String> map) {
        this.extendedInfo = map;
    }
}
