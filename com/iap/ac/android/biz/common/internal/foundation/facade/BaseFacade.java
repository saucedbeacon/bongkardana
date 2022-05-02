package com.iap.ac.android.biz.common.internal.foundation.facade;

import android.content.Context;
import com.iap.ac.android.biz.common.model.CommonConfig;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class BaseFacade {
    public String mBizCode;
    public CommonConfig mConfig;
    public Context mContext;

    public void initComponent(Context context, String str, CommonConfig commonConfig) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(-2128558015, oncanceled);
            onCancelLoad.getMin(-2128558015, oncanceled);
        }
        this.mContext = context;
        this.mBizCode = str;
        this.mConfig = commonConfig;
    }

    public abstract boolean isInitialized();
}
