package com.iap.ac.android.j;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.callback.IAuthCallback;
import com.iap.ac.android.biz.common.callback.IAuthLoginCallback;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.internal.foundation.FoundationProxy;
import com.iap.ac.android.biz.common.model.AuthResult;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.model.remoteconfig.common.OAuthConfig;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.d.e;
import com.iap.ac.android.k.a;
import com.j256.ormlite.stmt.query.SimpleComparison;
import id.dana.data.constant.BranchLinkConstant;
import java.util.ArrayList;
import java.util.List;

public class c implements IAuthCallback {

    /* renamed from: a  reason: collision with root package name */
    public List<IAuthLoginCallback> f9722a = new ArrayList();
    public a b;
    public String c;
    public com.iap.ac.android.m.a d;
    public boolean e = false;
    public long f;
    public Context g;
    public String h;
    public String i;

    public c(Context context, String str, String str2) {
        this.g = context;
        this.h = str;
        this.i = str2;
        this.b = new a();
        this.d = new com.iap.ac.android.m.a();
        this.c = FoundationProxy.getInstance(this.h).getGateWayUrl();
    }

    public void onResult(AuthResult authResult) {
        if (FoundationProxy.getInstance(this.h).getNetworkType() == FoundationProxy.NetworkType.NETWORK_TYPE_ACRPC) {
            String str = authResult != null ? authResult.authCode : "";
            ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_get_authcode").addParams("result", TextUtils.isEmpty(str) ^ true ? DiskFormatter.TB : "F").addParams("timeCost", String.valueOf(SystemClock.elapsedRealtime() - this.f)).event();
            IAPAsyncTask.asyncTask((Runnable) new a(this, str));
        }
    }

    public void a(OAuthConfig oAuthConfig, IAuthLoginCallback iAuthLoginCallback) {
        if (FoundationProxy.getInstance(this.h).getNetworkType() != FoundationProxy.NetworkType.NETWORK_TYPE_ACRPC) {
            iAuthLoginCallback.onSuccess();
            return;
        }
        synchronized (this) {
            if (iAuthLoginCallback != null) {
                this.f9722a.add(iAuthLoginCallback);
            }
            if (!this.e) {
                this.e = true;
                a(oAuthConfig);
            }
        }
    }

    public void a() {
        String[] strArr;
        Context context = this.g;
        String str = this.c;
        String str2 = this.i;
        if (e.b()) {
            CookieSyncManager.createInstance(context);
        }
        String[] a2 = e.a(str);
        if (TextUtils.isEmpty(str2) || a2 == null || a2.length <= 0) {
            StringBuilder sb = new StringBuilder("clearCookie error, key: ");
            sb.append(str2);
            sb.append(", cookie: ");
            sb.append(a2);
            ACLog.e(Constants.TAG, sb.toString());
            return;
        }
        for (String str3 : a2) {
            if (str3 == null) {
                strArr = null;
            } else {
                strArr = str3.split(SimpleComparison.EQUAL_TO_OPERATION);
            }
            if (strArr != null && strArr.length > 0 && TextUtils.equals(str2.trim(), strArr[0].trim())) {
                CookieManager instance = CookieManager.getInstance();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArr[0].trim());
                sb2.append("=; Expires=Wed, 05 JAN 2000 23:59:59 GMT");
                instance.setCookie(str, sb2.toString());
            }
        }
        if (e.b()) {
            CookieSyncManager.getInstance().sync();
            return;
        }
        try {
            CookieManager.getInstance().flush();
        } catch (Exception e2) {
            ACLog.e(Constants.TAG, "clearCookie exception: ".concat(String.valueOf(e2)));
        }
    }

    public final void a(OAuthConfig oAuthConfig) {
        if (oAuthConfig != null) {
            ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_get_authcode_enter").addParams("mode", (Object) 0).addParams("clientId", oAuthConfig.clientId).addParams(GriverBaseConstants.KEY_CLIENT_ID, oAuthConfig.authClientId).addParams(BranchLinkConstant.OauthParams.SCOPES, (Object) oAuthConfig.scopes).event();
            this.f = SystemClock.elapsedRealtime();
            SPIManager.getInstance().getAuthCode(oAuthConfig.clientId, oAuthConfig.authClientId, oAuthConfig.scopes, this);
            return;
        }
        a(false, ResultCode.PARAM_ILLEGAL, "Oops! System busy. Try again later!", 0, "");
    }

    public final void a(boolean z, String str, String str2, long j, String str3) {
        ACLog.i(Constants.TAG, String.format("AuthLoginResult(%s), ".concat(String.valueOf(z)), new Object[]{this.h}));
        synchronized (this) {
            for (IAuthLoginCallback next : this.f9722a) {
                if (z) {
                    next.onSuccess();
                } else {
                    next.onFailed();
                }
            }
            if (z) {
                ACLogEvent.commonRpcSuccessEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_auth_login", j, str3);
            } else {
                ACLogEvent.commonRpcFailEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_auth_login", str, str2, j, str3);
                ACLogEvent.crucialRpcEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_auth_login_fail", str2, str3);
            }
            this.f9722a.clear();
        }
    }
}
