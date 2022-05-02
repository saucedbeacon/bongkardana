package com.alibaba.griver.ui.refresh;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.alibaba.griver.base.common.utils.CommonUtils;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.refresh.GriverPullRefreshService;
import com.alibaba.griver.ui.refresh.RefreshHeader;

public class GriverRefreshHeader extends RefreshHeader {

    /* renamed from: a  reason: collision with root package name */
    private GriverPullRefreshService f10614a = null;
    private ProgressView b;

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

    public GriverRefreshHeader(Context context) {
        super(context);
        changeToState(RefreshHeader.RefreshState.NONE);
        GriverPullRefreshService griverPullRefreshService = this.f10614a;
        if (griverPullRefreshService != null) {
            addView(griverPullRefreshService.getRefreshView(context));
            return;
        }
        ProgressView progressView = new ProgressView(context);
        this.b = progressView;
        progressView.setAutoPlay(false);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        layoutParams.bottomMargin = CommonUtils.dip2px(context, 20.0f);
        addView(this.b, layoutParams);
        this.b.stopLoading();
        setBackgroundColor(0);
    }

    public void setProgress(float f) {
        GriverPullRefreshService griverPullRefreshService = this.f10614a;
        if (griverPullRefreshService != null) {
            griverPullRefreshService.setProgress(f);
        }
    }

    public void changeToState(RefreshHeader.RefreshState refreshState) {
        this.mState = refreshState;
        if (this.f10614a != null) {
            this.f10614a.changeToState(a(refreshState));
        } else if (this.b != null) {
            if (refreshState == RefreshHeader.RefreshState.REFRESHING) {
                this.b.startLoading();
            } else {
                this.b.stopLoading();
            }
        }
    }

    private GriverPullRefreshService.IGriverRefreshState a(RefreshHeader.RefreshState refreshState) {
        if (refreshState == RefreshHeader.RefreshState.NONE) {
            return GriverPullRefreshService.IGriverRefreshState.NONE;
        }
        if (refreshState == RefreshHeader.RefreshState.PULL_TO_REFRESH) {
            return GriverPullRefreshService.IGriverRefreshState.PULL_TO_REFRESH;
        }
        if (refreshState == RefreshHeader.RefreshState.REFRESHING) {
            return GriverPullRefreshService.IGriverRefreshState.REFRESHING;
        }
        if (refreshState == RefreshHeader.RefreshState.RELEASE_TO_REFRESH) {
            return GriverPullRefreshService.IGriverRefreshState.RELEASE_TO_REFRESH;
        }
        return GriverPullRefreshService.IGriverRefreshState.NONE;
    }

    public void switchStyle(RefreshHeader.RefreshHeaderStyle refreshHeaderStyle) {
        if (this.f10614a != null) {
            this.f10614a.changeStyle(a(refreshHeaderStyle));
        } else if (this.b == null) {
        } else {
            if (refreshHeaderStyle == RefreshHeader.RefreshHeaderStyle.NORMAL) {
                this.b.setDotsBackground(R.drawable.griver_ui_progress_view_bg_white);
            } else if (refreshHeaderStyle == RefreshHeader.RefreshHeaderStyle.DARK) {
                this.b.setDotsBackground(R.drawable.griver_ui_progress_view_bg);
            }
        }
    }

    private GriverPullRefreshService.IGRiverRefreshStyle a(RefreshHeader.RefreshHeaderStyle refreshHeaderStyle) {
        if (refreshHeaderStyle == RefreshHeader.RefreshHeaderStyle.DARK) {
            return GriverPullRefreshService.IGRiverRefreshStyle.DARK;
        }
        if (refreshHeaderStyle == RefreshHeader.RefreshHeaderStyle.NORMAL) {
            return GriverPullRefreshService.IGRiverRefreshStyle.LIGHT;
        }
        return null;
    }

    public ProgressView getProgressView() {
        return this.b;
    }
}
