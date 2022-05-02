package com.alibaba.griver.ui.titlebar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.ScrollChangedCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.ImageUtil;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.griver.api.common.menu.GRVMPMoreMenuItemPriority;
import com.alibaba.griver.api.common.menu.GriverACMenuExtension;
import com.alibaba.griver.api.common.menu.GriverBaseMenuItem;
import com.alibaba.griver.api.common.menu.GriverMenuExtension;
import com.alibaba.griver.api.common.menu.GriverMenuItem;
import com.alibaba.griver.api.common.menu.OnMenuItemClickListener;
import com.alibaba.griver.api.constants.GriverLaunchParams;
import com.alibaba.griver.api.ui.optionmenu.GriverOptionMenuEvent;
import com.alibaba.griver.api.ui.optionmenu.GriverOptionMenuPanelExtension;
import com.alibaba.griver.api.ui.optionmenu.ToolbarMenu;
import com.alibaba.griver.api.ui.optionmenu.ToolbarMenuOption;
import com.alibaba.griver.api.ui.titlebar.GVTitleBar;
import com.alibaba.griver.base.common.adapter.ImageListener;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.H5UrlHelper;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.core.GriverParam;
import com.alibaba.griver.core.jsapi.actionsheet.ActionSheetItem;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.popmenu.H5TinyPopMenu;
import com.alibaba.griver.ui.titlebar.NebulaTitleView;
import com.alibaba.griver.ui.titlebar.TitleView;
import com.ap.zoloz.hummer.h5.ZolozEkycH5Handler;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.reactivex.annotations.SchedulerSupport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Keep
public class GriverTitleBar implements GVTitleBar {
    private static final String BROADCAST_TITLE_URL = "com.alipay.mobile.h5container.titleRefreshed";
    public static final String LONG_NAV_SEARCH_BAR_TYPE = "navSearchBar_type";
    public static final String LONG_SEG_COLOR_ACTIVE = "segColorActive";
    public static final String LONG_SEG_COLOR_NORMAL = "segColorNormal";
    public static final String LONG_SEG_SELECTED_INDEX = "segSelectedIndex";
    public static final String LONG_SEG_TITLES = "segTitles";
    public static final String LONG_SEG_WIDTHS = "segWidths";
    public static final String LONG_TRANSPARENT_TITLE = "transparentTitle";
    private static final int MAX_DEVELOPER_MENU = 3;
    private static final String TAG = "GriverTitleBar";
    private static final String TRANSPARENT_ALWAYS = "always";
    private static final Map<String, Integer> blueIconFontMap = new HashMap();
    private static final Map<String, Integer> whiteIconFontMap = new HashMap();
    private float alpha;
    private String appId;
    /* access modifiers changed from: private */
    public int delayDy;
    /* access modifiers changed from: private */
    public int finalMaxScrollHeight;
    /* access modifiers changed from: private */
    public int finalScale = 1;
    private boolean isPageError = false;
    private boolean isSwitchMode = false;
    /* access modifiers changed from: private */
    public ColorDrawable mContentBgDrawable;
    private View mContentView;
    private Context mContext;
    private String mDefaultTitle;
    private View mDivider;
    private String[] mIconType;
    private boolean mIfImageTitle;
    private boolean mIgnorePageTitleFromCallbacks;
    private boolean mIsPageFinished = false;
    private boolean mIsTinyApp;
    private boolean mOptionMenuPreventDefault = false;
    /* access modifiers changed from: private */
    public Page mPage;
    private boolean mPageStarted;
    private NebulaPopMenu mPopMenu;
    private H5TinyPopMenu mTinyPopMenu;
    /* access modifiers changed from: private */
    public NebulaTitleView mTitleView;
    private NebulaPopMenu mToolbarMenu;
    private boolean mTransTitle;
    private boolean mUseSearch = false;
    private boolean preventScrollTrans = false;
    private boolean preventSetTitleColor = false;
    private boolean readTitle;
    private boolean scrollWithTitleText = false;
    /* access modifiers changed from: private */
    public int switchThemePoint;
    private String transparentTitle = "";
    private String version;

    static {
        blueIconFontMap.put("user", Integer.valueOf(R.drawable.griver_ui_user));
        blueIconFontMap.put("info", Integer.valueOf(R.drawable.griver_ui_info));
        blueIconFontMap.put("locate", Integer.valueOf(R.drawable.griver_ui_locate));
        blueIconFontMap.put(ZolozEkycH5Handler.HUMMER_FOUNDATION_ADD, Integer.valueOf(R.drawable.griver_ui_plus));
        blueIconFontMap.put("scan", Integer.valueOf(R.drawable.griver_ui_richscan));
        blueIconFontMap.put(FirebaseAnalytics.Event.SEARCH, Integer.valueOf(R.drawable.griver_ui_search));
        blueIconFontMap.put("settings", Integer.valueOf(R.drawable.griver_ui_settings));
        blueIconFontMap.put("help", Integer.valueOf(R.drawable.griver_ui_help));
        blueIconFontMap.put("filter", Integer.valueOf(R.drawable.griver_ui_filter));
        blueIconFontMap.put("mail", Integer.valueOf(R.drawable.griver_ui_mail));
        blueIconFontMap.put("share", Integer.valueOf(R.drawable.griver_ui_share));
        blueIconFontMap.put(ActionSheetItem.BadgeInfo.TYPE_MORE, Integer.valueOf(R.drawable.griver_ui_titlebar_more_normal));
        whiteIconFontMap.put("user", Integer.valueOf(R.drawable.griver_ui_userw));
        whiteIconFontMap.put("info", Integer.valueOf(R.drawable.griver_ui_infow));
        whiteIconFontMap.put("locate", Integer.valueOf(R.drawable.griver_ui_locatew));
        whiteIconFontMap.put(ZolozEkycH5Handler.HUMMER_FOUNDATION_ADD, Integer.valueOf(R.drawable.griver_ui_plusw));
        whiteIconFontMap.put("scan", Integer.valueOf(R.drawable.griver_ui_richscanw));
        whiteIconFontMap.put(FirebaseAnalytics.Event.SEARCH, Integer.valueOf(R.drawable.griver_ui_searchw));
        whiteIconFontMap.put("settings", Integer.valueOf(R.drawable.griver_ui_settingsw));
        whiteIconFontMap.put("help", Integer.valueOf(R.drawable.griver_ui_helpw));
        whiteIconFontMap.put("filter", Integer.valueOf(R.drawable.griver_ui_filterw));
        whiteIconFontMap.put("mail", Integer.valueOf(R.drawable.griver_ui_mailw));
        whiteIconFontMap.put("share", Integer.valueOf(R.drawable.griver_ui_sharew));
        whiteIconFontMap.put(ActionSheetItem.BadgeInfo.TYPE_MORE, Integer.valueOf(R.drawable.griver_ui_white_titlebar_more_normal));
    }

