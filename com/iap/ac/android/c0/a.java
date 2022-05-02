package com.iap.ac.android.c0;

import androidx.annotation.NonNull;
import com.alibaba.ariver.kernel.RVParams;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.constants.ACConstants;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.Result;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.m0.b;
import com.iap.ac.android.m0.c;
import com.iap.ac.android.mpm.base.interfaces.IDecodeCallback;
import com.iap.ac.android.mpm.base.model.route.ACDecodeConfig;
import id.dana.data.constant.BranchLinkConstant;
import java.util.HashMap;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public long f9692a;
    public String b = ACConstants.Scene.SOURCE_FROM_SCAN;
    public ACDecodeConfig c;
    public IDecodeCallback d;

    public static void a(Result result, IDecodeCallback iDecodeCallback) {
        ACMonitor.getInstance("ac_biz").flush();
        if (iDecodeCallback != null) {
            try {
                ACLog.i(Constants.TAG, String.format("send result code:%s, message:%s ", new Object[]{result.resultCode, result.resultMessage}));
                iDecodeCallback.onResult(result);
            } catch (Throwable th) {
                ACLog.e(Constants.TAG, th.getMessage(), th);
                ACLogEvent.exceptionLog(th.getMessage());
            }
        }
    }

    public abstract void a(@NonNull b bVar);

    public abstract void a(@NonNull b bVar, @NonNull com.iap.ac.android.b0.a aVar);

    public abstract void a(@NonNull b bVar, @NonNull c cVar);

    public abstract void a(@NonNull c cVar);

    public void b() {
        Result result = new Result();
        result.resultCode = ResultCode.UNKNOWN_EXCEPTION;
        result.resultMessage = "Oops! System busy. Try again later!";
        a(result, this.d);
    }

    public abstract void b(@NonNull c cVar);

    public synchronized void c() {
        if (this.d != null) {
            ConfigCenter.INSTANCE.refreshConfigs();
            if (ConfigCenter.INSTANCE.getLoadingSpiToggle()) {
                try {
                    this.d.showLoading();
                } catch (Throwable th) {
                    ACLog.e(Constants.TAG, th.getMessage(), th);
                    ACLogEvent.exceptionLog(th.getMessage());
                }
            }
        }
    }

    public synchronized void a() {
        if (this.d != null) {
            ConfigCenter.INSTANCE.refreshConfigs();
            if (ConfigCenter.INSTANCE.getLoadingSpiToggle()) {
                try {
                    this.d.dismissLoading();
                } catch (Throwable th) {
                    ACLog.e(Constants.TAG, th.getMessage(), th);
                    ACLogEvent.exceptionLog(th.getMessage());
                }
            }
        }
    }

    public void a(String str, String str2) {
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_mpm_decode_start").addParams(BranchLinkConstant.AcCashierParams.CODE_VALUE, str).addParams("decodeConfig", (Object) this.c).addParams(RVParams.LONG_BIZ_SCENARIO, str2).event();
    }

    public void a(c cVar, String str, String str2) {
        String str3 = cVar.b;
        String str4 = cVar.c;
        Result result = new Result();
        if (str3 == null) {
            str3 = ResultCode.INVALID_NETWORK;
        }
        result.resultCode = str3;
        if (str4 == null) {
            str4 = "Oops! System busy. Try again later!";
        }
        result.resultMessage = str4;
        ACLogEvent addParams = ACLogEvent.newLogger("ac_mpm_decode_end", this.f9692a, result).addParams(RVParams.LONG_BIZ_SCENARIO, str).addParams("endNode", cVar.d).addParams("scene", this.b);
        if (str2 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("paymentRedirectUrl", str2);
            addParams.addAll(hashMap);
        }
        addParams.event();
    }
}
