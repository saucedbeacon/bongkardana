package com.alibaba.ariver.app.api.ui;

import com.alibaba.ariver.app.api.Page;

public interface ErrorView {
    boolean enableShowErrorPage();

    void showErrorView(Page page, String str, int i, String str2, String str3);
}
