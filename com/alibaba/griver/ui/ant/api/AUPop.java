package com.alibaba.griver.ui.ant.api;

import android.app.Activity;

public interface AUPop {
    void dismissPop();

    Activity getPopActivity();

    int getPriority();

    void showPop();
}
