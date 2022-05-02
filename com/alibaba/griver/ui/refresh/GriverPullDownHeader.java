package com.alibaba.griver.ui.refresh;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.alibaba.griver.ui.refresh.RefreshHeader;

public class GriverPullDownHeader extends RefreshHeader {

    /* renamed from: a  reason: collision with root package name */
    private ProgressView f10613a;

    public View getRefreshView() {
        return this;
    }

    public View getSecondFloorView() {
        return null;
    }

    public void setRefreshAnimation(String[] strArr, @Nullable String str) {
    }

    public void setRefreshTipColor(int i) {
    }

    public void setRefreshTips(String[] strArr) {
    }

    public void setSecondFloorView(View view) {
    }

    public void switchStyle(RefreshHeader.RefreshHeaderStyle refreshHeaderStyle) {
    }

    public GriverPullDownHeader(Context context) {
        super(context);
        changeToState(RefreshHeader.RefreshState.NONE);
        setBackgroundColor(0);
        this.f10613a = new ProgressView(context);
    }

    public void setProgress(float f) {
        this.f10613a.startLoading();
    }

    public void changeToState(RefreshHeader.RefreshState refreshState) {
        this.mState = refreshState;
    }
}
