package com.google.android.play.core.splitcompat;

import android.app.Application;
import android.content.Context;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class SplitCompatApplication extends Application {
    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-680423123, oncanceled);
            onCancelLoad.getMin(-680423123, oncanceled);
        }
        super.attachBaseContext(context);
        SplitCompat.install(this);
    }
}
