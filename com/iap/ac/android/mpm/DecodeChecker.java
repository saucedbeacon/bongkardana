package com.iap.ac.android.mpm;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.BuildConfig;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.callback.IConfigCallback;
import com.iap.ac.android.biz.common.constants.ACConstants;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.Result;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.d0.b;
import com.iap.ac.android.d0.d;
import com.iap.ac.android.mpm.base.interfaces.IDecodeCallback;
import com.iap.ac.android.mpm.base.model.route.ACDecodeConfig;
import com.iap.ac.android.mpm.base.model.route.RouterType;

public class DecodeChecker {

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f9749a;
        public final /* synthetic */ DecodeParameter b;
        public final /* synthetic */ com.iap.ac.android.a0.a c;
        public final /* synthetic */ IDecodeCallback d;

        public a(Context context, DecodeParameter decodeParameter, com.iap.ac.android.a0.a aVar, IDecodeCallback iDecodeCallback) {
            this.f9749a = context;
            this.b = decodeParameter;
            this.c = aVar;
            this.d = iDecodeCallback;
        }

        public final void run() {
            Context context = this.f9749a;
            DecodeParameter decodeParameter = this.b;
            com.iap.ac.android.a0.a aVar = this.c;
            String str = aVar.c;
            ACDecodeConfig aCDecodeConfig = aVar.d;
            IDecodeCallback iDecodeCallback = this.d;
            String str2 = null;
            ACManager.getInstance().fetchConfigAsync((IConfigCallback) null);
            StringBuilder sb = new StringBuilder("acDecodeConfig.userAgent :");
            if (aCDecodeConfig != null) {
                str2 = aCDecodeConfig.toString();
            }
            sb.append(str2);
            ACLog.i(Constants.TAG, sb.toString());
            String str3 = decodeParameter.scene;
            if (ACConstants.Scene.SOURCE_FROM_OTHER_APP.equalsIgnoreCase(str3)) {
                new com.iap.ac.android.e0.a(context, str, false, decodeParameter, aCDecodeConfig, iDecodeCallback).e();
            } else if (aCDecodeConfig == null || RouterType.AC_CODE.equalsIgnoreCase(aCDecodeConfig.routerType)) {
                new d(context, str, false, aCDecodeConfig, str3, iDecodeCallback).e();
            } else if (RouterType.AC_URL.equalsIgnoreCase(aCDecodeConfig.routerType)) {
                new b(context, str, str3, aCDecodeConfig, iDecodeCallback).e();
            } else {
                ACLog.w(Constants.TAG, "DecodeChecker PARAM_ILLEGAL ".concat(String.valueOf(aCDecodeConfig)));
                Result result = new Result();
                result.resultCode = ResultCode.PARAM_ILLEGAL;
                result.resultMessage = "Oops! System busy. Try again later!";
                ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_mpm_decode_params_error", "PARAM_ILLEGAL ".concat(String.valueOf(aCDecodeConfig)));
                com.iap.ac.android.c0.a.a(result, iDecodeCallback);
            }
        }
    }

    public static com.iap.ac.android.a0.a a(String str, String str2, String str3) {
        com.iap.ac.android.a0.a aVar = new com.iap.ac.android.a0.a();
        Result result = new Result();
        result.resultCode = str;
        result.resultMessage = str2;
        aVar.f9673a = result;
        aVar.b = str3;
        return aVar;
    }

    public static void decode(@NonNull Context context, @NonNull DecodeParameter decodeParameter, @NonNull IDecodeCallback iDecodeCallback) {
        com.iap.ac.android.a0.a aVar;
        if (context == null) {
            aVar = a(ResultCode.PARAM_ILLEGAL, "Oops! System busy. Try again later!", "DecodeChecker context is null");
        } else if (decodeParameter == null) {
            aVar = a(ResultCode.PARAM_ILLEGAL, "Oops! System busy. Try again later!", "DecodeChecker parameter is null");
        } else if (iDecodeCallback == null) {
            aVar = a(ResultCode.PARAM_ILLEGAL, "Oops! System busy. Try again later!", "DecodeChecker decodeCallback is null");
        } else {
            String str = decodeParameter.codeValue;
            if (TextUtils.isEmpty(str)) {
                aVar = a(ResultCode.PARAM_ILLEGAL, "Oops! System busy. Try again later!", "DecodeChecker code value is empty");
            } else {
                try {
                    ACDecodeConfig aCDecodeConfig = (ACDecodeConfig) JsonUtils.fromJson(decodeParameter.acDecodeConfigFromServer, ACDecodeConfig.class);
                    boolean z = false;
                    if (aCDecodeConfig != null && !TextUtils.isEmpty(aCDecodeConfig.minAndroidAcSdkVersion)) {
                        try {
                            String[] split = BuildConfig.VERSION_NAME.split("\\.");
                            String[] split2 = aCDecodeConfig.minAndroidAcSdkVersion.split("\\.");
                            int min = Math.min(split.length, split2.length);
                            int i = 0;
                            for (int i2 = 0; i2 < min; i2++) {
                                i = split[i2].length() - split2[i2].length();
                                if (i != 0 || (i = split[i2].compareTo(split2[i2])) != 0) {
                                    break;
                                }
                            }
                            if (i == 0) {
                                i = split.length - split2.length;
                            }
                            if (i < 0) {
                                z = true;
                            }
                        } catch (Exception e) {
                            ACLog.e(Constants.TAG, "isBelowMinSDKVersion error:".concat(String.valueOf(e)));
                        }
                    }
                    if (z) {
                        aVar = a(ResultCode.SDK_NOT_SUPPORT, ResultCode.SDK_NOT_SUPPORT_MESSAGE, "DecodeChecker sdk have to upgrade = true");
                    } else {
                        aVar = new com.iap.ac.android.a0.a();
                        aVar.c = str;
                        aVar.d = aCDecodeConfig;
                        Result result = new Result();
                        result.resultCode = "SUCCESS";
                        aVar.f9673a = result;
                    }
                } catch (Exception e2) {
                    aVar = a(ResultCode.UNKNOWN_EXCEPTION, "Oops! System busy. Try again later!", "DecodeChecker decode error fromJson:".concat(String.valueOf(e2)));
                }
            }
        }
        if (!"SUCCESS".equals(aVar.f9673a.resultCode)) {
            ACLog.w(Constants.TAG, aVar.b);
            ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_mpm_decode_params_error", aVar.b);
            com.iap.ac.android.c0.a.a(aVar.f9673a, iDecodeCallback);
            return;
        }
        IAPAsyncTask.asyncTask((Runnable) new a(context, decodeParameter, aVar, iDecodeCallback));
    }
}
