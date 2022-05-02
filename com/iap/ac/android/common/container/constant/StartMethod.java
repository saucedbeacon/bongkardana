package com.iap.ac.android.common.container.constant;

public enum StartMethod {
    POST("POST"),
    GET("GET");
    
    public String value;

    private StartMethod(String str) {
        this.value = str;
    }
}