    public GriverTitleBar(Context context) {
        this.mContext = context;
        this.mIgnorePageTitleFromCallbacks = false;
        this.mIfImageTitle = false;
        this.mPageStarted = false;
        if (this.mTitleView == null) {
            this.mTitleView = new NebulaTitleView(context);
        }
        this.mDivider = this.mTitleView.getDivider();
        View contentView = this.mTitleView.getContentView();
        this.mContentView = contentView;
        contentView.setTag("h5_titlebar");
        this.mContentBgDrawable = this.mTitleView.getContentBackgroundView();
        this.mTitleView.setOptionType(TitleView.OptionType.MENU, 0, true);
        this.mTitleView.showCloseButton(false);
        this.mToolbarMenu = new NebulaPopMenu(context);
        this.mPopMenu = new NebulaPopMenu(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0163, code lost:
        if (r0 == false) goto L_0x0168;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0282 A[SYNTHETIC, Splitter:B:69:0x0282] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void attachPage(com.alibaba.ariver.app.api.Page r18) {
        /*
            r17 = this;
            r13 = r17
            r7 = r18
            java.lang.String r0 = java.lang.String.valueOf(r18)
            java.lang.String r1 = "setPage "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r14 = "GriverTitleBar"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r14, r0)
            r13.mPage = r7
            android.os.Bundle r8 = r18.getStartParams()
            java.lang.String r0 = "appId"
            java.lang.String r0 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r8, r0)
            r13.appId = r0
            java.lang.String r0 = "appVersion"
            java.lang.String r0 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r8, r0)
            r13.version = r0
            r9 = 0
            java.lang.String r0 = "isTinyApp"
            boolean r0 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r8, r0, r9)
            r13.mIsTinyApp = r0
            r13.preventSetTitleColor = r9
            com.alibaba.griver.ui.titlebar.NebulaTitleView r0 = r13.mTitleView
            com.alibaba.ariver.app.api.Page r1 = r13.mPage
            r0.setPage(r1)
            com.alibaba.griver.ui.titlebar.NebulaPopMenu r0 = r13.mToolbarMenu
            com.alibaba.ariver.app.api.Page r1 = r13.mPage
            r0.setPage(r1)
            com.alibaba.griver.ui.titlebar.NebulaPopMenu r0 = r13.mPopMenu
            com.alibaba.ariver.app.api.Page r1 = r13.mPage
            r0.setPage(r1)
            com.alibaba.ariver.app.api.Page r0 = r13.mPage
            boolean r0 = r13.needTinyPopMenu(r0)
            if (r0 == 0) goto L_0x0061
            com.alibaba.griver.ui.titlebar.NebulaTitleView r0 = r13.mTitleView
            android.view.View r0 = r0.getOptionMenuContainer()
            if (r0 == 0) goto L_0x005e
            r1 = 8
            r0.setVisibility(r1)
        L_0x005e:
            r17.getTinyPopMenuData()
        L_0x0061:
            r10 = 1
            java.lang.String r0 = "showOptionMenu"
            boolean r15 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r8, r0, r10)
            java.lang.String r0 = "readTitle"
            boolean r0 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r8, r0, r10)
            r13.readTitle = r0
            java.lang.String r0 = "titleImage"
            java.lang.String r4 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r8, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0086
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r1 = r17
            r1.setTitle(r2, r3, r4, r5, r6)
            goto L_0x009b
        L_0x0086:
            java.lang.String r0 = "defaultTitle"
            java.lang.String r2 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r8, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x009b
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r17
            r1.setTitle(r2, r3, r4, r5, r6)
        L_0x009b:
            java.lang.String r0 = "showTitleBar"
            boolean r0 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r8, r0, r10)
            if (r0 != 0) goto L_0x00a6
            r13.showTitleBar(r9)
        L_0x00a6:
            r17.applyTransparentTitle()
            java.lang.String r0 = "showTitleLoading"
            boolean r0 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r8, r0, r9)
            r13.showTitleLoading(r0)
            java.lang.String r0 = "transparent"
            boolean r0 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r8, r0, r9)
            com.alibaba.griver.ui.titlebar.NebulaTitleView r1 = r13.mTitleView
            if (r1 == 0) goto L_0x011d
            boolean r1 = com.alibaba.ariver.app.api.ui.StatusBarUtils.isSupport()
            if (r1 == 0) goto L_0x011d
            boolean r1 = com.alibaba.ariver.app.api.ui.StatusBarUtils.isConfigSupport()
            if (r1 == 0) goto L_0x011d
            if (r0 != 0) goto L_0x011d
            r0 = 1325400064(0x4f000000, float:2.14748365E9)
            java.lang.String r1 = "statusBarColor"
            int r0 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getInt(r8, r1, r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "openTranslucentStatusBarSupport "
            java.lang.String r1 = r2.concat(r1)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r14, r1)
            com.alibaba.griver.ui.titlebar.NebulaTitleView r1 = r13.mTitleView
            r1.openTranslucentStatusBarSupport(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x011d
            java.lang.Boolean r0 = com.alibaba.griver.api.constants.GriverLaunchParams.DEFAULT_STATUS_BAR_DARK_TEXT_COLOR
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "statusBarDarkTextColor"
            boolean r0 = com.alibaba.griver.base.common.utils.GriverBundleUtils.getBoolean(r8, r1, r0, r10)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "set dark status bar text color: "
            java.lang.String r1 = r2.concat(r1)
            com.alibaba.griver.base.common.logger.GriverLogger.d(r14, r1)
            if (r0 == 0) goto L_0x011d
            android.content.Context r0 = r13.mContext     // Catch:{ Exception -> 0x0117 }
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x0117 }
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x0117 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x0117 }
            r1 = 9216(0x2400, float:1.2914E-41)
            r0.setSystemUiVisibility(r1)     // Catch:{ Exception -> 0x0117 }
            goto L_0x011d
        L_0x0117:
            r0 = move-exception
            java.lang.String r1 = "set status bar text color exception"
            com.alibaba.griver.base.common.logger.GriverLogger.e(r14, r1, r0)
        L_0x011d:
            r13.isSwitchMode = r9
            com.alibaba.ariver.app.api.Page r0 = r13.mPage
            com.alibaba.ariver.app.api.App r0 = r0.getApp()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "attachPage with alivePageCount: "
            r1.<init>(r2)
            int r2 = r0.getAlivePageCount()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r14, r1)
            int r1 = r0.getAlivePageCount()
            if (r1 == r10) goto L_0x0165
            com.alibaba.ariver.app.api.AppContext r1 = r0.getAppContext()
            if (r1 == 0) goto L_0x0168
            com.alibaba.ariver.app.api.AppContext r0 = r0.getAppContext()
            com.alibaba.ariver.app.api.ui.tabbar.TabBar r0 = r0.getTabBar()
            if (r0 == 0) goto L_0x015a
            com.alibaba.ariver.app.api.Page r1 = r13.mPage
            boolean r0 = r0.isTabPage(r1)
            if (r0 == 0) goto L_0x015a
            r0 = 1
            goto L_0x015b
        L_0x015a:
            r0 = 0
        L_0x015b:
            java.lang.String r1 = "closeAllWindow"
            boolean r1 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r8, r1, r9)
            if (r1 != 0) goto L_0x0165
            if (r0 == 0) goto L_0x0168
        L_0x0165:
            r13.showBackButton(r9)
        L_0x0168:
            java.lang.String r0 = "segWidths"
            java.lang.String r1 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r8, r0)
            java.lang.String r2 = "segTitles"
            java.lang.String r3 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getString(r8, r2)
            java.lang.String r4 = "segSelectedIndex"
            int r5 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getInt(r8, r4, r9)
            java.lang.String r6 = "segColorNormal"
            int r11 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getInt(r8, r6)
            r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r11 = r11 | r12
            java.lang.String r10 = "segColorActive"
            int r16 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getInt(r8, r10)
            r12 = r16 | r12
            com.alibaba.fastjson.JSONObject r9 = new com.alibaba.fastjson.JSONObject
            r9.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.put((java.lang.String) r4, (java.lang.Object) r5)
            r9.put((java.lang.String) r0, (java.lang.Object) r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r9.put((java.lang.String) r6, (java.lang.Object) r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r9.put((java.lang.String) r10, (java.lang.Object) r0)
            r9.put((java.lang.String) r2, (java.lang.Object) r3)
            com.alibaba.griver.ui.titlebar.NebulaTitleView r0 = r17.getTitleView()
            r0.initTitleSegControl(r9)
            java.lang.String r0 = "isH5app"
            r1 = 0
            boolean r0 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r8, r0, r1)
            if (r0 == 0) goto L_0x0226
            java.lang.Boolean r0 = com.alibaba.griver.api.constants.GriverLaunchParams.DEFAULT_SHOW_CLOSE_BUTTON
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "showCloseButton"
            r2 = 1
            boolean r0 = com.alibaba.griver.base.common.utils.GriverBundleUtils.getBoolean(r8, r1, r0, r2)
            if (r0 == 0) goto L_0x01d1
            com.alibaba.griver.ui.titlebar.NebulaTitleView r0 = r13.mTitleView
            if (r0 == 0) goto L_0x01d1
            r0.showCloseButton(r2)
        L_0x01d1:
            java.lang.String r0 = "titleIconSize"
            boolean r1 = com.alibaba.ariver.kernel.common.utils.BundleUtils.contains(r8, r0)
            if (r1 == 0) goto L_0x01e3
            double r0 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getDouble(r8, r0)
            float r0 = (float) r0
            com.alibaba.griver.ui.titlebar.NebulaTitleView r1 = r13.mTitleView
            r1.setButtonSize(r0)
        L_0x01e3:
            java.lang.String r0 = "titleFontSize"
            boolean r1 = com.alibaba.ariver.kernel.common.utils.BundleUtils.contains(r8, r0)
            if (r1 == 0) goto L_0x0202
            com.alibaba.griver.ui.titlebar.NebulaTitleView r1 = r13.mTitleView
            android.widget.TextView r1 = r1.getMainTitleView()
            if (r1 == 0) goto L_0x0202
            double r0 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getDouble(r8, r0)
            float r0 = (float) r0
            com.alibaba.griver.ui.titlebar.NebulaTitleView r1 = r13.mTitleView
            android.widget.TextView r1 = r1.getMainTitleView()
            r2 = 2
            r1.setTextSize(r2, r0)
        L_0x0202:
            r0 = -1
            java.lang.String r1 = "titleFontWeight"
            int r0 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getInt(r8, r1, r0)
            if (r0 <= 0) goto L_0x0226
            com.alibaba.griver.ui.titlebar.NebulaTitleView r1 = r13.mTitleView
            android.widget.TextView r1 = r1.getMainTitleView()
            if (r1 == 0) goto L_0x0226
            com.alibaba.griver.ui.titlebar.NebulaTitleView r1 = r13.mTitleView
            android.widget.TextView r1 = r1.getMainTitleView()
            com.alibaba.griver.ui.titlebar.NebulaTitleView r2 = r13.mTitleView
            android.widget.TextView r2 = r2.getMainTitleView()
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2, r0)
        L_0x0226:
            java.lang.Class<com.alibaba.griver.api.ui.optionmenu.GriverOptionMenuEvent> r0 = com.alibaba.griver.api.ui.optionmenu.GriverOptionMenuEvent.class
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r0 = com.alibaba.ariver.kernel.api.extension.ExtensionPoint.as(r0)
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r0 = r0.node(r7)
            com.alibaba.ariver.kernel.api.extension.Extension r0 = r0.create()
            com.alibaba.griver.api.ui.optionmenu.GriverOptionMenuEvent r0 = (com.alibaba.griver.api.ui.optionmenu.GriverOptionMenuEvent) r0
            com.alibaba.ariver.app.api.Page r1 = r13.mPage
            java.lang.String r1 = r1.getOriginalURI()
            com.alibaba.ariver.app.api.App r2 = r18.getApp()
            java.lang.String r2 = r2.getAppId()
            com.alibaba.griver.api.ui.optionmenu.OptionMenu r1 = r0.showOptionMenu(r1, r2)
            if (r1 == 0) goto L_0x0276
            java.lang.String r2 = r1.getTitle()
            java.lang.String r3 = r1.getIcon()
            java.lang.String r4 = r1.getRedDot()
            boolean r5 = r1.isReset()
            java.lang.String r6 = r1.getColor()
            boolean r7 = r1.isOverride()
            com.alibaba.fastjson.JSONArray r8 = r1.getMenus()
            r9 = 0
            java.lang.String r10 = r1.getIcontype()
            java.lang.String r12 = r1.getBizType()
            java.lang.String r11 = ""
            r1 = r17
            r1.setOptionMenu(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0276:
            com.alibaba.ariver.app.api.Page r1 = r13.mPage
            java.lang.String r1 = r1.getOriginalURI()
            com.alibaba.griver.api.ui.optionmenu.ToolbarMenuOption r0 = r0.defaultToolbarMenus(r1)
            if (r0 == 0) goto L_0x02a0
            java.util.List r1 = r0.getToolbarMenus()     // Catch:{ Exception -> 0x029a }
            java.lang.String r1 = com.alibaba.fastjson.JSON.toJSONString(r1)     // Catch:{ Exception -> 0x029a }
            com.alibaba.fastjson.JSONArray r1 = com.alibaba.fastjson.JSONArray.parseArray(r1)     // Catch:{ Exception -> 0x029a }
            boolean r2 = r0.isOverride()     // Catch:{ Exception -> 0x029a }
            boolean r0 = r0.isReset()     // Catch:{ Exception -> 0x029a }
            r13.setToolbarMenu(r1, r2, r0)     // Catch:{ Exception -> 0x029a }
            goto L_0x02a0
        L_0x029a:
            r0 = move-exception
            java.lang.String r1 = "set custom toolbar menu option failed"
            com.alibaba.griver.base.common.logger.GriverLogger.e(r14, r1, r0)
        L_0x02a0:
            boolean r0 = r13.isSwitchMode
            if (r0 != 0) goto L_0x02a7
            r13.showOptionMenu(r15)
        L_0x02a7:
            java.lang.Class<com.alibaba.griver.api.ui.titlebar.GriverTitleBarCreatedEvent> r0 = com.alibaba.griver.api.ui.titlebar.GriverTitleBarCreatedEvent.class
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r0 = com.alibaba.ariver.kernel.api.extension.ExtensionPoint.as(r0)
            com.alibaba.ariver.app.api.Page r1 = r13.mPage
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r0 = r0.node(r1)
            com.alibaba.ariver.kernel.api.extension.Extension r0 = r0.create()
            com.alibaba.griver.api.ui.titlebar.GriverTitleBarCreatedEvent r0 = (com.alibaba.griver.api.ui.titlebar.GriverTitleBarCreatedEvent) r0
            android.view.View r1 = r13.mContentView
            r0.titleBarCreated(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.titlebar.GriverTitleBar.attachPage(com.alibaba.ariver.app.api.Page):void");
    }

    private void applyTransparentTitle() {
        this.mTransTitle = false;
        Bundle startParams = this.mPage.getStartParams();
        int i = 1;
        if (startParams != null && startParams.containsKey("transparentTitle")) {
            String string = BundleUtils.getString(startParams, "transparentTitle");
            this.transparentTitle = string;
            if (!TextUtils.isEmpty(string)) {
                this.mTransTitle = TextUtils.equals("always", this.transparentTitle) || TextUtils.equals("auto", this.transparentTitle) || TextUtils.equals(SchedulerSupport.CUSTOM, this.transparentTitle);
                StringBuilder sb = new StringBuilder("mTransTitle is ");
                sb.append(this.mTransTitle);
                RVLogger.d(TAG, sb.toString());
            }
        }
        int i2 = -16777216 | BundleUtils.getInt(startParams, "titleBarColor", -16777216);
        if (startParams != null && startParams.containsKey("titleBarColor")) {
            setContentBackgroundViewColor(i2);
            if (i2 != -1) {
                this.mTitleView.switchTheme(NebulaTitleView.Theme.WHITE);
                switchIconFontToWhiteTheme();
            } else {
                this.mTitleView.switchTheme(NebulaTitleView.Theme.BLUE);
                switchIconFontToBlueTheme();
            }
        }
        if (this.mTransTitle) {
            if (TextUtils.equals(this.transparentTitle, "auto")) {
                int i3 = BundleUtils.getInt(startParams, RVParams.LONG_TITLE_SCROLLDISTANCE);
                this.finalMaxScrollHeight = i3;
                int i4 = i3 / 255;
                if (i4 != 0) {
                    i = i4;
                }
                this.finalScale = i;
                this.switchThemePoint = (this.finalMaxScrollHeight * 3) / 4;
                StringBuilder sb2 = new StringBuilder("transparentTitleBar finalMaxScrollHeight is ");
                sb2.append(this.finalMaxScrollHeight);
                sb2.append(", switchThemePoint is ");
                sb2.append(this.switchThemePoint);
                RVLogger.d(TAG, sb2.toString());
                this.preventScrollTrans = false;
                calAlphaValue(this.finalMaxScrollHeight, this.finalScale, false);
                switchTheme(-1, this.switchThemePoint, false);
                this.delayDy = this.mPage.getRender().getScrollY();
                this.scrollWithTitleText = "YES".equalsIgnoreCase(BundleUtils.getString(startParams, RVParams.LONG_TRANSPARENT_TITLE_TEXTAUTO));
            } else {
                this.alpha = 0.0f;
                this.preventScrollTrans = true;
                this.scrollWithTitleText = false;
            }
            View divider = this.mTitleView.getDivider();
            this.mDivider = divider;
            divider.setVisibility(8);
            boolean z = BundleUtils.getBoolean(startParams, "hasH5Pkg", false);
            if (i2 != -1) {
                resetDivider();
            } else {
                resetDivider();
                if (!TextUtils.equals(this.transparentTitle, SchedulerSupport.CUSTOM)) {
                    StringBuilder sb3 = new StringBuilder("mTransTitle appid ");
                    sb3.append(this.appId);
                    sb3.append(", appVersion ");
                    sb3.append(this.version);
                    sb3.append(", hasPackage ");
                    sb3.append(z);
                    RVLogger.d(TAG, sb3.toString());
                    if (z) {
                        if (!TextUtils.equals(this.transparentTitle, "auto")) {
                            this.mTitleView.switchTheme(NebulaTitleView.Theme.WHITE);
                            switchIconFontToWhiteTheme();
                        }
                    } else if (!this.isSwitchMode) {
                        this.mTitleView.switchTheme(NebulaTitleView.Theme.BLUE);
                        switchIconFontToBlueTheme();
                    }
                }
            }
            transparentTitleBar(this.transparentTitle, startParams);
            return;
        }
        this.alpha = 1.0f;
        if (i2 != -1) {
            resetDivider();
        } else {
            resetDivider();
            this.mTitleView.switchTheme(NebulaTitleView.Theme.BLUE);
            switchIconFontToBlueTheme();
        }
        setTitleAlpha();
        this.preventScrollTrans = true;
        this.scrollWithTitleText = false;
        String string2 = BundleUtils.getString(startParams, "backBtnImage");
        BundleUtils.getInt(startParams, RVParams.LONG_BACKBTN_TEXTCOLOR);
        int i5 = BundleUtils.getInt(startParams, "titleColor");
        this.preventSetTitleColor = true;
        this.mTitleView.setBackCloseButtonImage(string2, startParams);
        this.mTitleView.setTitleTextColor(i5);
        setTitleElementsColor(startParams);
        int i6 = BundleUtils.getInt(startParams, "titleBarBackgroundImage", 0);
        if (i6 != 0 && this.mTitleView != null && startParams != null && !startParams.containsKey("titleBarColor")) {
            this.mTitleView.setTitleBackgroundImage(i6);
        }
    }

    private void transparentTitleBar(String str, Bundle bundle) {
        NebulaTitleView nebulaTitleView;
        if (!TextUtils.isEmpty(str)) {
            setTitleAlpha();
            if (TextUtils.equals(str, "auto")) {
                this.mPage.getRender().setScrollChangedCallback(new ScrollChangedCallback() {
                    public void onScroll(int i, int i2) {
                        GriverTitleBar griverTitleBar = GriverTitleBar.this;
                        int unused = griverTitleBar.delayDy = griverTitleBar.delayDy + i2;
                        GriverTitleBar griverTitleBar2 = GriverTitleBar.this;
                        griverTitleBar2.calAlphaValue(griverTitleBar2.finalMaxScrollHeight, GriverTitleBar.this.finalScale, true);
                        GriverTitleBar griverTitleBar3 = GriverTitleBar.this;
                        griverTitleBar3.switchTheme(GriverTitleBar.this.mContentBgDrawable.getColor() | -16777216, griverTitleBar3.switchThemePoint, true);
                    }
                });
            } else {
                String string = BundleUtils.getString(bundle, "backBtnImage", "");
                int i = BundleUtils.getInt(bundle, "titleColor", -16777216);
                setTitleElementsColor(bundle);
                this.mTitleView.setTitleTextColor(i);
                this.mTitleView.setBackCloseButtonImage(string, bundle);
            }
            if ("YES".equalsIgnoreCase(BundleUtils.getString(bundle, RVParams.LONG_TITLE_PENETRATE, "NO")) && (nebulaTitleView = this.mTitleView) != null) {
                View contentView = nebulaTitleView.getContentView();
                if (contentView instanceof H5TitleBarFrameLayout) {
                    ((H5TitleBarFrameLayout) contentView).setPreventTouchEvent(false);
                }
            }
        }
    }

    private void setCustomTitleElementsColor(Bundle bundle) {
        if (BundleUtils.contains(bundle, "backButtonColor")) {
            this.mTitleView.setBackButtonColor(BundleUtils.getInt(bundle, "backButtonColor", -15692055));
        }
        if (BundleUtils.contains(bundle, "closeButtonColor")) {
            this.mTitleView.setCloseButtonColor(BundleUtils.getInt(bundle, "closeButtonColor", -15692055));
        }
        if (BundleUtils.contains(bundle, GriverLaunchParams.BACK_HOME_BUTTON_COLOR)) {
            this.mTitleView.setBackHomeButtonColor(BundleUtils.getInt(bundle, GriverLaunchParams.BACK_HOME_BUTTON_COLOR, -15692055));
        }
        int i = BundleUtils.getInt(bundle, "titleLoadingColor");
        if (i == 0) {
            i = R.drawable.griver_ui_title_bar_progress;
        }
        this.mTitleView.setTitleLoading(i);
        if (BundleUtils.contains(bundle, "optionMenuColor")) {
            this.mTitleView.setOptionMenuColor(BundleUtils.getInt(bundle, "optionMenuColor", -15692055));
        }
        if (BundleUtils.getBoolean(bundle, "useTitleColorWhenAutoTransparentTitle", false)) {
            this.mTitleView.setTitleTextColor(BundleUtils.getInt(bundle, "titleColor", -16777216));
        }
    }

    private void setTitleElementsColor(Bundle bundle) {
        this.mTitleView.setBackButtonColor(BundleUtils.getInt(bundle, "backButtonColor", -15692055));
        this.mTitleView.setCloseButtonColor(BundleUtils.getInt(bundle, "closeButtonColor", -15692055));
        this.mTitleView.setBackHomeButtonColor(BundleUtils.getInt(bundle, GriverLaunchParams.BACK_HOME_BUTTON_COLOR, -15692055));
        int i = BundleUtils.getInt(bundle, "titleLoadingColor");
        if (i == 0) {
            i = R.drawable.griver_ui_title_bar_progress;
        }
        this.mTitleView.setTitleLoading(i);
        this.mTitleView.setOptionMenuColor(BundleUtils.getInt(bundle, "optionMenuColor", -15692055));
    }

    /* access modifiers changed from: private */
    public void switchTheme(int i, int i2, boolean z) {
        NebulaTitleView nebulaTitleView;
        Page page = this.mPage;
        if (page != null) {
            int scrollY = z ? this.delayDy : page.getRender().getScrollY();
            if (!this.preventScrollTrans) {
                if (i == -1) {
                    if (Math.abs(scrollY) >= i2) {
                        if (BundleUtils.contains(this.mPage.getStartParams(), "autoTransparentTitleSlideThemeColor")) {
                            this.mTitleView.switchToCustomTheme(BundleUtils.getInt(this.mPage.getStartParams(), "autoTransparentTitleSlideThemeColor"));
                        } else {
                            this.mTitleView.switchTheme(NebulaTitleView.Theme.BLUE);
                            switchIconFontToBlueTheme();
                        }
                    } else if (BundleUtils.contains(this.mPage.getStartParams(), "autoTransparentTitleInitThemeColor")) {
                        this.mTitleView.switchToCustomTheme(BundleUtils.getInt(this.mPage.getStartParams(), "autoTransparentTitleInitThemeColor"));
                    } else {
                        this.mTitleView.switchTheme(NebulaTitleView.Theme.WHITE);
                        switchIconFontToWhiteTheme();
                    }
                    setCustomTitleElementsColor(this.mPage.getStartParams());
                }
                this.mContentBgDrawable.setAlpha((int) (this.alpha * 255.0f));
                this.mDivider.setAlpha(this.alpha);
                if (this.scrollWithTitleText && (nebulaTitleView = this.mTitleView) != null) {
                    TextView mainTitleView = nebulaTitleView.getMainTitleView();
                    if (mainTitleView != null) {
                        mainTitleView.setAlpha(this.alpha);
                    }
                    TextView subTitleView = this.mTitleView.getSubTitleView();
                    if (subTitleView != null) {
                        subTitleView.setAlpha(this.alpha);
                    }
                }
            }
        }
    }

    private boolean needTinyPopMenu(Page page) {
        Bundle startParams;
        AppModel appModel;
        if (page == null || (startParams = page.getStartParams()) == null || "NO".equalsIgnoreCase(startParams.getString("usePresetPopmenu")) || (appModel = (AppModel) page.getApp().getData(AppModel.class)) == null) {
            return false;
        }
        return "YES".equalsIgnoreCase(JSONUtils.getString(appModel.getExtendInfos(), "usePresetPopmenu"));
    }

    /* access modifiers changed from: private */
    public void calAlphaValue(int i, int i2, boolean z) {
        int scrollY = z ? this.delayDy : this.mPage.getRender().getScrollY();
        if (Math.abs(scrollY) < i) {
            this.alpha = ((float) Math.abs(scrollY / i2)) / 255.0f;
        } else if (scrollY <= 0) {
            this.alpha = 0.0f;
        } else {
            this.alpha = 1.0f;
        }
    }

    public View getContent() {
        return this.mContentView;
    }

    public void onDestroy() {
        this.mPage = null;
        NebulaTitleView nebulaTitleView = this.mTitleView;
        if (nebulaTitleView != null) {
            nebulaTitleView.releaseViewList();
        }
        H5TinyPopMenu h5TinyPopMenu = this.mTinyPopMenu;
        if (h5TinyPopMenu != null) {
            h5TinyPopMenu.onRelease();
        }
    }

    private void showTitleBar(boolean z) {
        this.mContentView.setVisibility(z ? 0 : 8);
    }

    public void onReceivedTitle(String str, String str2) {
        setPageTitle(str2, str);
    }

    private void setPageTitle(String str, String str2) {
        if (str == null) {
            RVLogger.d(TAG, "case 1, page title ignored!");
            return;
        }
        StringBuilder sb = new StringBuilder("readTitle:");
        sb.append(this.readTitle);
        RVLogger.d(TAG, sb.toString());
        if (!this.readTitle || this.mIgnorePageTitleFromCallbacks || this.mIfImageTitle) {
            RVLogger.d(TAG, "case 2, page title ignored!");
            return;
        }
        Page page = this.mPage;
        if (page == null || !TextUtils.equals(str, page.getPageURI())) {
            try {
                NebulaTitleView nebulaTitleView = this.mTitleView;
                if (str2.equals("http://".concat(String.valueOf(str)))) {
                    str = this.mDefaultTitle;
                }
                nebulaTitleView.setTitle(str);
            } catch (IllegalArgumentException e) {
                RVLogger.e(TAG, (Throwable) e);
                this.mTitleView.setTitle(this.mDefaultTitle);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" not show");
            RVLogger.d(TAG, sb2.toString());
        }
    }

    private Bitmap createIconBitmap(int i) {
        Page page = this.mPage;
        if (page == null) {
            return null;
        }
        return BitmapFactory.decodeResource(page.getPageContext().getActivity().getResources(), i);
    }

    /* access modifiers changed from: private */
    public void setOptionImage(final Bitmap bitmap, final int i) {
        if (bitmap != null) {
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    GriverTitleBar.this.mTitleView.setOptionType(TitleView.OptionType.ICON, i, true);
                    GriverTitleBar.this.mTitleView.setButtonIcon(bitmap, i);
                }
            });
        }
    }

