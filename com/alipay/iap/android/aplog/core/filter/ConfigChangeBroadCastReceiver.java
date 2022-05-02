package com.alipay.iap.android.aplog.core.filter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alipay.iap.android.aplog.core.LoggerFactory;

public class ConfigChangeBroadCastReceiver extends BroadcastReceiver {
    private static final String TAG = "ConfigChangeBroadCastReceiver";

    public void onReceive(Context context, Intent intent) {
        LoggerFactory.getTraceLogger().info(TAG, "onReceive resetUploadUrl");
    }
}
