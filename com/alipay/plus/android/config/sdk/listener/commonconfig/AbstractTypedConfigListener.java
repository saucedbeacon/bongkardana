package com.alipay.plus.android.config.sdk.listener.commonconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.listener.ConfigChangeType;

public abstract class AbstractTypedConfigListener<T> implements ICommonConfigListener {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10748a = e.a("ConfigChangeListener");
    protected Class<T> mTypedClazz;

    protected AbstractTypedConfigListener(Class<T> cls) {
        this.mTypedClazz = cls;
    }

    @WorkerThread
    public void onCommonConfigChanged(@NonNull String str, @Nullable Object obj, @NonNull ConfigChangeType configChangeType) {
        if (obj == null || this.mTypedClazz.isInstance(obj)) {
            onConfigChangedInternal(str, obj);
        } else {
            onConfigValueTypeNotConform(str, obj);
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract void onConfigChangedInternal(@NonNull String str, @Nullable T t);

    /* access modifiers changed from: protected */
    @WorkerThread
    public void onConfigValueTypeNotConform(@NonNull String str, @Nullable Object obj) {
        String str2 = f10748a;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = obj != null ? obj.getClass().getSimpleName() : "null";
        LoggerWrapper.e(str2, String.format("onConfigValueTypeNotConform: key = %s, valueClass = %s.", objArr));
    }
}
