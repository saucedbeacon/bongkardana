package com.zoloz.android.phone.zdoc.module;

import java.io.Serializable;

public class UploadModule implements Serializable {
    private String docType = "";
    private int pageNo = 1;
    private float ratio = 0.7f;

    public String getDocType() {
        return this.docType;
    }

    public void setDocType(String str) {
        this.docType = str;
    }

    public int getPageNo() {
        return this.pageNo;
    }

    public void setPageNo(int i) {
        this.pageNo = i;
    }

    public float getRatio() {
        return this.ratio;
    }

    public void setRatio(float f) {
        this.ratio = f;
    }
}
