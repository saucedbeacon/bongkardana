package com.alipay.plus.android.unipayresult.sdk.executor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.task.async.IAPAsyncCallback;
import com.alipay.plus.android.unipayresult.sdk.executor.a.a;
import com.alipay.plus.android.unipayresult.sdk.request.IUnifierQueryDelegate;
import com.alipay.plus.android.unipayresult.sdk.request.UnifierPollingRpcRequest;
import com.alipayplus.mobile.component.uniresultpage.service.result.UniResultPageQueryResult;
import java.util.List;

public class UnifierPollingRpcExecutor extends AbstractUnifierQueryExecutor {

    /* renamed from: a  reason: collision with root package name */
    private List<Integer> f9518a;
    private HandlerThread b;
    private Handler c;
    private int d = 0;
    private Runnable e = new Runnable() {
        public void run() {
            if (UnifierPollingRpcExecutor.this.mIsHandlingResult) {
                UnifierPollingRpcExecutor.this.a();
                UnifierPollingRpcExecutor.access$104(UnifierPollingRpcExecutor.this);
                UnifierPollingRpcExecutor.this.b();
                return;
            }
            LoggerWrapper.i("UnifierPollingRpcExecutor", "Task is stopped! Will not schedule next polling.");
        }
    };

    public UnifierPollingRpcExecutor(@NonNull Context context, @NonNull List<Integer> list, @NonNull IUnifierQueryDelegate iUnifierQueryDelegate) {
        super(context, iUnifierQueryDelegate);
        this.f9518a = list;
    }

    /* access modifiers changed from: private */
    public void a() {
        UnifierPollingRpcRequest unifierPollingRpcRequest = (UnifierPollingRpcRequest) this.mQueryDelegate.generateRequest();
        if (unifierPollingRpcRequest == null || TextUtils.isEmpty(unifierPollingRpcRequest.mLinkTargetId) || unifierPollingRpcRequest.mBizNos == null || unifierPollingRpcRequest.mBizNos.size() == 0) {
            LoggerWrapper.w("UnifierPollingRpcExecutor", "Polling request illegal, do NOTHING!");
        } else {
            a.a(this.mQueryConfig.mBizType, unifierPollingRpcRequest, new IAPAsyncCallback<UniResultPageQueryResult>() {
                public void onFailure(IAPError iAPError) {
                    LoggerWrapper.e("UnifierPollingRpcExecutor", String.format("Rpc query pay result FAILED! bizType = %s, error = %s", new Object[]{UnifierPollingRpcExecutor.this.mQueryConfig.mBizType, iAPError.toString()}));
                }

                @SuppressLint({"DefaultLocale"})
                public void onSuccess(UniResultPageQueryResult uniResultPageQueryResult) {
                    if (uniResultPageQueryResult == null) {
                        LoggerWrapper.w("UnifierPollingRpcExecutor", "Receive null pay rpc query message, do NOTHING!");
                        return;
                    }
                    Object[] objArr = new Object[2];
                    int i = 0;
                    objArr[0] = UnifierPollingRpcExecutor.this.mQueryConfig.mBizType;
                    if (uniResultPageQueryResult.bizModelsJsonStr != null) {
                        i = uniResultPageQueryResult.bizModelsJsonStr.length();
                    }
                    objArr[1] = Integer.valueOf(i);
                    LoggerWrapper.i("UnifierPollingRpcExecutor", String.format("Receive pay rpc query result! bizType = %s, bytes = %d", objArr));
                    UnifierPollingRpcExecutor.this.handlePayResultInternal(uniResultPageQueryResult.bizModelsJsonStr);
                }
            });
        }
    }

    static /* synthetic */ int access$104(UnifierPollingRpcExecutor unifierPollingRpcExecutor) {
        int i = unifierPollingRpcExecutor.d + 1;
        unifierPollingRpcExecutor.d = i;
        return i;
    }

    /* access modifiers changed from: private */
    public void b() {
        Handler handler = this.c;
        if (handler != null) {
            handler.postDelayed(this.e, (long) c());
        }
    }

    private int c() {
        int i = this.d;
        int size = this.f9518a.size() - 1;
        if (i > size) {
            i = size;
        }
        return this.f9518a.get(i).intValue();
    }

    public void start() {
        if (this.mQueryConfig == null) {
            LoggerWrapper.e("UnifierPollingRpcExecutor", "setQueryConfig should be called first");
            return;
        }
        LoggerWrapper.i("UnifierPollingRpcExecutor", String.format("Start polling-rpc query! BizType:%s", new Object[]{this.mQueryConfig.mBizType}));
        if (this.b == null) {
            HandlerThread handlerThread = new HandlerThread("UnifierPollingRpcExecutor_Thread");
            this.b = handlerThread;
            handlerThread.start();
            this.c = new Handler(this.b.getLooper());
        }
        this.d = 0;
        this.mIsHandlingResult = true;
        this.c.removeCallbacks(this.e);
        b();
    }

    public void stop() {
        if (this.mQueryConfig == null) {
            LoggerWrapper.e("UnifierPollingRpcExecutor", "setQueryConfig should be called first");
            return;
        }
        LoggerWrapper.i("UnifierPollingRpcExecutor", String.format("Stop polling-rpc query! BizType: %s", new Object[]{this.mQueryConfig.mBizType}));
        this.mIsHandlingResult = false;
        this.d = 0;
        Handler handler = this.c;
        if (handler != null) {
            handler.removeCallbacks(this.e);
            this.c = null;
        }
        HandlerThread handlerThread = this.b;
        if (handlerThread != null) {
            handlerThread.quit();
            this.b = null;
        }
    }
}
