package com.alibaba.griver.api.ui.titlebar;

import android.view.View;
import com.alibaba.griver.api.common.GriverEvent;

public interface GriverTitleBarCreatedEvent extends GriverEvent {
    void titleBarCreated(View view);
}
