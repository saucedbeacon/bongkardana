package com.alibaba.griver.base.common.proxy;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.MD5Util;
import java.util.HashMap;
import java.util.Map;
import o.PlaybackStateCompat;

public class LocalIdTool {
    public static final String PREFIX = "apml";

    /* renamed from: a  reason: collision with root package name */
    private static LocalIdTool f10219a;
    private Map<String, String> b = new HashMap();
    private PlaybackStateCompat.ErrorCode<String, String> c = new PlaybackStateCompat.ErrorCode<>(1000);
    private RVFileAbilityProxy d;

    private LocalIdTool() {
        long currentTimeMillis = System.currentTimeMillis();
        this.d = (RVFileAbilityProxy) RVProxy.get(RVFileAbilityProxy.class);
        StringBuilder sb = new StringBuilder("LocalIdTool init time=");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        RVLogger.e("LocalIdTool", sb.toString());
    }

    public static synchronized LocalIdTool get() {
        LocalIdTool localIdTool;
        synchronized (LocalIdTool.class) {
            if (f10219a == null) {
                f10219a = new LocalIdTool();
            }
            localIdTool = f10219a;
        }
        return localIdTool;
    }

    public static boolean isLocalIdRes(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(PREFIX);
    }

    public String encodeToLocalId(String str) {
        GriverLogger.d("LocalIdTool", "encodeToLocalId, path: ".concat(String.valueOf(str)));
        if (str == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str) && !str.startsWith(PREFIX)) {
            String str2 = this.c.get(str);
            if (str2 == null) {
                StringBuilder sb = new StringBuilder(PREFIX);
                sb.append(MD5Util.getMD5String(str));
                str2 = sb.toString();
                this.b.put(str2, str);
                this.c.put(str, str2);
            }
            a(str2, str);
            str = str2;
        }
        GriverLogger.d("LocalIdTool", "encodeToLocalId, localId: ".concat(String.valueOf(str)));
        return str;
    }

    public String decodeToPath(String str) {
        if (str == null) {
            return null;
        }
        RVLogger.d("LocalIdTool", "decodeToPath>localId = ".concat(String.valueOf(str)));
        if (!isLocalIdRes(str)) {
            return str;
        }
        String str2 = this.b.get(str);
        if (str2 != null) {
            a(str, str2);
        } else {
            str2 = a(str);
            if (TextUtils.isEmpty(str2)) {
                return str;
            }
            this.b.put(str, str2);
        }
        return str2;
    }

    private void a(String str, String str2) {
        RVFileAbilityProxy rVFileAbilityProxy = this.d;
        if (rVFileAbilityProxy != null) {
            rVFileAbilityProxy.saveIdWithPath(str, str2);
        }
    }

    private String a(String str) {
        RVFileAbilityProxy rVFileAbilityProxy = this.d;
        return rVFileAbilityProxy != null ? rVFileAbilityProxy.queryPathByLocalId(str) : "";
    }
}
