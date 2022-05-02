package com.iap.ac.android.biz.common.internal.foundation.facade;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.common.instance.IInstanceInfo;
import com.iap.ac.android.common.instance.InstanceInfo;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.instance.IAPInstanceInfo;

public class InstanceInfoFacade extends BaseFacade {
    public static boolean mInitialized = false;

    public void initComponent(Context context, String str, CommonConfig commonConfig) {
        super.initComponent(context, str, commonConfig);
        synchronized (this) {
            mInitialized = false;
            if (Utils.checkClassExist("com.iap.ac.android.instance.IAPInstanceInfo")) {
                InstanceInfo.setInstanceInfoImpl(new IInstanceInfo() {
                    public String getInstanceId(Context context) {
                        return IAPInstanceInfo.instanceId(context);
                    }

                    public String getTid(@NonNull Context context) {
                        return IAPInstanceInfo.tid(context);
                    }
                });
                ACLog.i(Constants.TAG, "InstanceInfo component initialize finish");
                mInitialized = true;
            } else {
                ACLog.e(Constants.TAG, "InstanceInfoFacade initialize error, cannot find class");
            }
        }
    }

    public boolean isInitialized() {
        return mInitialized;
    }
}
