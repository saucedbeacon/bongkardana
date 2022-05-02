package com.alibaba.ariver.app.api.ui.loading;

public interface LoadingView {
    boolean backPressed();

    void dismiss();

    void show(String str, int i, boolean z);
}
