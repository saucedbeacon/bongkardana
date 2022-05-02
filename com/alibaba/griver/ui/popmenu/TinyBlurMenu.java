package com.alibaba.griver.ui.popmenu;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.view.TitleBarCloseClickPoint;
import com.alibaba.ariver.app.api.point.view.TitleBarOptionClickPoint;
import com.alibaba.ariver.app.api.ui.StateListUtils;
import com.alibaba.ariver.app.api.ui.titlebar.TitleBar;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.service.executor.RVExecutorService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.DimensionUtil;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.constants.GriverLaunchParams;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.TinyUtils;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.utils.TypefaceCache;
import com.alibaba.griver.ui.popmenu.H5TinyPopMenu;
import com.alibaba.griver.ui.popmenu.ITinyMenuPopupWindow;
import com.alibaba.griver.ui.reddot.OnStateChangeListener;
import com.alibaba.griver.ui.reddot.RedDotManager;
import com.alibaba.griver.ui.titlebar.H5NavMenuItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o.restorePresenterStates;

public class TinyBlurMenu implements IH5TinyPopMenu {
    public static final String ABOUT_ID = "1001";
    public static final String ABOUT_MENU_NAME = "About";
    public static final String ADD_TO_DESKTOP_ID = "1004";
    public static final String ADD_TO_DESKTOP_MENU_NAME = "Add to Desktop";
    public static final String ADD_TO_HOME_ID = "1017";
    public static final String ADD_TO_HOME_MENU_NAME = "Add to Home";
    public static final String BACK_TO_ALIPAY_HOME_ID = "1014";
    public static final String BACK_TO_ALIPAY_HOME_MENU_NAME = "Home";
    public static final String BACK_TO_HOME_ID = "BACK_TO_HOME";
    public static final String CANCEL_FAVORITE_ID = "1011";
    public static final String CLOSE_PERFORMANCE_ID = "CLOSE_PERFORMANCE_ID";
    public static final String CLOSE_PERFORMANCE_PANEL = "Close performance panel";
    public static final String CLOSE_VCONSOLE = "Close console";
    public static final String CLOSE_VCONSOLE_ID = "CLOSE_VCONSOLE_ID";
    public static final String FAVORITE_ID = "1005";
    public static final String FEEDBACK_ID = "1013";
    public static final String MESSAGE_ID = "1012";
    public static final String MY_FAVORITE_TINY_APP = "1016";
    public static final String OFFICIAL_FEEDBACK_ID = "1015";
    public static final String OPEN_PERFORMANCE_ID = "OPEN_PERFORMANCE_ID";
    public static final String OPEN_PERFORMANCE_PANEL = "Open performance panel";
    public static final String OPEN_VCONSOLE = "Open console";
    public static final String OPEN_VCONSOLE_ID = "OPEN_VCONSOLE_ID";
    public static final String SHARE_ID = "1002";
    public static final String TAG = "TinyBlurMenu";
    private static boolean b = false;
    private boolean A;
    private volatile String B;
    private volatile TinyMenuItemData C;
    private restorePresenterStates D;
    /* access modifiers changed from: private */
    public TinyPopMenuReceiver E;
    private H5TinyPopMenu.TitleBarTheme F;
    private View.OnClickListener G;

    /* renamed from: a  reason: collision with root package name */
    private String f10594a;
    /* access modifiers changed from: private */
    public Page c;
    private List<JSONObject> d;
    /* access modifiers changed from: private */
    public List<TinyMenuItemData> e;
    /* access modifiers changed from: private */
    public Context f;
    private String g;
    private volatile boolean h;
    /* access modifiers changed from: private */
    public ITinyMenuPopupWindow i;
    /* access modifiers changed from: private */
    public List<CornerMarkingData> j;
    private int k;
    private boolean l;
    private String m;
    public TinyMenuItemData mFavoriteJsInvokeModel;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10595o;
    private volatile boolean p;
    private volatile boolean q;
    private boolean r;
    /* access modifiers changed from: private */
    public boolean s;
    /* access modifiers changed from: private */
    public boolean t;
    /* access modifiers changed from: private */
    public TitleBarRightButtonView u;
    /* access modifiers changed from: private */
    public TextView v;
    /* access modifiers changed from: private */
    public View w;
    /* access modifiers changed from: private */
    public Typeface x;
    private List<H5NavMenuItem> y;
    private boolean z;

    private void b(TinyMenuItemData tinyMenuItemData) {
    }

