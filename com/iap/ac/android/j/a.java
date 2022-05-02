package com.iap.ac.android.j;

import android.os.SystemClock;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentLoginResult;
import com.iap.ac.android.common.account.ACUserInfo;
import com.iap.ac.android.common.account.ACUserInfoManager;
import com.iap.ac.android.common.account.IOAuthLoginCallback;
import com.iap.ac.android.common.account.OAuthService;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f9720a;
    public final /* synthetic */ c b;

    public a(c cVar, String str) {
        this.b = cVar;
        this.f9720a = str;
    }

    public void run() {
        c cVar;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                MobilePaymentLoginResult a2 = this.b.b.a(this.b.g, this.f9720a);
                if (a2 == null) {
                    this.b.a(false, ResultCode.INVALID_NETWORK, "Oops! System busy. Try again later!", SystemClock.elapsedRealtime() - elapsedRealtime, "");
                } else if (a2.success) {
                    ACManager.getInstance().save(ACManager.getInstance().getClientKeyStorageKey(this.b.h), a2.clientKey);
                    ACManager.getInstance().save(ACManager.getInstance().getOpenIdStorageKey(this.b.h), a2.openId);
                    ACUserInfo aCUserInfo = new ACUserInfo();
                    aCUserInfo.openId = a2.openId;
                    ACUserInfoManager.getInstance(this.b.h).setUserInfo(aCUserInfo);
                    OAuthService.INSTANCE.authLogin((String) null, (IOAuthLoginCallback) null);
                    this.b.a(true, (String) null, (String) null, SystemClock.elapsedRealtime() - elapsedRealtime, a2.traceId);
                } else {
                    this.b.a(false, a2.errorCode, a2.errorMessage, SystemClock.elapsedRealtime() - elapsedRealtime, a2.traceId);
                }
                cVar = this.b;
            } catch (Throwable th) {
                boolean unused = this.b.e = false;
                throw th;
            }
            boolean unused2 = cVar.e = false;
        }
    }
}
