package com.alibaba.griver.core;

public abstract class GriverInitializeCallback {
    public abstract void onInitializeFailed(int i, String str);

    public abstract void onInitializedSuccess();
}
