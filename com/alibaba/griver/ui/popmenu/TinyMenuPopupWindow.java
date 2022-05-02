package com.alibaba.griver.ui.popmenu;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.StatusBarUtils;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.DimensionUtil;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.base.common.account.GriverAccount;
import com.alibaba.griver.base.common.adapter.ImageListener;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.utils.DensityUtil;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.base.resource.appcenter.GriverAppCenter;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.badge.AUBadgeView;
import com.alibaba.griver.ui.ant.basic.AUHorizontalListView;
import com.alibaba.griver.ui.ant.dialog.AUDialog;
import com.alibaba.griver.ui.ant.text.AUIconView;
import com.alibaba.griver.ui.blur.AUBubbleView;
import com.alibaba.griver.ui.popmenu.ITinyMenuPopupWindow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TinyMenuPopupWindow extends AUDialog implements DialogInterface.OnDismissListener, View.OnClickListener, ITinyMenuPopupWindow {
    protected static final int MAX_MENU_ITEM_COUNT_ROW = 5;
    protected static final int MENU_HORIZONTAL_MARGIN = 2;
    protected static final int ROW_MARGIN_HORIZONTAL = 8;
    protected static final int ROW_MARGIN_TOP = 8;
    /* access modifiers changed from: private */
    public long A = 0;
    private LinearLayout B;
    private TextView C;
    /* access modifiers changed from: private */
    public CornerMarkingUIController D = new CornerMarkingUIController();
    private View.OnClickListener E = new View.OnClickListener() {
        public void onClick(View view) {
            if (TinyMenuPopupWindow.this.c != null) {
                if (TinyMenuPopupWindow.this.n == null || TinyMenuPopupWindow.this.n.getVisibility() != 8) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - TinyMenuPopupWindow.this.A >= 1000) {
                        long unused = TinyMenuPopupWindow.this.A = currentTimeMillis;
                        if (TinyMenuPopupWindow.this.c != null) {
                            TinyMenuPopupWindow tinyMenuPopupWindow = TinyMenuPopupWindow.this;
                            tinyMenuPopupWindow.a(tinyMenuPopupWindow.c);
                        }
                        TinyMenuPopupWindow.this.doDismissWithAnimation(true);
                    }
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public int F = 0;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public float f10598a;
    /* access modifiers changed from: private */
    public List<TinyMenuItemData> b = new ArrayList();
    /* access modifiers changed from: private */
    public TinyMenuItemData c;
    private String d;
    private String e;
    /* access modifiers changed from: private */
    public Page f;
    private LinearLayout g;
    private LinearLayout h;
    private View i;
    private TextView j;
    private AUIconView k;
    private View l;
    private TextView m;
    protected Context mContext;
    protected AUHorizontalListView mFavoriteAndRecentTinyAppList;
    protected View mInternalContent;
    protected View mMenuContent;
    protected int mMenuItemWidth;
    View.OnLayoutChangeListener mOnLayoutChangeListener = new View.OnLayoutChangeListener() {
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            try {
                int width = ((WindowManager) TinyMenuPopupWindow.this.mContext.getSystemService("window")).getDefaultDisplay().getWidth();
                RVLogger.debug("TinyMenuPopupWindow", "on layout change width = ".concat(String.valueOf(width)));
                if (width != TinyMenuPopupWindow.this.F) {
                    TinyMenuPopupWindow.this.a();
                    TinyMenuPopupWindow.this.d();
                }
            } catch (Throwable th) {
                RVLogger.e("TinyMenuPopupWindow", "onlayout change exception ", th);
            }
        }
    };
    protected int mRecentTinyAppItemWidth;
    protected List<TinyMenuFunctionModel> mRecentUseList = new ArrayList();
    /* access modifiers changed from: private */
    public AUIconView n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public View.OnClickListener f10599o;
    private ITinyMenuPopupWindow.OnMenuWindowDismissListener p;
    private BaseAdapter q;
    private boolean r = false;
    /* access modifiers changed from: private */
    public Bitmap s;
    private boolean t = true;
    private boolean u = false;
    private Map<String, String> v = new HashMap();
    /* access modifiers changed from: private */
    public Map<String, View> w = new HashMap();
    private int x = 0;
    private int y = 0;
    /* access modifiers changed from: private */
    public boolean z = false;

    /* access modifiers changed from: protected */
    public void startRecentTinyApp() {
    }

    /* access modifiers changed from: protected */
    public void startTinyAppAndCloseCurrent(String str) {
    }

    public TinyMenuPopupWindow(Context context) {
        super(context, R.style.griver_Pop_Menu_Style);
        this.mContext = context;
        Resources resources = context.getResources();
        if (resources != null) {
            try {
                this.v.put("1001", resources.getString(R.string.griver_ui_menu_item_about));
                this.v.put(TinyBlurMenu.ADD_TO_DESKTOP_ID, resources.getString(R.string.griver_ui_menu_item_add_to_desktop));
                this.v.put(TinyBlurMenu.ADD_TO_HOME_ID, resources.getString(R.string.griver_ui_menu_item_add_to_home));
                this.v.put(TinyBlurMenu.BACK_TO_HOME_ID, resources.getString(R.string.griver_ui_bar_back_to_home));
                this.v.put(TinyBlurMenu.CANCEL_FAVORITE_ID, resources.getString(R.string.griver_ui_title_bar_unfavorite_icon_font_unicode));
                this.v.put("1005", resources.getString(R.string.griver_ui_menu_item_favorite_icon_font_unicode));
                this.v.put("1002", resources.getString(R.string.griver_ui_menu_item_share));
                this.v.put(TinyBlurMenu.MESSAGE_ID, resources.getString(R.string.griver_ui_menu_item_message));
                this.v.put(TinyBlurMenu.FEEDBACK_ID, resources.getString(R.string.griver_ui_menu_item_complaint));
                this.v.put(TinyBlurMenu.BACK_TO_ALIPAY_HOME_ID, resources.getString(R.string.griver_ui_menu_item_back_to_home));
                this.v.put(TinyBlurMenu.OPEN_PERFORMANCE_ID, resources.getString(R.string.griver_ui_menu_item_performance));
                this.v.put(TinyBlurMenu.CLOSE_PERFORMANCE_ID, resources.getString(R.string.griver_ui_menu_item_performance));
                this.v.put(TinyBlurMenu.OPEN_VCONSOLE_ID, resources.getString(R.string.griver_ui_menu_item_debug));
                this.v.put(TinyBlurMenu.CLOSE_VCONSOLE_ID, resources.getString(R.string.griver_ui_menu_item_debug));
                this.v.put(TinyBlurMenu.OFFICIAL_FEEDBACK_ID, resources.getString(R.string.griver_ui_menu_item_official_feedback));
                this.v.put(TinyBlurMenu.MY_FAVORITE_TINY_APP, resources.getString(R.string.griver_ui_menu_my_favorite_tiny_app));
                this.v.put("default", resources.getString(R.string.griver_ui_menu_item_default));
            } catch (Throwable th) {
                RVLogger.e("TinyMenuPopupWindow", th);
            }
        }
    }

    @Nullable
    private static SharedPreferences a(Context context, String str, String str2) {
        if (context == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("rv_local_storage_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return context.getSharedPreferences(sb.toString(), 0);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        AppModel appModel;
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this.mContext).inflate(getLayoutId(), (ViewGroup) null);
        this.mMenuContent = inflate;
        this.mInternalContent = inflate.findViewById(R.id.menu_content);
        this.mFavoriteAndRecentTinyAppList = (AUHorizontalListView) this.mMenuContent.findViewById(R.id.favorite_and_recent_tiny_app_list);
        this.h = (LinearLayout) this.mMenuContent.findViewById(R.id.menu_area);
        this.k = (AUIconView) this.mMenuContent.findViewById(R.id.tiny_menu_arrow);
        this.i = this.mMenuContent.findViewById(R.id.close_menu);
        this.l = this.mMenuContent.findViewById(R.id.recent_use_tiny_app_title);
        this.j = (TextView) this.mMenuContent.findViewById(R.id.menu_title);
        this.g = (LinearLayout) this.mMenuContent.findViewById(R.id.recent_app_area);
        this.m = (TextView) this.mMenuContent.findViewById(R.id.tiny_app_desc);
        this.n = (AUIconView) this.mMenuContent.findViewById(R.id.about_icon);
        this.B = (LinearLayout) this.mMenuContent.findViewById(R.id.menu_action_content);
        this.C = (TextView) this.mMenuContent.findViewById(R.id.menu_action_text);
        this.mFavoriteAndRecentTinyAppList.setSelector(17170445);
        FavoriteAndRecentAppAdapter favoriteAndRecentAppAdapter = new FavoriteAndRecentAppAdapter();
        this.q = favoriteAndRecentAppAdapter;
        this.mFavoriteAndRecentTinyAppList.setAdapter((ListAdapter) favoriteAndRecentAppAdapter);
        if (!this.r) {
            this.g.setVisibility(8);
            this.mFavoriteAndRecentTinyAppList.setVisibility(8);
            this.l.setVisibility(8);
        }
        this.i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!TinyMenuPopupWindow.this.z) {
                    TinyMenuPopupWindow.this.doDismissWithAnimation(true);
                }
            }
        });
        try {
            a();
            Resources resources = this.mContext.getResources();
            AppModel queryHighestAppInfo = GriverAppCenter.queryHighestAppInfo(this.e);
            if (queryHighestAppInfo != null && !TextUtils.isEmpty(queryHighestAppInfo.getAppInfoModel().getName())) {
                this.j.setText(queryHighestAppInfo.getAppInfoModel().getName());
            }
            if (!(this.f == null || this.f.getApp() == null || (appModel = (AppModel) this.f.getApp().getData(AppModel.class)) == null || appModel.getAppInfoModel() == null)) {
                this.j.setText(appModel.getAppInfoModel().getName());
            }
            this.k.setIconfontFileName("iconfont");
            this.k.setIconfontBundle("tinyfont");
            this.k.setIconfontColor("#747474");
            this.k.setIconfontUnicode(resources.getString(R.string.griver_ui_tiny_menu_arrow_icon_font));
            this.n.setIconfontFileName("iconfont");
            this.n.setIconfontBundle("tinyfont");
            this.n.setIconfontColor("#747474");
            this.n.setIconfontSize("16dp");
            this.n.setIconfontUnicode(resources.getString(R.string.griver_ui_menu_mini_about_icon));
        } catch (Throwable th) {
            RVLogger.e("TinyMenuPopupWindow", "initWidth...e=".concat(String.valueOf(th)));
        }
        requestWindowFeature(1);
        setContentView(this.mMenuContent);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            initWindowManagerLayoutParams(attributes);
            window.setAttributes(attributes);
            View decorView = window.getDecorView();
            if (decorView != null) {
                decorView.setPadding(0, 0, 0, 0);
            }
        }
        setOnDismissListener(this);
        setOnKeyListener(new DialogInterface.OnKeyListener() {
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (TinyMenuPopupWindow.this.z || keyEvent.getAction() != 1 || i != 4 || keyEvent.getRepeatCount() != 0) {
                    return false;
                }
                TinyMenuPopupWindow.this.doDismissWithAnimation(true);
                return true;
            }
        });
        this.l.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TinyMenuPopupWindow.this.startRecentTinyApp();
                if (!TinyMenuPopupWindow.this.z) {
                    TinyMenuPopupWindow.this.doDismissWithAnimation(true);
                }
            }
        });
        this.j.setOnClickListener(this.E);
        this.m.setOnClickListener(this.E);
        this.n.setOnClickListener(this.E);
    }

    /* access modifiers changed from: private */
    public void a() {
        try {
            this.f10598a = this.mContext.getResources().getDisplayMetrics().density;
            int width = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getWidth();
            initMenuItemWidth(width);
            RVLogger.debug("TinyMenuPopupWindow", "initScreenWidth width = ".concat(String.valueOf(width)));
            this.F = width;
        } catch (Throwable th) {
            RVLogger.e("TinyMenuPopupWindow", "init screen width ", th);
        }
    }

    /* access modifiers changed from: protected */
    public void initMenuItemWidth(int i2) {
        this.mRecentTinyAppItemWidth = Math.round(this.f10598a * 75.0f);
        this.mMenuItemWidth = (i2 - Math.round((this.f10598a * 36.0f) + 0.5f)) / 5;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        View view;
        List<TinyMenuFunctionModel> list;
        super.onStart();
        d();
        this.z = false;
        if (!(this.q == null || (list = this.mRecentUseList) == null || list.size() <= 0)) {
            this.q.notifyDataSetChanged();
        }
        c();
        View view2 = this.mMenuContent;
        if (!(view2 == null || (view = this.mInternalContent) == null)) {
            if (this.s != null) {
                if (this.t) {
                    try {
                        view2.measure(0, 0);
                    } catch (Throwable th) {
                        RVLogger.e("TinyMenuPopupWindow", th);
                    }
                    this.x = this.mMenuContent.getMeasuredHeight();
                    this.t = false;
                }
                this.y = this.x;
                if (this.B.getVisibility() == 0) {
                    this.y += DimensionUtil.dip2px(getContext(), 22.0f);
                }
                this.mInternalContent.setBackgroundDrawable(createTinyMenuBackground(this.s));
            } else {
                view.setBackgroundResource(R.color.griver_ui_default_menu_bg);
            }
            this.mMenuContent.startAnimation(AnimationUtils.loadAnimation(this.mContext, getShowAnimationId()));
        }
        TextUtils.isEmpty(this.d);
        TextView textView = this.m;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (this.c == null) {
            AUIconView aUIconView = this.n;
            if (aUIconView != null) {
                aUIconView.setVisibility(8);
            }
        } else {
            AUIconView aUIconView2 = this.n;
            if (aUIconView2 != null) {
                aUIconView2.setVisibility(8);
            }
        }
        List<TinyMenuFunctionModel> list2 = this.mRecentUseList;
        if (list2 == null || list2.size() == 0) {
            AUHorizontalListView aUHorizontalListView = this.mFavoriteAndRecentTinyAppList;
            if (aUHorizontalListView != null) {
                aUHorizontalListView.setVisibility(8);
            }
            View view3 = this.l;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            LinearLayout linearLayout = this.g;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else if (!this.r) {
            AUHorizontalListView aUHorizontalListView2 = this.mFavoriteAndRecentTinyAppList;
            if (aUHorizontalListView2 != null) {
                aUHorizontalListView2.setVisibility(8);
            }
            View view4 = this.l;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.g;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        } else {
            AUHorizontalListView aUHorizontalListView3 = this.mFavoriteAndRecentTinyAppList;
            if (aUHorizontalListView3 != null) {
                aUHorizontalListView3.setVisibility(0);
            }
            View view5 = this.l;
            if (view5 != null) {
                view5.setVisibility(0);
            }
            LinearLayout linearLayout3 = this.g;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.u = false;
        View view = this.mInternalContent;
        if (view != null) {
            view.setBackgroundResource(R.color.griver_ui_default_menu_bg);
            this.s = null;
        }
        ITinyMenuPopupWindow.OnMenuWindowDismissListener onMenuWindowDismissListener = this.p;
        if (onMenuWindowDismissListener != null) {
            onMenuWindowDismissListener.onDismiss(this);
        }
    }

    public void onClick(final View view) {
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                if (!TinyMenuPopupWindow.this.z) {
                    TinyMenuPopupWindow.this.doDismissWithAnimation(true, view);
                }
            }
        });
    }

    public void setCurrentAppId(String str) {
        this.e = str;
    }

    public void setH5Page(Page page) {
        this.f = page;
    }

    public boolean isShowMenu() {
        return this.u;
    }

    public void showMenu(final Context context) {
        if (!this.u) {
            this.u = true;
            if ("yes".equalsIgnoreCase(GriverConfig.getConfig("h5_disableMenuBgBlur", ""))) {
                b();
            } else {
                GriverExecutors.getExecutor(ExecutorType.URGENT_DISPLAY).execute(new Runnable() {
                    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
                        r6 = com.alibaba.griver.ui.popmenu.TinyMenuPopupWindow.access$1000(r10.this$0).getPageContext().getActivity().findViewById(16908290);
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                            r10 = this;
                            java.lang.String r0 = "TinyMenuPopupWindow"
                            com.alibaba.griver.ui.popmenu.TinyMenuPopupWindow r1 = com.alibaba.griver.ui.popmenu.TinyMenuPopupWindow.this
                            com.alibaba.ariver.app.api.Page r1 = r1.f
                            if (r1 == 0) goto L_0x0075
                            com.alibaba.griver.ui.popmenu.TinyMenuPopupWindow r1 = com.alibaba.griver.ui.popmenu.TinyMenuPopupWindow.this
                            com.alibaba.ariver.app.api.Page r1 = r1.f
                            com.alibaba.ariver.app.api.PageContext r1 = r1.getPageContext()
                            android.app.Activity r1 = r1.getActivity()
                            if (r1 == 0) goto L_0x0075
                            com.alibaba.griver.ui.popmenu.TinyMenuPopupWindow r1 = com.alibaba.griver.ui.popmenu.TinyMenuPopupWindow.this
                            com.alibaba.ariver.app.api.Page r1 = r1.f
                            com.alibaba.ariver.app.api.PageContext r1 = r1.getPageContext()
                            android.app.Activity r1 = r1.getActivity()
                            r2 = 16908290(0x1020002, float:2.3877235E-38)
                            android.view.View r6 = r1.findViewById(r2)
                            if (r6 == 0) goto L_0x0075
                            android.app.Application r1 = com.alibaba.griver.base.common.env.GriverEnv.getApplicationContext()
                            android.content.res.Resources r1 = r1.getResources()
                            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
                            r2 = 0
                            if (r1 == 0) goto L_0x0047
                            int r2 = r1.widthPixels
                            int r1 = r1.heightPixels
                            r8 = r1
                            r7 = r2
                            goto L_0x0049
                        L_0x0047:
                            r7 = 0
                            r8 = 0
                        L_0x0049:
                            r1 = 0
                            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0052 }
                            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r7, r8, r2)     // Catch:{ all -> 0x0052 }
                            r9 = r2
                            goto L_0x0057
                        L_0x0052:
                            r2 = move-exception
                            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r0, (java.lang.Throwable) r2)
                            r9 = r1
                        L_0x0057:
                            if (r9 != 0) goto L_0x005f
                            com.alibaba.griver.ui.popmenu.TinyMenuPopupWindow r0 = com.alibaba.griver.ui.popmenu.TinyMenuPopupWindow.this
                            r0.b()
                            return
                        L_0x005f:
                            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch:{ all -> 0x0066 }
                            r2.<init>(r9)     // Catch:{ all -> 0x0066 }
                            r5 = r2
                            goto L_0x006b
                        L_0x0066:
                            r2 = move-exception
                            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r0, (java.lang.Throwable) r2)
                            r5 = r1
                        L_0x006b:
                            com.alibaba.griver.ui.popmenu.TinyMenuPopupWindow$7$1 r0 = new com.alibaba.griver.ui.popmenu.TinyMenuPopupWindow$7$1
                            r3 = r0
                            r4 = r10
                            r3.<init>(r5, r6, r7, r8, r9)
                            com.alibaba.ariver.kernel.common.utils.ExecutorUtils.runOnMain(r0)
                        L_0x0075:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.popmenu.TinyMenuPopupWindow.AnonymousClass7.run():void");
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                if (TinyMenuPopupWindow.this.b == null || TinyMenuPopupWindow.this.b.isEmpty()) {
                    RVLogger.d("TinyMenuPopupWindow", "internalShowMenu.. no valid item");
                } else if (!TinyMenuPopupWindow.this.isShowing()) {
                    try {
                        for (TinyMenuItemData tinyMenuItemData : TinyMenuPopupWindow.this.b) {
                            if (!TinyBlurMenu.MESSAGE_ID.equals(tinyMenuItemData.getMid()) && !TinyBlurMenu.OFFICIAL_FEEDBACK_ID.equals(tinyMenuItemData.getMid())) {
                                TinyBlurMenu.ADD_TO_HOME_ID.equals(tinyMenuItemData.getMid());
                            }
                        }
                        TinyMenuPopupWindow.this.show();
                    } catch (Throwable th) {
                        RVLogger.e("TinyMenuPopupWindow", th);
                    }
                }
            }
        });
    }

    private void c() {
        TinyAppActionState currentState;
        this.B.setVisibility(8);
        if (TinyMenuUtils.showActionIcon(this.f.getApp().getAppId()) && (currentState = TinyAppActionStateManager.getInstance().getCurrentState(this.f)) != null) {
            this.C.setText(currentState.getTips(getContext().getResources()));
            this.B.setVisibility(0);
        }
    }

    public void setMenuClickListener(View.OnClickListener onClickListener) {
        this.f10599o = onClickListener;
    }

    public void setOnMenuWindowDismissListener(ITinyMenuPopupWindow.OnMenuWindowDismissListener onMenuWindowDismissListener) {
        this.p = onMenuWindowDismissListener;
    }

    public void setMenus(List<TinyMenuItemData> list) {
        if (!a(list, true)) {
            this.t = true;
        }
        if (list != null) {
            this.b = new ArrayList();
            for (TinyMenuItemData next : list) {
                if (next != null) {
                    TinyMenuItemData tinyMenuItemData = new TinyMenuItemData();
                    a(tinyMenuItemData, next);
                    this.b.add(tinyMenuItemData);
                }
            }
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
    }

    public void setRecentUseTinyAppList(List<TinyMenuFunctionModel> list) {
        this.mRecentUseList = list;
        if (list == null) {
            this.mRecentUseList = new ArrayList();
        }
        BaseAdapter baseAdapter = this.q;
        if (baseAdapter != null) {
            baseAdapter.notifyDataSetChanged();
        }
    }

    public void isShowRecentUseTinyAppArea(boolean z2) {
        this.r = z2;
    }

    public void updateFavoriteMenuItem(boolean z2, List<TinyMenuItemData> list) {
        Map<String, View> map;
        Map<String, View> map2;
        AUBubbleView aUBubbleView;
        if (list != null && this.b != null && a(list, false)) {
            TinyMenuItemData tinyMenuItemData = null;
            if (z2) {
                if (list.contains(new TinyMenuItemData("", "", "", TinyBlurMenu.CANCEL_FAVORITE_ID)) && this.b != null && (map2 = this.w) != null && map2.containsKey("1005") && this.b.contains(new TinyMenuItemData("", "", "", "1005"))) {
                    int indexOf = this.b.indexOf(new TinyMenuItemData("", "", "", "1005"));
                    TinyMenuItemData tinyMenuItemData2 = (indexOf < 0 || indexOf >= this.b.size()) ? null : this.b.get(indexOf);
                    int indexOf2 = list.indexOf(new TinyMenuItemData("", "", "", TinyBlurMenu.CANCEL_FAVORITE_ID));
                    if (indexOf2 >= 0 && indexOf2 < list.size()) {
                        tinyMenuItemData = list.get(indexOf2);
                    }
                    if (tinyMenuItemData2 != null && tinyMenuItemData != null) {
                        a(tinyMenuItemData2, tinyMenuItemData);
                        View view = this.w.get("1005");
                        a(tinyMenuItemData, view);
                        this.w.put(TinyBlurMenu.CANCEL_FAVORITE_ID, view);
                        if (view != null && (aUBubbleView = (AUBubbleView) view.findViewById(R.id.menu_item_corner_marking)) != null) {
                            aUBubbleView.setVisibility(8);
                        }
                    }
                }
            } else if (list.contains(new TinyMenuItemData("", "", "", "1005")) && this.b != null && (map = this.w) != null && map.containsKey(TinyBlurMenu.CANCEL_FAVORITE_ID) && this.b.contains(new TinyMenuItemData("", "", "", TinyBlurMenu.CANCEL_FAVORITE_ID))) {
                int indexOf3 = this.b.indexOf(new TinyMenuItemData("", "", "", TinyBlurMenu.CANCEL_FAVORITE_ID));
                TinyMenuItemData tinyMenuItemData3 = (indexOf3 < 0 || indexOf3 >= this.b.size()) ? null : this.b.get(indexOf3);
                int indexOf4 = list.indexOf(new TinyMenuItemData("", "", "", "1005"));
                if (indexOf4 >= 0 && indexOf4 < list.size()) {
                    tinyMenuItemData = list.get(indexOf4);
                }
                if (tinyMenuItemData != null && tinyMenuItemData3 != null) {
                    a(tinyMenuItemData3, tinyMenuItemData);
                    View view2 = this.w.get(TinyBlurMenu.CANCEL_FAVORITE_ID);
                    a(tinyMenuItemData, view2);
                    this.w.put("1005", view2);
                }
            }
        } else if (list != null) {
            this.t = true;
            setMenus(list);
            d();
        }
    }

    public void updateMessageMenuItem(List<TinyMenuItemData> list) {
        Map<String, View> map;
        TinyMenuItemData tinyMenuItemData;
        TinyMenuItemData tinyMenuItemData2;
        if (list != null && list.contains(new TinyMenuItemData("", "", "", TinyBlurMenu.MESSAGE_ID)) && this.b != null && (map = this.w) != null && map.containsKey(TinyBlurMenu.MESSAGE_ID) && this.b.contains(new TinyMenuItemData("", "", "", TinyBlurMenu.MESSAGE_ID))) {
            if (a(list, true)) {
                Iterator<TinyMenuItemData> it = this.b.iterator();
                while (true) {
                    tinyMenuItemData = null;
                    if (!it.hasNext()) {
                        tinyMenuItemData2 = null;
                        break;
                    }
                    tinyMenuItemData2 = it.next();
                    if (tinyMenuItemData2 != null && TextUtils.equals(tinyMenuItemData2.getMid(), TinyBlurMenu.MESSAGE_ID)) {
                        break;
                    }
                }
                Iterator<TinyMenuItemData> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        TinyMenuItemData next = it2.next();
                        if (next != null && TextUtils.equals(next.getMid(), TinyBlurMenu.MESSAGE_ID)) {
                            tinyMenuItemData = next;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (tinyMenuItemData2 != null && tinyMenuItemData != null) {
                    a(tinyMenuItemData2, tinyMenuItemData);
                    a(tinyMenuItemData2, this.w.get(TinyBlurMenu.MESSAGE_ID));
                    return;
                }
                return;
            }
            this.t = true;
            setMenus(list);
            d();
        }
    }

    public void setTinyAppDesc(String str) {
        this.d = str;
    }

    public void setMiniAbout(TinyMenuItemData tinyMenuItemData) {
        this.c = tinyMenuItemData;
    }

    private void a(TinyMenuItemData tinyMenuItemData, TinyMenuItemData tinyMenuItemData2) {
        if (tinyMenuItemData != null && tinyMenuItemData2 != null) {
            tinyMenuItemData.action = tinyMenuItemData2.action;
            tinyMenuItemData.badgeType = tinyMenuItemData2.badgeType;
            tinyMenuItemData.callback = tinyMenuItemData2.callback;
            tinyMenuItemData.iconUrl = tinyMenuItemData2.iconUrl;
            tinyMenuItemData.latestMsgTime = tinyMenuItemData2.latestMsgTime;
            tinyMenuItemData.menuName = tinyMenuItemData2.menuName;
            tinyMenuItemData.messageCount = tinyMenuItemData2.messageCount;
            tinyMenuItemData.mid = tinyMenuItemData2.mid;
            tinyMenuItemData.params = tinyMenuItemData2.params;
            tinyMenuItemData.h5MenuIcon = tinyMenuItemData2.h5MenuIcon;
        }
    }

    private boolean a(List<TinyMenuItemData> list, boolean z2) {
        int size;
        List<TinyMenuItemData> list2 = this.b;
        if (list2 == null || list == null || (size = list2.size()) != (r2 = list.size())) {
            return false;
        }
        if (!z2) {
            return true;
        }
        int i2 = 0;
        while (i2 < size && i2 < r2) {
            TinyMenuItemData tinyMenuItemData = this.b.get(i2);
            TinyMenuItemData tinyMenuItemData2 = list.get(i2);
            if (tinyMenuItemData == null || tinyMenuItemData2 == null || !TextUtils.equals(tinyMenuItemData.getMid(), tinyMenuItemData2.getMid())) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void d() {
        List<TinyMenuItemData> list;
        if (this.mContext == null || this.h == null || (list = this.b) == null || list.size() <= 0) {
            this.w.clear();
            this.h.removeAllViews();
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        int round = Math.round((this.f10598a * 8.0f) + 0.5f);
        int round2 = Math.round((this.f10598a * 8.0f) + 0.5f);
        layoutParams.setMargins(round2, round, round2, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.mMenuItemWidth, -2);
        int round3 = Math.round((this.f10598a * 2.0f) + 0.5f);
        layoutParams2.setMargins(round3, 0, round3, 0);
        this.w.clear();
        this.h.removeAllViews();
        int size = this.b.size();
        LinearLayout linearLayout = null;
        for (int i2 = 0; i2 < size; i2++) {
            TinyMenuItemData tinyMenuItemData = this.b.get(i2);
            if (tinyMenuItemData != null && !TextUtils.isEmpty(tinyMenuItemData.getMid())) {
                if (i2 % 5 == 0) {
                    linearLayout = new LinearLayout(this.mContext);
                    linearLayout.setClipChildren(false);
                    this.h.addView(linearLayout, layoutParams);
                }
                if (linearLayout != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.mContext).inflate(R.layout.griver_ui_menu_item, (ViewGroup) null);
                    relativeLayout.setTag(Integer.valueOf(i2));
                    relativeLayout.setClipChildren(false);
                    ViewCompat.setMax((View) relativeLayout, (float) (-i2));
                    AUBubbleView aUBubbleView = (AUBubbleView) relativeLayout.findViewById(R.id.menu_item_corner_marking);
                    if (aUBubbleView != null) {
                        aUBubbleView.setTranslationX((float) (this.mMenuItemWidth / 2));
                    }
                    a(tinyMenuItemData, (View) relativeLayout);
                    if (this.f10599o != null) {
                        relativeLayout.setOnClickListener(this);
                    }
                    this.w.put(tinyMenuItemData.getMid(), relativeLayout);
                    linearLayout.addView(relativeLayout, layoutParams2);
                }
            }
        }
        this.D.syncCornerMarkingDataToUI();
    }

    /* access modifiers changed from: private */
    public void a(TinyMenuItemData tinyMenuItemData, View view) {
        String str;
        if (view != null && tinyMenuItemData != null) {
            TextView textView = (TextView) view.findViewById(R.id.menu_item_text);
            AUIconView aUIconView = (AUIconView) view.findViewById(R.id.menu_item_font_icon);
            ImageView imageView = (ImageView) view.findViewById(R.id.menu_item_img_icon);
            AUBadgeView aUBadgeView = (AUBadgeView) view.findViewById(R.id.menu_item_badge);
            if (textView != null) {
                textView.setText(tinyMenuItemData.menuName);
            }
            if (!(aUIconView == null || imageView == null)) {
                if (TextUtils.isEmpty(tinyMenuItemData.iconUrl) && tinyMenuItemData.h5MenuIcon == null) {
                    aUIconView.setVisibility(0);
                    imageView.setVisibility(8);
                    String str2 = this.v.get(tinyMenuItemData.mid);
                    if (TextUtils.isEmpty(str2)) {
                        str2 = this.v.get("default");
                    }
                    aUIconView.setIconfontFileName("iconfont");
                    aUIconView.setIconfontBundle("tinyfont");
                    aUIconView.setIconfontUnicode(str2);
                    aUIconView.setIconfontColor(Color.parseColor("#3C4550"));
                    aUIconView.setIconfontSize("25dp");
                } else if (!TextUtils.isEmpty(tinyMenuItemData.iconUrl)) {
                    aUIconView.setVisibility(4);
                    imageView.setVisibility(0);
                    ImageUtils.loadImage(tinyMenuItemData.iconUrl, new TinyAppImageLoader(imageView));
                } else if (tinyMenuItemData.h5MenuIcon != null) {
                    aUIconView.setVisibility(4);
                    imageView.setVisibility(0);
                    imageView.setImageDrawable(tinyMenuItemData.h5MenuIcon);
                }
            }
            if (TinyBlurMenu.MESSAGE_ID.equals(tinyMenuItemData.getMid())) {
                long j2 = tinyMenuItemData.latestMsgTime;
                if (aUBadgeView != null) {
                    try {
                        String userId = GriverAccount.getUserId();
                        if (TextUtils.isEmpty(userId)) {
                            return;
                        }
                        if (!TextUtils.isEmpty(this.e)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(userId);
                            sb.append("_");
                            sb.append(this.e);
                            sb.append("_messageLatestClickTime");
                            String obj = sb.toString();
                            SharedPreferences a2 = a(GriverEnv.getApplicationContext(), userId, this.e);
                            if (a2 != null) {
                                str = a2.getString(obj, "");
                            } else {
                                str = "";
                            }
                            if ((!TextUtils.isEmpty(str) ? Long.parseLong(str) : 0) >= j2 || j2 < 0) {
                                aUBadgeView.setVisibility(8);
                            } else if (tinyMenuItemData.badgeType <= 0) {
                            } else {
                                if (tinyMenuItemData.badgeType == 1) {
                                    if (tinyMenuItemData.messageCount > 0) {
                                        aUBadgeView.setVisibility(0);
                                        aUBadgeView.setStyleAndContent(AUBadgeView.Style.NUM, "");
                                        aUBadgeView.setMsgCount(tinyMenuItemData.messageCount, true);
                                        aUBadgeView.setMaxLines(1);
                                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) aUBadgeView.getLayoutParams();
                                        if (layoutParams != null) {
                                            layoutParams.setMargins(Math.round(this.f10598a * 36.5f), Math.round(this.f10598a * 1.0f), 0, 0);
                                            aUBadgeView.setLayoutParams(layoutParams);
                                            return;
                                        }
                                        return;
                                    }
                                    aUBadgeView.setVisibility(8);
                                } else if (tinyMenuItemData.badgeType != 2) {
                                } else {
                                    if (tinyMenuItemData.messageCount > 0) {
                                        aUBadgeView.setVisibility(0);
                                        aUBadgeView.setStyleAndContent(AUBadgeView.Style.POINT, "");
                                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) aUBadgeView.getLayoutParams();
                                        if (layoutParams2 != null) {
                                            layoutParams2.setMargins(Math.round(this.f10598a * 40.5f), Math.round(this.f10598a * 7.5f), 0, 0);
                                            aUBadgeView.setLayoutParams(layoutParams2);
                                            return;
                                        }
                                        return;
                                    }
                                    aUBadgeView.setVisibility(8);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        RVLogger.e("TinyMenuPopupWindow", th);
                    }
                }
            }
        }
    }

    public void updateCornerMarking(List<CornerMarkingData> list) {
        this.D.setDataProvider(list);
        this.D.syncCornerMarkingDataToUI();
    }

    /* access modifiers changed from: private */
    public void a(TinyMenuItemData tinyMenuItemData) {
        try {
            if (this.f != null) {
                RVLogger.d("TinyMenuPopupWindow", "generateNativeJsApiInvoke finalInvoke ".concat(String.valueOf(String.format("javascript:(function(){function tinyApp_presetPopMenu_ready(callback){if(window.AlipayJSBridge){callback&&callback();}else{document.addEventListener('AlipayJSBridgeReady',callback,false);}}tinyApp_presetPopMenu_ready(AlipayJSBridge.call('%s', %s, %s));})();", new Object[]{tinyMenuItemData.getAction(), tinyMenuItemData.getParams(), tinyMenuItemData.getCallback()}))));
            }
        } catch (Throwable th) {
            RVLogger.e("TinyMenuPopupWindow", th);
        }
    }

    public void doDismissWithAnimation(boolean z2, final View view) {
        Context context;
        this.z = true;
        if (this.mMenuContent == null || (context = this.mContext) == null || !z2) {
            try {
                dismiss();
            } catch (Throwable th) {
                RVLogger.e("TinyMenuPopupWindow", th);
            }
        } else {
            Animation loadAnimation = AnimationUtils.loadAnimation(context, getDismissAnimationId());
            loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    try {
                        if (TinyMenuPopupWindow.this.f10599o != null) {
                            TinyMenuPopupWindow.this.f10599o.onClick(TinyMenuPopupWindow.this.D.interceptClickEventForCornerMarking(view) ? null : view);
                        }
                        TinyMenuPopupWindow.this.dismiss();
                    } catch (Throwable th) {
                        RVLogger.e("TinyMenuPopupWindow", th);
                    }
                }
            });
            this.mMenuContent.startAnimation(loadAnimation);
        }
    }

    public void doDismissWithAnimation(boolean z2) {
        doDismissWithAnimation(z2, (View) null);
    }

    /* access modifiers changed from: protected */
    public void initWindowManagerLayoutParams(WindowManager.LayoutParams layoutParams) {
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = 48;
        layoutParams.dimAmount = 0.4f;
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return R.layout.griver_ui_menu_layout_xml;
    }

    /* access modifiers changed from: protected */
    public TinyMenuBgDrawable createTinyMenuBackground(Bitmap bitmap) {
        int statusBarHeight = StatusBarUtils.getStatusBarHeight(getContext());
        return new TinyMenuBgDrawable(bitmap, 0, statusBarHeight, bitmap.getWidth(), this.y + statusBarHeight, 0, 0, bitmap.getWidth(), this.y);
    }

    /* access modifiers changed from: protected */
    public int getShowAnimationId() {
        return R.anim.griver_ui_menu_in;
    }

    /* access modifiers changed from: protected */
    public int getDismissAnimationId() {
        return R.anim.griver_ui_menu_out;
    }

    static class ViewHolder {
        ImageView appIcon;
        TextView appName;
        AUIconView fontIcon;
        View parent;

        private ViewHolder() {
        }
    }

    public class TinyAppImageLoader implements ImageListener {

        /* renamed from: a  reason: collision with root package name */
        private ImageView f10601a;

        TinyAppImageLoader(ImageView imageView) {
            this.f10601a = imageView;
        }

        public void onImage(Bitmap bitmap) {
            ImageView imageView = this.f10601a;
            if (imageView != null && bitmap != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    class CornerMarkingUIController {

        /* renamed from: a  reason: collision with root package name */
        private List<CornerMarkingData> f10600a;

        private CornerMarkingUIController() {
        }

        public void setDataProvider(List<CornerMarkingData> list) {
            this.f10600a = list;
        }

        public void syncCornerMarkingDataToUI() {
            View view;
            String str;
            List<CornerMarkingData> list = this.f10600a;
            if (list != null && list.size() != 0) {
                for (CornerMarkingData next : this.f10600a) {
                    String str2 = next.mid;
                    if (!TextUtils.isEmpty(str2) && (view = (View) TinyMenuPopupWindow.this.w.get(str2)) != null) {
                        AUBadgeView aUBadgeView = (AUBadgeView) view.findViewById(R.id.menu_item_badge);
                        if (aUBadgeView != null) {
                            aUBadgeView.setVisibility(8);
                        }
                        AUBubbleView aUBubbleView = (AUBubbleView) view.findViewById(R.id.menu_item_corner_marking);
                        if (aUBubbleView != null) {
                            aUBubbleView.setVisibility(0);
                            aUBubbleView.setTag(next);
                            if (TextUtils.isEmpty(next.superscript) || next.superscript.length() <= 5) {
                                str = next.superscript;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append(next.superscript.substring(0, 4));
                                sb.append("...");
                                str = sb.toString();
                            }
                            aUBubbleView.setText(str);
                        }
                    }
                }
            }
        }

        public boolean interceptClickEventForCornerMarking(View view) {
            AUBubbleView aUBubbleView;
            if (view == null || (aUBubbleView = (AUBubbleView) view.findViewById(R.id.menu_item_corner_marking)) == null || !(aUBubbleView.getTag() instanceof CornerMarkingData)) {
                return false;
            }
            CornerMarkingData cornerMarkingData = (CornerMarkingData) aUBubbleView.getTag();
            String appId = TinyMenuPopupWindow.this.f.getApp().getAppId();
            if (TextUtils.isEmpty(appId)) {
                return false;
            }
            RVLogger.d("TinyMenuPopupWindow", "intercept click event for corner marking");
            List<CornerMarkingData> list = this.f10600a;
            if (list != null) {
                list.remove(cornerMarkingData);
            }
            new CornerMarkingDataProvider().click(appId, cornerMarkingData.noticeId);
            RVLogger.d("TinyMenuPopupWindow", cornerMarkingData.toJavaScript());
            aUBubbleView.setTag((Object) null);
            if (!(view.getTag() instanceof Integer)) {
                return true;
            }
            int intValue = ((Integer) view.getTag()).intValue();
            if (TinyMenuPopupWindow.this.b == null || intValue < 0 || intValue >= TinyMenuPopupWindow.this.b.size()) {
                return true;
            }
            TinyMenuPopupWindow tinyMenuPopupWindow = TinyMenuPopupWindow.this;
            tinyMenuPopupWindow.a((TinyMenuItemData) tinyMenuPopupWindow.b.get(intValue), view);
            return true;
        }
    }

    class FavoriteAndRecentAppAdapter extends BaseAdapter {
        public long getItemId(int i) {
            return (long) i;
        }

        public int getViewTypeCount() {
            return 2;
        }

        private FavoriteAndRecentAppAdapter() {
        }

        public int getCount() {
            if (TinyMenuPopupWindow.this.mRecentUseList != null) {
                return TinyMenuPopupWindow.this.mRecentUseList.size();
            }
            return 0;
        }

        public Object getItem(int i) {
            if (TinyMenuPopupWindow.this.mRecentUseList == null || i >= TinyMenuPopupWindow.this.mRecentUseList.size()) {
                return null;
            }
            return TinyMenuPopupWindow.this.mRecentUseList.get(i);
        }

        public int getItemViewType(int i) {
            TinyMenuFunctionModel tinyMenuFunctionModel = (TinyMenuFunctionModel) getItem(i);
            if (tinyMenuFunctionModel != null) {
                return tinyMenuFunctionModel.functionType;
            }
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            final TinyMenuFunctionModel tinyMenuFunctionModel = (TinyMenuFunctionModel) getItem(i);
            if (tinyMenuFunctionModel == null) {
                return null;
            }
            if (view == null) {
                int access$1800 = (int) (TinyMenuPopupWindow.this.f10598a * 45.0f);
                LinearLayout linearLayout = new LinearLayout(TinyMenuPopupWindow.this.mContext);
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new AUHorizontalListView.LayoutParams(TinyMenuPopupWindow.this.mRecentTinyAppItemWidth, -1));
                linearLayout.setGravity(17);
                ViewHolder viewHolder = new ViewHolder();
                linearLayout.setTag(viewHolder);
                if (tinyMenuFunctionModel != null && tinyMenuFunctionModel.fillingMark) {
                    return linearLayout;
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(access$1800, access$1800);
                if (tinyMenuFunctionModel.functionType == 0) {
                    TinyRoundImageView tinyRoundImageView = new TinyRoundImageView(TinyMenuPopupWindow.this.mContext);
                    layoutParams.gravity = 17;
                    tinyRoundImageView.setRadius(DensityUtil.dip2px(TinyMenuPopupWindow.this.mContext, 7.0f));
                    tinyRoundImageView.setLayoutParams(layoutParams);
                    if (tinyMenuFunctionModel != null) {
                        ImageUtils.loadImage(tinyMenuFunctionModel.iconUrl, new TinyAppImageLoader(tinyRoundImageView));
                    }
                    linearLayout.addView(tinyRoundImageView);
                    viewHolder.appIcon = tinyRoundImageView;
                } else if (tinyMenuFunctionModel.functionType == 1) {
                    AUIconView aUIconView = new AUIconView(TinyMenuPopupWindow.this.mContext);
                    Resources resources = TinyMenuPopupWindow.this.mContext.getResources();
                    if (resources != null) {
                        String string = resources.getString(R.string.griver_ui_more_recent_app_back_to_tiny_home);
                        aUIconView.setIconfontFileName("iconfont");
                        aUIconView.setIconfontBundle("tinyfont");
                        aUIconView.setIconfontUnicode(string);
                        aUIconView.setIconfontColor(Color.parseColor("#9da2a7"));
                        aUIconView.setLayoutParams(layoutParams);
                        aUIconView.setIconfontSize("25dp");
                        aUIconView.setBackgroundResource(R.drawable.griver_ui_recent_app_more_bg);
                    }
                    linearLayout.addView(aUIconView);
                    viewHolder.fontIcon = aUIconView;
                }
                TextView textView = new TextView(TinyMenuPopupWindow.this.mContext);
                if (tinyMenuFunctionModel != null) {
                    textView.setText(tinyMenuFunctionModel.name);
                }
                textView.setTextSize(12.0f);
                textView.setGravity(17);
                textView.setSingleLine(true);
                textView.setTextColor(Color.parseColor("#3C4550"));
                textView.setEllipsize(TextUtils.TruncateAt.END);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.gravity = 17;
                layoutParams2.setMargins(6, 20, 6, 0);
                linearLayout.addView(textView, layoutParams2);
                viewHolder.appName = textView;
                viewHolder.parent = linearLayout;
                linearLayout.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        TinyMenuFunctionModel tinyMenuFunctionModel = tinyMenuFunctionModel;
                        if (tinyMenuFunctionModel != null) {
                            if (tinyMenuFunctionModel.functionType == 0) {
                                TinyMenuPopupWindow.this.startTinyAppAndCloseCurrent(tinyMenuFunctionModel.appId);
                            } else if (tinyMenuFunctionModel.functionType == 1) {
                                TinyMenuPopupWindow.this.startRecentTinyApp();
                            }
                        }
                        if (!TinyMenuPopupWindow.this.z) {
                            TinyMenuPopupWindow.this.doDismissWithAnimation(true);
                        }
                    }
                });
                return linearLayout;
            }
            ViewHolder viewHolder2 = (ViewHolder) view.getTag();
            if (viewHolder2 == null || viewHolder2.appName == null) {
                return view;
            }
            if (tinyMenuFunctionModel == null || !tinyMenuFunctionModel.fillingMark) {
                if (tinyMenuFunctionModel != null) {
                    viewHolder2.appName.setText(tinyMenuFunctionModel.name);
                }
                if (viewHolder2.appIcon != null) {
                    viewHolder2.appIcon.setImageBitmap((Bitmap) null);
                }
                if (!(tinyMenuFunctionModel == null || viewHolder2.appIcon == null)) {
                    ImageUtils.loadImage(tinyMenuFunctionModel.iconUrl, new TinyAppImageLoader(viewHolder2.appIcon));
                }
                if (viewHolder2.parent == null) {
                    return view;
                }
                viewHolder2.parent.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        if (tinyMenuFunctionModel.functionType == 0) {
                            TinyMenuPopupWindow.this.startTinyAppAndCloseCurrent(tinyMenuFunctionModel.appId);
                        } else if (tinyMenuFunctionModel.functionType == 1) {
                            TinyMenuPopupWindow.this.startRecentTinyApp();
                        }
                        if (!TinyMenuPopupWindow.this.z) {
                            TinyMenuPopupWindow.this.doDismissWithAnimation(true);
                        }
                    }
                });
                return view;
            }
            viewHolder2.appName.setText((CharSequence) null);
            if (viewHolder2.appIcon != null) {
                viewHolder2.appIcon.setImageBitmap((Bitmap) null);
            }
            return view;
        }
    }
}