    private String getDownloadImageUrl(String str) {
        if (this.mPage == null || TextUtils.isEmpty(str) || str.startsWith("http")) {
            return str;
        }
        String string = BundleUtils.getString(this.mPage.getStartParams(), "url");
        return !TextUtils.isEmpty(string) ? UrlUtils.mergeUrl(string, str) : str;
    }

    private void setTitleAlpha() {
        NebulaTitleView nebulaTitleView;
        this.mContentBgDrawable.setAlpha((int) (this.alpha * 255.0f));
        this.mDivider.setAlpha(this.alpha);
        if (this.scrollWithTitleText && (nebulaTitleView = this.mTitleView) != null) {
            TextView mainTitleView = nebulaTitleView.getMainTitleView();
            if (mainTitleView != null) {
                mainTitleView.setAlpha(this.alpha);
            }
            TextView subTitleView = this.mTitleView.getSubTitleView();
            if (subTitleView != null) {
                subTitleView.setAlpha(this.alpha);
            }
        }
    }

    private void setContentBackgroundViewColor(int i) {
        this.mContentBgDrawable.setColor(i);
    }

    public int getTitleColor() {
        return this.mContentBgDrawable.getColor();
    }

    public String getTransparentTitle() {
        return this.transparentTitle;
    }

    public String getTitle() {
        NebulaTitleView nebulaTitleView = this.mTitleView;
        return nebulaTitleView != null ? nebulaTitleView.getTitle() : "";
    }

