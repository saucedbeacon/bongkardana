package com.alibaba.griver.ui.container;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.page.PageStartedPoint;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.h5.point.GriverH5LoadProgressPoint;
import com.alibaba.griver.api.ui.pagecontainer.GVPageContainer;
import com.alibaba.griver.api.webview.PageFinishedPoint;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.progress.GriverProgressBar;
import com.alibaba.griver.ui.refresh.GriverRefreshHeader;
import com.alibaba.griver.ui.refresh.GriverSwipeRefreshLayout;
import java.util.concurrent.atomic.AtomicBoolean;

public class GriverPageContainer implements PageStartedPoint, GriverH5LoadProgressPoint, GVPageContainer, PageFinishedPoint {

    /* renamed from: a  reason: collision with root package name */
    private Context f9108a;
    private GriverRootView b;
    private boolean c;
    private boolean d;
    private GriverSwipeRefreshLayout e;
    /* access modifiers changed from: private */
    public GriverProgressBar f;
    private boolean g;
    /* access modifiers changed from: private */
    public App h;
    private Page i;
    private H5CloseHandler j;
    /* access modifiers changed from: private */
    public AtomicBoolean k = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public boolean l;
    GriverSwipeRefreshLayout.OnReachDistanceRefreshListener reachDistanceRefreshListener = new GriverSwipeRefreshLayout.OnReachDistanceRefreshListener() {
        public void onMotionEventUp() {
        }

        public boolean onReachPullRefreshDistance() {
            return false;
        }

        public void onRefresh() {
            try {
                if (GriverPageContainer.this.l) {
                    EngineUtils.sendToRender(GriverPageContainer.this.h.getActivePage().getRender(), EngineUtils.getWorker(GriverPageContainer.this.h.getEngineProxy()), RVEvents.FIRE_PULL_TO_REFRESH, (JSONObject) null, new PullFreshCallback());
                    boolean unused = GriverPageContainer.this.l = false;
                    return;
                }
                GriverLogger.w("GriverPageContainer", "date not return, not sendToWeb FIRE_PULL_TO_REFRESH");
            } catch (Exception unused2) {
            }
        }
    };

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public GriverPageContainer(Context context, App app) {
        this.h = app;
        this.f9108a = context;
        GriverRootView griverRootView = (GriverRootView) LayoutInflater.from(context).inflate(R.layout.griver_ui_container_root_view, (ViewGroup) null);
        this.b = griverRootView;
        this.l = true;
        this.e = (GriverSwipeRefreshLayout) griverRootView.findViewById(R.id.griver_layout_refresh);
        GriverProgressBar griverProgressBar = (GriverProgressBar) this.b.findViewById(R.id.griver_h5_prgress);
        this.f = griverProgressBar;
        griverProgressBar.setNotifier(new GriverProgressBar.ProgressNotifier() {
            public void onProgressBegin() {
                StringBuilder sb = new StringBuilder("isShowProgress:");
                sb.append(GriverPageContainer.this.k);
                sb.append(" visible:");
                sb.append(GriverPageContainer.this.f.getVisibility());
                GriverLogger.d("GriverPageContainer", sb.toString());
                GriverPageContainer.this.k.set(true);
            }

            public void onProgressEnd() {
                StringBuilder sb = new StringBuilder("isShowProgress:");
                sb.append(GriverPageContainer.this.k);
                sb.append(" visible:");
                sb.append(GriverPageContainer.this.f.getVisibility());
                GriverLogger.d("GriverPageContainer", sb.toString());
                if (GriverPageContainer.this.k.compareAndSet(true, false) && GriverPageContainer.this.f.getVisibility() == 0) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                    translateAnimation.setDuration(300);
                    GriverPageContainer.this.f.startAnimation(translateAnimation);
                    GriverPageContainer.this.f.setVisibility(8);
                }
            }
        });
        boolean z = BundleUtils.getBoolean(app.getStartParams(), "showProgress", false);
        this.g = z;
        if (z) {
            this.f.setVisibility(0);
            int i2 = BundleUtils.getInt(app.getStartParams(), "progressBarColor", 0);
            if (i2 != 0) {
                try {
                    this.f.setProgressDrawable(this.f9108a.getResources().getDrawable(i2));
                } catch (Exception unused) {
                }
            }
        } else {
            this.f.setVisibility(8);
        }
        this.j = new H5CloseHandler();
    }

    public void attachPage(Page page) {
        this.i = page;
        a(page);
    }

    public ViewGroup getView() {
        return this.b;
    }

    public void addRenderView(View view) {
        if (!(view == null || view.getParent() == null)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        this.e.addView(view, new ViewGroup.LayoutParams(-1, -1));
    }

    private void a(Page page) {
        this.d = false;
        this.c = false;
        if (!(page.getStartParams() == null || page.getStartParams().get("pullRefresh") == null)) {
            this.c = ((Boolean) page.getStartParams().get("pullRefresh")).booleanValue();
        }
        if (!(page.getStartParams() == null || page.getStartParams().get(RVParams.LONG_CAN_PULL_DOWN) == null)) {
            this.d = ((Boolean) page.getStartParams().get(RVParams.LONG_CAN_PULL_DOWN)).booleanValue();
        }
        if (this.c && this.d) {
            c();
        } else if (this.c) {
            a();
        } else {
            b();
        }
    }

    private void a() {
        this.e.enablePullRefresh(true);
        this.e.enableLoadMore(false);
        this.e.enableSecondFloor(false);
        this.e.setPullRefreshDistance(30);
        this.e.setDistanceToRefresh(48);
        this.e.setHeaderView(new GriverRefreshHeader(this.f9108a));
    }

    private void b() {
        this.e.enablePullRefresh(false);
        this.e.enableLoadMore(false);
        this.e.enableSecondFloor(false);
        this.e.setPullRefreshDistance(0);
        this.e.setDistanceToRefresh(0);
        this.e.setHeaderView(new GriverRefreshHeader(this.f9108a));
    }

    private void c() {
        this.e.enablePullRefresh(true);
        this.e.enableLoadMore(false);
        this.e.enableSecondFloor(false);
        this.e.setPullRefreshDistance(30);
        this.e.setHeaderView(new GriverRefreshHeader(this.f9108a));
        this.e.setReachDistanceRefreshListener(this.reachDistanceRefreshListener);
    }

    public void startPullDownRefresh() {
        this.e.setRefreshingWithNotify(true, true);
    }

    public void restorePullToRefresh() {
        this.e.setRefreshing(false);
        this.l = true;
    }

    public void setCanPullDown(boolean z) {
        if (z) {
            this.d = true;
            if (this.c) {
                c();
            } else {
                a();
            }
        } else {
            this.d = false;
            if (this.c) {
                restorePullToRefresh();
            }
            b();
        }
    }

    public GriverProgressBar getProgressBar() {
        return this.f;
    }

    public void onProgressChanged(int i2) {
        GriverProgressBar griverProgressBar = this.f;
        if (griverProgressBar != null && this.g) {
            griverProgressBar.setProgress(i2);
        }
    }

    public void onStarted(String str) {
        if (this.f != null && BundleUtils.getBoolean(this.i.getStartParams(), "showProgress", false)) {
            this.f.setVisibility(0);
        }
    }

    public void onPageFinished(String str) {
        GriverProgressBar griverProgressBar = this.f;
        if (griverProgressBar != null) {
            griverProgressBar.setVisibility(8);
        }
        restorePullToRefresh();
    }

    class H5CloseHandler implements SendToRenderCallback {
        public long lastClose = 0;
        public boolean waiting = false;

        public H5CloseHandler() {
        }

        public void onCallBack(JSONObject jSONObject) {
            this.waiting = false;
            boolean z = JSONUtils.getBoolean(jSONObject, "prevent", false);
            RVLogger.d("GriverPageContainer", "close event prevent ".concat(String.valueOf(z)));
            if (!z) {
                GriverPageContainer.this.e();
            }
        }
    }

    private void d() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.j.lastClose < 500) {
            RVLogger.d("GriverPageContainer", "ignore bridge, perform close!");
            e();
            return;
        }
        RVLogger.d("GriverPageContainer", "send close event to bridge!");
        this.j.waiting = true;
        this.j.lastClose = currentTimeMillis;
        EngineUtils.sendToRender(this.i.getRender(), "closeWindow", (JSONObject) null, this.j);
    }

    public void handleCloseEvent() {
        if (!BundleUtils.getBoolean(this.i.getStartParams(), RVParams.isH5App, false)) {
            this.h.exit();
        } else {
            d();
        }
    }

    /* access modifiers changed from: private */
    public void e() {
        this.i.exit(true);
    }

    class PullFreshCallback implements SendToRenderCallback {
        public PullFreshCallback() {
        }

        public void onCallBack(JSONObject jSONObject) {
            boolean z = JSONUtils.getBoolean(jSONObject, "prevent", false);
            GriverLogger.d("GriverPageContainer", "FIRE_PULL_TO_REFRESH event prevent: ".concat(String.valueOf(z)));
            if (z) {
                GriverLogger.d("GriverPageContainer", "set e.preventDefault(),not send H5_PAGE_RELOAD");
                return;
            }
            GriverLogger.d("GriverPageContainer", "not set e.preventDefault(),sendEvent H5_PAGE_RELOAD");
            try {
                GriverPageContainer.this.h.getActivePage().getRender().reload();
            } catch (Exception e) {
                GriverLogger.e("GriverPageContainer", "reload exception", e);
            }
            boolean unused = GriverPageContainer.this.l = true;
        }
    }
}
