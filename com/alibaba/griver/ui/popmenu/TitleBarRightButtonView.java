package com.alibaba.griver.ui.popmenu;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.DimensionUtil;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.account.GriverAccount;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.badge.AUBadgeView;
import com.alibaba.griver.ui.ant.text.AUIconView;
import com.alibaba.griver.ui.popmenu.H5TinyPopMenu;
import com.alibaba.griver.ui.reddot.RedDotDrawable;
import com.iap.ac.android.container.adapter.griver.extension.CustomMenuExtensionImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class TitleBarRightButtonView extends LinearLayout implements TinyAppActionStateListener {
    public static final int ID_CLOSE_OPTTION_CONTAINER = 103;
    public static final int ID_FAVORITE_CONTAINER = 104;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f10604a = TitleBarRightButtonView.class.getSimpleName();
    private AUIconView b;
    private ImageView c;
    private AUIconView d;
    /* access modifiers changed from: private */
    public AUBadgeView e;
    /* access modifiers changed from: private */
    public RelativeLayout f;
    private AUIconView g;
    private TextView h;
    /* access modifiers changed from: private */
    public TextView i;
    private RelativeLayout j;
    private String k;
    private String l;
    private String m;
    /* access modifiers changed from: private */
    public String n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public H5TinyPopMenu.TitleBarTheme f10605o;
    /* access modifiers changed from: private */
    public CornerMarkingUIController p = new CornerMarkingUIController();
    /* access modifiers changed from: private */
    public boolean q;
    /* access modifiers changed from: private */
    public boolean r;
    private JSONObject s;
    private ObjectAnimator t;

    public TitleBarRightButtonView(Context context, H5TinyPopMenu.TitleBarTheme titleBarTheme, int i2) {
        super(context);
        a(context, titleBarTheme, i2);
    }

    public TitleBarRightButtonView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, (H5TinyPopMenu.TitleBarTheme) null, 0);
    }

    public TitleBarRightButtonView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, (H5TinyPopMenu.TitleBarTheme) null, 0);
    }

    private void a(Context context, H5TinyPopMenu.TitleBarTheme titleBarTheme, int i2) {
        RelativeLayout relativeLayout;
        Context context2 = context;
        H5TinyPopMenu.TitleBarTheme titleBarTheme2 = titleBarTheme == null ? H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_BLUE : titleBarTheme;
        float density = DimensionUtil.getDensity(context);
        Resources resources = context.getResources();
        if (resources != null) {
            this.k = resources.getString(R.string.griver_title_bar_favorite_icon_font_unicode);
            this.l = resources.getString(R.string.griver_title_bar_more_icon_font_unicode);
            this.m = resources.getString(R.string.griver_title_bar_close_icon_font_unicode);
        }
        setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        this.j = new RelativeLayout(context2);
        RelativeLayout relativeLayout2 = new RelativeLayout(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        this.j.setBackgroundResource(R.drawable.griver_ui_close_btn_bg);
        relativeLayout2.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) (82.0f * density), -1);
        int i3 = (int) (9.0f * density);
        layoutParams2.topMargin = i3;
        layoutParams2.bottomMargin = i3;
        layoutParams2.rightMargin = (int) (4.0f * density);
        this.j.setLayoutParams(layoutParams2);
        int i4 = (int) (7.0f * density);
        int i5 = i4 / 3;
        int i6 = i4 + i5;
        double d2 = (double) density;
        Double.isNaN(d2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins((int) (d2 * 24.5d), 0, 0, 0);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(0, 102);
        AUIconView aUIconView = new AUIconView(context2, "tinyfont", "titlebar");
        this.b = aUIconView;
        aUIconView.setPadding(i6 + i5, 0, i6 - i5, 0);
        this.b.setLayoutParams(layoutParams4);
        this.b.setIconfontUnicode(this.l);
        this.b.setIconfontSize("22dp");
        this.b.setIconfontColor(-15626519);
        this.b.setBackgroundResource(R.drawable.griver_ui_title_btn_bg_r_left);
        RelativeLayout relativeLayout3 = relativeLayout2;
        RedDotDrawable.wrap(this.b, getResources().getDimensionPixelOffset(R.dimen.griver_AU_REDDOTSIZE5), getResources().getDimensionPixelOffset(R.dimen.griver_AU_REDDOT_DX), getResources().getDimensionPixelOffset(R.dimen.griver_AU_REDDOT_DY), -65536);
        AUBadgeView aUBadgeView = new AUBadgeView(context2);
        this.e = aUBadgeView;
        aUBadgeView.setLayoutParams(layoutParams3);
        String str = "";
        this.e.setStyleAndContent(AUBadgeView.Style.POINT, str);
        this.e.setVisibility(8);
        this.e.setMaxLines(1);
        this.b.setContentDescription(context.getResources().getString(R.string.griver_more));
        ImageView imageView = new ImageView(context2);
        this.c = imageView;
        imageView.setId(102);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(1, -1);
        layoutParams5.addRule(13);
        layoutParams5.setMargins(0, i4, 0, i4);
        this.c.setLayoutParams(layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams6.addRule(1, 102);
        AUIconView aUIconView2 = new AUIconView(context2, "tinyfont", "titlebar");
        this.d = aUIconView2;
        aUIconView2.setLayoutParams(layoutParams6);
        this.d.setPadding(i6, 0, i6, 0);
        this.d.setIconfontUnicode(this.m);
        this.d.setIconfontSize("22dp");
        this.d.setIconfontColor(-15626519);
        this.d.setBackgroundResource(R.drawable.griver_ui_title_btn_bg_r_right);
        this.d.setContentDescription(context.getResources().getString(R.string.griver_close));
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) (66.0f * density), -1);
        layoutParams7.topMargin = i3;
        layoutParams7.bottomMargin = i3;
        layoutParams7.rightMargin = (int) (8.0f * density);
        RelativeLayout relativeLayout4 = new RelativeLayout(context2);
        this.f = relativeLayout4;
        relativeLayout4.setLayoutParams(layoutParams7);
        this.f.setBackgroundResource(R.drawable.griver_ui_close_btn_bg);
        RelativeLayout relativeLayout5 = new RelativeLayout(context2);
        relativeLayout5.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout5.setPadding(i4, 0, i4, 0);
        relativeLayout5.setBackgroundResource(R.drawable.griver_ui_title_btn_bg);
        relativeLayout5.setId(104);
        this.f.addView(relativeLayout5);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(15);
        AUIconView aUIconView3 = new AUIconView(context2);
        this.g = aUIconView3;
        aUIconView3.setId(100);
        this.g.setLayoutParams(layoutParams8);
        this.g.setIconfontFileName("iconfont");
        this.g.setIconfontBundle("tinyfont");
        this.g.setIconfontUnicode(this.k);
        this.g.setIconfontColor(Color.rgb(255, 255, 255));
        this.g.setIconfontSize("22dp");
        relativeLayout5.addView(this.g);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(13);
        layoutParams9.addRule(1, 100);
        TextView textView = new TextView(context2);
        this.h = textView;
        textView.setId(101);
        this.h.setLayoutParams(layoutParams9);
        this.h.setTextSize(1, 13.0f);
        this.h.setTextColor(-15626519);
        this.h.setSingleLine(true);
        this.h.setText(CustomMenuExtensionImpl.TYPE_FAVORITE);
        relativeLayout5.addView(this.h);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(11);
        TextView textView2 = new TextView(context2);
        this.i = textView2;
        textView2.setLayoutParams(layoutParams10);
        this.i.setBackgroundColor(-65536);
        this.i.setMaxLines(1);
        int i7 = (int) (3.0f * density);
        int i8 = (int) (density * 1.0f);
        this.i.setPadding(i7, i8, i7, i8);
        this.i.setTextColor(-1);
        this.i.setTextSize(1, 6.0f);
        this.i.setVisibility(8);
        relativeLayout5.addView(this.i);
        this.f.setVisibility(8);
        switchTheme(titleBarTheme2, i2);
        setOrientation(0);
        RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class);
        if (rVConfigService != null) {
            str = rVConfigService.getConfigWithProcessCache("h5_showCloseButtonTitleBarRight", str);
        }
        if (!"no".equalsIgnoreCase(str)) {
            this.j.addView(this.b);
            this.j.addView(this.c);
            this.j.addView(this.d);
            this.j.setId(103);
            relativeLayout = relativeLayout3;
            relativeLayout.addView(this.j);
            relativeLayout.addView(this.e);
        } else {
            relativeLayout = relativeLayout3;
        }
        addView(this.f);
        addView(relativeLayout);
    }

    public void showOptionMenuRedDot(boolean z) {
        AUIconView aUIconView = this.b;
        if (aUIconView != null) {
            RedDotDrawable.showRedPoint(aUIconView, z);
            postInvalidate();
        }
    }

    public void setOptionMenuOnClickListener(View.OnClickListener onClickListener) {
        AUIconView aUIconView = this.b;
        if (aUIconView != null) {
            aUIconView.setOnClickListener(onClickListener);
        }
    }

    public void setCloseButtonOnClickListener(View.OnClickListener onClickListener) {
        AUIconView aUIconView = this.d;
        if (aUIconView != null) {
            aUIconView.setOnClickListener(onClickListener);
        }
    }

    public void setCloseButtonOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        AUIconView aUIconView = this.d;
        if (aUIconView != null) {
            aUIconView.setOnLongClickListener(onLongClickListener);
        }
    }

    public void setFavoriteButtonClickListener(final View.OnClickListener onClickListener) {
        RelativeLayout relativeLayout = this.f;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (!TitleBarRightButtonView.this.p.interceptClickEventForCornerMarking()) {
                        onClickListener.onClick(view);
                    }
                }
            });
        }
    }

    public void setFavoriteBtnVisibility(int i2) {
        RelativeLayout relativeLayout = this.f;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(i2);
            setBadgeData(this.s);
        }
    }

    public void setFavoriteStatus(boolean z) {
        this.q = z;
        this.r = true;
        setBadgeData(this.s);
    }

    public void switchFavoriteIconFont(boolean z) {
        setFavoriteStatus(z);
        AUIconView aUIconView = this.g;
        if (aUIconView != null) {
            if (z) {
                aUIconView.setVisibility(8);
                if (this.f10605o == H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_WHITE) {
                    this.g.setIconfontColor(Color.rgb(255, 255, 255));
                } else if (this.f10605o == H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_BLUE) {
                    this.g.setIconfontColor(Color.rgb(30, 144, 230));
                }
            } else {
                aUIconView.setVisibility(0);
                if (this.f10605o == H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_WHITE) {
                    this.g.setIconfontColor(Color.rgb(255, 255, 255));
                } else if (this.f10605o == H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_BLUE) {
                    this.g.setIconfontColor(Color.rgb(30, 144, 230));
                }
            }
        }
        RelativeLayout relativeLayout = this.f;
        if (relativeLayout != null) {
            if (z) {
                relativeLayout.setContentDescription(getContext().getResources().getString(R.string.griver_unfavorite));
            } else {
                relativeLayout.setContentDescription(getContext().getResources().getString(R.string.griver_favorite));
            }
        }
        if (this.h != null) {
            if (this.f10605o == H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_WHITE) {
                this.h.setTextColor(-1);
            } else if (this.f10605o == H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_BLUE) {
                this.h.setTextColor(-15626519);
            }
            if (z) {
                this.h.setText("Collected");
            } else {
                this.h.setText(CustomMenuExtensionImpl.TYPE_FAVORITE);
            }
        }
    }

    public boolean isShowTitleBarFavorite() {
        RelativeLayout relativeLayout = this.f;
        return relativeLayout != null && relativeLayout.getVisibility() == 0;
    }

    public boolean isBadgeViewShow() {
        AUBadgeView aUBadgeView = this.e;
        return aUBadgeView != null && aUBadgeView.getVisibility() == 0;
    }

    public void setBadgeData(final JSONObject jSONObject) {
        this.s = jSONObject;
        AUBadgeView aUBadgeView = this.e;
        if (aUBadgeView != null) {
            aUBadgeView.setVisibility(8);
            if (jSONObject != null) {
                ExecutorUtils.runNotOnMain(ExecutorType.NETWORK, new Runnable() {
                    public void run() {
                        int i = JSONUtils.getInt(jSONObject, AUBadgeView.KEY_BADGE_STYLE);
                        final int i2 = JSONUtils.getInt(jSONObject, "unreadCount");
                        long j = JSONUtils.getLong(jSONObject, "latestMsgTime");
                        final int i3 = -1;
                        if (i2 > 0) {
                            try {
                                String userId = GriverAccount.getUserId();
                                if (!TextUtils.isEmpty(TitleBarRightButtonView.this.n) && !TextUtils.isEmpty(userId)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(userId);
                                    sb.append("_");
                                    sb.append(TitleBarRightButtonView.this.n);
                                    sb.append("_titleBarOptionLatestClickTime");
                                    String obj = sb.toString();
                                    TitleBarRightButtonView titleBarRightButtonView = TitleBarRightButtonView.this;
                                    Context context = TitleBarRightButtonView.this.getContext();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(userId);
                                    sb2.append("_");
                                    sb2.append(TitleBarRightButtonView.this.n);
                                    SharedPreferences access$300 = titleBarRightButtonView.a(context, sb2.toString());
                                    String str = "";
                                    if (access$300 != null) {
                                        str = access$300.getString(obj, str);
                                    }
                                    if (!TextUtils.isEmpty(str) && Long.parseLong(str) >= j) {
                                        if (TitleBarRightButtonView.this.p.hasCornerMarking()) {
                                            i = -1;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                i3 = i;
                            } catch (Throwable th) {
                                RVLogger.e(TitleBarRightButtonView.f10604a, th);
                            }
                        }
                        ExecutorUtils.runOnMain(new Runnable() {
                            public void run() {
                                if (i3 > 0) {
                                    TitleBarRightButtonView.this.e.setVisibility(0);
                                    int i = i3;
                                    if (i == 1) {
                                        if (i2 > 0) {
                                            TitleBarRightButtonView.this.e.setStyleAndContent(AUBadgeView.Style.NUM, "");
                                            if (TitleBarRightButtonView.this.f10605o == H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_BLUE) {
                                                TitleBarRightButtonView.this.e.setMsgCount(i2, true);
                                            } else {
                                                TitleBarRightButtonView.this.e.setMsgCount(i2, false);
                                            }
                                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) TitleBarRightButtonView.this.e.getLayoutParams();
                                            if (layoutParams != null) {
                                                layoutParams.topMargin = 0;
                                                layoutParams.leftMargin = (int) (DimensionUtil.getDensity(TitleBarRightButtonView.this.getContext()) * 23.0f);
                                                TitleBarRightButtonView.this.e.setLayoutParams(layoutParams);
                                            }
                                        }
                                    } else if (i == 2) {
                                        float density = DimensionUtil.getDensity(TitleBarRightButtonView.this.getContext());
                                        TitleBarRightButtonView.this.e.setStyleAndContent(AUBadgeView.Style.POINT, "");
                                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) TitleBarRightButtonView.this.e.getLayoutParams();
                                        if (layoutParams2 != null) {
                                            layoutParams2.topMargin = Math.round(density * 12.5f);
                                            layoutParams2.leftMargin = (int) (28.5f * density);
                                            TitleBarRightButtonView.this.e.setLayoutParams(layoutParams2);
                                        }
                                    } else {
                                        TitleBarRightButtonView.this.p.syncCornerMarkingDataToUI();
                                    }
                                } else {
                                    TitleBarRightButtonView.this.p.syncCornerMarkingDataToUI();
                                }
                            }
                        });
                    }
                });
            } else {
                this.p.syncCornerMarkingDataToUI();
            }
        }
    }

    public void dismissBadgeView() {
        this.p.expose();
        ExecutorUtils.runNotOnMain(ExecutorType.NETWORK, new Runnable() {
            public void run() {
                if (!TitleBarRightButtonView.this.p.hasCornerMarking()) {
                    ExecutorUtils.runOnMain(new Runnable() {
                        public void run() {
                            if (TitleBarRightButtonView.this.e != null) {
                                TitleBarRightButtonView.this.e.setVisibility(8);
                            }
                        }
                    });
                }
            }
        });
    }

    public void setAppId(String str) {
        this.n = str;
    }

    /* access modifiers changed from: private */
    public void a() {
        String str = f10604a;
        StringBuilder sb = new StringBuilder("switchToWhiteTheme...optionMenu=");
        sb.append(this.b);
        RVLogger.d(str, sb.toString());
        RelativeLayout relativeLayout = this.j;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(R.drawable.griver_ui_close_btn_bg_white);
        }
        AUIconView aUIconView = this.b;
        if (aUIconView != null) {
            aUIconView.setIconfontColor(-1);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setBackgroundColor(Color.parseColor("#26FFFFFF"));
        }
        AUIconView aUIconView2 = this.d;
        if (aUIconView2 != null) {
            aUIconView2.setIconfontColor(-1);
        }
        AUIconView aUIconView3 = this.g;
        if (aUIconView3 != null) {
            aUIconView3.setIconfontColor(Color.rgb(255, 255, 255));
        }
        TextView textView = this.h;
        if (textView != null) {
            textView.setTextColor(-1);
        }
        RelativeLayout relativeLayout2 = this.f;
        if (relativeLayout2 != null) {
            relativeLayout2.setBackgroundResource(R.drawable.griver_ui_close_btn_bg_white);
        }
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        String str = f10604a;
        StringBuilder sb = new StringBuilder("switchToBlueTheme...optionMenu=");
        sb.append(this.b);
        RVLogger.d(str, sb.toString());
        RelativeLayout relativeLayout = this.j;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(R.drawable.griver_ui_close_btn_bg);
        }
        AUIconView aUIconView = this.b;
        if (aUIconView != null) {
            aUIconView.setIconfontColor(i2);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setBackgroundColor(Color.parseColor("#80B0B0B0"));
        }
        AUIconView aUIconView2 = this.d;
        if (aUIconView2 != null) {
            aUIconView2.setIconfontColor(i2);
        }
        AUIconView aUIconView3 = this.g;
        if (aUIconView3 != null) {
            aUIconView3.setIconfontColor(Color.rgb(0, 144, 230));
        }
        TextView textView = this.h;
        if (textView != null) {
            textView.setTextColor(i2);
        }
        RelativeLayout relativeLayout2 = this.f;
        if (relativeLayout2 != null) {
            relativeLayout2.setBackgroundResource(R.drawable.griver_ui_close_btn_bg);
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        String str = f10604a;
        StringBuilder sb = new StringBuilder("switchToBlueTheme...optionMenu=");
        sb.append(this.b);
        RVLogger.d(str, sb.toString());
        RelativeLayout relativeLayout = this.j;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(R.drawable.griver_ui_close_btn_bg);
        }
        AUIconView aUIconView = this.b;
        if (aUIconView != null) {
            aUIconView.setIconfontColor(-15626519);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setBackgroundColor(Color.parseColor("#80B0B0B0"));
        }
        AUIconView aUIconView2 = this.d;
        if (aUIconView2 != null) {
            aUIconView2.setIconfontColor(-15626519);
        }
        AUIconView aUIconView3 = this.g;
        if (aUIconView3 != null) {
            aUIconView3.setIconfontColor(Color.rgb(0, 144, 230));
        }
        TextView textView = this.h;
        if (textView != null) {
            textView.setTextColor(-15626519);
        }
        RelativeLayout relativeLayout2 = this.f;
        if (relativeLayout2 != null) {
            relativeLayout2.setBackgroundResource(R.drawable.griver_ui_close_btn_bg);
        }
    }

    public void switchTheme(final H5TinyPopMenu.TitleBarTheme titleBarTheme, final int i2) {
        post(new Runnable() {
            public void run() {
                H5TinyPopMenu.TitleBarTheme unused = TitleBarRightButtonView.this.f10605o = titleBarTheme;
                if (titleBarTheme == H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_WHITE) {
                    TitleBarRightButtonView.this.a();
                } else if (titleBarTheme == H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_BLUE) {
                    TitleBarRightButtonView.this.b();
                } else if (titleBarTheme == H5TinyPopMenu.TitleBarTheme.TITLE_BAR_THEME_CUSTOM) {
                    TitleBarRightButtonView.this.a(i2);
                }
            }
        });
    }

    public void updateCornerMarking(List<CornerMarkingData> list) {
        this.p.setDataProvider(list);
        this.p.syncCornerMarkingDataToUI();
    }

    public void setH5Page(Page page) {
        this.p.setH5Page(page);
        if (page.getStartParams() != null && BundleUtils.getBoolean(page.getStartParams(), RVParams.isTinyApp, false)) {
            TinyAppActionStateManager.getInstance().registerStateListener(page, this);
        }
    }

    public boolean isCornerMarkingShow() {
        TextView textView = this.i;
        return textView != null && textView.getVisibility() == 0;
    }

    public void onStateChanged(TinyAppActionState tinyAppActionState) {
        if (TinyMenuUtils.showActionIcon(this.n)) {
            if (tinyAppActionState != null) {
                String str = f10604a;
                StringBuilder sb = new StringBuilder("onStateChanged ");
                sb.append(tinyAppActionState.getAction());
                sb.append(" ");
                sb.append(tinyAppActionState.getCount());
                RVLogger.d(str, sb.toString());
                setOptionMenuIcon(tinyAppActionState);
                return;
            }
            c();
        }
    }

    private ObjectAnimator getOptionMenuBlinkAnimator() {
        if (this.t == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, "alpha", new float[]{1.0f, 0.0f, 1.0f});
            this.t = ofFloat;
            ofFloat.setDuration(1000);
            this.t.setRepeatCount(-1);
            this.t.setRepeatMode(1);
        }
        return this.t;
    }

    private void setOptionMenuIcon(TinyAppActionState tinyAppActionState) {
        String iconUnicode = tinyAppActionState.getIconUnicode(getResources());
        if (!TextUtils.isEmpty(iconUnicode)) {
            this.b.setIconfontUnicode(iconUnicode);
            getOptionMenuBlinkAnimator().cancel();
            getOptionMenuBlinkAnimator().start();
        }
    }

    private void c() {
        this.b.setIconfontUnicode(this.l);
        this.b.setAlpha(1.0f);
        getOptionMenuBlinkAnimator().cancel();
    }

    public View getFavorite() {
        return this.f;
    }

    public View getOptionMenu() {
        return this.b;
    }

    public View getOptionMenuContainer() {
        return this.j;
    }

    /* access modifiers changed from: private */
    @Nullable
    public SharedPreferences a(Context context, String str) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-1345074674, oncanceled);
                onCancelLoad.getMin(-1345074674, oncanceled);
            }
        }
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }

    class CornerMarkingUIController {

        /* renamed from: a  reason: collision with root package name */
        private List<CornerMarkingData> f10606a;
        private WeakReference<Page> b;

        private CornerMarkingUIController() {
        }

        public void setDataProvider(List<CornerMarkingData> list) {
            this.f10606a = list;
        }

        public void setH5Page(Page page) {
            this.b = new WeakReference<>(page);
        }

        private CornerMarkingData a() {
            List<CornerMarkingData> list = this.f10606a;
            if (list == null) {
                return null;
            }
            for (CornerMarkingData next : list) {
                if (next != null && "1005".equals(next.mid)) {
                    return next;
                }
            }
            return null;
        }

        public void syncCornerMarkingDataToUI() {
            if (TitleBarRightButtonView.this.i != null) {
                CornerMarkingData a2 = a();
                if (a2 == null) {
                    TitleBarRightButtonView.this.i.setTag((Object) null);
                    TitleBarRightButtonView.this.i.setText((CharSequence) null);
                } else {
                    TitleBarRightButtonView.this.i.setTag(a2);
                    TitleBarRightButtonView.this.i.setText(a2.superscript);
                }
                ExecutorUtils.runNotOnMain(ExecutorType.NETWORK, new Runnable() {
                    public void run() {
                        if (CornerMarkingUIController.this.hasCornerMarking()) {
                            ExecutorUtils.runOnMain(new Runnable() {
                                public void run() {
                                    if (TitleBarRightButtonView.this.e.getVisibility() != 0) {
                                        TitleBarRightButtonView.this.e.setVisibility(0);
                                        float density = DimensionUtil.getDensity(TitleBarRightButtonView.this.getContext());
                                        TitleBarRightButtonView.this.e.setStyleAndContent(AUBadgeView.Style.POINT, "");
                                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) TitleBarRightButtonView.this.e.getLayoutParams();
                                        if (layoutParams != null) {
                                            layoutParams.topMargin = Math.round(density * 12.5f);
                                            layoutParams.leftMargin = (int) (28.5f * density);
                                            TitleBarRightButtonView.this.e.setLayoutParams(layoutParams);
                                        }
                                    }
                                }
                            });
                        }
                    }
                });
            }
        }

        public boolean interceptClickEventForCornerMarking() {
            if (TitleBarRightButtonView.this.i == null || !(TitleBarRightButtonView.this.i.getTag() instanceof CornerMarkingData)) {
                return false;
            }
            WeakReference<Page> weakReference = this.b;
            String appId = (weakReference != null ? weakReference.get() : null).getApp().getAppId();
            if (TextUtils.isEmpty(appId)) {
                return false;
            }
            RVLogger.d(TitleBarRightButtonView.f10604a, "intercept click event for corner marking");
            CornerMarkingData cornerMarkingData = (CornerMarkingData) TitleBarRightButtonView.this.i.getTag();
            List<CornerMarkingData> list = this.f10606a;
            if (list != null) {
                list.remove(cornerMarkingData);
            }
            new CornerMarkingDataProvider().click(appId, cornerMarkingData.noticeId);
            RVLogger.d(TitleBarRightButtonView.f10604a, cornerMarkingData.toJavaScript());
            syncCornerMarkingDataToUI();
            return TextUtils.equals("startApp", cornerMarkingData.action);
        }

        public boolean hasCornerMarking() {
            List<CornerMarkingData> list = this.f10606a;
            boolean z = false;
            if (list != null && list.size() > 0) {
                if (!TitleBarRightButtonView.this.r) {
                    boolean unused = TitleBarRightButtonView.this.r = true;
                }
                boolean z2 = TitleBarRightButtonView.this.f != null && TitleBarRightButtonView.this.f.getVisibility() == 0;
                for (CornerMarkingData next : this.f10606a) {
                    if (!next.exposed && ((!z2 || !"1005".equals(next.mid)) && (!TitleBarRightButtonView.this.q || !"1005".equals(next.mid)))) {
                        z = true;
                    }
                }
            }
            return z;
        }

        public void expose() {
            List list = this.f10606a;
            if (TitleBarRightButtonView.this.q) {
                list = new ArrayList();
                for (CornerMarkingData next : this.f10606a) {
                    if (!"1005".equals(next.mid)) {
                        list.add(next);
                    }
                }
            }
            new CornerMarkingDataProvider().expose(TitleBarRightButtonView.this.n, list);
        }
    }
}
