package com.alibaba.ariver.permission.openauth.model.request;

import androidx.annotation.Keep;
import java.util.Map;

@Keep
public final class AuthRequestContextModel {
    private Map<String, String> ctuExtInfo;
    private String currentLongitudeAndLatitude;
    private String terminalType;

    public final String getCurrentLongitudeAndLatitude() {
        return this.currentLongitudeAndLatitude;
    }

    public final void setCurrentLongitudeAndLatitude(String str) {
        this.currentLongitudeAndLatitude = str;
    }

    public final String getTerminalType() {
        return this.terminalType;
    }

    public final void setTerminalType(String str) {
        this.terminalType = str;
    }

    public final Map<String, String> getCtuExtInfo() {
        return this.ctuExtInfo;
    }

    public final void setCtuExtInfo(Map<String, String> map) {
        this.ctuExtInfo = map;
    }
}
