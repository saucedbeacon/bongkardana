package com.alibaba.griver.ui.splash;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.app.api.ui.loading.SplashView;
import com.alibaba.ariver.kernel.api.track.EventTracker;
import com.alibaba.ariver.kernel.api.track.TrackId;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.griver.api.ui.GVSplashView;

public abstract class BaseSplashView implements GVSplashView {

    /* renamed from: a  reason: collision with root package name */
    private App f10618a;

    BaseSplashView(App app) {
        this.f10618a = app;
    }

    public void showLoading(EntryInfo entryInfo) {
        if (getStatus() != SplashView.Status.LOADING) {
            ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.f10618a, TrackId.Stub_LoadingStart);
        }
    }

    public void exit(SplashView.ExitListener exitListener) {
        if (getStatus() == SplashView.Status.LOADING) {
            ((EventTracker) RVProxy.get(EventTracker.class)).stub(this.f10618a, TrackId.Stub_LoadingEnd);
        }
    }
}
