package com.alibaba.griver.ui.popmenu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.ariver.kernel.common.utils.DimensionUtil;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.utils.DensityUtil;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.text.AUIconView;
import com.alibaba.griver.ui.popmenu.TinyMenuPopupWindow;
import java.util.ArrayList;
import java.util.List;

public class LandScapeTinyMenuPopupWindow extends TinyMenuPopupWindow {

    /* renamed from: a  reason: collision with root package name */
    private int f10589a;
    private int b;
    private FrameLayout c;

    public LandScapeTinyMenuPopupWindow(Context context) {
        super(context);
        this.f10589a = context.getResources().getDimensionPixelSize(R.dimen.griver_ui_menu_landscape_width);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.griver_ui_menu_landscape_recent_app_height);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = (FrameLayout) this.mMenuContent.findViewById(R.id.favorite_and_recent_tiny_app_layout);
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                public void onSystemUiVisibilityChange(int i) {
                    LandScapeTinyMenuPopupWindow.this.b();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        b();
        a();
        this.mFavoriteAndRecentTinyAppList.setVisibility(8);
    }

    public void setRecentUseTinyAppList(List<TinyMenuFunctionModel> list) {
        if (this.mRecentUseList == null) {
            this.mRecentUseList = new ArrayList();
        } else if (list.size() > 10) {
            list = list.subList(0, 10);
        }
        this.mRecentUseList = list;
    }

    private void a() {
        this.c.removeAllViews();
        for (int i = 0; i < this.mRecentUseList.size(); i++) {
            this.c.addView(a(i, (TinyMenuFunctionModel) this.mRecentUseList.get(i)));
        }
    }

    private View a(int i, final TinyMenuFunctionModel tinyMenuFunctionModel) {
        int dip2px = DimensionUtil.dip2px(this.mContext, 45.0f);
        LinearLayout linearLayout = new LinearLayout(this.mContext);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dip2px, dip2px);
        if (tinyMenuFunctionModel.functionType == 0) {
            TinyRoundImageView tinyRoundImageView = new TinyRoundImageView(this.mContext);
            layoutParams.gravity = 17;
            tinyRoundImageView.setRadius(DensityUtil.dip2px(this.mContext, 7.0f));
            tinyRoundImageView.setLayoutParams(layoutParams);
            if (tinyMenuFunctionModel != null) {
                ImageUtils.loadImage(tinyMenuFunctionModel.iconUrl, new TinyMenuPopupWindow.TinyAppImageLoader(tinyRoundImageView));
            }
            linearLayout.addView(tinyRoundImageView);
        } else if (tinyMenuFunctionModel.functionType == 1) {
            AUIconView aUIconView = new AUIconView(this.mContext);
            Resources resources = this.mContext.getResources();
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
        }
        TextView textView = new TextView(this.mContext);
        if (tinyMenuFunctionModel != null) {
            textView.setText(tinyMenuFunctionModel.name);
        }
        textView.setTextSize(11.0f);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setTextColor(Color.parseColor("#3C4550"));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        layoutParams2.setMargins(6, 20, 6, 0);
        linearLayout.addView(textView, layoutParams2);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TinyMenuFunctionModel tinyMenuFunctionModel = tinyMenuFunctionModel;
                if (tinyMenuFunctionModel != null) {
                    if (tinyMenuFunctionModel.functionType == 0) {
                        LandScapeTinyMenuPopupWindow.this.startTinyAppAndCloseCurrent(tinyMenuFunctionModel.appId);
                    } else if (tinyMenuFunctionModel.functionType == 1) {
                        LandScapeTinyMenuPopupWindow.this.startRecentTinyApp();
                    }
                }
                LandScapeTinyMenuPopupWindow.this.doDismissWithAnimation(true);
            }
        });
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(this.f10589a / 5, this.b);
        layoutParams3.topMargin = (i / 5) * this.b;
        layoutParams3.leftMargin = (i % 5) * this.mRecentTinyAppItemWidth;
        linearLayout.setLayoutParams(layoutParams3);
        return linearLayout;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            b();
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        Window window = getWindow();
        if (window != null && Build.VERSION.SDK_INT >= 19) {
            window.getDecorView().setSystemUiVisibility(5894);
        }
    }

    public void showMenu(Context context) {
        RVLogger.d("LandScapeTinyMenuPopupWindow", "landscape showMenu.");
        super.showMenu(context);
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return R.layout.griver_ui_menu_layout_horizontal;
    }

    /* access modifiers changed from: protected */
    public void initWindowManagerLayoutParams(WindowManager.LayoutParams layoutParams) {
        layoutParams.width = this.f10589a;
        layoutParams.height = -1;
        layoutParams.gravity = 5;
        layoutParams.dimAmount = 0.4f;
    }

    /* access modifiers changed from: protected */
    public void initMenuItemWidth(int i) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.mRecentTinyAppItemWidth = Math.round((float) ((this.f10589a - DimensionUtil.dip2px(this.mContext, 4.0f)) / 5));
        this.mMenuItemWidth = (this.f10589a - Math.round((f * 36.0f) + 0.5f)) / 5;
    }

    /* access modifiers changed from: protected */
    public TinyMenuBgDrawable createTinyMenuBackground(Bitmap bitmap) {
        return new TinyMenuBgDrawable(bitmap, bitmap.getWidth() - this.f10589a, 0, bitmap.getWidth(), bitmap.getHeight(), 0, 0, this.f10589a, bitmap.getHeight());
    }

    /* access modifiers changed from: protected */
    public int getShowAnimationId() {
        return R.anim.griver_ui_menu_in_landscape;
    }

    /* access modifiers changed from: protected */
    public int getDismissAnimationId() {
        return R.anim.griver_ui_menu_out_landscape;
    }
}
