package com.alibaba.griver.ui.splash;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.app.api.ui.loading.SplashView;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.ui.splash.GriverSplashFragmentExtension;
import com.alibaba.griver.api.ui.splash.SplashEntryInfo;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.ui.R;
import java.util.Map;
import o.setColorFilter;

public class GriverSplashView extends BaseSplashView {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f10619a = R.id.splash_container;
    /* access modifiers changed from: private */
    public FragmentManager b;
    /* access modifiers changed from: private */
    public GriverSplashFragmentExtension.AbstractSplashFragment c;
    /* access modifiers changed from: private */
    public SplashView.Status d = SplashView.Status.WAITING;
    /* access modifiers changed from: private */
    public App e;
    /* access modifiers changed from: private */
    public AppModel f;

    public GriverSplashView(FragmentManager fragmentManager, App app, AppModel appModel) {
        super(app);
        this.b = fragmentManager;
        this.e = app;
        this.f = appModel == null ? new AppModel() : appModel;
    }

    public void showLoading(final EntryInfo entryInfo) {
        super.showLoading(entryInfo);
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                Bundle bundle;
                if (GriverSplashView.this.e == null || GriverSplashView.this.e.isDestroyed()) {
                    RVLogger.w("SplashView", "app has been destroyed");
                } else if (GriverSplashView.this.d == SplashView.Status.ERROR || GriverSplashView.this.d == SplashView.Status.LOADING) {
                    StringBuilder sb = new StringBuilder("showLoading not work on ");
                    sb.append(GriverSplashView.this.d);
                    sb.append(" Status");
                    RVLogger.w("SplashView", sb.toString());
                } else {
                    SplashView.Status unused = GriverSplashView.this.d = SplashView.Status.LOADING;
                    if (GriverSplashView.this.c == null) {
                        GriverSplashFragmentExtension.AbstractSplashFragment unused2 = GriverSplashView.this.c = ((GriverSplashFragmentExtension) RVProxy.get(GriverSplashFragmentExtension.class)).createSplashFragment();
                        if (GriverSplashView.this.c == null) {
                            GriverLogger.e("SplashView", "splash fragment is null, can not show loading");
                            return;
                        }
                        setColorFilter setcolorfilter = new setColorFilter(GriverSplashView.this.b);
                        setcolorfilter.length(GriverSplashView.this.f10619a, GriverSplashView.this.c, SplashFragment.FRAGMENT_TAG, 1);
                        setcolorfilter.length();
                    }
                    SplashEntryInfo access$500 = GriverSplashView.this.a(entryInfo);
                    StringBuilder sb2 = new StringBuilder("showLoading with loadingFragment added ");
                    sb2.append(GriverSplashView.this.c.isAdded());
                    sb2.append(" and loadingInfo:");
                    sb2.append(access$500);
                    RVLogger.d("SplashView", sb2.toString());
                    try {
                        if (GriverSplashView.this.c.getArguments() == null) {
                            bundle = new Bundle();
                        } else {
                            bundle = GriverSplashView.this.c.getArguments();
                        }
                        if (!GriverSplashView.this.c.isAdded()) {
                            bundle.putString("usePresetPopmenu", BundleUtils.getString(GriverSplashView.this.e.getSceneParams(), "usePresetPopmenu"));
                            bundle.putParcelable(RVConstants.EXTRA_ENTRY_INFO, access$500);
                            bundle.putParcelable("appInfo", GriverSplashView.this.f);
                            GriverSplashView.this.c.setArguments(bundle);
                            return;
                        }
                        GriverSplashView.this.c.updateLoadingInfo(access$500);
                    } catch (Throwable th) {
                        RVLogger.e("SplashView", "showLoading with loadingFragment exception", th);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public SplashEntryInfo a(EntryInfo entryInfo) {
        SplashEntryInfo splashEntryInfo = new SplashEntryInfo();
        App app = this.e;
        if (app != null) {
            splashEntryInfo.appId = app.getAppId();
        }
        if (entryInfo != null) {
            splashEntryInfo.appName = entryInfo.title;
            splashEntryInfo.slogan = entryInfo.slogan;
            splashEntryInfo.desc = entryInfo.desc;
            splashEntryInfo.iconUrl = entryInfo.iconUrl;
        }
        return splashEntryInfo;
    }

    public void update(final EntryInfo entryInfo) {
        if (this.d != SplashView.Status.LOADING) {
            RVLogger.w("SplashView", "updateLoading before showLoading would not working!");
        }
        final SplashEntryInfo a2 = a(entryInfo);
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                Bundle bundle;
                if (GriverSplashView.this.c != null) {
                    StringBuilder sb = new StringBuilder("updateLoading with loadingFragment isAdded: ");
                    sb.append(GriverSplashView.this.c.isAdded());
                    sb.append(" and loadingInfo:");
                    sb.append(entryInfo);
                    RVLogger.d("SplashView", sb.toString());
                    if (GriverSplashView.this.c.getArguments() == null) {
                        bundle = new Bundle();
                    } else {
                        bundle = GriverSplashView.this.c.getArguments();
                    }
                    if (!GriverSplashView.this.c.isAdded()) {
                        bundle.putParcelable(RVConstants.EXTRA_ENTRY_INFO, a2);
                        GriverSplashView.this.c.setArguments(bundle);
                        return;
                    }
                    GriverSplashView.this.c.updateLoadingInfo(a2);
                }
            }
        });
    }

