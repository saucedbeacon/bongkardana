package com.iap.ac.android.z;

import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.callback.IAuthCallback;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.AuthResult;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.common.log.ACLog;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f9780a;
    public final /* synthetic */ b b;

    /* renamed from: com.iap.ac.android.z.a$a  reason: collision with other inner class name */
    public class C0033a implements IAuthCallback {
        public C0033a() {
        }

        public void onResult(@NonNull AuthResult authResult) {
            if (authResult == null) {
                authResult = new AuthResult();
            }
            a.this.b.a(authResult);
        }
    }

    public a(b bVar, String str) {
        this.b = bVar;
        this.f9780a = str;
    }

    public void run() {
        ACLog.i(Constants.TAG, "signContract handleAuthUrl enter in thread");
        SPIManager.getInstance().getAuthCode(this.f9780a, (IAuthCallback) new C0033a());
    }
}
