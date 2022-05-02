package com.iap.ac.android.mpm.interceptor.provider;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.model.acl.AclAPIContext;
import com.iap.ac.android.common.container.provider.ContainerUaProvider;
import com.iap.ac.android.mpm.base.model.route.ACDecodeConfig;

public class UAProvider implements ContainerUaProvider {

    /* renamed from: a  reason: collision with root package name */
    public static String f9119a = "";
    public static String b;
    public static String c;

    public static void a() {
        if (TextUtils.isEmpty(b) || !b.contains(f9119a)) {
            String str = f9119a;
            b = str;
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(b);
                sb.append(" ");
                b = sb.toString();
            }
            if (!f9119a.contains(AclAPIContext.API_SOURCE_AC)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b);
                sb2.append(AclAPIContext.API_SOURCE_AC);
                b = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(b);
            sb3.append(" iapconnectsdk/2.16.11");
            b = sb3.toString();
        }
    }

    public static void enableUserAgent(boolean z) {
        if (z) {
            a();
            return;
        }
        b = null;
        c = null;
    }

    public static void mockUserAgent(ACDecodeConfig aCDecodeConfig) {
        if (aCDecodeConfig == null || TextUtils.isEmpty(aCDecodeConfig.userAgent)) {
            c = "";
        } else {
            c = aCDecodeConfig.userAgent;
        }
        a();
    }

    public static void setPspUA(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            f9119a = "";
        } else {
            f9119a = str;
        }
        a();
    }

    public String getUa(String str) {
        if (!TextUtils.isEmpty(c)) {
            if (TextUtils.isEmpty(str)) {
                return String.format("%s %s", new Object[]{b, c});
            } else if (str.contains(f9119a)) {
                return String.format("%s %s %s %s", new Object[]{str, AclAPIContext.API_SOURCE_AC, "iapconnectsdk/2.16.11", c});
            } else {
                return String.format("%s %s %s", new Object[]{str, b, c});
            }
        } else if (TextUtils.isEmpty(str)) {
            String str2 = b;
            return str2 == null ? "" : str2;
        } else if (TextUtils.isEmpty(b) || str.contains(b)) {
            return str;
        } else {
            if (str.contains(f9119a)) {
                return String.format("%s %s %s", new Object[]{str, AclAPIContext.API_SOURCE_AC, "iapconnectsdk/2.16.11"});
            }
            return String.format("%s %s", new Object[]{str, b});
        }
    }
}
