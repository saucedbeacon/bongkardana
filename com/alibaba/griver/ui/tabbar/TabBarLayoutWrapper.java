package com.alibaba.griver.ui.tabbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarItemModel;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarModel;
import com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.engine.api.resources.ResourceLoadPoint;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.ImageUtil;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.base.common.adapter.ImageListener;
import com.alibaba.griver.base.common.utils.DensityUtil;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.tabbar.TabBarLayout;
import com.alibaba.griver.ui.utils.NebulaTabbarUtils;

public class TabBarLayoutWrapper {
    public static final String TAG = "TabBarLayoutWrapper";

    /* renamed from: a  reason: collision with root package name */
    private TabBarLayout f10626a;
    private LinearLayout b;
    private String c;
    /* access modifiers changed from: private */
    public App d;
    private View e;
    /* access modifiers changed from: private */
    public Activity f;

    public TabBarLayoutWrapper(App app, Activity activity, ViewGroup viewGroup) {
        this.d = app;
        this.f = activity;
        LinearLayout linearLayout = new LinearLayout(activity);
        this.b = linearLayout;
        linearLayout.setId(R.id.griver_tabrootview);
        this.b.setOrientation(1);
        viewGroup.addView(this.b, new ViewGroup.LayoutParams(-1, activity.getResources().getDimensionPixelSize(R.dimen.griver_tabbar_height)));
    }

    /* access modifiers changed from: package-private */
    public void setSelectedIndex(int i) {
        TabBarLayout tabBarLayout = this.f10626a;
        if (tabBarLayout != null) {
            tabBarLayout.selectTab(i);
        } else {
            RVLogger.e(TAG, "setSelectedIndex but tabHost not null!!!");
        }
    }

    /* access modifiers changed from: package-private */
    public void clearAllTabs() {
        this.f10626a.removeAllViews();
    }

    /* access modifiers changed from: package-private */
    public void init(TabBarModel tabBarModel) {
        this.b.removeAllViews();
        TabBarLayout tabBarLayout = new TabBarLayout(this.f);
        this.f10626a = tabBarLayout;
        tabBarLayout.setId(R.id.griver_tabhost);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        View view = new View(this.f);
        this.e = view;
        view.setBackgroundColor(-5526610);
        this.b.addView(this.e, layoutParams);
        this.b.addView(this.f10626a, new LinearLayout.LayoutParams(-1, -1));
        this.c = "default";
        long backgroundColor = tabBarModel.getBackgroundColor();
        if (backgroundColor <= 16777215) {
            backgroundColor |= -16777216;
        }
        this.f10626a.setBackgroundColor((int) backgroundColor);
    }

