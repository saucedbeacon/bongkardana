package com.alipay.plus.android.unipayresult.sdk.executor;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.JSON;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.unipayresult.sdk.callback.IUnifierPayResultHandler;
import com.alipay.plus.android.unipayresult.sdk.client.IUnifierQuery;
import com.alipay.plus.android.unipayresult.sdk.executor.a.a;
import com.alipay.plus.android.unipayresult.sdk.request.IUnifierQueryDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractUnifierQueryExecutor {
    protected Context mContext;
    protected boolean mIsHandlingResult;
    protected IUnifierPayResultHandler mPayResultHandler;
    protected IUnifierQuery.QueryConfig mQueryConfig;
    protected IUnifierQueryDelegate mQueryDelegate;

    protected AbstractUnifierQueryExecutor(@NonNull Context context, @NonNull IUnifierQueryDelegate iUnifierQueryDelegate) {
        this.mContext = context.getApplicationContext();
        this.mQueryDelegate = iUnifierQueryDelegate;
    }

    public Context getContext() {
        return this.mContext;
    }

    public IUnifierQuery.QueryConfig getQueryConfig() {
        return this.mQueryConfig;
    }

    /* access modifiers changed from: protected */
    public void handlePayResultInternal(String str) {
        if (!this.mIsHandlingResult) {
            LoggerWrapper.e("AbstractUnifierQueryExecutor", "in handlePayResult! but query task stopped. do NOTHING!");
        } else if (TextUtils.isEmpty(str)) {
            LoggerWrapper.e("AbstractUnifierQueryExecutor", "pay order info is empty! do NOTHING!");
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = JSON.parseArray(str).iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toString());
                }
                handlePayResultInternal((List<String>) arrayList);
            } catch (Exception e) {
                LoggerWrapper.e("AbstractUnifierQueryExecutor", "Cannot parse Order List!", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void handlePayResultInternal(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            UnifierPayResultInfo unifierPayResultInfo = new UnifierPayResultInfo();
            if (this.mQueryConfig.mDeserializeBizOrderClazz != null) {
                unifierPayResultInfo.mBizOrderInfo = JSON.parseObject(next, this.mQueryConfig.mDeserializeBizOrderClazz);
            }
            this.mQueryDelegate.parseBizResultInfo(next, unifierPayResultInfo);
            IUnifierPayResultHandler iUnifierPayResultHandler = this.mPayResultHandler;
            if (iUnifierPayResultHandler != null && iUnifierPayResultHandler.handlePayResult(unifierPayResultInfo)) {
                arrayList.add(unifierPayResultInfo);
            }
        }
        a.a(this.mQueryConfig.mBizType, (List<UnifierPayResultInfo>) arrayList);
    }

    public void setPayResultHandler(IUnifierPayResultHandler iUnifierPayResultHandler) {
        this.mPayResultHandler = iUnifierPayResultHandler;
    }

    public void setQueryConfig(IUnifierQuery.QueryConfig queryConfig) {
        this.mQueryConfig = queryConfig;
    }

    public void setQueryDelegate(@NonNull IUnifierQueryDelegate iUnifierQueryDelegate) {
        this.mQueryDelegate = iUnifierQueryDelegate;
    }

    public abstract void start();

    public abstract void stop();
}
