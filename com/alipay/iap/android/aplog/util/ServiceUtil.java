package com.alipay.iap.android.aplog.util;

import android.content.Context;
import android.content.Intent;
import com.alipay.iap.android.aplog.service.LogServiceInToolsProcess;

public class ServiceUtil {
    public static void startForegroundService(Context context, Intent intent) {
        LogServiceInToolsProcess.enqueueWork(context, intent);
    }
}