    /* access modifiers changed from: package-private */
    public void changeTabBarStyle(TabBarModel tabBarModel, @Nullable Integer num) {
        if (num != null) {
            this.e.setBackgroundColor(num.intValue());
        }
        if (tabBarModel != null) {
            this.f10626a.setBackgroundColor((int) tabBarModel.getBackgroundColor());
            int childCount = this.f10626a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ((TextView) this.f10626a.getChildAt(i).findViewById(R.id.h5_tabbaritem_txticon)).setTextColor(NebulaTabbarUtils.generateTextColor(tabBarModel.getTextColor().intValue(), tabBarModel.getSelectedColor().intValue()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onInflateTab(int i, final TabBarLayout.H5TabListener h5TabListener) {
        this.f10626a.selectTab(i);
        this.f10626a.setTabListener(new TabBarLayout.H5TabListener() {
            public void onTabItemClicked(int i, View view) {
                h5TabListener.onTabItemClicked(i, view);
            }
        });
    }

    public ViewGroup getContent() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public void createDefaultTabBar(int i) {
        LinearLayout linearLayout = new LinearLayout(this.f);
        linearLayout.setOrientation(1);
        TabBarLayout tabBarLayout = new TabBarLayout(this.f);
        int i2 = 0;
        while (i2 < i && i2 < 5) {
            TabBarItem tabBarItem = new TabBarItem(this.f);
            TextView textView = (TextView) tabBarItem.getIconAreaView();
            textView.setText("".trim());
            Drawable drawable = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getResources((String) null).getDrawable(R.drawable.griver_ui_sessiontab_defaultitem);
            int iconSize = getIconSize();
            drawable.setBounds(0, 0, iconSize, iconSize);
            textView.setCompoundDrawables((Drawable) null, drawable, (Drawable) null, (Drawable) null);
            tabBarLayout.addTab(tabBarItem.getRootView());
            i2++;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        View view = new View(this.f);
        view.setBackgroundColor(-5526610);
        linearLayout.addView(view, layoutParams);
        tabBarLayout.setBackgroundColor(-460551);
        linearLayout.addView(tabBarLayout, new LinearLayout.LayoutParams(-1, -1));
        this.b.addView(linearLayout, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* access modifiers changed from: package-private */
    public void addTabItem(int i, TabBarModel tabBarModel, TabBarItemModel tabBarItemModel) {
        if (tabBarItemModel != null) {
            String name = tabBarItemModel.getName();
            String tag = tabBarItemModel.getTag();
            String icon = tabBarItemModel.getIcon();
            String activeIcon = tabBarItemModel.getActiveIcon();
            TabBarItem tabBarItem = new TabBarItem(this.f);
            tabBarItem.setTag(tag);
            TextView textView = (TextView) tabBarItem.getIconAreaView();
            textView.setText(name);
            Integer textColor = tabBarItemModel.getTextColor() == null ? tabBarModel.getTextColor() : tabBarItemModel.getTextColor();
            if (textColor == null) {
                textColor = -16777216;
            }
            Integer selectedColor = tabBarItemModel.getSelectedColor() == null ? tabBarModel.getSelectedColor() : tabBarItemModel.getSelectedColor();
            if (selectedColor == null) {
                selectedColor = -16777216;
            }
            textView.setTextColor(NebulaTabbarUtils.generateTextColor(textColor.intValue(), selectedColor.intValue()));
            StateListDrawable generateEmptyTopDrawable = NebulaTabbarUtils.generateEmptyTopDrawable();
            int iconSize = getIconSize();
            generateEmptyTopDrawable.setBounds(0, 0, iconSize, iconSize);
            a(activeIcon, textView, generateEmptyTopDrawable, this.f, iconSize, true);
            a(icon, textView, generateEmptyTopDrawable, this.f, iconSize, false);
            this.f10626a.addTab(i, tabBarItem.getRootView());
        }
    }

    public void reset() {
        TabBarLayout tabBarLayout = this.f10626a;
        if (tabBarLayout != null) {
            tabBarLayout.removeAllViews();
        } else {
            RVLogger.w(TAG, "reset but mTabHost == null!!");
        }
    }

    public void clearBadge(int i) {
        View childAt = this.f10626a.getChildAt(i);
        TextView textView = (TextView) childAt.findViewById(R.id.h5_tabbaritem_badge);
        if (textView != null) {
            textView.setVisibility(8);
        }
        DotView dotView = (DotView) childAt.findViewById(R.id.h5_tabbaritem_dotView);
        if (dotView != null) {
            dotView.setVisibility(8);
        }
    }

    public void setTabBadge(int i, String str, int i2, int i3) {
        RVLogger.d(TAG, "setTabBadge ");
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        if (this.f10626a != null) {
            RVLogger.d(TAG, "setTabBadge value is ".concat(String.valueOf(str)));
            View childAt = this.f10626a.getChildAt(i);
            final TextView textView = (TextView) childAt.findViewById(R.id.h5_tabbaritem_badge);
            DotView dotView = (DotView) childAt.findViewById(R.id.h5_tabbaritem_dotView);
            if (!TextUtils.isEmpty(str)) {
                String trim = str.trim();
                if (!TextUtils.equals("-1", trim)) {
                    if (TextUtils.equals("0", trim)) {
                        textView.setVisibility(8);
                        dotView.setDotColor(i3);
                        dotView.setDotWidth(i2);
                        dotView.setVisibility(0);
                        return;
                    }
                    if (trim.length() > 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(trim.substring(0, 2));
                        sb.append("...");
                        trim = sb.toString();
                    }
                    textView.setText(trim);
                    textView.setVisibility(0);
                    dotView.setVisibility(8);
                    textView.post(new Runnable() {
                        public void run() {
                            int measuredWidth = textView.getMeasuredWidth();
                            if (measuredWidth < DensityUtil.dip2px(TabBarLayoutWrapper.this.f, 20.0f)) {
                                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                                layoutParams.height = measuredWidth;
                                textView.setLayoutParams(layoutParams);
                            }
                        }
                    });
                    return;
                }
            }
            textView.setVisibility(8);
            dotView.setVisibility(8);
        }
    }

    public void removeTabBadge(int i) {
        RVLogger.d(TAG, "removeTabBadge ");
        TabBarLayout tabBarLayout = this.f10626a;
        if (tabBarLayout != null) {
            View childAt = tabBarLayout.getChildAt(i);
            ((TextView) childAt.findViewById(R.id.h5_tabbaritem_badge)).setVisibility(8);
            ((DotView) childAt.findViewById(R.id.h5_tabbaritem_dotView)).setVisibility(8);
        }
    }

    public void setTabBarItem(int i, TabBarModel tabBarModel, TabBarItemModel tabBarItemModel) {
        String str;
        RVLogger.d(TAG, "setTabBarItem ");
        Bundle startParams = this.d.getStartParams();
        String icon = tabBarItemModel.getIcon();
        String activeIcon = tabBarItemModel.getActiveIcon();
        if (this.f10626a != null) {
            try {
                if (ImageUtil.base64ToBitmap(icon) == null) {
                    icon = NebulaTabbarUtils.getAbsoluteUrl(icon, startParams);
                }
            } catch (Throwable unused) {
                icon = NebulaTabbarUtils.getAbsoluteUrl(icon, startParams);
            }
            String str2 = icon;
            try {
                if (ImageUtil.base64ToBitmap(activeIcon) == null) {
                    activeIcon = NebulaTabbarUtils.getAbsoluteUrl(activeIcon, startParams);
                }
                str = activeIcon;
            } catch (Throwable unused2) {
                str = NebulaTabbarUtils.getAbsoluteUrl(activeIcon, startParams);
            }
            StringBuilder sb = new StringBuilder("setTabBarItem iconURL is ");
            sb.append(str2);
            sb.append(", activeIconURL is ");
            sb.append(str);
            RVLogger.d(TAG, sb.toString());
            TextView textView = (TextView) this.f10626a.getChildAt(i).findViewById(R.id.h5_tabbaritem_txticon);
            textView.setText(tabBarItemModel.getName());
            Integer textColor = tabBarItemModel.getTextColor() == null ? tabBarModel.getTextColor() : tabBarItemModel.getTextColor();
            if (textColor == null) {
                textColor = -16777216;
            }
            Integer selectedColor = tabBarItemModel.getSelectedColor() == null ? tabBarModel.getSelectedColor() : tabBarItemModel.getSelectedColor();
            if (selectedColor == null) {
                selectedColor = -16777216;
            }
            textView.setTextColor(NebulaTabbarUtils.generateTextColor(textColor.intValue(), selectedColor.intValue()));
            StateListDrawable generateEmptyTopDrawable = NebulaTabbarUtils.generateEmptyTopDrawable();
            int iconSize = getIconSize();
            generateEmptyTopDrawable.setBounds(0, 0, iconSize, iconSize);
            TextView textView2 = textView;
            StateListDrawable stateListDrawable = generateEmptyTopDrawable;
            int i2 = iconSize;
            a(str, textView2, stateListDrawable, this.f, i2, true);
            a(str2, textView2, stateListDrawable, this.f, i2, false);
        }
    }

    private void a(String str, TextView textView, StateListDrawable stateListDrawable, Context context, int i, boolean z) {
        String str2 = str;
        StateListDrawable stateListDrawable2 = stateListDrawable;
        RVLogger.d(TAG, "loadImageAsync: ".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            boolean z2 = false;
            if (ImageUtil.isBase64Url(str)) {
                Bitmap base64ToBitmap = ImageUtil.base64ToBitmap(str);
                if (base64ToBitmap != null) {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), base64ToBitmap);
                    int i2 = i;
                    bitmapDrawable.setBounds(0, 0, i2, i2);
                    if (z) {
                        NebulaTabbarUtils.addCheckedState(stateListDrawable, bitmapDrawable);
                    } else {
                        NebulaTabbarUtils.addNormalState(stateListDrawable, bitmapDrawable);
                    }
                    TextView textView2 = textView;
                    textView.setCompoundDrawables((Drawable) null, stateListDrawable, (Drawable) null, (Drawable) null);
                    return;
                }
                return;
            }
            TextView textView3 = textView;
            int i3 = i;
            AppModel appModel = (AppModel) this.d.getData(AppModel.class);
            if (appModel != null) {
                String vhost = appModel.getAppInfoModel().getVhost();
                if (str.startsWith("http")) {
                    z2 = str.startsWith(vhost);
                } else {
                    str2 = FileUtils.combinePath(vhost, str);
                    z2 = true;
                }
            }
            String str3 = str2;
            if (!z2) {
                final Context context2 = context;
                final int i4 = i;
                final boolean z3 = z;
                final StateListDrawable stateListDrawable3 = stateListDrawable;
                final TextView textView4 = textView;
                ImageUtils.loadImage(str3, new ImageListener() {
                    public void onImage(Bitmap bitmap) {
                        if (bitmap != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(context2.getResources(), bitmap);
                            int i = i4;
                            bitmapDrawable.setBounds(0, 0, i, i);
                            if (z3) {
                                NebulaTabbarUtils.addCheckedState(stateListDrawable3, bitmapDrawable);
                            } else {
                                NebulaTabbarUtils.addNormalState(stateListDrawable3, bitmapDrawable);
                            }
                            ExecutorUtils.runOnMain(new Runnable() {
                                public void run() {
                                    textView4.setCompoundDrawables((Drawable) null, stateListDrawable3, (Drawable) null, (Drawable) null);
                                }
                            });
                        }
                    }
                });
                return;
            }
            final String str4 = str3;
            final Context context3 = context;
            final int i5 = i;
            final boolean z4 = z;
            final StateListDrawable stateListDrawable4 = stateListDrawable;
            final TextView textView5 = textView;
            ExecutorUtils.execute(ExecutorType.IO, new Runnable() {
                public void run() {
                    Bitmap decodeStream;
                    Resource load = ExtensionPoint.as(ResourceLoadPoint.class).node(TabBarLayoutWrapper.this.d).create().load(ResourceLoadContext.newBuilder().originUrl(str4).canUseFallback(true).build());
                    if (load != null && (decodeStream = BitmapFactory.decodeStream(load.getStream())) != null) {
                        final BitmapDrawable bitmapDrawable = new BitmapDrawable(context3.getResources(), decodeStream);
                        int i = i5;
                        bitmapDrawable.setBounds(0, 0, i, i);
                        ExecutorUtils.runOnMain(new Runnable() {
                            public void run() {
                                if (z4) {
                                    NebulaTabbarUtils.addCheckedState(stateListDrawable4, bitmapDrawable);
                                } else {
                                    NebulaTabbarUtils.addNormalState(stateListDrawable4, bitmapDrawable);
                                }
                                textView5.setCompoundDrawables((Drawable) null, stateListDrawable4, (Drawable) null, (Drawable) null);
                            }
                        });
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public int getIconSize() {
        if (TextUtils.isEmpty(this.c) || !this.c.equalsIgnoreCase("large")) {
            return ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getResources((String) null).getDimensionPixelSize(R.dimen.griver_bottom_height_tab_icon);
        }
        return ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getResources((String) null).getDimensionPixelSize(R.dimen.griver_bottom_height_tab_large_icon);
    }
}
