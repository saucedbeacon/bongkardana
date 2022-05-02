package com.alipay.iap.android.aplog.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import com.alipay.iap.android.aplog.api.InitParams;
import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.log.BaseLogInfo;
import com.alipay.iap.android.aplog.util.CrashCombineUtils;
import com.alipay.iap.android.aplog.util.LoggingUtil;
import com.alipay.iap.android.aplog.util.ReflectUtil;

public class LogServiceInToolsProcess extends JobIntentService {
    private static final int JOB_ID = 1943;
    public static final String TAG = "LogServiceInToolsProcess";

    public void onCreate() {
        super.onCreate();
        setInterruptIfStopped(true);
    }

    public static void enqueueWork(Context context, Intent intent) {
        try {
            enqueueWork(context, (Class<?>) LogServiceInToolsProcess.class, (int) JOB_ID, intent);
        } catch (Exception e) {
            try {
                LoggerFactory.getTraceLogger().error(TAG, (Throwable) e);
            } catch (Exception unused) {
            }
        }
    }

    public void onHandleWork(@NonNull Intent intent) {
        Bundle extras;
        InitParams initParams;
        if (intent != null) {
            String action = intent.getAction();
            Bundle extras2 = intent.getExtras();
            if (!TextUtils.isEmpty(action) && extras2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(getPackageName());
                sb.append(LogContext.ACTION_UPLOAD_MDAPLOG);
                if (action.equals(sb.toString())) {
                    LoggerFactory.getTraceLogger().debug(TAG, "uploading in process");
                    LoggerFactory.getLogContext().upload(extras2.getString("logCategory"), extras2.getString("uploadUrl"), extras2);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getPackageName());
                sb2.append(LogContext.ACTION_UPDATE_LOG_STRATEGY);
                if (action.equals(sb2.toString())) {
                    LoggerFactory.getLogContext().updateLogStrategy(extras2.getString("strategy"));
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(getPackageName());
                sb3.append(LogContext.ACTION_NATIVE_CRASH);
                if (!action.equals(sb3.toString())) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(getPackageName());
                    sb4.append(LogContext.ACTION_UPDATE_USERID);
                    if (action.equals(sb4.toString())) {
                        String string = extras2.getString("userID");
                        if (!TextUtils.isEmpty(string)) {
                            LoggerFactory.getLogContext().setUserID(string);
                            return;
                        }
                        return;
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(getPackageName());
                    sb5.append(LogContext.ACTION_INIT_TOOLS_PROCESS);
                    if (action.equals(sb5.toString()) && (extras = intent.getExtras()) != null && (initParams = (InitParams) extras.getParcelable("initParams")) != null) {
                        if (TextUtils.isEmpty(initParams.appId) || TextUtils.isEmpty(initParams.publicKey)) {
                            LoggerFactory.init(getApplication());
                        } else {
                            LoggerFactory.init(getApplication(), initParams.appId, initParams.publicKey);
                        }
                        LoggingUtil.setDebuggable(initParams.isDebugable);
                        LoggerFactory.getLogContext().setLogHost(initParams.host);
                        LoggerFactory.getLogContext().setLogConfigHost(initParams.configHost);
                        LoggerFactory.getLogContext().setProductID(initParams.productId);
                        LoggerFactory.getLogContext().setUserID(initParams.userId);
                    }
                } else if (intent.getExtras() != null) {
                    String string2 = intent.getExtras().getString("filePath");
                    String string3 = intent.getExtras().getString("callStack");
                    try {
                        LoggerFactory.getLogContext().syncAppendLog((BaseLogInfo) ReflectUtil.invokeMethod("com.alipay.iap.android.aplog.core.logger.CrashLogAbility", "makeCrashLog", new Class[]{String.class, String.class}, (Object) null, new Object[]{string3, CrashCombineUtils.UserTrackReport(string2, string3).replaceAll("\n", "###")}));
                        CrashCombineUtils.deleteFileByPath(string2);
                    } catch (Exception e) {
                        LoggerFactory.getTraceLogger().error(TAG, TextUtils.isEmpty(e.getMessage()) ? "invoke makeCrashLog error" : e.getMessage());
                    }
                }
            }
        }
    }
}
