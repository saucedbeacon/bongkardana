package com.alipay.zoloz.config;

public interface IConfigCenterCallback {
    void onConfigFail(String str);

    void onConfigSuccess();
}
