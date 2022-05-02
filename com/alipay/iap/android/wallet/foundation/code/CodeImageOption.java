package com.alipay.iap.android.wallet.foundation.code;

import java.util.Map;

public class CodeImageOption {
    private String code;
    private CodeType codeType;
    private Map<String, String> extendedInfo;
    private int height;
    private int width;

    public CodeImageOption(CodeType codeType2, String str, int i, int i2, Map<String, String> map) {
        this.codeType = codeType2;
        this.code = str;
        this.width = i;
        this.height = i2;
        this.extendedInfo = map;
    }

    public CodeType getCodeType() {
        return this.codeType;
    }

    public void setCodeType(CodeType codeType2) {
        this.codeType = codeType2;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public Map<String, String> getExtendedInfo() {
        return this.extendedInfo;
    }

    public void setExtendedInfo(Map<String, String> map) {
        this.extendedInfo = map;
    }
}
