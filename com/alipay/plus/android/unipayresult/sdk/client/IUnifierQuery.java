package com.alipay.plus.android.unipayresult.sdk.client;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.plus.android.unipayresult.sdk.callback.IUnifierPayResultHandler;
import com.alipay.plus.android.unipayresult.sdk.executor.AbstractUnifierQueryExecutor;
import java.util.ArrayList;
import java.util.List;

public interface IUnifierQuery {

    public static class QueryConfig {
        @NonNull
        public String mBizType;
        @Nullable
        public Class<?> mDeserializeBizOrderClazz;
        @Nullable
        public IUnifierPayResultHandler mPayResultHandler;
        public List<AbstractUnifierQueryExecutor> mQueryExecutors;

        public QueryConfig(@NonNull String str) {
            this.mBizType = str;
        }

        public QueryConfig addQueryExecutor(@NonNull AbstractUnifierQueryExecutor abstractUnifierQueryExecutor) {
            if (this.mQueryExecutors == null) {
                this.mQueryExecutors = new ArrayList();
            }
            this.mQueryExecutors.add(abstractUnifierQueryExecutor);
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r1.mQueryExecutors;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean isValid() {
            /*
                r1 = this;
                java.lang.String r0 = r1.mBizType
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x0014
                java.util.List<com.alipay.plus.android.unipayresult.sdk.executor.AbstractUnifierQueryExecutor> r0 = r1.mQueryExecutors
                if (r0 == 0) goto L_0x0014
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x0014
                r0 = 1
                return r0
            L_0x0014:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.plus.android.unipayresult.sdk.client.IUnifierQuery.QueryConfig.isValid():boolean");
        }

        public QueryConfig setDeserializeBizOrderClazz(@Nullable Class<?> cls) {
            this.mDeserializeBizOrderClazz = cls;
            return this;
        }

        public QueryConfig setPayResultHandler(@Nullable IUnifierPayResultHandler iUnifierPayResultHandler) {
            this.mPayResultHandler = iUnifierPayResultHandler;
            return this;
        }
    }

    boolean isQueryingNow(@NonNull String str);

    void startQuery(@NonNull QueryConfig queryConfig);

    void stopQuery(@NonNull String str);
}
