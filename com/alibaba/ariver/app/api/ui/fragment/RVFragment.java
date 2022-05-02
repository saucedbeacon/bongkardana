package com.alibaba.ariver.app.api.ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppManager;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.app.api.ParamUtils;
import com.alibaba.ariver.app.api.R;
import com.alibaba.ariver.app.api.activity.AnimUtils;
import com.alibaba.ariver.app.api.ui.ErrorView;
import com.alibaba.ariver.app.api.ui.PageContainer;
import com.alibaba.ariver.app.api.ui.RVViewFactory;
import com.alibaba.ariver.app.api.ui.ViewSpecProvider;
import com.alibaba.ariver.app.api.ui.ViewUtils;
import com.alibaba.ariver.app.api.ui.loading.LoadingView;
import com.alibaba.ariver.app.api.ui.titlebar.TitleBar;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedViewManager;
import com.alibaba.ariver.ipc.RemoteCallClient;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.track.EventTrackStore;
import com.alibaba.ariver.kernel.api.track.EventTracker;
import com.alibaba.ariver.kernel.api.track.TrackId;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.DimensionUtil;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.fastjson.JSONObject;

public class RVFragment extends Fragment implements PageContext {
    public static final String TRANSLATE_IN_LEFT_ID = "ariver_fragment_translate_in_left";
    public static final String TRANSLATE_IN_RIGHT_ID = "ariver_fragment_translate_in_right";
    public static final String TRANSLATE_OUT_LEFT_ID = "ariver_fragment_translate_out_left";
    public static final String TRANSLATE_OUT_RIGHT_ID = "ariver_fragment_translate_out_right";
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public Page f8958a;
    private LoadingView b;
    /* access modifiers changed from: private */
    public RelativeLayout c;
    private PageContainer d;
    private ErrorView e;
    private TitleBar f;
    private ViewSpecProvider g;
    private IEmbedViewManager h;
    /* access modifiers changed from: private */
    public Page i = null;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private long m = 0;
    /* access modifiers changed from: private */
    public boolean n = false;

    public /* bridge */ /* synthetic */ Activity getActivity() {
        return super.getActivity();
    }

    public boolean isAlreadyScheduleAdded() {
        return this.l;
    }

    public void setAlreadyScheduleAdded(boolean z) {
        this.l = z;
    }

