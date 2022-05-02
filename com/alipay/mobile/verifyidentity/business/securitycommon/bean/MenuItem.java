package com.alipay.mobile.verifyidentity.business.securitycommon.bean;

public class MenuItem {
    private String desc;
    private boolean isNeedLine;
    private String productCode;
    private String productId;
    private String redDot;
    private String status;
    private String title;
    private String type;
    private String url;

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String str) {
        this.productCode = str;
    }

    public boolean isNeedLine() {
        return this.isNeedLine;
    }

    public void setNeedLine(boolean z) {
        this.isNeedLine = z;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public String getRedDot() {
        return this.redDot;
    }

    public void setRedDot(String str) {
        this.redDot = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
