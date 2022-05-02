package com.alibaba.griver.ui.refresh;

import android.content.Context;
import android.view.View;

public interface GriverPullRefreshService {

    public enum IGRiverRefreshStyle {
        LIGHT,
        DARK
    }

    public enum IGriverRefreshState {
        NONE,
        PULL_TO_REFRESH,
        RELEASE_TO_REFRESH,
        REFRESHING
    }

    void changeStyle(IGRiverRefreshStyle iGRiverRefreshStyle);

    void changeToState(IGriverRefreshState iGriverRefreshState);

    View getRefreshView(Context context);

    int getRefreshViewHeight();

    void setProgress(float f);
}
