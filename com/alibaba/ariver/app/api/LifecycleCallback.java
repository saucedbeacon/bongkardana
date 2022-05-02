package com.alibaba.ariver.app.api;

public interface LifecycleCallback {
    void onAppFinish(App app);

    void onAppStart(App app);

    void onPageEnter(Page page);

    void onPageExit(Page page);

    void onPageHide(Page page);

    void onPageShow(Page page);

    void onVisit(Visit visit);
}
