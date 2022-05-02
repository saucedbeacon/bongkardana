package com.iap.ac.config.lite.listener.commonconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.listener.ConfigChangeType;
import org.json.JSONObject;

public abstract class AbstractTypedConfigListener<T> implements ICommonConfigListener {

    /* renamed from: a  reason: collision with root package name */
    private static final String f11073a = e.b("ConfigChangeListener");
    protected Class<T> mTypedClazz;

    protected AbstractTypedConfigListener(Class<T> cls) {
        this.mTypedClazz = cls;
    }

    @WorkerThread
    public void onCommonConfigChanged(@NonNull String str, @Nullable Object obj, @NonNull ConfigChangeType configChangeType) {
        if (this.mTypedClazz.isInstance(obj)) {
            onConfigChangedInternal(str, obj);
        } else if (obj == null || obj == JSONObject.NULL) {
            onConfigChangedInternal(str, (Object) null);
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
        String str2 = f11073a;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = obj != null ? obj.getClass().getSimpleName() : "null";
        ACLog.e(str2, String.format("onConfigValueTypeNotConform: key = %s, valueClass = %s.", objArr));
    }
}
