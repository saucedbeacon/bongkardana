package com.alipay.multimedia.adjuster.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import com.alipay.multimedia.adjuster.config.ConfigMgr;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class AliCdnUtils {
    private static final int IMAGE_MAX_BITMAP_DIMENSION = 2048;
    private static final String TAG = "AliCdnUtils";
    private static Random mRandom = new Random();
    private static ExecutorService mSingleExecutor = null;

    public static int getMaxTextureSize() {
        return 2048;
    }

    public static boolean checkUrlWithFuzzy(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            for (String contains : strArr) {
                if (str.contains(contains)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkUrlHostWithExact(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            for (String equalsIgnoreCase : strArr) {
                if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getScreenScale() {
        return ConfigMgr.getInc().getCdnConfigItem().mScreenScale;
    }

    public static boolean checkUrl(String str) {
        return Patterns.WEB_URL.matcher(str).matches();
    }

    public static String getUrlDecoderString(String str, String str2) {
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static boolean isHttp(Uri uri) {
        if (uri == null) {
            return false;
        }
        String scheme = uri.getScheme();
        if (("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) && hasHost(uri)) {
            return true;
        }
        return false;
    }

    public static boolean hasHost(Uri uri) {
        String host = uri.getHost();
        return host != null && !"".equals(host);
    }

    public static int generateRandom(int i, int i2) {
        return (mRandom.nextInt(i2) % ((i2 - i) + 1)) + i;
    }

    public static synchronized ExecutorService getSingleExecutor() {
        ExecutorService executorService;
        synchronized (AliCdnUtils.class) {
            if (mSingleExecutor == null) {
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                mSingleExecutor = newSingleThreadExecutor;
                allTimeout(newSingleThreadExecutor);
            }
            executorService = mSingleExecutor;
        }
        return executorService;
    }

    private static void allTimeout(ExecutorService executorService) {
        if (executorService instanceof ThreadPoolExecutor) {
            try {
                ((ThreadPoolExecutor) executorService).allowCoreThreadTimeOut(true);
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("allTimeout exp=");
                sb.append(th.toString());
                Log.D(TAG, sb.toString(), new Object[0]);
            }
        }
    }
}
