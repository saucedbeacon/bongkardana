package com.alipay.plus.android.unipayresult.sdk.client;

import androidx.annotation.NonNull;
import com.alipay.plus.android.unipayresult.sdk.client.IUnifierQuery;
import com.alipay.plus.android.unipayresult.sdk.executor.AbstractUnifierQueryExecutor;
import com.alipay.plus.android.unipayresult.sdk.executor.UnifierSyncQueryExecutor;
import com.alipay.plus.android.unipayresult.sdk.executor.a.b;
import java.util.HashMap;
import java.util.Map;

public class UnifierQueryClient implements IUnifierQuery {

    /* renamed from: a  reason: collision with root package name */
    private static UnifierQueryClient f9517a;
    private Map<String, IUnifierQuery.QueryConfig> b = new HashMap();
    private UnifierQueryClientContext c;
    private b d = new b();

    public static UnifierQueryClient getInstance() {
        if (f9517a == null) {
            f9517a = new UnifierQueryClient();
        }
        return f9517a;
    }

    public UnifierQueryClientContext getClientContext() {
        return this.c;
    }

    public void initialize(UnifierQueryClientContext unifierQueryClientContext) {
        this.c = unifierQueryClientContext;
    }

    public boolean isQueryingNow(@NonNull String str) {
        return this.b.get(str) != null;
    }

    public void startQuery(@NonNull IUnifierQuery.QueryConfig queryConfig) {
        if (queryConfig.isValid()) {
            this.b.put(queryConfig.mBizType, queryConfig);
            for (AbstractUnifierQueryExecutor next : queryConfig.mQueryExecutors) {
                if (next instanceof UnifierSyncQueryExecutor) {
                    this.d.a();
                    ((UnifierSyncQueryExecutor) next).setSyncCenter(this.d);
                }
                next.setQueryConfig(queryConfig);
                next.setPayResultHandler(queryConfig.mPayResultHandler);
                next.start();
            }
        }
    }

    public void stopQuery(@NonNull String str) {
        IUnifierQuery.QueryConfig queryConfig = this.b.get(str);
        if (queryConfig != null) {
            for (AbstractUnifierQueryExecutor stop : queryConfig.mQueryExecutors) {
                stop.stop();
            }
        }
    }
}
