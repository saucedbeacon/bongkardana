package com.alipay.plus.android.config.sdk.a;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.errorcode.IAPException;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.utils.MiscUtils;
import com.alipay.iap.android.f2fpay.util.DeviceUtils;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.plus.android.config.sdk.ConfigCenterContext;
import com.alipay.plus.android.config.sdk.delegate.ConfigIdentifierProvider;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigByKeysLiteRpcRequest;
import com.alipay.plus.android.config.sdk.fetcher.FetchException;
import com.alipay.plus.android.config.sdk.retry.DistributionNode;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.lang.reflect.UndeclaredThrowableException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9513a = a("SdkUtils");

    public static AmcsConfigByKeysLiteRpcRequest a(@NonNull ConfigCenterContext configCenterContext, String str, String str2, String str3, List<String> list, Map<String, Object> map) {
        AmcsConfigByKeysLiteRpcRequest amcsConfigByKeysLiteRpcRequest = new AmcsConfigByKeysLiteRpcRequest();
        amcsConfigByKeysLiteRpcRequest.keys = list;
        amcsConfigByKeysLiteRpcRequest.lastResponseTime = "0";
        amcsConfigByKeysLiteRpcRequest.appId = str;
        amcsConfigByKeysLiteRpcRequest.tntInstId = str2;
        amcsConfigByKeysLiteRpcRequest.workspaceId = str3;
        Context context = configCenterContext.getContext();
        ConfigIdentifierProvider identifierProvider = configCenterContext.getIdentifierProvider();
        String versionName = MiscUtils.getVersionName(configCenterContext.getContext());
        if (TextUtils.isEmpty(versionName)) {
            versionName = "1.0";
        }
        amcsConfigByKeysLiteRpcRequest.addParameter("utdid", identifierProvider.getUtdId(context));
        amcsConfigByKeysLiteRpcRequest.addParameter("reference ", identifierProvider.getConfigUserId(context));
        amcsConfigByKeysLiteRpcRequest.addParameter("mobileModel ", Build.MODEL);
        amcsConfigByKeysLiteRpcRequest.addParameter("mobileBrand ", Build.BRAND);
        amcsConfigByKeysLiteRpcRequest.addParameter("manufacturer ", Build.MANUFACTURER);
        amcsConfigByKeysLiteRpcRequest.addParameter("osVersion ", a());
        amcsConfigByKeysLiteRpcRequest.addParameter("clientVersion ", versionName);
        amcsConfigByKeysLiteRpcRequest.addParameter("systemType ", DeviceUtils.PLATFORM_TYPE);
        amcsConfigByKeysLiteRpcRequest.addParameters(map);
        return amcsConfigByKeysLiteRpcRequest;
    }

    @NonNull
    public static FetchException a(@NonNull Throwable th, boolean z) {
        Throwable undeclaredThrowable;
        while (!(th instanceof FetchException)) {
            if (th instanceof RpcException) {
                RpcException rpcException = (RpcException) th;
                return new FetchException(String.valueOf(rpcException.getCode()), a(rpcException.getMsg(), "unknown_rpc_exception"));
            }
            if (th instanceof IAPException) {
                IAPError error = ((IAPException) th).getError();
                if (error != null) {
                    return new FetchException(error.errorCode, a(error.errorMessage, "unknown_iap_error"));
                }
            } else if ((th instanceof UndeclaredThrowableException) && z && (undeclaredThrowable = ((UndeclaredThrowableException) th).getUndeclaredThrowable()) != null) {
                th = undeclaredThrowable;
                z = false;
            }
            String message = th.getMessage();
            if (TextUtils.isEmpty(message)) {
                message = "unknown_fetch_exception";
            }
            return new FetchException(message);
        }
        return (FetchException) th;
    }

    @Nullable
    public static <T> T a(@Nullable T t, @NonNull Class<T> cls) {
        if (t == null) {
            return null;
        }
        try {
            return JSONObject.parseObject(JSONObject.toJSONString(t), cls);
        } catch (Throwable th) {
            String str = f9513a;
            StringBuilder sb = new StringBuilder("copyModelObject failed: ");
            sb.append(th.getMessage());
            LoggerWrapper.e(str, sb.toString());
            return null;
        }
    }

    @NonNull
    public static String a() {
        return Build.VERSION.RELEASE;
    }

    @SuppressLint({"SimpleDateFormat"})
    @NonNull
    public static String a(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
    }

    public static String a(DistributionNode distributionNode, ConfigCenterContext configCenterContext) {
        String str;
        String str2;
        String str3 = null;
        if (configCenterContext != null) {
            str2 = MiscUtils.getVersionName(configCenterContext.getContext());
            str = configCenterContext.getIdentifierProvider().getConfigUserId(configCenterContext.getContext());
        } else {
            str = null;
            str2 = null;
        }
        String a2 = a();
        if (distributionNode != null) {
            str3 = distributionNode.url;
        }
        return String.format("%s_%s_%s_%s", new Object[]{str3, str2, a2, str});
    }

    @Nullable
    public static String a(@Nullable Iterable<? extends CharSequence> iterable, char c) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (CharSequence append : iterable) {
            sb.append(append);
            sb.append(c);
        }
        if (sb.length() <= 0) {
            return null;
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static String a(String str) {
        return "Amcs-".concat(String.valueOf(str));
    }

    @NonNull
    private static String a(@Nullable String str, @NonNull String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }

    public static boolean a(@NonNull Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(AkuEventParamsKey.KEY_ACTIVITY);
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.equals(packageName) && next.importance == 100) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            String str = f9513a;
            StringBuilder sb = new StringBuilder("isAppInForeground error: ");
            sb.append(th.getMessage());
            LoggerWrapper.e(str, sb.toString());
        }
    }
}
