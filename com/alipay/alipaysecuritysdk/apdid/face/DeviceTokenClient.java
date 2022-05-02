package com.alipay.alipaysecuritysdk.apdid.face;

import android.content.Context;
import com.alipay.alipaysecuritysdk.apdid.a.a;
import com.alipay.alipaysecuritysdk.apdid.face.Configuration;
import com.alipay.alipaysecuritysdk.common.c.b;
import com.alipay.alipaysecuritysdk.common.e.e;
import com.alipay.alipaysecuritysdk.common.e.f;
import java.util.HashMap;
import java.util.Map;

public class DeviceTokenClient {
    private static DeviceTokenClient mInstance;
    /* access modifiers changed from: private */
    public Context mContext = null;
    private boolean mInited = false;

    public interface InitResultListener {
        void onResult(String str, int i);
    }

    private DeviceTokenClient(Context context) {
        if (context != null) {
            this.mContext = context;
            return;
        }
        throw new IllegalArgumentException("DeviceTokenClient initialization error: mContext is null.");
    }

    public static DeviceTokenClient getInstance(Context context) {
        if (mInstance == null) {
            synchronized (DeviceTokenClient.class) {
                if (mInstance == null) {
                    mInstance = new DeviceTokenClient(context);
                }
            }
        }
        return mInstance;
    }

    public void setConfiguration(Configuration configuration) {
        StringBuilder sb = new StringBuilder("set local: ");
        sb.append(configuration.locale);
        sb.append(", env:");
        sb.append(configuration.envMode);
        b.a("SEC_SDK-apdid", sb.toString());
        a.a(configuration);
    }

    public void setConfiguration(Configuration.Locale locale, int i) {
        StringBuilder sb = new StringBuilder("set local: ");
        sb.append(locale);
        sb.append(", env:");
        sb.append(i);
        b.a("SEC_SDK-apdid", sb.toString());
        a.a(Configuration.getConfiguration(locale, i));
    }

    public void initToken(String str, String str2, InitResultListener initResultListener) {
        baseInitToken(str, str2, false, initResultListener);
    }

    public void updateToken(String str, String str2, InitResultListener initResultListener) {
        baseInitToken(str, str2, true, initResultListener);
    }

    private void baseInitToken(String str, String str2, boolean z, InitResultListener initResultListener) {
        b.a("SEC_SDK-apdid", "start init sec token -> DeviceTokenClient");
        a.b();
        if (e.c(str)) {
            if (initResultListener != null) {
                initResultListener.onResult("", 2);
            }
        } else if (!e.c(str2)) {
            this.mInited = true;
            String a2 = com.alipay.alipaysecuritysdk.apdid.f.b.a(this.mContext);
            final HashMap hashMap = new HashMap(8);
            hashMap.put("utdid", a2);
            hashMap.put("tid", "");
            hashMap.put("userId", "");
            hashMap.put("appName", str);
            hashMap.put("appKeyClient", str2);
            hashMap.put("appchannel", "openapi");
            hashMap.put("rpcVersion", "");
            final boolean z2 = z;
            final InitResultListener initResultListener2 = initResultListener;
            final String str3 = str;
            f.a().a(new Runnable() {
                public void run() {
                    int a2 = new com.alipay.alipaysecuritysdk.apdid.d.a(DeviceTokenClient.this.mContext).a((Map<String, String>) hashMap, z2);
                    InitResultListener initResultListener = initResultListener2;
                    if (initResultListener != null) {
                        if (a2 == 0) {
                            initResultListener2.onResult(com.alipay.alipaysecuritysdk.apdid.d.a.a(DeviceTokenClient.this.mContext, str3), 0);
                        } else {
                            initResultListener.onResult("", a2);
                        }
                    }
                    b.a("SEC_SDK-apdid", "callback finished, return code:".concat(String.valueOf(a2)));
                }
            });
        } else if (initResultListener != null) {
            initResultListener.onResult("", 3);
        }
    }

    public String getApdidToken(String str, String str2) {
        String a2 = com.alipay.alipaysecuritysdk.apdid.d.a.a(this.mContext, str);
        if (e.c(a2) || !this.mInited) {
            b.a("SEC_SDK-apdid", "token in cache is null, recall init");
            try {
                initToken(str, str2, (InitResultListener) null);
            } catch (Exception e) {
                b.a("SEC_SDK-apdid", "recall init error", e);
            }
        }
        return a2;
    }
}
