package com.iap.ac.android.z;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.AcBaseResult;
import com.iap.ac.android.biz.common.model.AcCallback;
import com.iap.ac.android.biz.common.model.AuthResult;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.d.e;
import com.iap.ac.android.gol.rpc.AuthProcessor;
import com.iap.ac.android.gol.rpc.request.AuthPrepareCallbackRequest;
import com.iap.ac.android.gol.rpc.result.AuthPrepareCallbackResult;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public long f9782a;
    public boolean b;
    public String c;
    public String d;
    public AcCallback<AcBaseResult> e;
    public String f;
    public String g;
    public boolean h;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AuthResult f9783a;

        public a(AuthResult authResult) {
            this.f9783a = authResult;
        }

        public void run() {
            String str;
            ACLog.i(Constants.TAG, "signContract handleAuthResult enter");
            String str2 = this.f9783a.authCode;
            String str3 = "Oops! System busy. Try again later!";
            if (TextUtils.isEmpty(str2)) {
                String str4 = TextUtils.isEmpty(this.f9783a.errorCode) ? ResultCode.UNKNOWN_EXCEPTION : this.f9783a.errorCode;
                if (!TextUtils.isEmpty(this.f9783a.errorMessage)) {
                    str3 = this.f9783a.errorMessage;
                }
                c.this.a(false, str4, str3, "invalid getAuthCode result: ".concat(String.valueOf(str3)));
                return;
            }
            if (!TextUtils.isEmpty(this.f9783a.authState)) {
                c.this.d = this.f9783a.authState;
            }
            if (!TextUtils.isEmpty(this.f9783a.authRedirectUrl)) {
                c.this.c = this.f9783a.authRedirectUrl;
            }
            c cVar = c.this;
            if (cVar.b) {
                AuthProcessor authProcessor = new AuthProcessor();
                AuthPrepareCallbackRequest authPrepareCallbackRequest = new AuthPrepareCallbackRequest();
                authPrepareCallbackRequest.authCode = str2;
                c cVar2 = c.this;
                authPrepareCallbackRequest.authState = cVar2.d;
                authPrepareCallbackRequest.authRedirectUrl = cVar2.c;
                authPrepareCallbackRequest.referenceAgreementId = cVar2.f;
                authPrepareCallbackRequest.passThroughInfo = cVar2.g;
                AuthPrepareCallbackResult authPrepareCallbackResult = null;
                try {
                    authPrepareCallbackResult = authProcessor.prepareCallback(authPrepareCallbackRequest);
                } catch (Throwable th) {
                    com.iap.ac.android.a.a.a("signContract failed, e: ", th, Constants.TAG);
                }
                if (authPrepareCallbackResult == null || !authPrepareCallbackResult.success) {
                    String concat = "auth prepare callback rpc error: ".concat(String.valueOf(authPrepareCallbackResult));
                    if (authPrepareCallbackResult == null) {
                        str = ResultCode.INVALID_NETWORK;
                    } else {
                        str = authPrepareCallbackResult.errorCode;
                    }
                    if (authPrepareCallbackResult != null) {
                        str3 = authPrepareCallbackResult.errorMessage;
                    }
                    c.this.a(false, str, str3, concat);
                    return;
                }
                if (!TextUtils.isEmpty(authPrepareCallbackResult.authRedirectUrl)) {
                    c.this.c = authPrepareCallbackResult.authRedirectUrl;
                }
                c.this.a(str2);
                return;
            }
            cVar.a(str2);
        }
    }

    public c(boolean z) {
        this.h = z;
    }

    public void a(@NonNull AuthResult authResult) {
        IAPAsyncTask.asyncTask((Runnable) new a(authResult));
    }

    public void a(boolean z, String str, String str2, String str3) {
        if (z) {
            StringBuilder a2 = com.iap.ac.android.a.a.a("signContract success, redirectUrl is: ");
            a2.append(this.c);
            ACLog.i(Constants.TAG, a2.toString());
            e.a(true, this.c, this.f9782a, this.h);
        } else {
            ACLog.i(Constants.TAG, "signContract fail: ".concat(String.valueOf(str3)));
            String str4 = this.c;
            long j = this.f9782a;
            boolean z2 = this.h;
            ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_gol_sign_contract_fail", str3);
            if (!z2) {
                e.a(false, str4, j, false);
            }
        }
        AcBaseResult acBaseResult = new AcBaseResult();
        acBaseResult.success = z;
        acBaseResult.errorCode = str;
        acBaseResult.errorMessage = str2;
        AcCallback<AcBaseResult> acCallback = this.e;
        if (acCallback != null) {
            acCallback.onResult(acBaseResult);
        } else {
            ACLog.i(Constants.TAG, "signContract handleCallback error, callback is null");
        }
    }

    public final void a(@NonNull String str) {
        StringBuilder a2 = com.iap.ac.android.a.a.a("gol signContract, redirect to payRedirectUrl: ");
        a2.append(this.c);
        ACLog.e(Constants.TAG, a2.toString());
        if (this.h) {
            a(true, "", "", "");
        } else if (TextUtils.isEmpty(this.c)) {
            a(false, ResultCode.PARAM_ILLEGAL, "Oops! System busy. Try again later!", "empty auth redirect url, ignore it");
        } else {
            try {
                this.c = this.c.replace("${authCode}", str);
                if (this.d == null) {
                    this.d = "";
                }
                this.c = this.c.replace("${authState}", this.d);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.c));
                intent.setFlags(268435456);
                ACManager.getInstance().getContext().startActivity(intent);
                a(true, "", "", "");
            } catch (Throwable th) {
                a(false, ResultCode.UNKNOWN_EXCEPTION, "Oops! System busy. Try again later!", "Gol jumpToMerchantApp error:".concat(String.valueOf(th)));
            }
        }
    }
}
