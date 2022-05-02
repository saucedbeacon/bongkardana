package com.alibaba.griver.h5.permission;

import androidx.annotation.Keep;
import com.alibaba.griver.api.h5.permission.GriverH5JSAPIPermissionExtension;
import com.alibaba.griver.base.common.logger.GriverLogger;

@Keep
public class GriverDefaultH5JSAPIPermission implements GriverH5JSAPIPermissionExtension {
    private static final String TAG = "GriverDefaultH5JSAPIPermission";

    public boolean hasPermission(String str, String str2) {
        StringBuilder sb = new StringBuilder("judge h5 jsapi permission from extension, jsapi: ");
        sb.append(str);
        sb.append(", url: ");
        sb.append(str2);
        GriverLogger.d(TAG, sb.toString());
        return true;
    }
}
