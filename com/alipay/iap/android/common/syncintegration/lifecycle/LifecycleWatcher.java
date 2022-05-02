package com.alipay.iap.android.common.syncintegration.lifecycle;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.log.LoggerWrapper;
import java.util.ArrayList;
import java.util.List;

public abstract class LifecycleWatcher {
    private static final String TAG = "LifecycleWatcher";
    protected List<Callback> mCallbacks = new ArrayList();

    public interface Callback {
        void onAppToBackground();

        void onAppToForeground();
    }

    public abstract boolean isAppForeground();

    public abstract void startWatcher(@NonNull Context context);

    public abstract void stopWatcher(@NonNull Context context);

    public void addCallback(@NonNull Callback callback) {
        this.mCallbacks.add(callback);
    }

    public void removeCallback(@NonNull Callback callback) {
        this.mCallbacks.remove(callback);
    }

    /* access modifiers changed from: protected */
    public void notifyAppToForeground() {
        StringBuilder sb = new StringBuilder("notifyAppToForeground. callbacks count: ");
        sb.append(this.mCallbacks.size());
        LoggerWrapper.d(TAG, sb.toString());
        for (Callback onAppToForeground : this.mCallbacks) {
            onAppToForeground.onAppToForeground();
        }
    }

    /* access modifiers changed from: protected */
    public void notifyAppToBackground() {
        StringBuilder sb = new StringBuilder("notifyAppToBackground. callbacks count: ");
        sb.append(this.mCallbacks.size());
        LoggerWrapper.d(TAG, sb.toString());
        for (Callback onAppToBackground : this.mCallbacks) {
            onAppToBackground.onAppToBackground();
        }
    }

    @NonNull
    public static LifecycleWatcher newValidWatcher() {
        if (ProcessOwnerLifecycleWatcher.processOwnerValid()) {
            LoggerWrapper.d(TAG, "Will create ProcessOwnerLifecycleWatcher");
            return new ProcessOwnerLifecycleWatcher();
        }
        LoggerWrapper.d(TAG, "Will create NormalLifecycleWatcher");
        return new NormalLifecycleWatcher();
    }
}
