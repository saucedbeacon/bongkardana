package com.alipay.multimedia.adjuster.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;

public class ZURLEncodedUtil {
    public static final String TAG = "ZURLEncodedUtil";
    private static final Log logger = Log.getLogger(TAG);

    public static String urlEncode(String str) {
        try {
            URL url = getURL(str);
            try {
                return UrlFixer.fixUrl(url.toString());
            } catch (Throwable th) {
                if (url != null) {
                    str = url.toString();
                }
                Log log = logger;
                StringBuilder sb = new StringBuilder("New URI(");
                sb.append(str);
                sb.append(") exception ");
                sb.append(th.toString());
                log.i(sb.toString(), new Object[0]);
                return url.toString();
            }
        } catch (MalformedURLException e) {
            Log log2 = logger;
            StringBuilder sb2 = new StringBuilder("checkURL exception ");
            sb2.append(e.toString());
            log2.w(sb2.toString(), new Object[0]);
            return str;
        }
    }

    private static URL getURL(String str) {
        try {
            return new URL(str);
        } catch (Exception e) {
            Log log = logger;
            StringBuilder sb = new StringBuilder("new URL(");
            sb.append(str);
            sb.append(")  exception ");
            sb.append(e.toString());
            log.w(sb.toString(), new Object[0]);
            str = URLDecoder.decode(str);
        } catch (Throwable th) {
            Log log2 = logger;
            StringBuilder sb2 = new StringBuilder("decode uri=");
            sb2.append(str);
            sb2.append(", exception ");
            sb2.append(th.toString());
            log2.w(sb2.toString(), new Object[0]);
        }
        return new URL(str);
    }
}
