package com.alibaba.ariver.integration.proxy.impl;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.titlebar.TitleBar;
import com.alibaba.ariver.app.proxy.RVScreenOrientationProxy;
import com.alibaba.ariver.kernel.RVParams;

public class DefaultScreenOrientationProxyImpl implements RVScreenOrientationProxy {
    public String getScreenOrientation(Activity activity) {
        if (activity == null) {
            return null;
        }
        String a2 = a(activity);
        return a2 == null ? a((Context) activity) : a2;
    }

    private static String a(Activity activity) {
        int requestedOrientation = activity.getRequestedOrientation();
        if (requestedOrientation == 0) {
            return "landscape";
        }
        if (requestedOrientation != 1) {
            return null;
        }
        return RVParams.LONG_PORTRAIT;
    }

    private static String a(Context context) {
        int i = context.getResources().getConfiguration().orientation;
        if (i == 1) {
            return RVParams.LONG_PORTRAIT;
        }
        if (i != 2) {
            return null;
        }
        return "landscape";
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean setScreenOrientation(android.app.Activity r5, java.lang.String r6, com.alibaba.ariver.app.api.Page r7) {
        /*
            r4 = this;
            int r0 = r6.hashCode()
            r1 = 729267099(0x2b77bb9b, float:8.8012383E-13)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x001b
            r1 = 1430647483(0x5545f2bb, float:1.36028944E13)
            if (r0 == r1) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "landscape"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0025
            r6 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "portrait"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0025
            r6 = 1
            goto L_0x0026
        L_0x0025:
            r6 = -1
        L_0x0026:
            r0 = 1024(0x400, float:1.435E-42)
            r1 = 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x004a
            if (r6 == r3) goto L_0x002f
            return r2
        L_0x002f:
            int r6 = r5.getRequestedOrientation()
            if (r6 == r3) goto L_0x0049
            r5.setRequestedOrientation(r3)
            android.view.Window r5 = r5.getWindow()
            if (r5 == 0) goto L_0x0044
            r5.clearFlags(r0)
            r5.addFlags(r1)
        L_0x0044:
            if (r7 == 0) goto L_0x0049
            r4.a(r7, r3)
        L_0x0049:
            return r3
        L_0x004a:
            int r6 = r5.getRequestedOrientation()
            if (r6 == 0) goto L_0x0064
            r5.setRequestedOrientation(r2)
            android.view.Window r5 = r5.getWindow()
            if (r5 == 0) goto L_0x005f
            r5.clearFlags(r1)
            r5.addFlags(r0)
        L_0x005f:
            if (r7 == 0) goto L_0x0064
            r4.a(r7, r2)
        L_0x0064:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.integration.proxy.impl.DefaultScreenOrientationProxyImpl.setScreenOrientation(android.app.Activity, java.lang.String, com.alibaba.ariver.app.api.Page):boolean");
    }

    private void a(Page page, boolean z) {
        TitleBar titleBar;
        if (page != null && page.getPageContext() != null && (titleBar = page.getPageContext().getTitleBar()) != null) {
            View content = titleBar.getContent();
            int i = 0;
            if (content != null) {
                content.setVisibility(z ? 0 : 8);
            }
            View divider = titleBar.getDivider();
            if (divider != null) {
                if (!z) {
                    i = 8;
                }
                divider.setVisibility(i);
            }
        }
    }
}
