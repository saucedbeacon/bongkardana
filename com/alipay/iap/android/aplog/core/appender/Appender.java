package com.alipay.iap.android.aplog.core.appender;

import android.content.Context;
import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import java.io.File;

public abstract class Appender {
    protected static final String TAG = "Appender";
    protected Context appContext;
    protected boolean isAppendBytesError;
    protected boolean isAppendStringError;
    protected boolean isGzipBytesError;
    protected String logCategory;
    protected LogContext logContext;
    protected String processTag = LoggerFactory.getProcessInfo().getProcessTag();

    /* access modifiers changed from: protected */
    public abstract void flush();

    /* access modifiers changed from: protected */
    public abstract File getFile();

    /* access modifiers changed from: protected */
    public abstract void onAppend(String str);

    /* access modifiers changed from: protected */
    public abstract boolean onAppend(String str, boolean z);

    /* access modifiers changed from: protected */
    public abstract boolean onAppend(byte[] bArr, int i, int i2);

    /* access modifiers changed from: protected */
    public abstract boolean writeFile(String str);

    public Appender(LogContext logContext2, String str) {
        this.logContext = logContext2;
        this.appContext = logContext2.getApplicationContext();
        this.logCategory = str;
        this.appContext = logContext2.getApplicationContext();
    }

    public String getLogCategory() {
        return this.logCategory;
    }
}
