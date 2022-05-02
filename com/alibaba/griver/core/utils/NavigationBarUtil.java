package com.alibaba.griver.core.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowInsets;
import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import java.lang.reflect.Method;

public class NavigationBarUtil {
    private static String d;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public boolean f9193a = true;
    private final int b;
    private final boolean c;

    interface OnNavigationStateListener {
        void onNavigationState(boolean z, int i);
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod(ContactEventType.CONTACT_GET, new Class[]{String.class});
                declaredMethod.setAccessible(true);
                d = (String) declaredMethod.invoke((Object) null, new Object[]{"qemu.hw.mainkeys"});
            } catch (Throwable unused) {
                d = null;
            }
        }
    }

    public NavigationBarUtil(Activity activity) {
        boolean z = true;
        this.c = activity.getResources().getConfiguration().orientation != 1 ? false : z;
        this.b = a(activity);
        a(activity, (OnNavigationStateListener) new OnNavigationStateListener() {
            public void onNavigationState(boolean z, int i) {
                boolean unused = NavigationBarUtil.this.f9193a = z;
            }
        });
    }

    @TargetApi(14)
    private int a(Context context) {
        Resources resources = context.getResources();
        if (Build.VERSION.SDK_INT < 14 || !b(context)) {
            return 0;
        }
        return a(resources, this.c ? "navigation_bar_height" : "navigation_bar_height_landscape");
    }

    @TargetApi(14)
    private boolean b(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier == 0) {
            return !ViewConfiguration.get(context).hasPermanentMenuKey();
        }
        boolean z = resources.getBoolean(identifier);
        if ("1".equals(d)) {
            return false;
        }
        if ("0".equals(d)) {
            return true;
        }
        return z;
    }

    private void a(final Activity activity, final OnNavigationStateListener onNavigationStateListener) {
        if (activity != null) {
            final int a2 = a(activity);
            if (Build.VERSION.SDK_INT >= 20) {
                activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        int i;
                        boolean z = false;
                        if (windowInsets != null) {
                            i = windowInsets.getSystemWindowInsetBottom();
                            if (i == a2) {
                                z = true;
                            }
                        } else {
                            i = -1;
                        }
                        OnNavigationStateListener onNavigationStateListener = onNavigationStateListener;
                        if (onNavigationStateListener != null && i <= a2) {
                            onNavigationStateListener.onNavigationState(z, i);
                        }
                        return activity.getWindow().getDecorView().onApplyWindowInsets(windowInsets);
                    }
                });
            }
        }
    }

    private int a(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public boolean a() {
        return this.f9193a;
    }

    public int b() {
        return this.b;
    }
}
