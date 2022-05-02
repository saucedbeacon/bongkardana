package com.alipay.iap.android.f2fpay.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.f2fpay.b.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class F2FPayCallbacks<T> {
    protected final CopyOnWriteArrayList<T> mCallbacks = new CopyOnWriteArrayList<>();

    public interface Invoker<T> {
        void invoke(@NonNull T t);
    }

    @Nullable
    public IF2FPayCallbackHolder addCallback(@NonNull final T t) {
        synchronized (this.mCallbacks) {
            Iterator<T> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                if (it.next() == t) {
                    return null;
                }
            }
            LoggerWrapper.d("F2FPayCallbacks", "addCallback with callback=".concat(String.valueOf(t)));
            this.mCallbacks.add(t);
            AnonymousClass1 r1 = new IF2FPayCallbackHolder() {
                public void removeSelf() {
                    LoggerWrapper.d("F2FPayCallbacks", "removeSelf");
                    F2FPayCallbacks.this.removeCallback(t);
                }
            };
            return r1;
        }
    }

    public void callback(@NonNull Invoker<T> invoker) {
        synchronized (this.mCallbacks) {
            LoggerWrapper.d("F2FPayCallbacks", "callback start with invoker=".concat(String.valueOf(invoker)));
            Iterator<T> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                invoker.invoke(it.next());
            }
            LoggerWrapper.d("F2FPayCallbacks", "callback end with invoker=".concat(String.valueOf(invoker)));
        }
    }

    public void clear() {
        synchronized (this.mCallbacks) {
            LoggerWrapper.d("F2FPayCallbacks", "clear");
            this.mCallbacks.clear();
        }
    }

    public synchronized void postMainCallback(@NonNull final Invoker<T> invoker) {
        LoggerWrapper.d("F2FPayCallbacks", "postMainCallback with invoker=".concat(String.valueOf(invoker)));
        a.a().a((Runnable) new Runnable() {
            public void run() {
                F2FPayCallbacks.this.callback(invoker);
            }
        });
    }

    public void removeCallback(@NonNull T t) {
        synchronized (this.mCallbacks) {
            LoggerWrapper.d("F2FPayCallbacks", "removeCallback start with callback=".concat(String.valueOf(t)));
            this.mCallbacks.remove(t);
            LoggerWrapper.d("F2FPayCallbacks", "removeCallback end with callback=".concat(String.valueOf(t)));
        }
    }
}
