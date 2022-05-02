package com.zoloz.android.phone.zdoc.module;

import java.io.Serializable;

public class CollModule implements Serializable {
    private int algoType = 1;
    private String docType = "006200001";
    private int pageNo = 1;
    private int retryLimit = 3;
    private int scanTimeout = 30;
    private int uiType = -1;

    public int getRetryLimit() {
        return this.retryLimit;
    }

    public void setRetryLimit(int i) {
        this.retryLimit = i;
    }

    public int getScanTimeout() {
        return this.scanTimeout;
    }

    public void setScanTimeout(int i) {
        this.scanTimeout = i;
    }

    public int getUiType() {
        return this.uiType;
    }

    public void setUiType(int i) {
        this.uiType = i;
    }

    public int getPageNo() {
        return this.pageNo;
    }

    public void setPageNo(int i) {
        this.pageNo = i;
    }

    public String getDocType() {
        return this.docType;
    }

    public void setDocType(String str) {
        this.docType = str;
    }

    public int getAlgoType() {
        return this.algoType;
    }

    public void setAlgoType(int i) {
        this.algoType = i;
    }
}