    public void showError(final String str, final String str2, @Nullable Map<String, String> map) {
        this.d = SplashView.Status.ERROR;
        RVLogger.d("SplashView", "showError with loadingFragment: ".concat(String.valueOf(this.b.findFragmentByTag(SplashFragment.FRAGMENT_TAG))));
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                Bundle bundle;
                if (GriverSplashView.this.c == null) {
                    GriverSplashFragmentExtension.AbstractSplashFragment unused = GriverSplashView.this.c = ((GriverSplashFragmentExtension) RVProxy.get(GriverSplashFragmentExtension.class)).createSplashFragment();
                    if (GriverSplashView.this.c == null) {
                        GriverLogger.e("SplashView", "splash fragment is null, can not show error");
                        return;
                    }
                    setColorFilter setcolorfilter = new setColorFilter(GriverSplashView.this.b);
                    setcolorfilter.length(GriverSplashView.this.f10619a, GriverSplashView.this.c, SplashFragment.FRAGMENT_TAG, 1);
                    setcolorfilter.length();
                }
                if (GriverSplashView.this.c != null) {
                    if (GriverSplashView.this.c.getArguments() == null) {
                        bundle = new Bundle();
                    } else {
                        bundle = GriverSplashView.this.c.getArguments();
                    }
                    if (!GriverSplashView.this.c.isAdded()) {
                        bundle.putBoolean("showError", true);
                        bundle.putString("errorCode", str);
                        bundle.putString("errorMessage", str2);
                        GriverSplashView.this.c.setArguments(bundle);
                        return;
                    }
                    GriverSplashView.this.c.showError(str, str2);
                }
            }
        });
    }

    /* renamed from: com.alibaba.griver.ui.splash.GriverSplashView$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$ariver$app$api$ui$loading$SplashView$Status;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.alibaba.ariver.app.api.ui.loading.SplashView$Status[] r0 = com.alibaba.ariver.app.api.ui.loading.SplashView.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alibaba$ariver$app$api$ui$loading$SplashView$Status = r0
                com.alibaba.ariver.app.api.ui.loading.SplashView$Status r1 = com.alibaba.ariver.app.api.ui.loading.SplashView.Status.WAITING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alibaba$ariver$app$api$ui$loading$SplashView$Status     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alibaba.ariver.app.api.ui.loading.SplashView$Status r1 = com.alibaba.ariver.app.api.ui.loading.SplashView.Status.EXIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$alibaba$ariver$app$api$ui$loading$SplashView$Status     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alibaba.ariver.app.api.ui.loading.SplashView$Status r1 = com.alibaba.ariver.app.api.ui.loading.SplashView.Status.LOADING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$alibaba$ariver$app$api$ui$loading$SplashView$Status     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.alibaba.ariver.app.api.ui.loading.SplashView$Status r1 = com.alibaba.ariver.app.api.ui.loading.SplashView.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.splash.GriverSplashView.AnonymousClass4.<clinit>():void");
        }
    }

    public void exit(SplashView.ExitListener exitListener) {
        super.exit(exitListener);
        int i = AnonymousClass4.$SwitchMap$com$alibaba$ariver$app$api$ui$loading$SplashView$Status[this.d.ordinal()];
        if (i == 1 || i == 2) {
            if (exitListener != null) {
                exitListener.onExit();
            }
        } else if (i == 3 || i == 4) {
            Fragment findFragmentByTag = this.b.findFragmentByTag(SplashFragment.FRAGMENT_TAG);
            RVLogger.d("SplashView", "exitLoading with loadingFragment: ".concat(String.valueOf(findFragmentByTag)));
            if (findFragmentByTag instanceof GriverSplashFragmentExtension.AbstractSplashFragment) {
                ((GriverSplashFragmentExtension.AbstractSplashFragment) findFragmentByTag).exit();
                new setColorFilter(this.b).length(findFragmentByTag).length();
            }
            if (exitListener != null) {
                exitListener.onExit();
            }
        }
        this.d = SplashView.Status.EXIT;
    }

    public SplashView.Status getStatus() {
        return this.d;
    }

    public boolean backPressed() {
        if (this.d != SplashView.Status.LOADING && this.d != SplashView.Status.ERROR) {
            return false;
        }
        this.e.exit();
        return true;
    }
}
