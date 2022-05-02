package com.alipay.iap.android.wallet.acl.capability.scanner;

import java.util.Map;

public class ScannerOption {
    private Map<String, String> extendedInfo;
    private boolean hideAlbum;
    private ScannerType type;

    public ScannerOption(ScannerType scannerType, boolean z, Map<String, String> map) {
        this.hideAlbum = z;
        this.type = scannerType;
        this.extendedInfo = map;
    }

    public ScannerType getType() {
        return this.type;
    }

    public void setType(ScannerType scannerType) {
        this.type = scannerType;
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
