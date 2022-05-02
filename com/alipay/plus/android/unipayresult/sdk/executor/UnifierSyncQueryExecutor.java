package com.alipay.plus.android.unipayresult.sdk.executor;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.unipayresult.sdk.executor.a.b;
import com.alipay.plus.android.unipayresult.sdk.request.IUnifierQueryDelegate;
import java.util.List;

public class UnifierSyncQueryExecutor extends AbstractUnifierQueryExecutor implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private b f9519a;

    public UnifierSyncQueryExecutor(@NonNull Context context, @NonNull IUnifierQueryDelegate iUnifierQueryDelegate) {
        super(context, iUnifierQueryDelegate);
    }

    public void handleSyncMessage(@NonNull List<String> list) {
        if (this.mQueryConfig == null) {
            LoggerWrapper.e("UnifierSyncQueryExecutor", "setQueryConfig should be called first");
            return;
        }
        LoggerWrapper.i("UnifierSyncQueryExecutor", String.format("Receive sync message for: bizType = %s", new Object[]{this.mQueryConfig.mBizType}));
        handlePayResultInternal(list);
    }

    public void setSyncCenter(b bVar) {
        this.f9519a = bVar;
    }

    public void start() {
        if (this.mQueryConfig == null) {
            LoggerWrapper.e("UnifierSyncQueryExecutor", "setQueryConfig should be called first");
        } else if (this.f9519a == null) {
            LoggerWrapper.e("UnifierSyncQueryExecutor", "setSyncCenter should be called first");
        } else {
            LoggerWrapper.i("UnifierSyncQueryExecutor", String.format("Start sync pay result: bizType = %s", new Object[]{this.mQueryConfig.mBizType}));
            this.f9519a.a(this.mQueryConfig.mBizType, (b.a) this);
        }
    }

    public void stop() {
        if (this.mQueryConfig == null) {
            LoggerWrapper.e("UnifierSyncQueryExecutor", "setQueryConfig should be called first");
        } else if (this.f9519a == null) {
            LoggerWrapper.e("UnifierSyncQueryExecutor", "setSyncCenter should be called first");
        } else {
            LoggerWrapper.i("UnifierSyncQueryExecutor", String.format("Stop sync pay result: bizType = %s", new Object[]{this.mQueryConfig.mBizType}));
            this.f9519a.b(this.mQueryConfig.mBizType, this);
        }
    }
}
