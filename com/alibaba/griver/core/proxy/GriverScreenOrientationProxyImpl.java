package com.alibaba.griver.core.proxy;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.titlebar.TitleBar;
import com.alibaba.ariver.app.proxy.RVScreenOrientationProxy;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class GriverScreenOrientationProxyImpl implements RVScreenOrientationProxy {
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

    public boolean setScreenOrientation(Activity activity, String str, Page page) {
        StringBuilder sb = new StringBuilder("setScreenOrientation ");
        sb.append(str);
        sb.append(" for activity: ");
        sb.append(activity);
        RVLogger.d("AriverInt:DefaultScreenOrientationProxyImpl", sb.toString());
        if (str == null) {
            return false;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 729267099) {
            if (hashCode == 1430647483 && str.equals("landscape")) {
                c = 0;
            }
        } else if (str.equals(RVParams.LONG_PORTRAIT)) {
            c = 1;
        }
        if (c == 0) {
            if (activity.getRequestedOrientation() != 0) {
                activity.setRequestedOrientation(0);
                Window window = activity.getWindow();
                if (window != null) {
                    window.clearFlags(2048);
                    window.addFlags(1024);
                }
                if (page != null) {
                    a(page, false);
                }
            }
            return true;
        } else if (c != 1) {
            return false;
        } else {
            if (activity.getRequestedOrientation() != 1) {
                activity.setRequestedOrientation(1);
                Window window2 = activity.getWindow();
                if (window2 != null) {
                    window2.clearFlags(1024);
                    window2.addFlags(2048);
                }
                if (page != null) {
                    a(page, true);
                }
            }
            return true;
        }
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
