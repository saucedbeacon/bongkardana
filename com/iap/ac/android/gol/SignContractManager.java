package com.iap.ac.android.gol;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.AcBaseResult;
import com.iap.ac.android.biz.common.model.AcCallback;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.model.gol.SignContractRequest;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.d.e;
import com.iap.ac.android.gol.model.SignContractBizContent;
import com.iap.ac.android.z.a;
import com.iap.ac.android.z.b;
import com.iap.ac.android.z.d;

public class SignContractManager {

    /* renamed from: a  reason: collision with root package name */
    public static volatile SignContractManager f9714a;

    public static SignContractManager getInstance() {
        if (f9714a == null) {
            synchronized (SignContractManager.class) {
                if (f9714a == null) {
                    f9714a = new SignContractManager();
                }
            }
        }
        return f9714a;
    }

    public final void a(@NonNull AcCallback<AcBaseResult> acCallback, String str, String str2, String str3, long j, boolean z) {
        ACLog.i(Constants.TAG, "signContract fail: ".concat(String.valueOf(str3)));
        ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_gol_sign_contract_fail", str3);
        if (!z) {
            e.a(false, (String) null, j, false);
        }
        AcBaseResult acBaseResult = new AcBaseResult();
        acBaseResult.success = false;
        acBaseResult.errorCode = str;
        acBaseResult.errorMessage = str2;
        acCallback.onResult(acBaseResult);
    }

    public void signContract(@NonNull boolean z, @NonNull SignContractRequest signContractRequest, @NonNull AcCallback<AcBaseResult> acCallback) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ACLog.i(Constants.TAG, "signContract enter: ".concat(String.valueOf(signContractRequest)));
        if (signContractRequest == null || acCallback == null) {
            ACLog.e(Constants.TAG, "request or callback can not be null");
            return;
        }
        SignContractBizContent signContractBizContent = null;
        if (!TextUtils.isEmpty(signContractRequest.bizContent)) {
            signContractBizContent = (SignContractBizContent) e.a(signContractRequest.bizContent, SignContractBizContent.class);
        }
        if (!z) {
            if (signContractBizContent == null) {
                ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_gol_sign_contract_enter").event();
            } else {
                ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_gol_sign_contract_enter").addParams("referenceAgreementId", signContractBizContent.referenceAgreementId).addParams("authClientName", signContractBizContent.authClientName).event();
            }
        }
        if (!ConfigCenter.INSTANCE.getGolSignContractToggle()) {
            a(acCallback, ResultCode.UNKNOWN_EXCEPTION, "Oops! System busy. Try again later!", "signContract feature is closed by configuration.", elapsedRealtime, z);
        } else if (signContractBizContent != null) {
            com.iap.ac.android.z.e eVar = new com.iap.ac.android.z.e(z);
            boolean z2 = signContractRequest.needCallback;
            ACLog.i(Constants.TAG, "signContract BizContentAuthProcessor enter");
            eVar.f9782a = SystemClock.elapsedRealtime();
            eVar.c = signContractBizContent.authRedirectUrl;
            eVar.d = signContractBizContent.authState;
            eVar.b = z2;
            eVar.i = signContractBizContent;
            eVar.e = acCallback;
            eVar.f = signContractBizContent.referenceAgreementId;
            eVar.g = signContractBizContent.passThroughInfo;
            IAPAsyncTask.asyncTask((Runnable) new d(eVar, signContractBizContent));
        } else if (!TextUtils.isEmpty(signContractRequest.authUrl)) {
            b bVar = new b(z);
            String str = signContractRequest.authUrl;
            boolean z3 = signContractRequest.needCallback;
            ACLog.i(Constants.TAG, "signContract handleAuthUrl enter");
            bVar.b = z3;
            bVar.e = acCallback;
            bVar.f9782a = SystemClock.elapsedRealtime();
            IAPAsyncTask.asyncTask((Runnable) new a(bVar, str));
        } else {
            StringBuilder a2 = com.iap.ac.android.a.a.a("bizContent and authUrl are both empty or bizContent invalid, bizContent:");
            a2.append(signContractRequest.bizContent);
            a(acCallback, ResultCode.PARAM_ILLEGAL, "Oops! System busy. Try again later!", a2.toString(), elapsedRealtime, z);
        }
    }
}
