package com.alibaba.griver.ui.titlebar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.page.BackPressedPoint;
import com.alibaba.ariver.app.api.point.view.TitleBarCloseClickPoint;
import com.alibaba.ariver.app.api.point.view.TitleBarDisclaimerClickPoint;
import com.alibaba.ariver.app.api.point.view.TitleBarOptionClickPoint;
import com.alibaba.ariver.app.api.point.view.TitleBarSegCheckPoint;
import com.alibaba.ariver.app.api.point.view.TitleBarTitleClickPoint;
import com.alibaba.ariver.app.api.ui.StateListUtils;
import com.alibaba.ariver.app.api.ui.StatusBarUtils;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.DimensionUtil;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.constants.GriverLaunchParams;
import com.alibaba.griver.api.ui.titlebar.GriverBackButtonStyleExtension;
import com.alibaba.griver.api.ui.titlebar.GriverButtonStyleExtension;
import com.alibaba.griver.api.ui.titlebar.GriverCloseButtonStyleExtension;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.DensityUtil;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.utils.TypefaceCache;
import com.alibaba.griver.ui.titlebar.H5SegmentGroup;
import com.alibaba.griver.ui.titlebar.TitleView;
import com.alibaba.griver.ui.utils.H5ViewStubUtil;
import io.reactivex.annotations.SchedulerSupport;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class NebulaTitleView implements View.OnClickListener, H5SegmentGroup.OnItemCheckedChangeListener, TitleView {
    public static final String LONG_SEG_COLOR_ACTIVE = "segColorActive";
    public static final String LONG_SEG_COLOR_NORMAL = "segColorNormal";
    public static final String LONG_SEG_SELECTED_INDEX = "segSelectedIndex";
    public static final String LONG_SEG_TITLES = "segTitles";
    public static final String LONG_SEG_WIDTHS = "segWidths";
    public static final String TAG = "NebulaTitleView";

    /* renamed from: a  reason: collision with root package name */
    private TitleView.OptionType[] f10634a = new TitleView.OptionType[2];
    private int b;
    public ViewGroup backContainer;
    public TextView btBack;
    public TextView btBackToHome;
    public TextView btClose;
    public View btDotView;
    public View btDotView1;
    public List<View> btDotViewList = new ArrayList();
    public ImageButton btIcon;
    public ImageButton btIcon1;
    public List<ImageButton> btIconList = new ArrayList();
    public TextView btMenu;
    public TextView btMenu1;
    public List<TextView> btMenuList = new ArrayList();
    public TextView btText;
    public TextView btText1;
    public List<TextView> btTextList = new ArrayList();
    @DrawableRes
    private int c = R.drawable.griver_ui_title_bar_progress;
    public H5TitleBarFrameLayout contentView;
    private View d;
    public TextView disClaimer;
    public ImageView dotImage;
    public ImageView dotImage1;
    public List<ImageView> dotImageList = new ArrayList();
    public TextView dotText;
    public TextView dotText1;
    public List<TextView> dotTextList = new ArrayList();
    private Page e;
    private View f;
    private Context g;
    private boolean h;
    public View h5NavOptions;
    public View h5NavOptions1;
    public List<View> h5NavOptionsList = new ArrayList();
    private ViewGroup i;
    public ImageView ivImageTitle;
    private H5SegmentGroup j;
    private Theme k;
    private LinearLayout l;
    public LinearLayout llTitle;
    public RelativeLayout rlTitle;
    public TextView tvSubtitle;
    public TextView tvTitle;

    public enum Theme {
        BLUE,
        WHITE
    }

    private boolean a(int i2, int i3) {
        return i3 == 0 || i3 < i2;
    }

    public NebulaTitleView(Context context) {
        this.g = context;
        H5TitleBarFrameLayout h5TitleBarFrameLayout = (H5TitleBarFrameLayout) LayoutInflater.from(context).inflate(R.layout.griver_ui_navigation_bar, (!(context instanceof Activity) || ((Activity) context).getWindow() == null) ? null : (ViewGroup) ((Activity) this.g).findViewById(16908290), false);
        this.contentView = h5TitleBarFrameLayout;
        this.l = (LinearLayout) h5TitleBarFrameLayout.findViewById(R.id.h5_rl_title_bar);
        this.tvTitle = (TextView) this.contentView.findViewById(R.id.h5_tv_title);
        this.tvSubtitle = (TextView) this.contentView.findViewById(R.id.h5_tv_subtitle);
        this.disClaimer = (TextView) this.contentView.findViewById(R.id.h5_nav_disclaimer);
        this.ivImageTitle = (ImageView) this.contentView.findViewById(R.id.h5_tv_title_img);
        this.d = this.contentView.findViewById(R.id.h5_status_bar_adjust_view);
        this.tvSubtitle.setVisibility(8);
        this.ivImageTitle.setVisibility(8);
        this.tvTitle.setOnClickListener(this);
        this.tvSubtitle.setOnClickListener(this);
        this.ivImageTitle.setOnClickListener(this);
        this.btBack = (TextView) this.contentView.findViewById(R.id.h5_tv_nav_back);
        this.btClose = (TextView) this.contentView.findViewById(R.id.h5_nav_close);
        this.btBackToHome = (TextView) this.contentView.findViewById(R.id.h5_tv_nav_back_to_home);
        StringBuilder sb = new StringBuilder("h5iconfont");
        sb.append(File.separator);
        sb.append("titlebar.ttf");
        Typeface typeface = TypefaceCache.getTypeface(context, "h5iconfont", sb.toString());
        this.backContainer = (ViewGroup) this.contentView.findViewById(R.id.h5_nav_back);
        this.btBack.setTypeface(typeface);
        this.btBack.setTextColor(StateListUtils.getStateColor(-15692055));
        this.btClose.setTypeface(typeface);
        this.btClose.setTextColor(StateListUtils.getStateColor(-15692055));
        this.disClaimer.setTypeface(typeface);
        this.disClaimer.setTextColor(StateListUtils.getStateColor(-6710887));
        this.f = this.contentView.findViewById(R.id.h5_h_divider_intitle);
        this.rlTitle = (RelativeLayout) this.contentView.findViewById(R.id.h5_rl_title);
        this.llTitle = (LinearLayout) this.contentView.findViewById(R.id.h5_ll_title);
        this.h5NavOptions = this.contentView.findViewById(R.id.h5_nav_options);
        this.btDotView = this.contentView.findViewById(R.id.h5_bt_dot);
        this.btIcon = (ImageButton) this.contentView.findViewById(R.id.h5_bt_image);
        this.btText = (TextView) this.contentView.findViewById(R.id.h5_bt_text);
        TextView textView = (TextView) this.contentView.findViewById(R.id.h5_bt_options);
        this.btMenu = textView;
        textView.setTypeface(typeface);
        this.btMenu.setTextColor(StateListUtils.getStateColor(-15692055));
        this.dotImage = (ImageView) this.contentView.findViewById(R.id.h5_bt_dot_bg);
        this.dotText = (TextView) this.contentView.findViewById(R.id.h5_bt_dot_number);
        this.h5NavOptions1 = this.contentView.findViewById(R.id.h5_nav_options1);
        this.btDotView1 = this.contentView.findViewById(R.id.h5_bt_dot1);
        this.btIcon1 = (ImageButton) this.contentView.findViewById(R.id.h5_bt_image1);
        this.btText1 = (TextView) this.contentView.findViewById(R.id.h5_bt_text1);
        TextView textView2 = (TextView) this.contentView.findViewById(R.id.h5_bt_options1);
        this.btMenu1 = textView2;
        textView2.setTypeface(typeface);
        this.btMenu1.setTextColor(StateListUtils.getStateColor(-15692055));
        this.dotImage1 = (ImageView) this.contentView.findViewById(R.id.h5_bt_dot_bg1);
        this.dotText1 = (TextView) this.contentView.findViewById(R.id.h5_bt_dot_number1);
        H5SegmentGroup h5SegmentGroup = (H5SegmentGroup) this.contentView.findViewById(R.id.h5_nav_seg_group);
        this.j = h5SegmentGroup;
        h5SegmentGroup.setItemChangeListener(this);
        this.h5NavOptionsList.add(this.h5NavOptions);
        this.h5NavOptionsList.add(this.h5NavOptions1);
        this.btDotViewList.add(this.btDotView);
        this.btDotViewList.add(this.btDotView1);
        this.btIconList.add(this.btIcon);
        this.btIconList.add(this.btIcon1);
        this.btTextList.add(this.btText);
        this.btTextList.add(this.btText1);
        this.btMenuList.add(this.btMenu);
        this.btMenuList.add(this.btMenu1);
        this.dotImageList.add(this.dotImage);
        this.dotImageList.add(this.dotImage1);
        this.dotTextList.add(this.dotText);
        this.dotTextList.add(this.dotText1);
        this.b = 1;
        ((RelativeLayout) this.contentView.findViewById(R.id.adView)).setTag("adView");
        ((RelativeLayout) this.contentView.findViewById(R.id.h5_custom_view)).setTag("h5_custom_view");
        this.btBack.setOnClickListener(this);
        this.btClose.setOnClickListener(this);
        this.disClaimer.setOnClickListener(this);
        this.btText.setOnClickListener(this);
        this.btIcon.setOnClickListener(this);
        this.btText1.setOnClickListener(this);
        this.btIcon1.setOnClickListener(this);
        this.btMenu.setOnClickListener(this);
        this.btMenu1.setOnClickListener(this);
        Drawable drawable = this.g.getResources().getDrawable(this.c);
        int dip2px = DimensionUtil.dip2px(this.g, 17.0f);
        drawable.setBounds(0, 0, dip2px, dip2px);
        ((ProgressBar) H5ViewStubUtil.getView(this.contentView, R.id.h5_nav_loading_stub, R.id.h5_nav_loading)).setIndeterminateDrawable(drawable);
        GriverBackButtonStyleExtension griverBackButtonStyleExtension = (GriverBackButtonStyleExtension) RVProxy.get(GriverBackButtonStyleExtension.class);
        if (!TextUtils.isEmpty(griverBackButtonStyleExtension.getType())) {
            a(this.btBack, (GriverButtonStyleExtension) griverBackButtonStyleExtension);
        }
        GriverCloseButtonStyleExtension griverCloseButtonStyleExtension = (GriverCloseButtonStyleExtension) RVProxy.get(GriverCloseButtonStyleExtension.class);
        if (!TextUtils.isEmpty(griverCloseButtonStyleExtension.getType())) {
            a(this.btClose, (GriverButtonStyleExtension) griverCloseButtonStyleExtension);
        }
    }

    public void setButtonSize(float f2) {
        this.btBack.setTextSize(2, f2);
        this.btClose.setTextSize(2, f2);
        this.btBackToHome.setTextSize(2, f2);
        this.btMenu.setTextSize(2, f2);
        this.btMenu1.setTextSize(2, f2);
    }

    private void a(TextView textView, GriverButtonStyleExtension griverButtonStyleExtension) {
        if (textView != null && griverButtonStyleExtension != null) {
            StringBuilder sb = new StringBuilder("set custom button style, view: ");
            sb.append(textView);
            sb.append(", type: ");
            sb.append(griverButtonStyleExtension.getType());
            GriverLogger.d(TAG, sb.toString());
            if ("text".equalsIgnoreCase(griverButtonStyleExtension.getType())) {
                textView.setText(griverButtonStyleExtension.getContent());
            } else if ("icon".equalsIgnoreCase(griverButtonStyleExtension.getType())) {
                textView.setText("");
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, griverButtonStyleExtension.getIconDrawable(), (Drawable) null);
            }
        }
    }

    public void setButtonIcon(Bitmap bitmap, int i2) {
        if (!a(i2, this.btIconList.size())) {
            this.btIconList.get(i2).setImageBitmap(bitmap);
        }
    }

    public String getTitle() {
        TextView textView = this.tvTitle;
        if (textView != null) {
            return textView.getText().toString();
        }
        return null;
    }

    public void setTitle(String str) {
        if (str != null && a(str)) {
            this.tvTitle.setText(str);
            this.tvTitle.setVisibility(0);
            this.ivImageTitle.setVisibility(8);
        }
    }

    private boolean a(String str) {
        return !str.startsWith("http://") && !str.startsWith("https://");
    }

    private void a(int i2, int i3, boolean z) {
        if (!a(i2, this.btTextList.size())) {
            if (z) {
                this.btTextList.get(i2).setVisibility(i3);
                if (i3 == 0) {
                    this.f10634a[i2] = TitleView.OptionType.TEXT;
                    return;
                }
                return;
            }
            for (int i4 = 0; i4 < i2; i4++) {
                this.btTextList.get(i4).setVisibility(i3);
                if (i3 == 0) {
                    this.f10634a[i2] = TitleView.OptionType.TEXT;
                }
            }
        }
    }

    private void b(int i2, int i3, boolean z) {
        if (!a(i2, this.btIconList.size())) {
            if (z) {
                this.btIconList.get(i2).setVisibility(i3);
                if (i3 == 0) {
                    this.f10634a[i2] = TitleView.OptionType.ICON;
                    return;
                }
                return;
            }
            for (int i4 = 0; i4 < i2; i4++) {
                this.btIconList.get(i4).setVisibility(i3);
                if (i3 == 0) {
                    this.f10634a[i2] = TitleView.OptionType.ICON;
                }
            }
        }
    }

    private void c(int i2, int i3, boolean z) {
        if (!a(i2, this.btMenuList.size())) {
            if (z) {
                this.btMenuList.get(i2).setVisibility(i3);
                if (i3 == 0) {
                    this.f10634a[i2] = TitleView.OptionType.MENU;
                    return;
                }
                return;
            }
            for (int i4 = 0; i4 < i2; i4++) {
                this.btMenuList.get(i4).setVisibility(i3);
                if (i3 == 0) {
                    this.f10634a[i2] = TitleView.OptionType.MENU;
                }
            }
        }
    }

    private void b(int i2, int i3) {
        if (!a(i2, this.btDotViewList.size())) {
            for (int i4 = 0; i4 < i2; i4++) {
                this.btDotViewList.get(i4).setVisibility(i3);
            }
        }
    }

    public void setSubTitle(String str) {
        boolean z;
        int i2 = 0;
        if (TextUtils.isEmpty(str)) {
            z = false;
        } else {
            z = true;
            this.tvSubtitle.setText(str);
        }
        TextView textView = this.tvSubtitle;
        if (!z) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public void setImgTitle(Bitmap bitmap) {
        if (bitmap != null) {
            StringBuilder sb = new StringBuilder("imgTitle width ");
            sb.append(bitmap.getWidth());
            sb.append(", imgTitle height ");
            sb.append(bitmap.getHeight());
            RVLogger.d(TAG, sb.toString());
            this.ivImageTitle.setImageBitmap(bitmap);
            this.ivImageTitle.setVisibility(0);
            this.tvTitle.setVisibility(8);
            this.tvSubtitle.setVisibility(8);
            StringBuilder sb2 = new StringBuilder("ivImageTitle width ");
            sb2.append(this.ivImageTitle.getWidth());
            sb2.append(", ivImageTitle height ");
            sb2.append(this.ivImageTitle.getHeight());
            RVLogger.d(TAG, sb2.toString());
        }
    }

    public void setImgTitle(Bitmap bitmap, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.ivImageTitle.setContentDescription(str);
        }
        setImgTitle(bitmap);
    }

    public void showCloseButton(boolean z) {
        TextView textView;
        this.h = z;
        this.btClose.setVisibility(z ? 0 : 8);
        if (z && (textView = this.btBackToHome) != null) {
            textView.setVisibility(8);
        }
        b();
        a();
    }

    public void showBackButton(boolean z) {
        TextView textView;
        int i2 = 0;
        this.backContainer.setVisibility(z ? 0 : 8);
        TextView textView2 = this.btBack;
        if (!z) {
            i2 = 8;
        }
        textView2.setVisibility(i2);
        if (z && (textView = this.btBackToHome) != null) {
            textView.setVisibility(8);
        }
        b();
        a();
    }

    private void a() {
        if (this.btBack.getVisibility() == 0) {
            if (this.h) {
                a(12);
            } else {
                a(0);
            }
        } else if (this.h) {
            a(12);
        } else {
            a(16);
        }
    }

    private void a(int i2) {
        ((RelativeLayout.LayoutParams) this.rlTitle.getLayoutParams()).setMargins(DimensionUtil.dip2px(this.g, (float) i2), 0, 0, 0);
    }

    private void b() {
        if (this.h) {
            if (this.btBack.getVisibility() == 0) {
                b(0);
            } else {
                b(16);
            }
        }
    }

    private void b(int i2) {
        ((RelativeLayout.LayoutParams) this.btClose.getLayoutParams()).setMargins(DimensionUtil.dip2px(this.g, (float) i2), 0, 0, 0);
    }

    public void showOptionMenu(boolean z) {
        if (z) {
            int i2 = this.b;
            if (i2 == 1) {
                this.h5NavOptions.setVisibility(0);
            } else if (i2 == 2) {
                this.h5NavOptions.setVisibility(0);
                this.h5NavOptions1.setVisibility(0);
            }
        } else {
            this.h5NavOptions.setVisibility(8);
            this.h5NavOptions1.setVisibility(8);
        }
    }

    public void setOptionType(TitleView.OptionType optionType) {
        setOptionType(optionType, 0, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOptionType(com.alibaba.griver.ui.titlebar.TitleView.OptionType r4, int r5, boolean r6) {
        /*
            r3 = this;
            com.alibaba.griver.ui.titlebar.TitleView$OptionType r0 = com.alibaba.griver.ui.titlebar.TitleView.OptionType.ICON
            r1 = 1
            r2 = 0
            if (r4 != r0) goto L_0x000a
            r4 = 1
        L_0x0007:
            r0 = 0
        L_0x0008:
            r1 = 0
            goto L_0x001a
        L_0x000a:
            com.alibaba.griver.ui.titlebar.TitleView$OptionType r0 = com.alibaba.griver.ui.titlebar.TitleView.OptionType.TEXT
            if (r4 != r0) goto L_0x0011
            r4 = 0
            r0 = 0
            goto L_0x001a
        L_0x0011:
            com.alibaba.griver.ui.titlebar.TitleView$OptionType r0 = com.alibaba.griver.ui.titlebar.TitleView.OptionType.MENU
            if (r4 != r0) goto L_0x0018
            r4 = 0
            r0 = 1
            goto L_0x0008
        L_0x0018:
            r4 = 0
            goto L_0x0007
        L_0x001a:
            if (r1 == 0) goto L_0x001e
            r1 = 0
            goto L_0x0020
        L_0x001e:
            r1 = 8
        L_0x0020:
            r3.a(r5, r1, r6)
            r1 = 4
            if (r4 == 0) goto L_0x0028
            r4 = 0
            goto L_0x0029
        L_0x0028:
            r4 = 4
        L_0x0029:
            r3.b(r5, r4, r6)
            if (r0 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r2 = 4
        L_0x0030:
            r3.c(r5, r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.titlebar.NebulaTitleView.setOptionType(com.alibaba.griver.ui.titlebar.TitleView$OptionType, int, boolean):void");
    }

    public void showTitleLoading(boolean z) {
        H5ViewStubUtil.setViewVisibility(this.contentView, R.id.h5_nav_loading_stub, R.id.h5_nav_loading, z ? 0 : 8);
        if (z) {
            Drawable drawable = this.g.getResources().getDrawable(this.c);
            int dip2px = DimensionUtil.dip2px(this.g, 17.0f);
            drawable.setBounds(0, 0, dip2px, dip2px);
            ((ProgressBar) H5ViewStubUtil.getView(this.contentView, R.id.h5_nav_loading_stub, R.id.h5_nav_loading)).setIndeterminateDrawable(drawable);
        }
    }

    public void showTitleDisclaimer(boolean z) {
        TextView textView = this.disClaimer;
        if (textView == null) {
            return;
        }
        if (z) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    public void setPage(Page page) {
        this.e = page;
    }

    public View getContentView() {
        return this.contentView;
    }

    public ColorDrawable getContentBackgroundView() {
        return this.contentView.getContentBgView();
    }

    public TextView getMainTitleView() {
        return this.tvTitle;
    }

    public TextView getSubTitleView() {
        return this.tvSubtitle;
    }

    public void onClick(View view) {
        RVLogger.d(TAG, "onClick ".concat(String.valueOf(view)));
        if (this.e != null) {
            if (view.equals(this.btBack)) {
                try {
                    InputMethodManager inputMethodManager = (InputMethodManager) GriverEnv.getApplicationContext().getSystemService("input_method");
                    if (inputMethodManager != null && inputMethodManager.isActive()) {
                        GriverLogger.d(TAG, "hide soft input");
                        inputMethodManager.hideSoftInputFromWindow(this.btBack.getApplicationWindowToken(), 0);
                    }
                } catch (Exception e2) {
                    GriverLogger.e(TAG, "get input service failed", e2);
                }
                ExtensionPoint.as(BackPressedPoint.class).node(this.e).create().handleBackPressed(this.e);
            } else if (view.equals(this.btClose)) {
                ExtensionPoint.as(TitleBarCloseClickPoint.class).node(this.e).create().onCloseClick();
            } else if (view.equals(this.btIcon) || view.equals(this.btText)) {
                ExtensionPoint.as(TitleBarOptionClickPoint.class).node(this.e).create().onOptionClick(0, false);
            } else if (view.equals(this.btIcon1) || view.equals(this.btText1)) {
                ExtensionPoint.as(TitleBarOptionClickPoint.class).node(this.e).create().onOptionClick(1, false);
            } else if (view.equals(this.btMenu) || view.equals(this.btMenu1)) {
                ExtensionPoint.as(TitleBarOptionClickPoint.class).node(this.e).create().onOptionClick(view.equals(this.btMenu) ^ true ? 1 : 0, true);
            } else if (view.equals(this.tvTitle) || view.equals(this.ivImageTitle)) {
                ExtensionPoint.as(TitleBarTitleClickPoint.class).node(this.e).create().onTitleClick();
            } else if (view.equals(this.tvSubtitle)) {
                ExtensionPoint.as(TitleBarTitleClickPoint.class).node(this.e).create().onSubTitleClick();
            } else if (view.equals(this.disClaimer)) {
                ExtensionPoint.as(TitleBarDisclaimerClickPoint.class).node(this.e).create().onDisclaimerClick();
            }
            if (view.equals(this.btIcon) || view.equals(this.btText) || view.equals(this.btMenu)) {
                this.btDotView.setVisibility(8);
            }
            if (view.equals(this.btIcon1) || view.equals(this.btText1) || view.equals(this.btMenu1)) {
                this.btDotView1.setVisibility(8);
            }
        }
    }

    public void setOptionMenu(String str, String str2, String str3, boolean z, String str4, boolean z2, JSONArray jSONArray, String str5, String str6, String str7) {
        JSONArray jSONArray2 = jSONArray;
        boolean equals = TextUtils.equals("tiny", str7);
        if (!z || equals) {
            int i2 = 2;
            if (jSONArray2 != null && !jSONArray.isEmpty()) {
                this.b = 0;
                String str8 = "icontype";
                String str9 = "icon";
                String str10 = "title";
                if (!z2 || equals) {
                    this.b = 2;
                    JSONObject jSONObject = jSONArray2.getJSONObject(0);
                    a(JSONUtils.getString(jSONObject, str10), JSONUtils.getString(jSONObject, str9), JSONUtils.getString(jSONObject, str8), JSONUtils.getString(jSONObject, "redDot", "-1"), JSONUtils.getString(jSONObject, "contentDesc"), JSONUtils.getString(jSONObject, "color"), 1);
                    return;
                }
                if (jSONArray.size() <= 2) {
                    i2 = jSONArray.size();
                }
                int i3 = 0;
                while (i3 < i2) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i3);
                    int i4 = i3;
                    a(JSONUtils.getString(jSONObject2, str10), JSONUtils.getString(jSONObject2, str9), JSONUtils.getString(jSONObject2, str8), JSONUtils.getString(jSONObject2, "redDot", "-1"), JSONUtils.getString(jSONObject2, "contentDesc"), JSONUtils.getString(jSONObject2, "color"), i4);
                    this.b++;
                    i3 = i4 + 1;
                    str10 = str10;
                    str9 = str9;
                    str8 = str8;
                }
            } else if (equals) {
                a(str, str2, str5, str3, str6, str4, 1);
                this.b = 2;
            } else {
                a(str, str2, str5, str3, str6, str4, 0);
                this.b = 1;
            }
        } else {
            this.h5NavOptions1.setVisibility(8);
            b(1, 8);
            setOptionType(TitleView.OptionType.MENU, 0, true);
            this.b = 1;
        }
    }

    private void a(String str, String str2, String str3, String str4, String str5, String str6, int i2) {
        int i3 = -15692055;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i3 = Color.parseColor(str6);
            } catch (Throwable unused) {
            }
            this.btTextList.get(i2).setTextColor(-16777216 | i3);
        } else {
            this.btTextList.get(i2).setTextColor(-15692055);
        }
        int i4 = 8;
        if (!TextUtils.isEmpty(str)) {
            this.btDotViewList.get(i2).setVisibility(8);
            String trim = str.trim();
            this.btTextList.get(i2).setText(trim);
            setOptionType(TitleView.OptionType.TEXT, i2, true);
            this.btTextList.get(i2).setContentDescription(trim);
        } else if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            this.btDotViewList.get(i2).setVisibility(8);
            if (!TextUtils.isEmpty(str5)) {
                this.btIconList.get(i2).setContentDescription(str5);
            }
        }
        int i5 = -1;
        try {
            i5 = Integer.parseInt(str4);
        } catch (NumberFormatException unused2) {
        }
        if (i5 >= 0) {
            i4 = 0;
        }
        this.btDotViewList.get(i2).setVisibility(i4);
        c(i2, i5);
    }

    private void c(int i2, int i3) {
        String str;
        if (this.f10634a[i2] == TitleView.OptionType.MENU) {
            RVLogger.debug(TAG, "adjust menu");
        } else if (this.f10634a[i2] == TitleView.OptionType.ICON) {
            RVLogger.debug(TAG, "adjust icon");
        } else if (this.f10634a[i2] == TitleView.OptionType.TEXT) {
            RVLogger.debug(TAG, "adjust text");
            if (i3 == 0) {
                this.dotImageList.get(i2).setPadding(0, DimensionUtil.dip2px(this.g, 7.8f), DimensionUtil.dip2px(this.g, 6.0f), 0);
            }
        }
        if (i3 == 0) {
            this.dotImageList.get(i2).setVisibility(0);
            this.dotTextList.get(i2).setVisibility(8);
        } else if (i3 > 0) {
            this.dotTextList.get(i2).setVisibility(0);
            this.dotImageList.get(i2).setVisibility(8);
            if (i3 > 99) {
                str = "···";
            } else {
                str = String.valueOf(i3);
            }
            TextView textView = this.dotTextList.get(i2);
            textView.setText(str);
            if (i3 >= 10) {
                textView.setTextSize(10.0f);
            } else {
                textView.setTextSize(12.0f);
            }
        }
    }

    public View getDivider() {
        return this.f;
    }

    public View getPopAnchor() {
        return this.btMenu;
    }

    public void resetTitleColor(int i2) {
        H5TitleBarFrameLayout h5TitleBarFrameLayout = this.contentView;
        if (h5TitleBarFrameLayout != null) {
            h5TitleBarFrameLayout.getContentBgView().setColor(i2);
        }
    }

    public void switchTheme(Theme theme) {
        if (Theme.BLUE == theme) {
            this.k = Theme.BLUE;
            switchToBlueTheme();
            return;
        }
        this.k = Theme.WHITE;
        switchToWhiteTheme();
    }

    public void switchToWhiteTheme() {
        RVLogger.d(TAG, "switchToWhiteTheme");
        this.tvTitle.setTextColor(-1);
        this.tvSubtitle.setTextColor(-1);
        if (this.btText.getCurrentTextColor() == -15692055) {
            this.btText.setTextColor(-1);
        }
        if (this.btText1.getCurrentTextColor() == -15692055) {
            this.btText1.setTextColor(-1);
        }
        this.btBack.setTextColor(StateListUtils.getStateColor(-1));
        this.btClose.setTextColor(StateListUtils.getStateColor(-1));
        this.btMenu.setTextColor(StateListUtils.getStateColor(-1));
        this.btMenu1.setTextColor(StateListUtils.getStateColor(-1));
        this.disClaimer.setTextColor(StateListUtils.getStateColor(-1));
        this.c = R.drawable.griver_ui_title_bar_progress_white;
    }

    public void switchToBlueTheme() {
        RVLogger.d(TAG, "switchToWhiteTheme");
        this.tvTitle.setTextColor(-15658735);
        this.tvSubtitle.setTextColor(-15658735);
        if (this.btText.getCurrentTextColor() == -1) {
            this.btText.setTextColor(-15692055);
        }
        if (this.btText1.getCurrentTextColor() == -1) {
            this.btText1.setTextColor(-15692055);
        }
        this.btBack.setTextColor(StateListUtils.getStateColor(-15692055));
        this.btClose.setTextColor(StateListUtils.getStateColor(-15692055));
        this.btMenu.setTextColor(StateListUtils.getStateColor(-15692055));
        this.btMenu1.setTextColor(StateListUtils.getStateColor(-15692055));
        this.disClaimer.setTextColor(StateListUtils.getStateColor(-6710887));
        this.c = R.drawable.griver_ui_title_bar_progress;
    }

    public void switchToCustomTheme(int i2) {
        RVLogger.d(TAG, "switchToCustomTheme");
        int i3 = i2 | -16777216;
        this.tvTitle.setTextColor(i3);
        this.tvSubtitle.setTextColor(i3);
        this.btText.setTextColor(i3);
        this.btText1.setTextColor(i3);
        this.btBack.setTextColor(StateListUtils.getStateColor(i3));
        this.btClose.setTextColor(StateListUtils.getStateColor(i3));
        this.btMenu.setTextColor(StateListUtils.getStateColor(i3));
        this.btMenu1.setTextColor(StateListUtils.getStateColor(i3));
        this.disClaimer.setTextColor(StateListUtils.getStateColor(i3));
        this.btBackToHome.setTextColor(StateListUtils.getStateColor(i3));
    }

    public void releaseViewList() {
        List<View> list = this.h5NavOptionsList;
        if (list != null) {
            list.clear();
        }
        List<View> list2 = this.btDotViewList;
        if (list2 != null) {
            list2.clear();
        }
        List<ImageButton> list3 = this.btIconList;
        if (list3 != null) {
            list3.clear();
        }
        List<TextView> list4 = this.btTextList;
        if (list4 != null) {
            list4.clear();
        }
        List<TextView> list5 = this.btMenuList;
        if (list5 != null) {
            list5.clear();
        }
        List<ImageView> list6 = this.dotImageList;
        if (list6 != null) {
            list6.clear();
        }
        List<TextView> list7 = this.dotTextList;
        if (list7 != null) {
            list7.clear();
        }
    }

    public void openTranslucentStatusBarSupport(int i2) {
        int statusBarHeight;
        if (StatusBarUtils.isSupport() && (statusBarHeight = StatusBarUtils.getStatusBarHeight(this.g)) != 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.d.getLayoutParams();
            layoutParams.height = statusBarHeight;
            this.d.setLayoutParams(layoutParams);
            this.d.setVisibility(0);
            try {
                StatusBarUtils.setTransparentColor((Activity) this.g, i2);
            } catch (Exception e2) {
                RVLogger.e(TAG, (Throwable) e2);
            }
            int dip2px = DensityUtil.dip2px(this.g, 48.0f) + statusBarHeight;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.l.getLayoutParams();
            layoutParams2.height = dip2px;
            this.l.setLayoutParams(layoutParams2);
        }
    }

    public void setBackCloseButtonImage(String str) {
        if ("yellow".equalsIgnoreCase(str)) {
            this.btBack.setTextColor(StateListUtils.getStateColor(-2109303));
            this.btClose.setTextColor(StateListUtils.getStateColor(-2109303));
            this.c = R.drawable.griver_ui_title_bar_progress_gold;
        }
        if ("black".equalsIgnoreCase(str)) {
            this.btBack.setTextColor(StateListUtils.getStateColor(-16777216));
            this.btClose.setTextColor(StateListUtils.getStateColor(-16777216));
            this.c = R.drawable.griver_ui_title_bar_progress;
        }
    }

    public void setBackCloseButtonImage(String str, Bundle bundle) {
        if ("yellow".equalsIgnoreCase(str)) {
            this.btBack.setTextColor(StateListUtils.getStateColor(-2109303));
            this.btClose.setTextColor(StateListUtils.getStateColor(-2109303));
            setOptionMenuColor(-2109303);
            this.c = R.drawable.griver_ui_title_bar_progress_gold;
        }
        if ("black".equalsIgnoreCase(str)) {
            this.btBack.setTextColor(StateListUtils.getStateColor(-16777216));
            this.btClose.setTextColor(StateListUtils.getStateColor(-16777216));
            setOptionMenuColor(-16777216);
            this.c = R.drawable.griver_ui_title_bar_progress;
        }
        if (SchedulerSupport.CUSTOM.equalsIgnoreCase(str)) {
            setBackHomeButtonColor(BundleUtils.getInt(bundle, GriverLaunchParams.BACK_HOME_BUTTON_COLOR, -15692055));
            setBackButtonColor(BundleUtils.getInt(bundle, "backButtonColor", -15692055));
            setCloseButtonColor(BundleUtils.getInt(bundle, "closeButtonColor", -15692055));
            setOptionMenuColor(BundleUtils.getInt(bundle, "optionMenuColor", -15692055));
        }
    }

    public void setBackButtonColor(int i2) {
        a(this.btBack, i2);
    }

    public void setCloseButtonColor(int i2) {
        a(this.btClose, i2);
    }

    public void setTitleLoading(int i2) {
        try {
            this.g.getResources().getDrawable(i2);
            this.c = i2;
        } catch (Exception unused) {
            GriverLogger.w(TAG, "get drawable resource failed, do not set to progress loading: ".concat(String.valueOf(i2)));
        }
    }

    public void setBackHomeButtonColor(int i2) {
        a(this.btBackToHome, i2);
    }

    public void setOptionMenuColor(int i2) {
        a(this.btMenu, i2);
        a(this.btMenu1, i2);
        a(this.btText, i2);
        a(this.btText1, i2);
    }

    public void setTitleBackgroundImage(int i2) {
        if (this.l != null && this.g != null) {
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    this.l.setBackground(this.g.getResources().getDrawable(i2));
                } else {
                    this.l.setBackgroundDrawable(this.g.getResources().getDrawable(i2));
                }
            } catch (Exception e2) {
                GriverLogger.e(TAG, "set title background image exception", e2);
            }
        }
    }

    private void a(TextView textView, int i2) {
        if (textView != null) {
            try {
                textView.setTextColor(StateListUtils.getStateColor(i2 | -16777216));
            } catch (Exception unused) {
                GriverLogger.e(TAG, "set color for view failed: ".concat(String.valueOf(textView)));
            }
        }
    }

    public void setTitleTextColor(int i2) {
        RVLogger.d(TAG, "setTitleTextColor: ".concat(String.valueOf(i2)));
        int i3 = i2 | -16777216;
        this.tvTitle.setTextColor(i3);
        this.tvSubtitle.setTextColor(i3);
    }

    public View getOptionMenuContainer() {
        return this.h5NavOptions;
    }

    public void setTitleView(View view) {
        if (view == null) {
            ViewGroup viewGroup = this.i;
            if (viewGroup != null) {
                this.rlTitle.removeView(viewGroup);
                this.llTitle.setVisibility(0);
                this.i.removeAllViews();
                this.i = null;
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 == null) {
            this.i = new LinearLayout(this.g);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(15);
            this.rlTitle.addView(this.i, layoutParams);
        } else {
            viewGroup2.removeAllViews();
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        }
        this.i.addView(view, layoutParams2);
        this.llTitle.setVisibility(4);
    }

    public void enableTitleSegControl(boolean z) {
        this.j.setEnabled(z);
    }

    public void initTitleSegControl(JSONObject jSONObject) {
        Integer[] numArr;
        int i2 = JSONUtils.getInt(jSONObject, "segSelectedIndex");
        JSONArray jSONArray = jSONObject.getJSONArray("segWidths");
        JSONArray jSONArray2 = jSONObject.getJSONArray("segTitles");
        int i3 = JSONUtils.getInt(jSONObject, "segColorNormal");
        int i4 = JSONUtils.getInt(jSONObject, "segColorActive");
        if (jSONArray == null || jSONArray.isEmpty() || jSONArray2 == null || jSONArray2.isEmpty()) {
            RVLogger.d(TAG, "SegWidth or  segTitles is empty)");
        } else {
            String[] strArr = null;
            try {
                numArr = (Integer[]) jSONArray.toArray(new Integer[1]);
                try {
                    strArr = (String[]) jSONArray2.toArray(new String[1]);
                } catch (Exception e2) {
                    e = e2;
                    RVLogger.w(TAG, "segtitle or width is not right type", e);
                    this.j.setSegmentColor(i3, i4);
                    this.j.addItems(strArr, numArr);
                    this.j.setDefaultChecked(i2);
                    this.j.setVisibility(0);
                    this.j.setEnabled(false);
                }
            } catch (Exception e3) {
                e = e3;
                numArr = null;
                RVLogger.w(TAG, "segtitle or width is not right type", e);
                this.j.setSegmentColor(i3, i4);
                this.j.addItems(strArr, numArr);
                this.j.setDefaultChecked(i2);
                this.j.setVisibility(0);
                this.j.setEnabled(false);
            }
            if (!(numArr == null || strArr == null || numArr.length != strArr.length)) {
                this.j.setSegmentColor(i3, i4);
                this.j.addItems(strArr, numArr);
                this.j.setDefaultChecked(i2);
                this.j.setVisibility(0);
            }
        }
        this.j.setEnabled(false);
    }

    public void onCheckedChanged(RadioGroup radioGroup, int i2) {
        if (radioGroup == this.j) {
            ExtensionPoint.as(TitleBarSegCheckPoint.class).node(this.e).create().onSegItemChecked(i2);
        }
    }

    public void performLastSegItemChecked(boolean z) {
        this.j.performLastItemChecked(z);
    }
}
