package com.alibaba.griver.base.api;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.api.extension.Extension;

public interface RenderLoadingStatusChangePoint extends Extension {

    public interface LoadingStatusChangeListener {
        void onChange(Page page, int i);
    }

    int getRenderLoadStatusCode();

    void onLoadingStatusChanged(Page page, int i, Object obj);

    void registerStatusListener(LoadingStatusChangeListener loadingStatusChangeListener);

    void unRegisterStatusListener(LoadingStatusChangeListener loadingStatusChangeListener);
}
