package com.alibaba.griver.base.common.utils;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.griver.base.common.adapter.OutFilePathProxy;
import java.io.File;

public class OuterFileUtils {

    /* renamed from: a  reason: collision with root package name */
    private static OutFilePathProxy f9059a = new OutFilePathProxy() {
        public final String getOuterRootPath() {
            return "griver";
        }
    };

    public static String getOuterRootFileDir(Context context) {
        if (context == null) {
            return null;
        }
        if (context.getExternalCacheDir() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getExternalCacheDir().getAbsolutePath());
            sb.append(File.separator);
            sb.append(f9059a.getOuterRootPath());
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getCacheDir().getAbsolutePath());
        sb2.append(File.separator);
        sb2.append(f9059a.getOuterRootPath());
        return sb2.toString();
    }

    public static void setOutFilePathProxy(OutFilePathProxy outFilePathProxy) {
        if (outFilePathProxy != null && TextUtils.isEmpty(outFilePathProxy.getOuterRootPath())) {
            f9059a = outFilePathProxy;
        }
    }
}