    public String getSubTitle() {
        NebulaTitleView nebulaTitleView = this.mTitleView;
        return (nebulaTitleView == null || nebulaTitleView.getSubTitleView() == null || this.mTitleView.getSubTitleView().getText() == null) ? "" : this.mTitleView.getSubTitleView().getText().toString();
    }

    public Bitmap getImgTitle() {
        NebulaTitleView nebulaTitleView = this.mTitleView;
        if (nebulaTitleView == null || nebulaTitleView.ivImageTitle == null) {
            return null;
        }
        Drawable drawable = this.mTitleView.ivImageTitle.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        return null;
    }

    public NebulaTitleView getTitleView() {
        return this.mTitleView;
    }

    private boolean isPreRenderPage() {
        boolean z;
        boolean z2;
        Page page = this.mPage;
        if (page != null) {
            Bundle startParams = page.getStartParams();
            z = BundleUtils.getBoolean(startParams, GriverParam.LONG_ISPRERENDER, false);
            z2 = BundleUtils.getBoolean(startParams, RVParams.isTinyApp, false);
        } else {
            z2 = false;
            z = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public void setTitle(String str, String str2, String str3, final String str4, boolean z) {
        if (!isPreRenderPage()) {
            if (z) {
                this.mIgnorePageTitleFromCallbacks = true;
            }
            if (!TextUtils.isEmpty(str3)) {
                this.mIfImageTitle = true;
                if (!str3.startsWith("http")) {
                    GriverLogger.d(TAG, "setTitle image type base64");
                    Bitmap base64ToBitmap = ImageUtil.base64ToBitmap(str3);
                    if (base64ToBitmap != null) {
                        this.mTitleView.setImgTitle(base64ToBitmap, str4);
                        return;
                    }
                }
                if (this.mPage != null) {
                    String decode = H5UrlHelper.decode(str3);
                    String downloadImageUrl = getDownloadImageUrl(decode);
                    String string = BundleUtils.getString(this.mPage.getStartParams(), "onlineHost");
                    StringBuilder sb = new StringBuilder("setTitle image type originUrl ");
                    sb.append(decode);
                    sb.append(", finalImageUrl ");
                    sb.append(downloadImageUrl);
                    sb.append(", onlineHost ");
                    sb.append(string);
                    GriverLogger.d(TAG, sb.toString());
                    if (!TextUtils.isEmpty(downloadImageUrl)) {
                        ImageUtils.loadImage(downloadImageUrl, new ImageListener() {
                            public void onImage(final Bitmap bitmap) {
                                if (bitmap != null) {
                                    GriverLogger.d(GriverTitleBar.TAG, "setTitle image type online");
                                    ExecutorUtils.runOnMain(new Runnable() {
                                        public void run() {
                                            GriverTitleBar.this.mTitleView.setImgTitle(bitmap, str4);
                                        }
                                    });
                                }
                            }
                        });
                    }
                }
            } else {
                GriverLogger.d(TAG, "setTitle text type");
                if (!TextUtils.isEmpty(str) && !this.mPageStarted) {
                    this.mDefaultTitle = str;
                }
                this.mTitleView.setTitle(str);
                this.mTitleView.setSubTitle(str2);
            }
            this.mTitleView.setTitle(str);
        }
    }

    public void setTitleColor(int i, boolean z, boolean z2) {
        if (z2) {
            this.mTransTitle = true;
        }
        if (this.mContentBgDrawable != null) {
            int i2 = i | -16777216;
            if (!z && !z2) {
                setContentBackgroundViewColor(i2);
                if (!this.preventSetTitleColor) {
                    if (i2 != -1) {
                        this.mTitleView.switchTheme(NebulaTitleView.Theme.WHITE);
                        switchIconFontToWhiteTheme();
                    } else {
                        this.mTitleView.switchTheme(NebulaTitleView.Theme.BLUE);
                        switchIconFontToBlueTheme();
                    }
                }
                if (i2 != -1) {
                    this.mDivider.setBackgroundColor(i2);
                    resetDivider();
                }
                if (this.mTransTitle) {
                    setTitleAlpha();
                }
            } else if (z) {
                this.mTitleView.resetTitleColor(-1);
                this.mTitleView.switchTheme(NebulaTitleView.Theme.BLUE);
                switchIconFontToBlueTheme();
                resetDivider();
                if (this.mTransTitle) {
                    setTitleAlpha();
                }
            } else {
                this.mTitleView.switchTheme(NebulaTitleView.Theme.WHITE);
                switchIconFontToWhiteTheme();
                if (this.mTransTitle) {
                    setTitleAlpha();
                }
            }
        }
        if (this.mTransTitle && this.mPage.getPageContext() != null) {
            this.mPage.getPageContext().applyTransparentTitle(true);
        }
    }

    private void resetDivider() {
        View view = this.mDivider;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public NebulaPopMenu getPopMenu() {
        return this.mPopMenu;
    }

    public NebulaPopMenu getToolbarMenu() {
        return this.mToolbarMenu;
    }

    public void showTitleLoading(boolean z) {
        NebulaTitleView nebulaTitleView = this.mTitleView;
        if (nebulaTitleView != null) {
            nebulaTitleView.showTitleLoading(z);
        }
    }

    public void showBackButton(boolean z) {
        NebulaTitleView nebulaTitleView = this.mTitleView;
        if (nebulaTitleView != null) {
            nebulaTitleView.showBackButton(z);
        }
    }

    public void showOptionMenu(boolean z) {
        NebulaTitleView nebulaTitleView = this.mTitleView;
        if (nebulaTitleView != null) {
            nebulaTitleView.showOptionMenu(z);
        }
    }

    public View getDivider() {
        return this.mDivider;
    }

    public void setDivider(View view) {
        this.mDivider = view;
    }

    private void switchIconFontToWhiteTheme() {
        String[] strArr = this.mIconType;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.mIconType;
                if (i < strArr2.length) {
                    String str = strArr2[i];
                    if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "stupid") && whiteIconFontMap.get(str) != null) {
                        setOptionImage(createIconBitmap(whiteIconFontMap.get(str).intValue()), i);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private void switchIconFontToBlueTheme() {
        String[] strArr = this.mIconType;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.mIconType;
                if (i < strArr2.length) {
                    String str = strArr2[i];
                    if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "stupid") && blueIconFontMap.get(str) != null) {
                        setOptionImage(createIconBitmap(blueIconFontMap.get(str).intValue()), i);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private void getTinyPopMenuData() {
        H5TinyPopMenu h5TinyPopMenu = new H5TinyPopMenu();
        this.mTinyPopMenu = h5TinyPopMenu;
        h5TinyPopMenu.init(this.mPage, "", this.mContext, (ViewGroup) this.mTitleView.getOptionMenuContainer());
    }

    public void setTransparentTitle(String str) {
        this.isSwitchMode = true;
        Page page = this.mPage;
        if (page != null) {
            page.getStartParams().putString("transparentTitle", str);
        }
        applyTransparentTitle();
    }

    public void onOptionMenuClick() {
        if (BundleUtils.getBoolean(this.mPage.getStartParams(), RVParams.isH5App, false)) {
            this.mToolbarMenu.showMenu(this.mTitleView.getPopAnchor());
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<GriverMenuItem> developerCustomMenu = getDeveloperCustomMenu();
        if (developerCustomMenu != null && developerCustomMenu.size() > 0) {
            arrayList.addAll(developerCustomMenu);
        }
        List<GriverMenuItem> menuList = ((GriverACMenuExtension) RVProxy.get(GriverACMenuExtension.class)).getMenuList(this.mPage);
        if (menuList != null && menuList.size() > 0) {
            for (GriverMenuItem next : menuList) {
                if (next.canShow(this.mPage)) {
                    arrayList.add(next);
                }
            }
        }
        List<GriverMenuItem> menuList2 = ((GriverMenuExtension) RVProxy.get(GriverMenuExtension.class)).getMenuList(this.mPage);
        if (menuList2 != null && menuList2.size() > 0) {
            for (GriverMenuItem next2 : menuList2) {
                if (next2.canShow(this.mPage)) {
                    arrayList.add(next2);
                }
            }
        }
        ((GriverOptionMenuPanelExtension) RVProxy.get(GriverOptionMenuPanelExtension.class)).showOptionMenuPanel(this.mPage, arrayList);
    }

    @NonNull
    private List<GriverMenuItem> getDeveloperCustomMenu() {
        LinkedList linkedList = new LinkedList();
        try {
            final JSONArray jSONArray = (JSONArray) this.mPage.getData(JSONArray.class);
            if (jSONArray == null) {
                return null;
            }
            int i = 0;
            int size = jSONArray.size();
            while (i < 3 && i < size) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = JSONUtils.getString(jSONObject, "name");
                String string2 = JSONUtils.getString(jSONObject, "menuIconUrl");
                GriverBaseMenuItem griverBaseMenuItem = new GriverBaseMenuItem();
                griverBaseMenuItem.identifier = string;
                griverBaseMenuItem.name = string;
                griverBaseMenuItem.iconUrl = string2;
                griverBaseMenuItem.row = 2;
                griverBaseMenuItem.priority = GRVMPMoreMenuItemPriority.GRVMPMoreMenuItemPriorityHigh;
                griverBaseMenuItem.listener = new OnMenuItemClickListener() {
                    public void onItemClick(Page page, String str) {
                        int size = jSONArray.size();
                        int i = 0;
                        while (i < 3 && i < size) {
                            if (TextUtils.equals(JSONUtils.getString(jSONArray.getJSONObject(i), "name"), str)) {
                                JSONObject jSONObject = new JSONObject();
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("index", (Object) Integer.valueOf(i));
                                jSONObject.put("data", (Object) jSONObject2);
                                EngineUtils.sendToRender(GriverTitleBar.this.mPage.getRender(), RVEvents.CUSTOM_POP_MENU_CLICKED, jSONObject, (SendToRenderCallback) null);
                                return;
                            }
                            i++;
                        }
                    }
                };
                linkedList.add(griverBaseMenuItem);
                i++;
            }
            return linkedList;
        } catch (Throwable th) {
            GriverLogger.e(TAG, "getDeveloperCustomMenu", th);
        }
    }

    public void enableBackButton(boolean z) {
        NebulaTitleView nebulaTitleView = this.mTitleView;
        if (nebulaTitleView != null && nebulaTitleView.btBack != null) {
            this.mTitleView.btBack.setEnabled(z);
        }
    }

    public void enableCloseButton(boolean z) {
        NebulaTitleView nebulaTitleView = this.mTitleView;
        if (nebulaTitleView != null && nebulaTitleView.btClose != null) {
            this.mTitleView.btClose.setEnabled(z);
        }
    }

    public void showCloseButton(boolean z) {
        NebulaTitleView nebulaTitleView = this.mTitleView;
        if (nebulaTitleView != null) {
            nebulaTitleView.showCloseButton(z);
        }
    }

    public void setToolbarMenu(JSONArray jSONArray, boolean z, boolean z2) {
        boolean z3 = false;
        if (BundleUtils.getBoolean(this.mPage.getStartParams(), RVParams.isH5App, false)) {
            GriverOptionMenuEvent create = ExtensionPoint.as(GriverOptionMenuEvent.class).node(this.mPage).create();
            ToolbarMenuOption toolbarMenuOption = new ToolbarMenuOption();
            toolbarMenuOption.setOverride(z);
            toolbarMenuOption.setReset(z2);
            List arrayList = new ArrayList();
            try {
                arrayList = (List) JSONObject.parseObject(jSONArray.toJSONString(), new TypeReference<List<ToolbarMenu>>() {
                }, new Feature[0]);
            } catch (Exception unused) {
                GriverLogger.e(TAG, "parse toolbar menus failed");
            }
            toolbarMenuOption.setToolbarMenus(arrayList);
            create.toolbarMenusUpdated(this.mPage.getOriginalURI(), toolbarMenuOption);
        }
        this.mToolbarMenu.setShowPopMenu(false);
        if (this.mPage.getApp() != null && TextUtils.equals("tiny", this.mPage.getApp().getAppType())) {
            z3 = true;
        }
        if (z3) {
            if (this.mPage.getApp() == null || !"20000067".equals(this.mPage.getApp().getAppId())) {
                this.mToolbarMenu.clearMenuList();
            } else {
                this.mToolbarMenu.removeMenu("refresh");
                this.mToolbarMenu.removeMenu("h5MenuActionOfFont");
            }
        }
        if (z2) {
            this.mToolbarMenu.resetMenu();
        } else {
            this.mToolbarMenu.setMenu(jSONArray, z, this.mPageStarted);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: com.alibaba.fastjson.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.alibaba.fastjson.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.alibaba.fastjson.JSONArray} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOptionMenu(java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, java.lang.String r22, boolean r23, com.alibaba.fastjson.JSONArray r24, boolean r25, java.lang.String r26, java.lang.String r27, java.lang.String r28) {
        /*
            r17 = this;
            r0 = r17
            r1 = r25
            r0.mOptionMenuPreventDefault = r1
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "tiny"
            r12 = r28
            boolean r1 = android.text.TextUtils.equals(r1, r12)
            com.alibaba.ariver.app.api.Page r2 = r0.mPage
            android.os.Bundle r2 = r2.getStartParams()
            r13 = 0
            java.lang.String r3 = "isH5app"
            boolean r2 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r2, r3, r13)
            java.lang.String r3 = "GriverTitleBar"
            r4 = 0
            if (r2 != 0) goto L_0x003b
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = "bizType is not tiny, do not set option menu"
            com.alibaba.griver.base.common.logger.GriverLogger.w(r3, r1)
            return
        L_0x002b:
            boolean r2 = android.text.TextUtils.isEmpty(r19)
            if (r2 == 0) goto L_0x0034
            r5 = r4
            r14 = r5
            goto L_0x0037
        L_0x0034:
            r5 = r20
            r14 = r4
        L_0x0037:
            r15 = r14
            r16 = r15
            goto L_0x004b
        L_0x003b:
            if (r1 == 0) goto L_0x0043
            java.lang.String r1 = "bizType can not set to tiny in h5, do not set option menu"
            com.alibaba.griver.base.common.logger.GriverLogger.w(r3, r1)
            return
        L_0x0043:
            r14 = r18
            r5 = r20
            r15 = r24
            r16 = r26
        L_0x004b:
            com.alibaba.griver.ui.titlebar.NebulaTitleView r2 = r0.mTitleView
            r3 = r14
            r4 = r19
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r15
            r10 = r16
            r11 = r27
            r12 = r28
            r2.setOptionMenu(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r21 == 0) goto L_0x0067
            if (r1 != 0) goto L_0x0067
            r0.mOptionMenuPreventDefault = r13
            return
        L_0x0067:
            java.lang.String r2 = "stupid"
            r3 = 2
            r4 = 1
            if (r15 == 0) goto L_0x014b
            boolean r5 = r15.isEmpty()
            if (r5 != 0) goto L_0x014b
            java.lang.String r5 = "icon"
            java.lang.String r6 = "icontype"
            java.lang.String r7 = "title"
            if (r23 == 0) goto L_0x00ec
            if (r1 != 0) goto L_0x00ec
            int r1 = r15.size()
            if (r1 <= r3) goto L_0x0084
            goto L_0x0088
        L_0x0084:
            int r3 = r15.size()
        L_0x0088:
            java.lang.String[] r1 = new java.lang.String[r3]
            r0.mIconType = r1
        L_0x008c:
            if (r13 >= r3) goto L_0x00eb
            com.alibaba.fastjson.JSONObject r1 = r15.getJSONObject(r13)
            java.lang.String r2 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getString(r1, r7)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00e8
            java.lang.String[] r2 = r0.mIconType
            java.lang.String r4 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getString(r1, r6)
            r2[r13] = r4
            java.util.Map<java.lang.String, java.lang.Integer> r2 = blueIconFontMap
            if (r2 == 0) goto L_0x00db
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00db
            java.util.Map<java.lang.String, java.lang.Integer> r2 = blueIconFontMap
            java.lang.String[] r4 = r0.mIconType
            r4 = r4[r13]
            boolean r2 = r2.containsKey(r4)
            if (r2 == 0) goto L_0x00db
            com.alibaba.griver.ui.titlebar.NebulaTitleView r1 = r0.mTitleView
            android.widget.TextView r1 = r1.getMainTitleView()
            r1.getCurrentTextColor()
            java.util.Map<java.lang.String, java.lang.Integer> r1 = blueIconFontMap
            java.lang.String[] r2 = r0.mIconType
            r2 = r2[r13]
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            android.graphics.Bitmap r1 = r0.createIconBitmap(r1)
            r0.setOptionImage(r1, r13)
            goto L_0x00e8
        L_0x00db:
            java.lang.String r1 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getString(r1, r5)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x00e8
            r0.loadImageAsync(r1, r13)
        L_0x00e8:
            int r13 = r13 + 1
            goto L_0x008c
        L_0x00eb:
            return
        L_0x00ec:
            com.alibaba.fastjson.JSONObject r1 = r15.getJSONObject(r13)
            java.lang.String r7 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getString(r1, r7)
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x014a
            java.lang.String[] r3 = new java.lang.String[r3]
            r0.mIconType = r3
            r3[r13] = r2
            java.lang.String r2 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getString(r1, r6)
            r3[r4] = r2
            java.util.Map<java.lang.String, java.lang.Integer> r2 = blueIconFontMap
            if (r2 == 0) goto L_0x013d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x013d
            java.util.Map<java.lang.String, java.lang.Integer> r2 = blueIconFontMap
            java.lang.String[] r3 = r0.mIconType
            r3 = r3[r4]
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x013d
            com.alibaba.griver.ui.titlebar.NebulaTitleView r1 = r0.mTitleView
            android.widget.TextView r1 = r1.getMainTitleView()
            r1.getCurrentTextColor()
            java.util.Map<java.lang.String, java.lang.Integer> r1 = blueIconFontMap
            java.lang.String[] r2 = r0.mIconType
            r2 = r2[r4]
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            android.graphics.Bitmap r1 = r0.createIconBitmap(r1)
            r0.setOptionImage(r1, r4)
            return
        L_0x013d:
            java.lang.String r1 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getString(r1, r5)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x014a
            r0.loadImageAsync(r1, r4)
        L_0x014a:
            return
        L_0x014b:
            boolean r5 = android.text.TextUtils.isEmpty(r14)
            if (r5 == 0) goto L_0x01a7
            boolean r5 = android.text.TextUtils.isEmpty(r19)
            if (r5 == 0) goto L_0x015d
            boolean r5 = android.text.TextUtils.isEmpty(r16)
            if (r5 != 0) goto L_0x01a7
        L_0x015d:
            java.lang.String[] r3 = new java.lang.String[r3]
            r0.mIconType = r3
            r3[r13] = r16
            r3[r4] = r2
            java.util.Map<java.lang.String, java.lang.Integer> r2 = blueIconFontMap
            if (r2 == 0) goto L_0x019c
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x019c
            java.util.Map<java.lang.String, java.lang.Integer> r2 = blueIconFontMap
            java.lang.String[] r3 = r0.mIconType
            r3 = r3[r13]
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x019c
            com.alibaba.griver.ui.titlebar.NebulaTitleView r2 = r0.mTitleView
            android.widget.TextView r2 = r2.getMainTitleView()
            r2.getCurrentTextColor()
            java.util.Map<java.lang.String, java.lang.Integer> r2 = blueIconFontMap
            java.lang.String[] r3 = r0.mIconType
            r3 = r3[r13]
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.graphics.Bitmap r2 = r0.createIconBitmap(r2)
            r0.setOptionImage(r2, r1)
            return
        L_0x019c:
            boolean r2 = android.text.TextUtils.isEmpty(r19)
            if (r2 != 0) goto L_0x01a7
            r2 = r19
            r0.loadImageAsync(r2, r1)
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.titlebar.GriverTitleBar.setOptionMenu(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, com.alibaba.fastjson.JSONArray, boolean, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private void loadImageAsync(String str, final int i) {
        if (!str.startsWith("http")) {
            setOptionImage(ImageUtils.base64ToBitmap(str), i);
        } else {
            ImageUtils.loadImage(str, new ImageListener() {
                public void onImage(Bitmap bitmap) {
                    if (bitmap != null) {
                        GriverTitleBar.this.setOptionImage(bitmap, i);
                    }
                }
            });
        }
    }
}
