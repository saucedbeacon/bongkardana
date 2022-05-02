package com.alibaba.griver.device.jsapi.screen;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.app.api.point.biz.SnapshotPoint;
import com.alibaba.ariver.app.api.point.page.PageExitPoint;
import com.alibaba.ariver.app.api.point.page.PagePausePoint;
import com.alibaba.ariver.app.api.point.page.PageResumePoint;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.device.jsapi.screen.ScreenShotObserver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.restorePresenterStates;

public class SnapshotExtension implements AppDestroyPoint, SnapshotPoint, PageExitPoint, PagePausePoint, PageResumePoint {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Page> f10427a = new HashSet();
    /* access modifiers changed from: private */
    public final Set<Page> b = new HashSet();
    private ScreenShotObserver c;
    private restorePresenterStates d = restorePresenterStates.length(GriverEnv.getApplicationContext());
    private List<BroadcastReceiver> e = new ArrayList();

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onAppDestroy(App app) {
        ScreenShotObserver screenShotObserver = this.c;
        if (screenShotObserver != null) {
            screenShotObserver.release();
            this.c = null;
        }
        Set<Page> set = this.f10427a;
        if (set != null) {
            set.clear();
        }
        Set<Page> set2 = this.b;
        if (set2 != null) {
            set2.clear();
        }
        List<BroadcastReceiver> list = this.e;
        if (list != null) {
            for (BroadcastReceiver max : list) {
                this.d.setMax(max);
            }
            this.e.clear();
        }
    }

    public void addScreenshotListener(final Page page) {
        if (!this.f10427a.contains(page)) {
            this.f10427a.add(page);
            this.b.add(page);
            if (this.c == null) {
                this.c = new ScreenShotObserver(GriverEnv.getApplicationContext());
            }
            this.c.registerListener(new ScreenShotObserver.H5ScreenShotListener() {
                public void onScreenShot() {
                    Page activePage = page.getApp().getActivePage();
                    if (activePage != null && activePage == page && SnapshotExtension.this.b.contains(page)) {
                        EngineUtils.sendToRender(page.getRender(), "screenshotbyuser", (JSONObject) null, (SendToRenderCallback) null);
                        RVLogger.d("SnapshotExtension", "send screenshotbyuser event");
                    }
                }
            });
        }
    }

    public void registerReceiever(BroadcastReceiver broadcastReceiver) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("embedview.snapshot.complete");
        this.e.add(broadcastReceiver);
        this.d.setMax(broadcastReceiver, intentFilter);
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        this.e.remove(broadcastReceiver);
        this.d.setMax(broadcastReceiver);
    }

    public void onPageExit(Page page) {
        this.f10427a.remove(page);
        this.b.remove(page);
    }

    public void onPagePause(Page page) {
        this.b.remove(page);
    }

    public void onPageResume(Page page) {
        this.b.add(page);
    }
}
