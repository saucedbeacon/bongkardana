package com.iap.ac.android.cpm.online.manager;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.callback.IPaymentCodeListener;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.model.remoteconfig.cpm.CPMConfig;
import com.iap.ac.android.biz.common.spi.SPIManager;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.cpm.online.rpc.model.MobileInStorePaymentEncodeResultInfo;
import com.iap.ac.android.cpm.online.rpc.service.MobileInStorePaymentEncodeRpcResult;
import com.iap.ac.android.x.a;
import com.iap.ac.android.x.b;
import com.iap.ac.android.x.c;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.setCheckBoxPrompt;

public class OnlinePaymentCodeManager {

    /* renamed from: a  reason: collision with root package name */
    public ReentrantLock f9697a = new ReentrantLock();
    public String b;
    public int c = 5;
    public int d = 30;

    public final void a(MobileInStorePaymentEncodeRpcResult mobileInStorePaymentEncodeRpcResult, IPaymentCodeListener iPaymentCodeListener, String str, long j) {
        String str2 = mobileInStorePaymentEncodeRpcResult.traceId;
        List<MobileInStorePaymentEncodeResultInfo> list = mobileInStorePaymentEncodeRpcResult.mobileInStorePaymentEncodeResultInfos;
        if (list == null) {
            a(iPaymentCodeListener, ResultCode.INVALID_NETWORK, "Oops! System busy. Try again later!", "RPC refresh code error: code list is null", SystemClock.elapsedRealtime() - j, str2);
        } else if (!list.isEmpty()) {
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            for (MobileInStorePaymentEncodeResultInfo next : mobileInStorePaymentEncodeRpcResult.mobileInStorePaymentEncodeResultInfos) {
                c cVar = new c();
                cVar.f9778a = next.paymentCode;
                cVar.b = Utils.stringToLong(next.startServerTime, System.currentTimeMillis());
                concurrentLinkedQueue.add(cVar);
            }
            b.b().a(str, concurrentLinkedQueue);
            if (iPaymentCodeListener != null) {
                String a2 = b.b().a(str);
                if (a2 != null) {
                    b(iPaymentCodeListener, a2, str, "REMOTE", SystemClock.elapsedRealtime() - j, str2);
                    return;
                }
                a(iPaymentCodeListener, ResultCode.INVALID_NETWORK, "Oops! System busy. Try again later!", "RPC refresh code error: no valid code", SystemClock.elapsedRealtime() - j, str2);
            }
        } else {
            a(iPaymentCodeListener, ResultCode.INVALID_NETWORK, "Oops! System busy. Try again later!", "RPC refresh code error: result code list is empty", SystemClock.elapsedRealtime() - j, str2);
        }
    }

    public final void b(IPaymentCodeListener iPaymentCodeListener, String str, String str2, String str3, long j, String str4) {
        if (iPaymentCodeListener != null) {
            iPaymentCodeListener.onPaymentCodeUpdated(str);
        }
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_cpm_onlinecode").addParams("result", DiskFormatter.TB).addParams("codeType", str2).addParams("source", str3).addParams("timeCost", (Object) Long.valueOf(j)).addParams("traceId", str4).event();
        ACLog.i(Constants.TAG, "OnlinePaymentCodeManager, notifyUpdateSuccess");
    }

    public void getPaymentCode(String str, CPMConfig cPMConfig, IPaymentCodeListener iPaymentCodeListener) {
        if (!ConfigCenter.INSTANCE.getOnlineCodeToggle()) {
            a(iPaymentCodeListener, ResultCode.UNKNOWN_EXCEPTION, "Oops! System busy. Try again later!", "getPaymentCode, feature is disabled", 0, "");
            return;
        }
        this.b = str;
        if (cPMConfig != null) {
            this.c = cPMConfig.encodeNum;
            this.d = cPMConfig.encodeFrequency;
            a aVar = new a();
            aVar.f9776a = cPMConfig.decodeWindowLeft * 1000;
            aVar.b = cPMConfig.decodeWindowRight * 1000;
            b.b().a(aVar);
        }
        if (TextUtils.isEmpty(this.b)) {
            a(iPaymentCodeListener, ResultCode.UNKNOWN_EXCEPTION, "Oops! System busy. Try again later!", "getPaymentCode, code type is empty", 0, "");
            return;
        }
        synchronized (this) {
            String a2 = b.b().a(this.b);
            if (a2 != null) {
                String openId = SPIManager.getInstance().getOpenId();
                if (!TextUtils.isEmpty(openId) ? openId.equals(ACManager.getInstance().fetch("AC_LOCAL_OPEN_ID")) : true) {
                    b(iPaymentCodeListener, a2, str, setCheckBoxPrompt.length.SOURCE_LOCAL, 0, "");
                }
            }
            String str2 = this.b;
            int i = this.c;
            int i2 = this.d;
            ACLog.i(Constants.TAG, "refreshPaymentCode begin");
            IAPAsyncTask.asyncTask((Runnable) new com.iap.ac.android.y.b(this, i, str2, i2, iPaymentCodeListener));
        }
    }

    public final void a(IPaymentCodeListener iPaymentCodeListener, String str, String str2, String str3, long j, String str4) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1909158058, oncanceled);
            onCancelLoad.getMin(1909158058, oncanceled);
        }
        if (iPaymentCodeListener != null) {
            iPaymentCodeListener.onPaymentCodeUpdateFailed(str, str2);
        }
        ACLogEvent.commonRpcFailEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_cpm_onlinecode", str, str3, j, str4);
        ACLog.e(Constants.TAG, "OnlinePaymentCodeManager, notifyUpdateFailed, message: ".concat(String.valueOf(str3)));
        ACLogEvent.crucialRpcEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_cpm_onlinecode_fail", str3, str4);
    }
}
