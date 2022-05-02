package com.iap.ac.android.y;

import android.os.SystemClock;
import com.iap.ac.android.biz.common.callback.IPaymentCodeListener;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.cpm.online.manager.OnlinePaymentCodeManager;
import com.iap.ac.android.cpm.online.rpc.service.MobileInStorePaymentEncodeRpcResult;

public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9779a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ IPaymentCodeListener d;
    public final /* synthetic */ OnlinePaymentCodeManager e;

    public b(OnlinePaymentCodeManager onlinePaymentCodeManager, int i, String str, int i2, IPaymentCodeListener iPaymentCodeListener) {
        this.e = onlinePaymentCodeManager;
        this.f9779a = i;
        this.b = str;
        this.c = i2;
        this.d = iPaymentCodeListener;
    }

    public void run() {
        OnlinePaymentCodeManager onlinePaymentCodeManager;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ACLog.i(Constants.TAG, "refreshPaymentCode start in thread");
        this.e.f9697a.lock();
        try {
            MobileInStorePaymentEncodeRpcResult a2 = new a().a(this.f9779a, this.b, this.c);
            if (a2 == null) {
                this.e.a(this.d, ResultCode.INVALID_NETWORK, "Oops! System busy. Try again later!", "RPC refresh code error: rpc failed", SystemClock.elapsedRealtime() - elapsedRealtime, "");
            } else if (a2.success) {
                int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                com.iap.ac.android.x.b.b().a(Utils.stringToLong(a2.currentServerTime, System.currentTimeMillis()) + ((long) (elapsedRealtime2 / 2)));
                this.e.a(a2, this.d, this.b, elapsedRealtime);
            } else {
                OnlinePaymentCodeManager onlinePaymentCodeManager2 = this.e;
                IPaymentCodeListener iPaymentCodeListener = this.d;
                String str = a2.errorCode;
                String str2 = a2.errorMessage;
                onlinePaymentCodeManager2.a(iPaymentCodeListener, str, str2, str2, SystemClock.elapsedRealtime() - elapsedRealtime, a2.traceId);
            }
            onlinePaymentCodeManager = this.e;
        } catch (Throwable th) {
            this.e.f9697a.unlock();
            throw th;
        }
        onlinePaymentCodeManager.f9697a.unlock();
    }
}
