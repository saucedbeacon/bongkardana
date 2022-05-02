package com.alibaba.griver.ui.container;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.alibaba.ariver.app.api.ui.StatusBarUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class GriverRootView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private String f10578a = "H5FragmentRootView@";
    private boolean b = false;
    private boolean c = false;
    private int d = 0;
    private int e = 0;

    public GriverRootView(Context context) {
        super(context);
    }

    public GriverRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GriverRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void init(Context context, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10578a);
        sb.append(hashCode());
        String obj = sb.toString();
        this.f10578a = obj;
        if (z) {
            RVLogger.d(obj, "disable mEnableNewAdjustInput by fullScreen.");
            this.b = false;
        }
        String str = this.f10578a;
        StringBuilder sb2 = new StringBuilder("mEnableNewAdjustInput: ");
        sb2.append(this.b);
        RVLogger.d(str, sb2.toString());
        if (this.b) {
            this.e = StatusBarUtils.getStatusBarHeight(context);
            setFitsSystemWindows(true);
            if (context instanceof Activity) {
                ((Activity) context).getWindow().setSoftInputMode(16);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b) {
            String str = this.f10578a;
            StringBuilder sb = new StringBuilder("onAttachedToWindow mNeedRestoreWindowInsets: ");
            sb.append(this.c);
            RVLogger.d(str, sb.toString());
            if (this.c) {
                a();
                this.c = false;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.b) {
            String str = this.f10578a;
            StringBuilder sb = new StringBuilder("onDetachedFromWindow mWindowInsetBottom: ");
            sb.append(this.d);
            RVLogger.d(str, sb.toString());
            if (this.d > 0) {
                this.c = true;
            }
        }
    }

    private void a() {
        if (Build.VERSION.SDK_INT > 19) {
            requestApplyInsets();
        } else if (Build.VERSION.SDK_INT >= 16) {
            requestFitSystemWindows();
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        if (!this.b) {
            return super.onApplyWindowInsets(windowInsets);
        }
        if (Build.VERSION.SDK_INT > 19) {
            int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop() - this.e;
            if (systemWindowInsetTop < 0) {
                systemWindowInsetTop = 0;
            }
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            int systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
            int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            this.d = systemWindowInsetBottom;
            windowInsets2 = windowInsets.replaceSystemWindowInsets(systemWindowInsetLeft, systemWindowInsetTop, systemWindowInsetRight, systemWindowInsetBottom);
        } else {
            windowInsets2 = windowInsets;
        }
        String str = this.f10578a;
        StringBuilder sb = new StringBuilder("onApplyWindowInsets, before: ");
        sb.append(windowInsets);
        sb.append(", after: ");
        sb.append(windowInsets2);
        RVLogger.d(str, sb.toString());
        return super.onApplyWindowInsets(windowInsets2);
    }
}
