package com.iap.ac.android.acs.plugin.biz.region.foundation.facade;

import android.content.Context;
import androidx.annotation.Keep;
import com.iap.ac.android.biz.common.internal.foundation.facade.BaseFacade;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.common.account.ACUserInfo;
import com.iap.ac.android.common.account.ACUserInfoManager;
import com.iap.ac.android.common.account.IUserInfoManager;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@Keep
public class RegionUserInfoFacade extends BaseFacade implements IUserInfoManager {
    private static boolean mInitialized = false;

    public boolean setUserInfo(ACUserInfo aCUserInfo) {
        return false;
    }

    public void initComponent(Context context, String str, CommonConfig commonConfig) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(787169878, oncanceled);
                onCancelLoad.getMin(787169878, oncanceled);
            }
        }
        super.initComponent(context, str, commonConfig);
        synchronized (this) {
            mInitialized = false;
            ACUserInfoManager.setUserInfoManager(this, str);
        }
    }

    public boolean isInitialized() {
        return mInitialized;
    }

    public ACUserInfo getUserInfo() {
        return ACUserInfoManager.getInstance("ac_biz").getUserInfo();
    }

    public String getOpenId() {
        return ACUserInfoManager.getInstance("ac_biz").getOpenId();
    }
}
