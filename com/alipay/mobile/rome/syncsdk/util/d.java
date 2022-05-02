package com.alipay.mobile.rome.syncsdk.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9460a = d.class.getSimpleName();
    private static Map<String, String> b = new HashMap();

    private static Map<String, String> h(Context context) {
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open("mpaas.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            if (properties.size() <= 0) {
                Map<String, String> emptyMap = Collections.emptyMap();
                try {
                    inputStream.close();
                } catch (IOException e) {
                    c.d(f9460a, "doGetMpaasProperties IOException:".concat(String.valueOf(e)));
                }
                return emptyMap;
            }
            HashMap hashMap = new HashMap(properties.size());
            for (Map.Entry entry : properties.entrySet()) {
                hashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
            try {
                inputStream.close();
            } catch (IOException e2) {
                c.d(f9460a, "doGetMpaasProperties IOException:".concat(String.valueOf(e2)));
            }
            return hashMap;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e3) {
                c.d(f9460a, "doGetMpaasProperties IOException:".concat(String.valueOf(e3)));
            }
            throw th;
        }
    }

    public static String a(Context context) {
        return a(context, "appkey");
    }

    public static String b(Context context) {
        return a(context, "AppId");
    }

    private static String a(Context context, String str) {
        if (b.containsKey(str)) {
            return b.get(str);
        }
        String str2 = null;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                str2 = applicationInfo.metaData.getString(str);
                if (!TextUtils.isEmpty(str2)) {
                    b.put(str, str2);
                    return str2;
                }
            }
        } catch (Throwable th) {
            c.d(f9460a, "getKeyFromManifest exception:".concat(String.valueOf(th)));
        }
        return TextUtils.isEmpty(str2) ? b(context, str) : str2;
    }

    public static String c(Context context) {
        return b(context, "WorkspaceId");
    }

    public static String d(Context context) {
        return b(context, "syncserver");
    }

    public static String e(Context context) {
        return b(context, "syncport");
    }

    public static String f(Context context) {
        return b(context, "syncauthcode");
    }

    private static String b(Context context, String str) {
        if (b.containsKey(str)) {
            return b.get(str);
        }
        String str2 = null;
        try {
            Map<String, String> h = h(context);
            b.putAll(h);
            if (h != null) {
                str2 = h.get(str);
            }
            if (str2 != null) {
                b.put(str, str2);
            }
        } catch (Throwable th) {
            c.d(f9460a, "getKeyFromMpaasProperties exception:".concat(String.valueOf(th)));
        }
        return str2;
    }

    public static String g(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(context, "appkey"));
        sb.append("-");
        sb.append(b(context, "WorkspaceId"));
        return sb.toString();
    }
}
