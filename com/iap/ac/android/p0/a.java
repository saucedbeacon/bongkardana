package com.iap.ac.android.p0;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.callback.IAuthCallback;
import com.iap.ac.android.biz.common.model.AuthResult;
import com.iap.ac.android.biz.common.model.Result;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.mpm.base.interfaces.INodeCallback;

public class a implements IAuthCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f9754a;
    public final /* synthetic */ d b;
    public final /* synthetic */ INodeCallback c;

    public a(b bVar, long j, d dVar, INodeCallback iNodeCallback) {
        this.f9754a = j;
        this.b = dVar;
        this.c = iNodeCallback;
    }

    public void onResult(AuthResult authResult) {
        boolean z = authResult != null && !TextUtils.isEmpty(authResult.authCode);
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_get_authcode").addParams("result", z ? DiskFormatter.TB : "F").addParams("timeCost", String.valueOf(SystemClock.elapsedRealtime() - this.f9754a)).event();
        d dVar = this.b;
        dVar.e = z;
        if (z) {
            dVar.f = authResult.authCode;
        } else {
            Result result = new Result();
            result.resultCode = ResultCode.INVALID_NETWORK;
            result.resultMessage = "Oops! System busy. Try again later!";
            d dVar2 = this.b;
            dVar2.b = ResultCode.INVALID_NETWORK;
            if (authResult == null) {
                dVar2.c = "get auth code fail: auth result is null ";
            } else {
                dVar2.c = "get auth code fail: auth code is empty";
            }
            d dVar3 = this.b;
            dVar3.d = "oauth";
            dVar3.f9748a = result;
        }
        this.c.onResult(this.b);
    }
}
