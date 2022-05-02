package com.alibaba.ariver.kernel.api.extension;

public interface Extension {
    void onFinalized();

    void onInitialized();
}
