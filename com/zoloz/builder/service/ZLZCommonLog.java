package com.zoloz.builder.service;

import com.alipay.mobile.security.bio.utils.Logger;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class ZLZCommonLog extends Logger {
    private boolean log = false;

    public int debug(String str, String str2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1010800158, oncanceled);
            onCancelLoad.getMin(1010800158, oncanceled);
        }
        return 0;
    }

    public int error(String str, String str2) {
        return 0;
    }

    public int info(String str, String str2) {
        return 0;
    }

    public int verbose(String str, String str2) {
        return 0;
    }

    public int warn(String str, String str2) {
        return 0;
    }

    public void setLog(boolean z) {
        this.log = z;
    }

    public String getStackTraceString(Throwable th) {
        return th.getMessage();
    }
}
