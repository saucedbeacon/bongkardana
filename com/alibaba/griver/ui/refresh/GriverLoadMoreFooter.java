package com.alibaba.griver.ui.refresh;

import android.content.Context;
import android.widget.TextView;
import com.alibaba.griver.ui.refresh.LoadMoreFooter;

public class GriverLoadMoreFooter extends LoadMoreFooter {

    /* renamed from: a  reason: collision with root package name */
    private LoadMoreFooter.LoadMoreState f10612a = LoadMoreFooter.LoadMoreState.NONE;

    public void setLoadMoreTipColor(int i) {
    }

    public void setLoadMoreTips(String[] strArr) {
    }

    public void setProgress(float f) {
    }

    public GriverLoadMoreFooter(Context context) {
        super(context);
        changeToState(LoadMoreFooter.LoadMoreState.NONE);
    }

    public void changeToState(LoadMoreFooter.LoadMoreState loadMoreState) {
        this.f10612a = loadMoreState;
    }

    public LoadMoreFooter.LoadMoreState getCurrentState() {
        return this.f10612a;
    }

    public TextView getLoadMoreTipView() {
        return new TextView(getContext());
    }
}
