package com.alipay.plus.android.ab.sdk.trigger;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.ab.sdk.AbTestingContext;
import com.alipay.plus.android.ab.sdk.AbTestingSdk;
import com.alipay.plus.android.config.sdk.a.e;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class AbTestingTrigger {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10733a = e.a("AbTestingTrigger");

    public void initialize(@NonNull Context context) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(-908838429, oncanceled);
            onCancelLoad.getMin(-908838429, oncanceled);
        }
        LoggerWrapper.d(f10733a, "initialize now.");
    }

    public abstract void startTrigger(@NonNull AbTestingContext abTestingContext);

    public void updateABVariation(@NonNull String str, String str2) {
        LoggerWrapper.d(f10733a, "update ABVariation with trigger.");
        AbTestingSdk.getInstance().updateAbVariation(str, str2);
    }
}
