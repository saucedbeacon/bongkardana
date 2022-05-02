package com.alibaba.ariver.kernel.common.utils;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import androidx.annotation.Nullable;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.PlaybackStateCompat;
import o.getTabbarModel;
import o.setNegativeButton;

public class UrlUtils {
    public static final String TAG = "AriverKernel:UrlUtils";

    /* renamed from: a  reason: collision with root package name */
    private static PlaybackStateCompat.ErrorCode<String, Uri> f9029a = new PlaybackStateCompat.ErrorCode<>(20);
    private static PlaybackStateCompat.ErrorCode<String, String> b = new PlaybackStateCompat.ErrorCode<>(20);

    public static String matchAppIdRaw(String str) {
        String str2;
        String host = getHost(str);
        if (host != null && (host.contains("h5app") || host.contains("hybrid"))) {
            if (host.contains("h5app")) {
                str2 = "\\d+\\.h5app\\.(alipay|m\\.taobao)\\.(net|com)";
            } else {
                str2 = host.contains("hybrid") ? "^\\d+[.]hybrid[.]alipay-eco[.](com|net)$" : "";
            }
            Pattern compile = PatternUtils.compile(str2);
            if (compile != null && !TextUtils.isEmpty(host)) {
                Matcher matcher = compile.matcher(host);
                if (matcher.find()) {
                    String group = matcher.group();
                    if (!TextUtils.isEmpty(group)) {
                        return group.substring(0, group.indexOf("."));
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public static setNegativeButton<String, Bundle> parseAriverCodeUrl(String str) {
        return parseAriverCodeUrl(parseUrl(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a A[SYNTHETIC, Splitter:B:17:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0034 A[Catch:{ all -> 0x0068 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0035 A[Catch:{ all -> 0x0068 }] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.setNegativeButton<java.lang.String, android.os.Bundle> parseAriverCodeUrl(android.net.Uri r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.Class<com.alibaba.ariver.kernel.common.service.RVEnvironmentService> r1 = com.alibaba.ariver.kernel.common.service.RVEnvironmentService.class
            java.lang.Object r1 = com.alibaba.ariver.kernel.common.RVProxy.get(r1)     // Catch:{ all -> 0x0068 }
            com.alibaba.ariver.kernel.common.service.RVEnvironmentService r1 = (com.alibaba.ariver.kernel.common.service.RVEnvironmentService) r1     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = "_ap_ariver_appid"
            if (r1 == 0) goto L_0x0021
            java.lang.String r3 = "AP"
            java.lang.String r1 = r1.defaultPlatform()     // Catch:{ all -> 0x0068 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = r8.getQueryParameter(r2)     // Catch:{ all -> 0x0068 }
            goto L_0x0022
        L_0x0021:
            r1 = r0
        L_0x0022:
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = "_ariver_appid"
            if (r3 == 0) goto L_0x002e
            java.lang.String r1 = r8.getQueryParameter(r4)     // Catch:{ all -> 0x0068 }
        L_0x002e:
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x0035
            return r0
        L_0x0035:
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0068 }
            r3.<init>()     // Catch:{ all -> 0x0068 }
            java.util.Set r5 = r8.getQueryParameterNames()     // Catch:{ all -> 0x0068 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0068 }
        L_0x0042:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0068 }
            if (r6 == 0) goto L_0x0062
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0068 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0068 }
            boolean r7 = r4.equals(r6)     // Catch:{ all -> 0x0068 }
            if (r7 != 0) goto L_0x0042
            boolean r7 = r2.equals(r6)     // Catch:{ all -> 0x0068 }
            if (r7 != 0) goto L_0x0042
            java.lang.String r7 = r8.getQueryParameter(r6)     // Catch:{ all -> 0x0068 }
            r3.putString(r6, r7)     // Catch:{ all -> 0x0068 }
            goto L_0x0042
        L_0x0062:
            o.setNegativeButton r8 = new o.setNegativeButton     // Catch:{ all -> 0x0068 }
            r8.<init>(r1, r3)     // Catch:{ all -> 0x0068 }
            return r8
        L_0x0068:
            r8 = move-exception
            java.lang.String r1 = "AriverKernel:UrlUtils"
            java.lang.String r2 = "parseAriverCodeUrl exception!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r1, r2, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.UrlUtils.parseAriverCodeUrl(android.net.Uri):o.setNegativeButton");
    }

    public static String getCORSUrl(String str) {
        try {
            Uri parseUrl = parseUrl(str);
            if (parseUrl == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(parseUrl.getScheme());
            sb.append("://");
            sb.append(parseUrl.getHost());
            String obj = sb.toString();
            if (parseUrl.getPort() == -1) {
                return obj;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(":");
            sb2.append(parseUrl.getPort());
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00aa, code lost:
        r5 = purifyUrl(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String mergeUrl(java.lang.String r5, java.lang.String r6) {
        /*
            android.net.Uri r0 = parseUrl(r6)
            if (r0 != 0) goto L_0x0007
            return r6
        L_0x0007:
            java.lang.String r0 = r0.getScheme()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0012
            return r6
        L_0x0012:
            java.lang.String r0 = "//"
            boolean r0 = r6.startsWith(r0)
            java.lang.String r1 = "AriverKernel:UrlUtils"
            r2 = 0
            if (r0 == 0) goto L_0x005b
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0024
            return r2
        L_0x0024:
            android.net.Uri r5 = parseUrl(r5)
            if (r5 == 0) goto L_0x004c
            java.lang.String r0 = r5.getScheme()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x004c
            java.lang.String r5 = r5.getScheme()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = ":"
            r0.append(r5)
            r0.append(r6)
            java.lang.String r2 = r0.toString()
        L_0x004c:
            java.lang.String r5 = java.lang.String.valueOf(r2)
            java.lang.String r6 = "getAbsoluteUrl // "
            java.lang.String r5 = r6.concat(r5)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r5)
            goto L_0x00da
        L_0x005b:
            java.lang.String r0 = "/"
            boolean r3 = r6.startsWith(r0)
            if (r3 == 0) goto L_0x00a3
            android.net.Uri r5 = parseUrl(r5)
            if (r5 != 0) goto L_0x006a
            return r2
        L_0x006a:
            java.lang.String r0 = r5.getScheme()
            java.lang.String r5 = r5.getAuthority()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0095
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L_0x0095
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "://"
            r2.append(r0)
            r2.append(r5)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
        L_0x0095:
            java.lang.String r5 = java.lang.String.valueOf(r2)
            java.lang.String r6 = "getAbsoluteUrl / "
            java.lang.String r5 = r6.concat(r5)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r5)
            goto L_0x00da
        L_0x00a3:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto L_0x00aa
            return r2
        L_0x00aa:
            java.lang.String r5 = purifyUrl(r5)
            int r3 = r5.lastIndexOf(r0)
            r4 = -1
            if (r3 != r4) goto L_0x00b6
            return r2
        L_0x00b6:
            r2 = 0
            java.lang.String r5 = r5.substring(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r0)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = java.lang.String.valueOf(r2)
            java.lang.String r6 = "getAbsoluteUrl else "
            java.lang.String r5 = r6.concat(r5)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r5)
        L_0x00da:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.UrlUtils.mergeUrl(java.lang.String, java.lang.String):java.lang.String");
    }

    public static String purifyUrl(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String str3 = b.get(str);
        if (str3 != null) {
            return str3;
        }
        try {
            int indexOf = str.indexOf("#");
            str2 = indexOf != -1 ? str.substring(0, indexOf) : str;
            try {
                if (str2.contains("??")) {
                    b.put(str, str2);
                    return str2;
                }
                int indexOf2 = str2.indexOf("?");
                if (indexOf2 != -1) {
                    str2 = str2.substring(0, indexOf2);
                }
                b.put(str, str2);
                return str2;
            } catch (Throwable unused) {
                b.put(str, str2);
                return str2;
            }
        } catch (Throwable unused2) {
            str2 = str;
            b.put(str, str2);
            return str2;
        }
    }

    public static Uri parseUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = f9029a.get(str);
        if (uri != null) {
            return uri;
        }
        try {
            uri = Uri.parse(str);
            f9029a.put(str, uri);
            return uri;
        } catch (Exception e) {
            RVLogger.e(TAG, "parse url exception.", e);
            return uri;
        }
    }

    public static String getHost(String str) {
        Uri parseUrl = parseUrl(str);
        if (parseUrl != null) {
            return parseUrl.getHost();
        }
        return null;
    }

    public static String getPath(String str) {
        Uri parseUrl = parseUrl(str);
        if (parseUrl != null) {
            return parseUrl.getPath();
        }
        return null;
    }

    public static String getHash(String str) {
        int indexOf;
        Uri parseUrl = parseUrl(str);
        String fragment = parseUrl != null ? parseUrl.getFragment() : null;
        if (fragment != null && (indexOf = fragment.indexOf("?")) > 0) {
            fragment = fragment.substring(0, indexOf);
        }
        return (fragment == null || !fragment.startsWith("/")) ? fragment : fragment.substring(1);
    }

    public static String getPathAndHash(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getPath(str));
        sb.append("#");
        sb.append(getHash(str));
        return sb.toString();
    }

    public static String getParam(Uri uri, String str, String str2) {
        if (uri == null) {
            return str2;
        }
        String str3 = null;
        try {
            str3 = uri.getQueryParameter(str);
        } catch (Exception e) {
            RVLogger.e(TAG, "Exception", e);
        }
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public static final String encode(String str) {
        try {
            return URLEncoder.encode(str, getTabbarModel.ENC);
        } catch (Exception e) {
            RVLogger.e(TAG, "Exception", e);
            return null;
        }
    }

    public static final String encodeOffilineUrlForAuth(String str) {
        try {
            Uri parseUrl = parseUrl(str);
            String str2 = null;
            if (parseUrl != null) {
                str2 = parseUrl.getFragment();
                if (!str.contains(str2)) {
                    str2 = parseUrl.getEncodedFragment();
                }
            }
            if (str2 == null) {
                return str;
            }
            String encode = URLEncoder.encode(str2, getTabbarModel.ENC);
            try {
                return str.replace(str2, encode);
            } catch (Exception e) {
                String str3 = encode;
                e = e;
                str = str3;
                RVLogger.e(TAG, "Exception", e);
                return str;
            }
        } catch (Exception e2) {
            e = e2;
            RVLogger.e(TAG, "Exception", e);
            return str;
        }
    }

    public static final String decode(String str) {
        try {
            return URLDecoder.decode(str, getTabbarModel.ENC);
        } catch (Exception e) {
            RVLogger.e(TAG, "Exception", e);
            return null;
        }
    }

    public static String getAbsoluteUrlWithURLLib(String str, String str2) {
        Uri parseUrl = parseUrl(str2);
        if (parseUrl == null || !TextUtils.isEmpty(parseUrl.getScheme())) {
            return str2;
        }
        try {
            return new URL(new URL(str), str2).toString();
        } catch (MalformedURLException e) {
            RVLogger.e(TAG, "getAbsoluteUrlWithURLLib fatal error ", e);
            return null;
        }
    }

    public static String getOnlineHost(String str) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("file:///") && !str.startsWith("data:")) {
            return getHost(str);
        }
        return null;
    }

    public static boolean isUrlInDomainArray(String str, String[] strArr) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length == 0) {
            return false;
        }
        Uri parseUrl = parseUrl(str);
        if (parseUrl == null) {
            RVLogger.d(TAG, "parse auto url failed!");
            return false;
        }
        String host = parseUrl.getHost();
        if (TextUtils.isEmpty(host)) {
            RVLogger.d(TAG, "can't get url host");
            return false;
        }
        String lowerCase = host.toLowerCase();
        try {
            for (String str2 : strArr) {
                if (str2.equalsIgnoreCase(lowerCase) || lowerCase.endsWith(".".concat(String.valueOf(str2)))) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            RVLogger.e(TAG, "match auto login exception.", e);
            return false;
        }
    }

    public static String stripAnchor(String str) {
        int indexOf = str.indexOf(35);
        if (indexOf == -1) {
            return str;
        }
        String substring = str.substring(0, indexOf);
        StringBuilder sb = new StringBuilder("stripAnchor url:");
        sb.append(str);
        sb.append(" afterUrl:");
        sb.append(substring);
        RVLogger.d(TAG, sb.toString());
        return substring;
    }

    public static boolean isValidUrl(String str) {
        if (!TextUtils.isEmpty(str) && URLUtil.isValidUrl(str) && Patterns.WEB_URL.matcher(str).matches()) {
            return true;
        }
        return false;
    }
}
