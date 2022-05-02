package com.alibaba.griver.core.utils;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private View f9196a;
    private int b;
    private FrameLayout.LayoutParams c;
    private int d;
    private NavigationBarUtil e;
    private Rect f = new Rect();

    public static void a(Activity activity, boolean z) {
        try {
            new a(activity, z);
        } catch (Throwable th) {
            GriverLogger.e("H5AndroidBug5497Workaround", "assistActivity failed", th);
        }
    }

    private a(Activity activity, final boolean z) {
        this.e = new NavigationBarUtil(activity);
        this.f9196a = ((FrameLayout) activity.findViewById(16908290)).getChildAt(0);
        try {
            this.d = activity.getResources().getDimensionPixelSize(activity.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        } catch (Throwable th) {
            GriverLogger.e("H5AndroidBug5497Workaround", "construct AndroidBug5497Workaround failed", th);
        }
        this.f9196a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                try {
                    a.this.a(z);
                } catch (Throwable th) {
                    GriverLogger.e("H5AndroidBug5497Workaround", "get view tree observer failed", th);
                }
            }
        });
        this.c = (FrameLayout.LayoutParams) this.f9196a.getLayoutParams();
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        int height;
        int i;
        int a2 = a();
        if (a2 != this.b && (i = height - a2) >= 0) {
            StringBuilder sb = new StringBuilder("heightDifference ");
            sb.append(i);
            sb.append(" usableHeightSansKeyboard ");
            sb.append((height = this.f9196a.getRootView().getHeight()));
            sb.append(" statusBarHeight:");
            sb.append(this.d);
            sb.append(" hasNavigationBar ");
            sb.append(this.e.a());
            sb.append(" NavigationBarHeight ");
            sb.append(this.e.b());
            GriverLogger.d("H5AndroidBug5497Workaround", sb.toString());
            if (i > height / 4) {
                if (!h.a() || !h.b() || z) {
                    this.c.height = height - i;
                    if (h.a()) {
                        this.c.topMargin = this.d;
                    }
                } else {
                    this.c.height = (height - i) + this.d;
                }
            } else if (!h.a() || !h.b() || z) {
                this.c.height = height - this.d;
                if (h.a()) {
                    this.c.topMargin = this.d;
                }
            } else {
                this.c.height = height;
                if (this.e.a()) {
                    this.c.height -= this.e.b();
                }
            }
            this.f9196a.requestLayout();
            this.b = a2;
        }
    }

    private int a() {
        this.f9196a.getWindowVisibleDisplayFrame(this.f);
        return this.f.bottom - this.f.top;
    }
}
