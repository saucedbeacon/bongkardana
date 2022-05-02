package com.alipay.iap.android.common.syncintegration.lifecycle;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.alipay.iap.android.common.log.LoggerWrapper;
import o.needsDividerBefore;
import o.showsIcon;

public class ProcessOwnerLifecycleWatcher extends LifecycleWatcher {
    private static final String TAG = "ProcessOwnerLifecycleWatcher";
    /* access modifiers changed from: private */
    public boolean mIsAppForeground = false;
    private final showsIcon mLifecycleObserver = new showsIcon() {
        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onEnterForeground() {
            boolean unused = ProcessOwnerLifecycleWatcher.this.mIsAppForeground = true;
            LoggerWrapper.d(ProcessOwnerLifecycleWatcher.TAG, "onEnterForeground");
            ProcessOwnerLifecycleWatcher.this.notifyAppToForeground();
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onEnterBackground() {
            boolean unused = ProcessOwnerLifecycleWatcher.this.mIsAppForeground = false;
            LoggerWrapper.d(ProcessOwnerLifecycleWatcher.TAG, "onEnterBackground");
            ProcessOwnerLifecycleWatcher.this.notifyAppToBackground();
        }
    };

    public static boolean processOwnerValid() {
        try {
            return Class.forName("androidx.lifecycle.ProcessLifecycleOwnerInitializer") != null;
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder("Take it easy. ProcessLifecycleOwnerInitializer not exists! ");
            sb.append(e.getMessage());
            LoggerWrapper.d(TAG, sb.toString());
            return false;
        }
    }

    public boolean isAppForeground() {
        return this.mIsAppForeground;
    }

    public void startWatcher(@NonNull Context context) {
        needsDividerBefore.setMin().getLifecycle().setMax(this.mLifecycleObserver);
    }

    public void stopWatcher(@NonNull Context context) {
        needsDividerBefore.setMin().getLifecycle().length(this.mLifecycleObserver);
    }
}
