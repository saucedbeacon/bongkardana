package com.alipay.iap.android.wallet.foundation.code;

import java.util.Map;

public class ScannerOption {
    private Map<String, String> extendedInfo;
    private boolean hideAlbum;
    private CodeType type;

    public ScannerOption(CodeType codeType, boolean z, Map<String, String> map) {
        this.hideAlbum = z;
        this.type = codeType;
        this.extendedInfo = map;
    }

    public CodeType getType() {
        return this.type;
    }

    public void setType(CodeType codeType) {
        this.type = codeType;
    }

    public boolean isHideAlbum() {
        return this.hideAlbum;
    }

    public void setHideAlbum(boolean z) {
        this.hideAlbum = z;
    }

    public Map<String, String> getExtendedInfo() {
        return this.extendedInfo;
    }

    public void setExtendedInfo(Map<String, String> map) {
        this.extendedInfo = map;
    }
}
