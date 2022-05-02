package com.alipay.iap.android.common.syncintegration.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.log.LoggerWrapper;

@Deprecated
public class NormalLifecycleWatcher extends LifecycleWatcher {
    private static final String TAG = "NormalLifecycleWatcher";
    /* access modifiers changed from: private */
    public int mForegroundCount = 0;
    private final Application.ActivityLifecycleCallbacks mLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            NormalLifecycleWatcher.access$004(NormalLifecycleWatcher.this);
            if (NormalLifecycleWatcher.this.mForegroundCount == 1) {
                LoggerWrapper.d(NormalLifecycleWatcher.TAG, "onEnterForeground");
                NormalLifecycleWatcher.this.notifyAppToForeground();
            }
        }

        public void onActivityStopped(Activity activity) {
            NormalLifecycleWatcher.access$006(NormalLifecycleWatcher.this);
            if (NormalLifecycleWatcher.this.mForegroundCount <= 0) {
                int unused = NormalLifecycleWatcher.this.mForegroundCount = 0;
                LoggerWrapper.d(NormalLifecycleWatcher.TAG, "onEnterBackground");
                NormalLifecycleWatcher.this.notifyAppToBackground();
            }
        }
    };

    static /* synthetic */ int access$004(NormalLifecycleWatcher normalLifecycleWatcher) {
        int i = normalLifecycleWatcher.mForegroundCount + 1;
        normalLifecycleWatcher.mForegroundCount = i;
        return i;
    }

    static /* synthetic */ int access$006(NormalLifecycleWatcher normalLifecycleWatcher) {
        int i = normalLifecycleWatcher.mForegroundCount - 1;
        normalLifecycleWatcher.mForegroundCount = i;
        return i;
    }

    public boolean isAppForeground() {
        return this.mForegroundCount > 0;
    }

    public void startWatcher(@NonNull Context context) {
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.mLifecycleCallbacks);
    }

    public void stopWatcher(@NonNull Context context) {
        ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.mLifecycleCallbacks);
    }
}