    public Page getPage() {
        return this.f8958a;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        RVLogger.d("AriverApp:RVFragment", "onCreate ".concat(String.valueOf(this)));
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context != null && !ProcessUtils.isMainProcess()) {
            RemoteCallClient.bindContext(context);
        }
    }

    public void onDetach() {
        super.onDetach();
        RVLogger.d("AriverApp:RVFragment", "onDetach ".concat(String.valueOf(this)));
    }

    public void onDestroyView() {
        super.onDestroyView();
        RVLogger.d("AriverApp:RVFragment", "onDestroyView ".concat(String.valueOf(this)));
    }

    public RelativeLayout getRootView() {
        return this.c;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_onCreateView);
        RVLogger.d("AriverApp:RVFragment", "onCreateView ".concat(String.valueOf(this)));
        App app = null;
        if (this.f8958a == null || !this.f8958a.isExited()) {
            try {
                if (this.c != null) {
                    ViewParent parent = this.c.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).endViewTransition(this.c);
                        ((ViewGroup) parent).removeAllViews();
                    }
                    return this.c;
                }
                long j2 = BundleUtils.getLong(getArguments(), RVConstants.EXTRA_APP_INSTANCE_ID, 0);
                RVLogger.d("AriverApp:RVFragment", "onCreateView with appInstanceId: ".concat(String.valueOf(j2)));
                if (j2 != 0) {
                    app = ((AppManager) RVProxy.get(AppManager.class)).findApp(j2);
                    RVLogger.d("AriverApp:RVFragment", "findApp: ".concat(String.valueOf(app)));
                }
                if (app != null) {
                    if (app.getAppContext() != null) {
                        RelativeLayout relativeLayout = new RelativeLayout(getActivity());
                        this.c = relativeLayout;
                        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        this.c.setBackgroundColor(0);
                        if (!BundleUtils.getBoolean(app.getStartParams(), RVStartParams.KEY_TRANSPARENT, false)) {
                            this.c.setBackgroundColor(-1);
                        }
                        this.g = app.getAppContext().getViewSpecProvider();
                        PageContainer createPageContainer = ((RVViewFactory) RVProxy.get(RVViewFactory.class)).createPageContainer(getActivity(), app, viewGroup);
                        this.d = createPageContainer;
                        createPageContainer.getView().setLayoutParams(new ViewGroup.LayoutParams(-1, ViewUtils.specToLayoutParam(this.g.getHeightSpec())));
                        TitleBar createTitleBar = ((RVViewFactory) RVProxy.get(RVViewFactory.class)).createTitleBar(getActivity(), app);
                        this.f = createTitleBar;
                        if (!(createTitleBar == null || createTitleBar.getContent() == null)) {
                            RVLogger.d("AriverApp:RVFragment", "add nav bar");
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams.addRule(10);
                            this.c.addView(this.f.getContent(), 0, layoutParams);
                        }
                        long j3 = BundleUtils.getLong(getArguments(), RVConstants.EXTRA_PAGE_INSTANCE_ID, -1);
                        if (j3 > 0) {
                            Page page = getPage(app, j3);
                            StringBuilder sb = new StringBuilder("setPage in fragment onCreateView: ");
                            sb.append(page);
                            sb.append(", ");
                            sb.append(this);
                            RVLogger.d("AriverApp:RVFragment", sb.toString());
                            if (page != null) {
                                setPage(page);
                            } else {
                                RVLogger.w("AriverApp:RVFragment", "mPage already existed!");
                            }
                        }
                        RelativeLayout relativeLayout2 = this.c;
                        RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_onCreateView);
                        return relativeLayout2;
                    }
                }
                FrameLayout frameLayout = new FrameLayout(getActivity());
                RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_onCreateView);
                return frameLayout;
            } finally {
                RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_onCreateView);
            }
        } else {
            RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_onCreateView);
            return null;
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.m = SystemClock.elapsedRealtime();
        Page page = this.i;
        if (page != null) {
            setPage(page);
            this.i = null;
        }
    }

    public PageContainer getPageContainer() {
        return this.d;
    }

    public Page getPage(App app, long j2) {
        Page pageByNodeId = app.getPageByNodeId(j2);
        if (pageByNodeId != null) {
            return pageByNodeId;
        }
        return null;
    }

    public void setPage(final Page page) {
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                if (RVFragment.this.c != null) {
                    RVFragment.this.a(page);
                } else {
                    Page unused = RVFragment.this.i = page;
                }
            }
        });
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public void a(Page page) {
        boolean z;
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_bindContext);
        try {
            if (this.f8958a != null) {
                RVLogger.e("AriverApp:RVFragment", "cannot attachPage twice in NebulaFragment!");
                return;
            }
            ((EventTracker) RVProxy.get(EventTracker.class)).stub(page, TrackId.Stub_FragmentOnViewCreated, this.m);
            this.f8958a = page;
            this.b = ((RVViewFactory) RVProxy.get(RVViewFactory.class)).createLoadingView(getActivity(), page);
            page.bindContext(this);
            RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_bindContext);
            try {
                RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_UICreate);
                this.d.attachPage(page);
                ((EventTracker) RVProxy.get(EventTracker.class)).stub(page, TrackId.Stub_PageShow);
                ((EventTrackStore) page.getData(EventTrackStore.class, true)).whiteScreenAttrMap.put(TrackId.Stub_PageShow, Long.valueOf(SystemClock.elapsedRealtime()));
                RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_applyTransparentTitle);
                if (!BundleUtils.getBoolean(page.getStartParams(), RVStartParams.KEY_TRANSPARENT, false)) {
                    if (page.getStartParams() == null || !page.getStartParams().containsKey("transparentTitle")) {
                        z = false;
                    } else {
                        z = ViewUtils.isTransparentTitle(page.getStartParams(), BundleUtils.getString(page.getStartParams(), "transparentTitle"));
                    }
                    applyTransparentTitle(z);
                }
                RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_applyTransparentTitle);
                ViewGroup view = this.d.getView();
                this.d.addRenderView(page.getRender().getView());
                this.c.addView(view, 0);
                if (this.f != null) {
                    RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_titleBarAttachPage);
                    this.f.attachPage(page);
                    RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_titleBarAttachPage);
                }
                if (this.f8958a != null) {
                    ParamUtils.processTransparent(this.f8958a.getStartParams());
                }
                RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_pageEnter);
                page.enter();
                RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_pageEnter);
                RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_UICreate);
            } catch (Throwable th) {
                RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_UICreate);
                throw th;
            }
        } finally {
            RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_bindContext);
        }
    }

    public void applyTransparentTitle(boolean z) {
        ViewGroup view = this.d.getView();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewUtils.specToLayoutParam(-1), ViewUtils.specToLayoutParam(this.g.getPageHeightSpec(z)));
        if (z) {
            RVLogger.d("AriverApp:RVFragment", "transTitle: true");
            layoutParams.addRule(6);
            layoutParams.height = ViewUtils.specToLayoutParam(this.g.getHeightSpec());
        } else {
            TitleBar titleBar = this.f;
            if (!(titleBar == null || titleBar.getContent() == null)) {
                layoutParams.addRule(3, this.f.getContent().getId());
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void setShouldResumeWebView(boolean z) {
        this.n = z;
    }

    public void pauseRender() {
        Page page = this.f8958a;
        if (page != null && page.getRender() != null) {
            this.f8958a.getRender().onPause();
        }
    }

    public Animation onCreateAnimation(int i2, boolean z, int i3) {
        int animResId = AnimUtils.getAnimResId(getActivity(), TRANSLATE_IN_RIGHT_ID);
        if (animResId == 0) {
            animResId = R.anim.ariver_fragment_translate_in_right_default;
        }
        if (animResId != i3) {
            return super.onCreateAnimation(i2, z, i3);
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), i3);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                RVLogger.d("AriverApp:RVFragment", "onAnimationEnd");
                if (RVFragment.this.f8958a != null && RVFragment.this.n && RVFragment.this.f8958a.getRender() != null) {
                    boolean unused = RVFragment.this.n = false;
                    RVFragment.this.f8958a.getRender().onResume();
                }
            }
        });
        return loadAnimation;
    }

    public synchronized IEmbedViewManager getEmbedViewManager() {
        if (this.h == null) {
            this.h = new DefaultEmbedViewManager(this.f8958a);
        }
        return this.h;
    }

    public void onStart() {
        RVLogger.d("AriverApp:RVFragment", "onStart ".concat(String.valueOf(this)));
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_onStart);
        super.onStart();
        this.k = true;
        if (!this.j) {
            this.j = true;
        } else {
            Page page = this.f8958a;
            if (page != null && !page.isExited()) {
                this.f8958a.resume();
            }
        }
        RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_onStart);
    }

    public void onPause() {
        RVLogger.d("AriverApp:RVFragment", "pause ".concat(String.valueOf(this)));
        super.onPause();
        this.k = false;
    }

    public void onResume() {
        RVLogger.d("AriverApp:RVFragment", "resume ".concat(String.valueOf(this)));
        RVTraceUtils.traceBeginSection(RVTraceKey.RV_Fragment_onResume);
        super.onResume();
        Page page = this.f8958a;
        if (page != null && !page.isExited() && BundleUtils.getBoolean(this.f8958a.getStartParams(), "fullscreen", false) && !this.k) {
            this.f8958a.resume();
        }
        RVTraceUtils.traceEndSection(RVTraceKey.RV_Fragment_onResume);
    }

    public void onStop() {
        RVLogger.d("AriverApp:RVFragment", "onStop ".concat(String.valueOf(this)));
        super.onStop();
        Page page = this.f8958a;
        if (page != null && !page.isExited()) {
            this.f8958a.pause();
        }
    }

    public void onDestroy() {
        RVLogger.d("AriverApp:RVFragment", "onDestroy ".concat(String.valueOf(this)));
        super.onDestroy();
        if (this.j) {
            this.j = false;
            Page page = this.f8958a;
            if (page != null && !page.isExited()) {
                this.f8958a.exit(true);
            }
            TitleBar titleBar = this.f;
            if (titleBar != null) {
                titleBar.onDestroy();
            }
        }
    }

    public ViewGroup getContentView() {
        return this.d.getView();
    }

    public TitleBar getTitleBar() {
        return this.f;
    }

    public LoadingView getLoadingView() {
        return this.b;
    }

    public ErrorView getErrorView() {
        if (this.e == null) {
            RVViewFactory rVViewFactory = (RVViewFactory) RVProxy.get(RVViewFactory.class);
            if (rVViewFactory == null) {
                return null;
            }
            this.e = rVViewFactory.createErrorView(getActivity());
        }
        return this.e;
    }

    public void destroy() {
        IEmbedViewManager embedViewManager = getEmbedViewManager();
        if (embedViewManager != null) {
            embedViewManager.releaseViews();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        DimensionUtil.resetDimensions();
        RVLogger.d("AriverApp:RVFragment", "window resize onConfigurationChanged ".concat(String.valueOf(configuration)));
        FragmentActivity activity = getActivity();
        if (activity != null && this.f8958a != null && configuration != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("windowWidth", (Object) Integer.valueOf(DimensionUtil.dip2px(activity, (float) configuration.screenWidthDp)));
            jSONObject.put("windowHeight", (Object) Integer.valueOf(DimensionUtil.dip2px(activity, (float) configuration.screenHeightDp)));
            EngineUtils.sendToRender(this.f8958a.getRender(), RVEvents.WINDOW_RESIZE, jSONObject, (SendToRenderCallback) null);
        }
    }
}