    public TinyBlurMenu() {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.h = false;
        this.j = new ArrayList();
        this.k = -1;
        this.l = false;
        this.n = false;
        this.f10595o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.z = false;
        this.A = false;
        this.G = new View.OnClickListener() {
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.alibaba.griver.ui.popmenu.TinyMenuItemData} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r4) {
                /*
                    r3 = this;
                    com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this
                    com.alibaba.griver.ui.popmenu.TitleBarRightButtonView r0 = r0.u
                    if (r0 == 0) goto L_0x0011
                    com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this
                    com.alibaba.griver.ui.popmenu.TitleBarRightButtonView r0 = r0.u
                    r0.dismissBadgeView()
                L_0x0011:
                    if (r4 != 0) goto L_0x0014
                    return
                L_0x0014:
                    java.lang.Object r4 = r4.getTag()
                    boolean r0 = r4 instanceof java.lang.Integer
                    if (r0 != 0) goto L_0x001d
                    return
                L_0x001d:
                    java.lang.Integer r4 = (java.lang.Integer) r4
                    int r4 = r4.intValue()
                    r0 = 0
                    java.lang.String r1 = "TinyBlurMenu"
                    if (r4 < 0) goto L_0x0048
                    com.alibaba.griver.ui.popmenu.TinyBlurMenu r2 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ all -> 0x0042 }
                    java.util.List r2 = r2.e     // Catch:{ all -> 0x0042 }
                    int r2 = r2.size()     // Catch:{ all -> 0x0042 }
                    if (r4 >= r2) goto L_0x0048
                    com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ all -> 0x0042 }
                    java.util.List r0 = r0.e     // Catch:{ all -> 0x0042 }
                    java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x0042 }
                    r0 = r4
                    com.alibaba.griver.ui.popmenu.TinyMenuItemData r0 = (com.alibaba.griver.ui.popmenu.TinyMenuItemData) r0     // Catch:{ all -> 0x0042 }
                    goto L_0x0048
                L_0x0042:
                    java.lang.String r4 = "tiny menu click problem"
                    com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r1, (java.lang.String) r4)
                    return
                L_0x0048:
                    if (r0 != 0) goto L_0x0050
                    java.lang.String r4 = "jsInvokeModel==null"
                    com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r1, (java.lang.String) r4)
                    return
                L_0x0050:
                    com.alibaba.griver.api.common.menu.OnMenuItemClickListener r4 = r0.listener
                    if (r4 == 0) goto L_0x0061
                    com.alibaba.griver.api.common.menu.OnMenuItemClickListener r4 = r0.listener
                    com.alibaba.griver.ui.popmenu.TinyBlurMenu r1 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this
                    com.alibaba.ariver.app.api.Page r1 = r1.c
                    java.lang.String r2 = r0.mid
                    r4.onItemClick(r1, r2)
                L_0x0061:
                    com.alibaba.griver.ui.popmenu.TinyBlurMenu r4 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this
                    r4.a((com.alibaba.griver.ui.popmenu.TinyMenuItemData) r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass1.onClick(android.view.View):void");
            }
        };
        this.e = new ArrayList();
        this.F = null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (CLOSE_PERFORMANCE_ID.equals(r6.getMid()) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.alibaba.griver.ui.popmenu.TinyMenuItemData r6) {
        /*
            r5 = this;
            java.lang.String r0 = "TinyBlurMenu"
            if (r6 != 0) goto L_0x0005
            return
        L_0x0005:
            r5.b(r6)
            r1 = 0
            java.lang.String r2 = "OPEN_VCONSOLE_ID"
            java.lang.String r3 = r6.getMid()     // Catch:{ all -> 0x0049 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0049 }
            java.lang.String r3 = "TINY_APP_ASSIST_PANEL"
            if (r2 != 0) goto L_0x003c
            java.lang.String r2 = "CLOSE_VCONSOLE_ID"
            java.lang.String r4 = r6.getMid()     // Catch:{ all -> 0x0049 }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0049 }
            if (r2 == 0) goto L_0x0024
            goto L_0x003c
        L_0x0024:
            java.lang.String r2 = "OPEN_PERFORMANCE_ID"
            java.lang.String r4 = r6.getMid()     // Catch:{ all -> 0x0049 }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0049 }
            if (r2 != 0) goto L_0x003c
            java.lang.String r2 = "CLOSE_PERFORMANCE_ID"
            java.lang.String r6 = r6.getMid()     // Catch:{ all -> 0x0049 }
            boolean r6 = r2.equals(r6)     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x003d
        L_0x003c:
            r1 = r3
        L_0x003d:
            boolean r6 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0048
            java.lang.String r6 = "doMonitorLog.. seedId is null"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r6)     // Catch:{ all -> 0x0049 }
        L_0x0048:
            return
        L_0x0049:
            r6 = move-exception
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "doMonitorLog..."
            java.lang.String r6 = r1.concat(r6)
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r0, (java.lang.String) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.popmenu.TinyBlurMenu.a(com.alibaba.griver.ui.popmenu.TinyMenuItemData):void");
    }

    public void showMenu() {
        ITinyMenuPopupWindow iTinyMenuPopupWindow = this.i;
        if (iTinyMenuPopupWindow == null || !iTinyMenuPopupWindow.isShowMenu()) {
            d();
        }
    }

    public void onRelease() {
        TinyPopMenuReceiver tinyPopMenuReceiver;
        restorePresenterStates restorepresenterstates = this.D;
        if (!(restorepresenterstates == null || (tinyPopMenuReceiver = this.E) == null)) {
            restorepresenterstates.setMax(tinyPopMenuReceiver);
            this.E = null;
        }
        RedDotManager.getInstance().removeNode(getUniqueKey());
        ITinyMenuPopupWindow iTinyMenuPopupWindow = this.i;
        if (iTinyMenuPopupWindow != null && iTinyMenuPopupWindow.isShowing()) {
            this.i.doDismissWithAnimation(false);
        }
        this.q = true;
        this.i = null;
        this.c = null;
        this.u = null;
        this.f = null;
    }

    public void init(final Page page, String str, final Context context, final ViewGroup viewGroup) {
        GriverLogger.d(TAG, "init menu start");
        a(str);
        a(context);
        setPage(page);
        if (!(page == null || page.getStartParams() == null)) {
            page.getStartParams();
            this.m = page.getApp().getAppId();
            StringBuilder sb = new StringBuilder();
            sb.append(this.m);
            sb.append(TAG);
            this.f10594a = sb.toString();
        }
        if (((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext() != null) {
            this.D = restorePresenterStates.length(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext());
            TinyPopMenuReceiver tinyPopMenuReceiver = new TinyPopMenuReceiver(this, this.m, this.q, this.p, this.u, this.i);
            this.E = tinyPopMenuReceiver;
            if (!(this.D == null || tinyPopMenuReceiver == null)) {
                this.D.setMax(this.E, new IntentFilter("broadcast_tiny_app_favorite"));
                this.D.setMax(this.E, new IntentFilter("hide_title_bar_back_to_home"));
                this.D.setMax(this.E, new IntentFilter("show_title_bar_back_to_home"));
                this.D.setMax(this.E, new IntentFilter("show_title_bar_menu"));
            }
        }
        ((RVExecutorService) RVProxy.get(RVExecutorService.class)).getExecutor(ExecutorType.NORMAL).execute(new Runnable() {
            public void run() {
                ExecutorUtils.runOnMain(new Runnable() {
                    /* JADX WARNING: Can't wrap try/catch for region: R(10:15|16|(2:18|(1:20))|25|(1:27)|28|(2:33|(2:35|36))(1:32)|37|38|(2:40|41)) */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0142 */
                    /* JADX WARNING: Removed duplicated region for block: B:40:0x014c A[SYNTHETIC, Splitter:B:40:0x014c] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                            r8 = this;
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            com.alibaba.ariver.app.api.Page r0 = r8
                            java.lang.String r1 = "TinyBlurMenu"
                            r2 = 0
                            if (r0 == 0) goto L_0x015d
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this
                            android.content.Context r0 = r0.f
                            if (r0 == 0) goto L_0x015d
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this
                            com.alibaba.griver.ui.popmenu.TinyMenuPopupWindowProxy r3 = new com.alibaba.griver.ui.popmenu.TinyMenuPopupWindowProxy
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r4 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r4 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this
                            android.content.Context r4 = r4.f
                            r3.<init>(r4)
                            com.alibaba.griver.ui.popmenu.ITinyMenuPopupWindow unused = r0.i = r3
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$TinyPopMenuReceiver r0 = r0.E
                            if (r0 == 0) goto L_0x0044
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$TinyPopMenuReceiver r0 = r0.E
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this
                            com.alibaba.griver.ui.popmenu.ITinyMenuPopupWindow r3 = r3.i
                            r0.setMenuPanel(r3)
                        L_0x0044:
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this
                            r0.a()
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ all -> 0x0159 }
                            com.alibaba.ariver.app.api.Page r0 = r8     // Catch:{ all -> 0x0159 }
                            com.alibaba.ariver.app.api.PageContext r0 = r0.getPageContext()     // Catch:{ all -> 0x0159 }
                            com.alibaba.ariver.app.api.ui.titlebar.TitleBar r0 = r0.getTitleBar()     // Catch:{ all -> 0x0159 }
                            if (r0 == 0) goto L_0x015d
                            android.view.View r3 = r0.getContent()     // Catch:{ all -> 0x0159 }
                            if (r3 == 0) goto L_0x015d
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ all -> 0x0159 }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ all -> 0x0159 }
                            android.view.View r4 = r0.getContent()     // Catch:{ all -> 0x0159 }
                            int r5 = com.alibaba.griver.ui.R.id.h5_nav_back_to_home     // Catch:{ all -> 0x0159 }
                            android.view.View r4 = r4.findViewById(r5)     // Catch:{ all -> 0x0159 }
                            android.view.View unused = r3.w = r4     // Catch:{ all -> 0x0159 }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ all -> 0x0159 }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ all -> 0x0159 }
                            android.view.View r0 = r0.getContent()     // Catch:{ all -> 0x0159 }
                            int r4 = com.alibaba.griver.ui.R.id.h5_tv_nav_back_to_home     // Catch:{ all -> 0x0159 }
                            android.view.View r0 = r0.findViewById(r4)     // Catch:{ all -> 0x0159 }
                            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ all -> 0x0159 }
                            android.widget.TextView unused = r3.v = r0     // Catch:{ all -> 0x0159 }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ all -> 0x0159 }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ all -> 0x0159 }
                            android.widget.TextView r0 = r0.v     // Catch:{ all -> 0x0159 }
                            if (r0 == 0) goto L_0x015d
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ all -> 0x00cc }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ all -> 0x00cc }
                            android.graphics.Typeface r0 = r0.x     // Catch:{ all -> 0x00cc }
                            if (r0 != 0) goto L_0x00d1
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ all -> 0x00cc }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ all -> 0x00cc }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ all -> 0x00cc }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ all -> 0x00cc }
                            android.content.Context r3 = r3.f     // Catch:{ all -> 0x00cc }
                            java.lang.String r4 = "tinyfont"
                            java.lang.String r5 = "tinyfont/titlebar.ttf"
                            android.graphics.Typeface r3 = com.alibaba.griver.ui.ant.utils.TypefaceCache.getTypeface(r3, r4, r5)     // Catch:{ all -> 0x00cc }
                            android.graphics.Typeface unused = r0.x = r3     // Catch:{ all -> 0x00cc }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ all -> 0x00cc }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ all -> 0x00cc }
                            android.graphics.Typeface r0 = r0.x     // Catch:{ all -> 0x00cc }
                            if (r0 == 0) goto L_0x00d1
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ all -> 0x00cc }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ all -> 0x00cc }
                            android.widget.TextView r0 = r0.v     // Catch:{ all -> 0x00cc }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ all -> 0x00cc }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ all -> 0x00cc }
                            android.graphics.Typeface r3 = r3.x     // Catch:{ all -> 0x00cc }
                            r0.setTypeface(r3)     // Catch:{ all -> 0x00cc }
                            goto L_0x00d1
                        L_0x00cc:
                            java.lang.String r0 = "iconfont failed"
                            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0159 }
                        L_0x00d1:
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ all -> 0x0159 }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ all -> 0x0159 }
                            android.content.Context r0 = r0.f     // Catch:{ all -> 0x0159 }
                            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x0159 }
                            if (r0 == 0) goto L_0x00f0
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ all -> 0x0159 }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ all -> 0x0159 }
                            android.widget.TextView r3 = r3.v     // Catch:{ all -> 0x0159 }
                            int r4 = com.alibaba.griver.ui.R.string.griver_bar_back_to_home     // Catch:{ all -> 0x0159 }
                            java.lang.CharSequence r0 = r0.getText(r4)     // Catch:{ all -> 0x0159 }
                            r3.setText(r0)     // Catch:{ all -> 0x0159 }
                        L_0x00f0:
                            java.lang.Class<com.alibaba.griver.api.ui.titlebar.GriverBackHomeButtonStyleExtension> r0 = com.alibaba.griver.api.ui.titlebar.GriverBackHomeButtonStyleExtension.class
                            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)     // Catch:{ all -> 0x0159 }
                            com.alibaba.griver.api.ui.titlebar.GriverBackHomeButtonStyleExtension r0 = (com.alibaba.griver.api.ui.titlebar.GriverBackHomeButtonStyleExtension) r0     // Catch:{ all -> 0x0159 }
                            java.lang.String r3 = "text"
                            java.lang.String r4 = r0.getType()     // Catch:{ all -> 0x0159 }
                            boolean r3 = android.text.TextUtils.equals(r3, r4)     // Catch:{ all -> 0x0159 }
                            if (r3 == 0) goto L_0x011a
                            java.lang.String r3 = r0.getContent()     // Catch:{ all -> 0x0159 }
                            if (r3 == 0) goto L_0x011a
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ all -> 0x0159 }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ all -> 0x0159 }
                            android.widget.TextView r3 = r3.v     // Catch:{ all -> 0x0159 }
                            java.lang.String r0 = r0.getContent()     // Catch:{ all -> 0x0159 }
                            r3.setText(r0)     // Catch:{ all -> 0x0159 }
                            goto L_0x0142
                        L_0x011a:
                            java.lang.String r3 = "icon"
                            java.lang.String r4 = r0.getType()     // Catch:{ all -> 0x0159 }
                            boolean r3 = android.text.TextUtils.equals(r3, r4)     // Catch:{ all -> 0x0159 }
                            if (r3 == 0) goto L_0x0142
                            android.graphics.drawable.Drawable r0 = r0.getIconDrawable()     // Catch:{ Exception -> 0x0142 }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ Exception -> 0x0142 }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ Exception -> 0x0142 }
                            android.widget.TextView r3 = r3.v     // Catch:{ Exception -> 0x0142 }
                            java.lang.String r4 = ""
                            r3.setText(r4)     // Catch:{ Exception -> 0x0142 }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ Exception -> 0x0142 }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ Exception -> 0x0142 }
                            android.widget.TextView r3 = r3.v     // Catch:{ Exception -> 0x0142 }
                            r3.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r0, r2)     // Catch:{ Exception -> 0x0142 }
                        L_0x0142:
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ all -> 0x0159 }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ all -> 0x0159 }
                            boolean r0 = r0.s     // Catch:{ all -> 0x0159 }
                            if (r0 == 0) goto L_0x015d
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ all -> 0x0154 }
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this     // Catch:{ all -> 0x0154 }
                            r0.e()     // Catch:{ all -> 0x0154 }
                            goto L_0x015d
                        L_0x0154:
                            r0 = move-exception
                            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r1, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0159 }
                            goto L_0x015d
                        L_0x0159:
                            r0 = move-exception
                            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r1, (java.lang.Throwable) r0)
                        L_0x015d:
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            android.content.Context r3 = r10
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r4 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            android.view.ViewGroup r4 = r11
                            r0.a(r3, r4)
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this
                            java.util.ArrayList r3 = new java.util.ArrayList
                            r3.<init>()
                            java.util.List unused = r0.e = r3
                            java.util.ArrayList r0 = new java.util.ArrayList
                            r0.<init>()
                            java.lang.Class<com.alibaba.griver.api.common.menu.GriverMenuExtension> r3 = com.alibaba.griver.api.common.menu.GriverMenuExtension.class
                            java.lang.Object r3 = com.alibaba.ariver.kernel.common.RVProxy.get(r3)
                            com.alibaba.griver.api.common.menu.GriverMenuExtension r3 = (com.alibaba.griver.api.common.menu.GriverMenuExtension) r3
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r4 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            com.alibaba.ariver.app.api.Page r4 = r8
                            java.util.List r3 = r3.getMenuList(r4)
                            java.lang.Class<com.alibaba.griver.api.common.menu.GriverACMenuExtension> r4 = com.alibaba.griver.api.common.menu.GriverACMenuExtension.class
                            java.lang.Object r4 = com.alibaba.ariver.kernel.common.RVProxy.get(r4)
                            com.alibaba.griver.api.common.menu.GriverACMenuExtension r4 = (com.alibaba.griver.api.common.menu.GriverACMenuExtension) r4
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r5 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            com.alibaba.ariver.app.api.Page r5 = r8
                            java.util.List r4 = r4.getMenuList(r5)
                            if (r3 == 0) goto L_0x01a8
                            int r5 = r3.size()
                            if (r5 <= 0) goto L_0x01a8
                            r0.addAll(r3)
                        L_0x01a8:
                            if (r4 == 0) goto L_0x01b3
                            int r3 = r4.size()
                            if (r3 <= 0) goto L_0x01b3
                            r0.addAll(r4)
                        L_0x01b3:
                            java.util.Iterator r0 = r0.iterator()
                        L_0x01b7:
                            boolean r3 = r0.hasNext()
                            if (r3 == 0) goto L_0x0239
                            java.lang.Object r3 = r0.next()
                            com.alibaba.griver.api.common.menu.GriverMenuItem r3 = (com.alibaba.griver.api.common.menu.GriverMenuItem) r3
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r4 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            com.alibaba.ariver.app.api.Page r4 = r8
                            boolean r4 = r3.canShow(r4)
                            if (r4 == 0) goto L_0x01b7
                            com.alibaba.griver.ui.popmenu.TinyMenuItemData r4 = new com.alibaba.griver.ui.popmenu.TinyMenuItemData
                            java.lang.String r5 = r3.name
                            java.lang.String r6 = r3.identifier
                            r4.<init>(r5, r2, r2, r6)
                            java.lang.String r5 = r3.name
                            r4.menuName = r5
                            com.alibaba.griver.api.common.menu.OnMenuItemClickListener r5 = r3.listener
                            r4.listener = r5
                            java.lang.String r5 = r3.iconUrl
                            r4.iconUrl = r5
                            int r5 = r3.iconDrawable     // Catch:{ Exception -> 0x01f7 }
                            if (r5 == 0) goto L_0x01fd
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r5 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this     // Catch:{ Exception -> 0x01f7 }
                            android.content.Context r5 = r10     // Catch:{ Exception -> 0x01f7 }
                            android.content.res.Resources r5 = r5.getResources()     // Catch:{ Exception -> 0x01f7 }
                            int r6 = r3.iconDrawable     // Catch:{ Exception -> 0x01f7 }
                            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)     // Catch:{ Exception -> 0x01f7 }
                            r4.h5MenuIcon = r5     // Catch:{ Exception -> 0x01f7 }
                            goto L_0x01fd
                        L_0x01f7:
                            r5 = move-exception
                            java.lang.String r6 = "get resource failed"
                            com.alibaba.griver.base.common.logger.GriverLogger.w(r1, r6, r5)
                        L_0x01fd:
                            boolean r5 = r3 instanceof com.alibaba.griver.api.common.menu.GRVMPMoreMenuItem
                            if (r5 == 0) goto L_0x022c
                            com.alibaba.griver.api.common.menu.GRVMPMoreMenuItem r3 = (com.alibaba.griver.api.common.menu.GRVMPMoreMenuItem) r3
                            boolean r5 = r3.isShowBadge()
                            if (r5 == 0) goto L_0x022c
                            com.alibaba.griver.ui.reddot.IRedDotManager r5 = com.alibaba.griver.ui.reddot.RedDotManager.getInstance()
                            java.lang.String r6 = r3.uniqueKey
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r7 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r7 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this
                            java.lang.String r7 = r7.getUniqueKey()
                            r5.registerNode(r6, r7)
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2$1$1 r5 = new com.alibaba.griver.ui.popmenu.TinyBlurMenu$2$1$1
                            r5.<init>()
                            r3.dataChangeListener = r5
                            com.alibaba.griver.ui.reddot.IRedDotManager r5 = com.alibaba.griver.ui.reddot.RedDotManager.getInstance()
                            java.lang.String r6 = r3.uniqueKey
                            boolean r3 = r3.showBadge
                            r5.resetState(r6, r3)
                        L_0x022c:
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu$2 r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.this
                            com.alibaba.griver.ui.popmenu.TinyBlurMenu r3 = com.alibaba.griver.ui.popmenu.TinyBlurMenu.this
                            java.util.List r3 = r3.e
                            r3.add(r4)
                            goto L_0x01b7
                        L_0x0239:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.popmenu.TinyBlurMenu.AnonymousClass2.AnonymousClass1.run():void");
                    }
                });
            }
        });
    }

    /* access modifiers changed from: private */
    public void a() {
        if (this.i != null || this.u != null) {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    if (TinyBlurMenu.this.i != null) {
                        TinyBlurMenu.this.i.updateCornerMarking(TinyBlurMenu.this.j);
                    }
                    if (TinyBlurMenu.this.u != null) {
                        TinyBlurMenu.this.u.updateCornerMarking(TinyBlurMenu.this.j);
                    }
                }
            });
        }
    }

    public void onSwitchToWhiteTheme() {
        this.F = H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_WHITE;
        if (TinyUtils.isMain()) {
            TitleBarRightButtonView titleBarRightButtonView = this.u;
            if (titleBarRightButtonView != null) {
                titleBarRightButtonView.switchTheme(this.F, 0);
            }
            View view = this.w;
            if (view != null && view.getVisibility() == 0) {
                this.v.setTextColor(-1);
            }
        }
    }

    public void onSwitchToBlueTheme() {
        this.F = H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_BLUE;
        if (TinyUtils.isMain()) {
            TitleBarRightButtonView titleBarRightButtonView = this.u;
            if (titleBarRightButtonView != null) {
                titleBarRightButtonView.switchTheme(this.F, 0);
            }
            View view = this.w;
            if (view != null && view.getVisibility() == 0) {
                this.v.setTextColor(Color.rgb(30, 144, 230));
            }
        }
    }

    public void setPage(Page page) {
        this.c = page;
    }

    private void a(String str) {
        this.g = str;
    }

    private void a(Context context) {
        this.f = context;
    }

    /* access modifiers changed from: private */
    public void a(Context context, ViewGroup viewGroup) {
        if (context != null && viewGroup != null && this.c != null) {
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    childAt.setVisibility(8);
                }
            }
            b();
            RVLogger.d(TAG, "init..optionContainer=".concat(String.valueOf(viewGroup)));
            TitleBarRightButtonView titleBarRightButtonView = new TitleBarRightButtonView(context, this.F, BundleUtils.getInt(this.c.getStartParams(), "optionMenuColor", 0));
            this.u = titleBarRightButtonView;
            TinyPopMenuReceiver tinyPopMenuReceiver = this.E;
            if (tinyPopMenuReceiver != null) {
                tinyPopMenuReceiver.setRightButtonView(titleBarRightButtonView);
            }
            this.u.setAppId(this.m);
            this.u.setH5Page(this.c);
            this.u.setOptionMenuOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    RVLogger.d(TinyBlurMenu.TAG, "OptionMenuClick");
                    if (!(TinyBlurMenu.this.c == null || TinyBlurMenu.this.c.getRender() == null)) {
                        EngineUtils.sendToRender(TinyBlurMenu.this.c.getRender(), "titleMoreClick", (JSONObject) null, (SendToRenderCallback) null);
                    }
                    ExtensionPoint.as(TitleBarOptionClickPoint.class).node(TinyBlurMenu.this.c).create().onOptionClick(0, true);
                }
            });
            this.u.setCloseButtonOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ExtensionPoint.as(TitleBarCloseClickPoint.class).node(TinyBlurMenu.this.c).create().onCloseClick();
                }
            });
            this.u.setCloseButtonOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View view) {
                    return true;
                }
            });
            float density = DimensionUtil.getDensity(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.gravity = 16;
            layoutParams.leftMargin = (int) (12.0f * density);
            layoutParams.rightMargin = (int) (density * 2.0f);
            viewGroup.addView(this.u, layoutParams);
            this.u.setTag(H5TinyPopMenu.TAG_VIEW);
            RedDotManager.getInstance().registerNode(this.f10594a, (String) null);
            RedDotManager.getInstance().setStateDidChangeHandler(this.f10594a, new OnStateChangeListener() {
                public void onStateChange(String str, boolean z) {
                    if (TinyBlurMenu.this.u != null) {
                        TinyBlurMenu.this.u.showOptionMenuRedDot(z);
                    }
                }
            });
            a();
        }
    }

    public String getUniqueKey() {
        return this.f10594a;
    }

    private void b() {
        Page page = this.c;
        if (page != null && this.F == null) {
            int i2 = BundleUtils.getInt(page.getStartParams(), "titleBarColor", -16777216) | -16777216;
            if (i2 != -16777216) {
                if (i2 != -1) {
                    this.F = H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_WHITE;
                } else {
                    this.F = H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_BLUE;
                }
            }
            if (BundleUtils.getInt(this.c.getStartParams(), "optionMenuColor", 0) != 0) {
                this.F = H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_CUSTOM;
            }
        }
    }

    public void setH5MenuList(List<H5NavMenuItem> list, boolean z2) {
        RVLogger.d(TAG, "setH5MenuList...");
        this.y = list;
        if (z2) {
            c();
        }
    }

    public void setH5ShowOptionMenuFlag() {
        RVLogger.d(TAG, "setH5ShowOptionMenuFlag");
        this.z = true;
    }

    public void setH5OptionMenuTextFlag() {
        RVLogger.d(TAG, "setH5OptionMenuTextFlag");
        this.A = true;
    }

    public boolean containsFavoriteMenuItem() {
        return this.mFavoriteJsInvokeModel != null;
    }

    /* access modifiers changed from: private */
    public void c() {
        if ((this.f instanceof Activity) && !this.t) {
            this.t = true;
            showMenu();
        }
    }

    private void d() {
        if (TinyUtils.isMain()) {
            a((List<TinyMenuFunctionModel>) null);
        } else {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    TinyBlurMenu.this.a((List<TinyMenuFunctionModel>) null);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void a(List<TinyMenuFunctionModel> list) {
        if (this.c == null || this.i == null || this.e == null || this.f == null || TextUtils.isEmpty(this.m) || this.q || this.l) {
            this.t = false;
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.i.setCurrentAppId(this.m);
        this.i.setH5Page(this.c);
        this.i.setMenus(this.e);
        this.i.setTinyAppDesc(this.B);
        this.i.setMiniAbout(this.C);
        this.i.setRecentUseTinyAppList(list);
        this.i.setMenuClickListener(this.G);
        this.i.setOnShowListener(new DialogInterface.OnShowListener() {
            public void onShow(DialogInterface dialogInterface) {
                if (TinyBlurMenu.this.u != null) {
                    TinyBlurMenu.this.u.isShowTitleBarFavorite();
                }
            }
        });
        this.i.setOnMenuWindowDismissListener(new ITinyMenuPopupWindow.OnMenuWindowDismissListener() {
            public void onDismiss(ITinyMenuPopupWindow iTinyMenuPopupWindow) {
                boolean unused = TinyBlurMenu.this.t = false;
            }
        });
        this.i.showMenu(this.f);
    }

    /* access modifiers changed from: private */
    public void e() {
        TitleBar titleBar;
        Resources resources;
        View content;
        if (!this.q) {
            Page page = this.c;
            if (page != null) {
                String string = BundleUtils.getString(page.getStartParams(), "leftTitlebarShow");
                RVLogger.debug(TAG, "leftTitlebarShow ".concat(String.valueOf(string)));
                TitleBar titleBar2 = this.c.getPageContext().getTitleBar();
                View view = null;
                if (!(titleBar2 == null || (content = titleBar2.getContent()) == null)) {
                    view = content.findViewById(R.id.h5_nav_back);
                }
                if ("back".equalsIgnoreCase(string) && view != null) {
                    view.setVisibility(0);
                    a(0);
                    f();
                    return;
                } else if ("none".equalsIgnoreCase(string) && view != null) {
                    view.setVisibility(8);
                    f();
                    return;
                } else if (!this.s) {
                    f();
                    return;
                }
            }
            Page page2 = this.c;
            if (page2 != null) {
                Object obj = page2.getStartParams().get(H5TinyPopMenu.SHOW_BACK_TO_HOME_TITLE_BAR);
                if ((obj instanceof Boolean) && !((Boolean) obj).booleanValue()) {
                    f();
                    return;
                }
            }
            Page page3 = this.c;
            if (page3 != null && this.v != null && this.w != null && (titleBar = page3.getPageContext().getTitleBar()) != null && titleBar.getContent() != null) {
                View content2 = titleBar.getContent();
                View findViewById = content2.findViewById(R.id.h5_nav_back);
                View findViewById2 = content2.findViewById(R.id.h5_nav_close);
                boolean z2 = BundleUtils.getBoolean(this.c.getStartParams(), "redirectFromHomepage", false);
                if (findViewById == null || findViewById.getVisibility() == 0 || findViewById2 == null || findViewById2.getVisibility() == 0) {
                    View view2 = this.w;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                } else if (this.w.getVisibility() != 0) {
                    try {
                        if (this.x == null && this.f != null) {
                            Typeface typeface = TypefaceCache.getTypeface(this.f, "tinyfont", "tinyfont/titlebar.ttf");
                            this.x = typeface;
                            if (typeface != null) {
                                this.v.setTypeface(typeface);
                            }
                        }
                    } catch (Throwable unused) {
                        RVLogger.e(TAG, "iconfont failed");
                    }
                    if (this.F == H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_WHITE) {
                        this.v.setTextColor(-1);
                    } else if (this.F == H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_BLUE) {
                        this.v.setTextColor(Color.rgb(30, 144, 230));
                    }
                    if (BundleUtils.contains(this.c.getStartParams(), GriverLaunchParams.BACK_HOME_BUTTON_COLOR)) {
                        try {
                            this.v.setTextColor(StateListUtils.getStateColor(BundleUtils.getInt(this.c.getStartParams(), GriverLaunchParams.BACK_HOME_BUTTON_COLOR) | -16777216));
                        } catch (Exception e2) {
                            GriverLogger.e(TAG, "set custom back home color failed", e2);
                        }
                    }
                    Context context = this.f;
                    if (!(context == null || (resources = context.getResources()) == null)) {
                        this.w.setContentDescription(resources.getString(R.string.griver_ui_tiny_back_to_home));
                    }
                    if (z2) {
                        this.w.setVisibility(8);
                        return;
                    }
                    this.w.setVisibility(0);
                    a(0);
                    this.w.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            if (TinyBlurMenu.this.c != null && TinyBlurMenu.this.c.getRender() != null) {
                                EngineUtils.sendToRender(TinyBlurMenu.this.c.getRender(), "onBackHomeClick", (JSONObject) null, (SendToRenderCallback) null);
                            }
                        }
                    });
                }
            }
        }
    }

    private void f() {
        View view = this.w;
        if (view != null && this.c != null && view.getVisibility() == 0) {
            this.w.setVisibility(8);
            a(16);
        }
    }

    private void a(int i2) {
        TitleBar titleBar;
        View content;
        RelativeLayout relativeLayout;
        RelativeLayout.LayoutParams layoutParams;
        Context context;
        Page page = this.c;
        if (page != null && (titleBar = page.getPageContext().getTitleBar()) != null && (content = titleBar.getContent()) != null && (relativeLayout = (RelativeLayout) content.findViewById(R.id.h5_rl_title)) != null && (layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams()) != null && (context = this.f) != null) {
            layoutParams.setMargins(DimensionUtil.dip2px(context, (float) i2), 0, 0, 0);
        }
    }

    static class TinyPopMenuReceiver extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private String f10596a;
        private boolean b;
        private boolean c;
        private WeakReference<TinyBlurMenu> d;
        private WeakReference<TitleBarRightButtonView> e;
        private WeakReference<ITinyMenuPopupWindow> f;

        public TinyPopMenuReceiver(TinyBlurMenu tinyBlurMenu, String str, boolean z, boolean z2, TitleBarRightButtonView titleBarRightButtonView, ITinyMenuPopupWindow iTinyMenuPopupWindow) {
            this.f10596a = str;
            this.b = z;
            this.c = z2;
            this.d = new WeakReference<>(tinyBlurMenu);
            this.e = new WeakReference<>(titleBarRightButtonView);
            this.f = new WeakReference<>(iTinyMenuPopupWindow);
        }

        public void setFavorite(boolean z) {
            this.c = z;
        }

        public void setBlurMenu(TinyBlurMenu tinyBlurMenu) {
            this.d = new WeakReference<>(tinyBlurMenu);
        }

        public void setRightButtonView(TitleBarRightButtonView titleBarRightButtonView) {
            this.e = new WeakReference<>(titleBarRightButtonView);
        }

        public void setMenuPanel(ITinyMenuPopupWindow iTinyMenuPopupWindow) {
            this.f = new WeakReference<>(iTinyMenuPopupWindow);
        }

        public void setAppId(String str) {
            this.f10596a = str;
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r5, android.content.Intent r6) {
            /*
                r4 = this;
                java.lang.String r5 = "TinyBlurMenu"
                if (r6 == 0) goto L_0x00ad
                java.lang.String r0 = r6.getAction()     // Catch:{ all -> 0x00a9 }
                java.lang.String r1 = "hide_title_bar_back_to_home"
                boolean r1 = android.text.TextUtils.equals(r1, r0)     // Catch:{ all -> 0x00a9 }
                r2 = 0
                java.lang.String r3 = "appId"
                if (r1 == 0) goto L_0x0039
                java.lang.String r6 = r6.getStringExtra(r3)     // Catch:{ all -> 0x00a9 }
                java.lang.String r0 = r4.f10596a     // Catch:{ all -> 0x00a9 }
                boolean r6 = android.text.TextUtils.equals(r6, r0)     // Catch:{ all -> 0x00a9 }
                if (r6 == 0) goto L_0x0038
                java.lang.ref.WeakReference<com.alibaba.griver.ui.popmenu.TinyBlurMenu> r6 = r4.d     // Catch:{ all -> 0x0034 }
                if (r6 == 0) goto L_0x0033
                java.lang.ref.WeakReference<com.alibaba.griver.ui.popmenu.TinyBlurMenu> r6 = r4.d     // Catch:{ all -> 0x0034 }
                java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x0034 }
                com.alibaba.griver.ui.popmenu.TinyBlurMenu r6 = (com.alibaba.griver.ui.popmenu.TinyBlurMenu) r6     // Catch:{ all -> 0x0034 }
                if (r6 == 0) goto L_0x0033
                boolean unused = r6.s = r2     // Catch:{ all -> 0x0034 }
                r6.e()     // Catch:{ all -> 0x0034 }
            L_0x0033:
                return
            L_0x0034:
                r6 = move-exception
                com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r5, (java.lang.Throwable) r6)     // Catch:{ all -> 0x00a9 }
            L_0x0038:
                return
            L_0x0039:
                java.lang.String r1 = "show_title_bar_back_to_home"
                boolean r1 = android.text.TextUtils.equals(r1, r0)     // Catch:{ all -> 0x00a9 }
                if (r1 == 0) goto L_0x0068
                java.lang.String r6 = r6.getStringExtra(r3)     // Catch:{ all -> 0x00a9 }
                java.lang.String r0 = r4.f10596a     // Catch:{ all -> 0x00a9 }
                boolean r6 = android.text.TextUtils.equals(r6, r0)     // Catch:{ all -> 0x00a9 }
                if (r6 == 0) goto L_0x0067
                java.lang.ref.WeakReference<com.alibaba.griver.ui.popmenu.TinyBlurMenu> r6 = r4.d     // Catch:{ all -> 0x0063 }
                if (r6 == 0) goto L_0x0062
                java.lang.ref.WeakReference<com.alibaba.griver.ui.popmenu.TinyBlurMenu> r6 = r4.d     // Catch:{ all -> 0x0063 }
                java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x0063 }
                com.alibaba.griver.ui.popmenu.TinyBlurMenu r6 = (com.alibaba.griver.ui.popmenu.TinyBlurMenu) r6     // Catch:{ all -> 0x0063 }
                if (r6 == 0) goto L_0x0062
                r0 = 1
                boolean unused = r6.s = r0     // Catch:{ all -> 0x0063 }
                r6.e()     // Catch:{ all -> 0x0063 }
            L_0x0062:
                return
            L_0x0063:
                r6 = move-exception
                com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r5, (java.lang.Throwable) r6)     // Catch:{ all -> 0x00a9 }
            L_0x0067:
                return
            L_0x0068:
                java.lang.String r1 = "show_title_bar_menu"
                boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch:{ all -> 0x00a9 }
                if (r0 == 0) goto L_0x00ad
                java.lang.String r0 = r6.getStringExtra(r3)     // Catch:{ all -> 0x00a9 }
                java.lang.String r1 = r4.f10596a     // Catch:{ all -> 0x00a9 }
                boolean r0 = android.text.TextUtils.equals(r0, r1)     // Catch:{ all -> 0x00a9 }
                if (r0 == 0) goto L_0x00ad
                java.lang.ref.WeakReference<com.alibaba.griver.ui.popmenu.TinyBlurMenu> r0 = r4.d     // Catch:{ all -> 0x00a4 }
                if (r0 == 0) goto L_0x00a3
                java.lang.ref.WeakReference<com.alibaba.griver.ui.popmenu.TinyBlurMenu> r0 = r4.d     // Catch:{ all -> 0x00a4 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00a4 }
                com.alibaba.griver.ui.popmenu.TinyBlurMenu r0 = (com.alibaba.griver.ui.popmenu.TinyBlurMenu) r0     // Catch:{ all -> 0x00a4 }
                java.lang.String r1 = "pageId"
                int r6 = r6.getIntExtra(r1, r2)     // Catch:{ all -> 0x00a4 }
                if (r0 == 0) goto L_0x00a3
                com.alibaba.ariver.app.api.Page r1 = r0.c     // Catch:{ all -> 0x00a4 }
                if (r1 == 0) goto L_0x00a3
                com.alibaba.ariver.app.api.Page r1 = r0.c     // Catch:{ all -> 0x00a4 }
                int r1 = r1.getPageId()     // Catch:{ all -> 0x00a4 }
                if (r6 != r1) goto L_0x00a3
                r0.c()     // Catch:{ all -> 0x00a4 }
            L_0x00a3:
                return
            L_0x00a4:
                r6 = move-exception
                com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r5, (java.lang.Throwable) r6)     // Catch:{ all -> 0x00a9 }
                goto L_0x00ad
            L_0x00a9:
                r6 = move-exception
                com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r5, (java.lang.Throwable) r6)
            L_0x00ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.popmenu.TinyBlurMenu.TinyPopMenuReceiver.onReceive(android.content.Context, android.content.Intent):void");
        }
    }
}
