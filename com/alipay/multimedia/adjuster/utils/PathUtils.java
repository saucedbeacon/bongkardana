package com.alipay.multimedia.adjuster.utils;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

public class PathUtils {
    private static final String ASSET_PATH_FLAG;
    public static final String CONTENT_SCHEMA = "content://";

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(File.separator);
        sb.append("[asset]");
        sb.append(File.separator);
        ASSET_PATH_FLAG = sb.toString();
    }

    /* renamed from: com.alipay.multimedia.adjuster.utils.PathUtils$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.alipay.multimedia.adjuster.utils.Scheme[] r0 = com.alipay.multimedia.adjuster.utils.Scheme.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme = r0
                com.alipay.multimedia.adjuster.utils.Scheme r1 = com.alipay.multimedia.adjuster.utils.Scheme.FILE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alipay.multimedia.adjuster.utils.Scheme r1 = com.alipay.multimedia.adjuster.utils.Scheme.HTTP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alipay.multimedia.adjuster.utils.Scheme r1 = com.alipay.multimedia.adjuster.utils.Scheme.HTTPS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.alipay.multimedia.adjuster.utils.Scheme r1 = com.alipay.multimedia.adjuster.utils.Scheme.CONTENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme     // Catch:{ NoSuchFieldError -> 0x003e }
                com.alipay.multimedia.adjuster.utils.Scheme r1 = com.alipay.multimedia.adjuster.utils.Scheme.DRAWABLE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.alipay.multimedia.adjuster.utils.Scheme r1 = com.alipay.multimedia.adjuster.utils.Scheme.ASSETS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.alipay.multimedia.adjuster.utils.Scheme r1 = com.alipay.multimedia.adjuster.utils.Scheme.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.multimedia.adjuster.utils.PathUtils.AnonymousClass1.<clinit>():void");
        }
    }

    public static String extractPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = AnonymousClass1.$SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme[Scheme.ofUri(str).ordinal()];
        if (i == 1) {
            String crop = Scheme.FILE.crop(str);
            return (TextUtils.isEmpty(crop) || !crop.startsWith(ASSET_PATH_FLAG)) ? crop : crop.substring(ASSET_PATH_FLAG.length());
        } else if (i == 2 || i == 3) {
            return urlEncode(str);
        } else {
            return str;
        }
    }

    private static String urlEncode(String str) {
        return ZURLEncodedUtil.urlEncode(str);
    }

    public static boolean isLocalFile(String str) {
        return (!TextUtils.isEmpty(str) && (str.startsWith("/") || isLocalFile(Uri.parse(str)))) || str.startsWith("local");
    }

    public static boolean isLocalFile(Uri uri) {
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme()) && !hasHost(uri)) {
            return true;
        }
        return false;
    }

    public static boolean hasHost(Uri uri) {
        String host = uri.getHost();
        return host != null && !"".equals(host);
    }

    public static boolean isContentUriPath(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith(CONTENT_SCHEMA);
        }
        return false;
    }
}
