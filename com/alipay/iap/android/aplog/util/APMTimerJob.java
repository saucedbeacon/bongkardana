package com.alipay.iap.android.aplog.util;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import java.util.TimerTask;

public abstract class APMTimerJob extends TimerTask {
    private String mName = getClass().getSimpleName();

    /* access modifiers changed from: protected */
    public abstract void doJob();

    public void setName(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mName = str;
        }
    }

    public String getName() {
        return this.mName;
    }

    public void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            doJob();
        } finally {
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 > 5000) {
                LoggerFactory.getTraceLogger().error(getName(), "doJob: spend ".concat(String.valueOf(uptimeMillis2)));
            }
        }
    }
}
