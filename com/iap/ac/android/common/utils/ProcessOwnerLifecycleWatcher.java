package com.iap.ac.android.common.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import com.iap.ac.android.common.log.ACLog;
import java.util.List;
import o.needsDividerBefore;
import o.showsIcon;

public enum ProcessOwnerLifecycleWatcher {
    INSTANCE;
    
    private static final String TAG = "ProcessOwnerLifecycleWatcher";
    private List<LifecycleCallback> callbackList;
    private final showsIcon mLifecycleObserver;

    public interface LifecycleCallback {
        void onAppToBackground();

        void onAppToForeground();
    }

    private boolean isProcessLifecycleOwnerValid() {
        try {
            return Class.forName("androidx.lifecycle.ProcessLifecycleOwnerInitializer") != null;
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder("Take it easy. ProcessLifecycleOwnerInitializer not exists! ");
            sb.append(e.getMessage());
            ACLog.d(TAG, sb.toString());
            return false;
        }
    }

    /* access modifiers changed from: private */
    public void notifyAppToForeground() {
        for (LifecycleCallback onAppToForeground : this.callbackList) {
            onAppToForeground.onAppToForeground();
        }
    }

    /* access modifiers changed from: private */
    public void notifyAppToBackground() {
        for (LifecycleCallback onAppToBackground : this.callbackList) {
            onAppToBackground.onAppToBackground();
        }
    }

    public final void addLifecycleCallback(LifecycleCallback lifecycleCallback) {
        this.callbackList.add(lifecycleCallback);
    }

    public final void removeLifecycleCallback(LifecycleCallback lifecycleCallback) {
        this.callbackList.remove(lifecycleCallback);
    }

    public final void clearLifecycleCallback() {
        this.callbackList.clear();
    }

    public final void startWatcher(@NonNull Context context) {
        if (isProcessLifecycleOwnerValid()) {
            needsDividerBefore.setMin().getLifecycle().setMax(this.mLifecycleObserver);
        } else {
            onProcessLifecycleNotValid();
        }
    }

    public final void stopWatcher(@NonNull Context context) {
        if (isProcessLifecycleOwnerValid()) {
            needsDividerBefore.setMin().getLifecycle().length(this.mLifecycleObserver);
        } else {
            onProcessLifecycleNotValid();
        }
    }

    public final boolean isAppForeground() {
        if (isProcessLifecycleOwnerValid()) {
            StringBuilder sb = new StringBuilder("Current state is: ");
            sb.append(needsDividerBefore.setMin().getLifecycle().length().name());
            ACLog.d(TAG, sb.toString());
            return needsDividerBefore.setMin().getLifecycle().length().isAtLeast(Lifecycle.State.STARTED);
        }
        onProcessLifecycleNotValid();
        return false;
    }

    private void onProcessLifecycleNotValid() {
        ACLog.e(TAG, "ProcessLifecycleOwner is not imported into your project. If you want use this feature please import androidx.lifecycle:lifecycle-process first.");
    }
}
