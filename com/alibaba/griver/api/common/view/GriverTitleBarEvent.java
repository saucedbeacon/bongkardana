package com.alibaba.griver.api.common.view;

import com.alibaba.griver.api.common.GriverEvent;

public interface GriverTitleBarEvent extends GriverEvent {
    void onTitleClick();
}
