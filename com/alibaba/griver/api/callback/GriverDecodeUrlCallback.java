package com.alibaba.griver.api.callback;

public abstract class GriverDecodeUrlCallback {
    public abstract void onDecodeFailed(int i, String str);

    public abstract void onDecodeSuccess(String str);
}
