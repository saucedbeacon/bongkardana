package io.split.android.client.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o.IStaticKeyEncryptComponent;
import o.needsDividerBefore;
import o.showsIcon;

public class SplitLifecycleManager implements showsIcon {
    private List<WeakReference<SplitLifecycleAware>> mComponents = new ArrayList();

    public SplitLifecycleManager() {
        IStaticKeyEncryptComponent.runInMainThread(new Runnable() {
            public final void run() {
                needsDividerBefore.setMin().getLifecycle().setMax(SplitLifecycleManager.this);
            }
        });
    }

    public void register(SplitLifecycleAware splitLifecycleAware) {
        this.mComponents.add(new WeakReference(splitLifecycleAware));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void onPause() {
        changeRunningStatus(false);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void onResume() {
        changeRunningStatus(true);
    }

    private void changeRunningStatus(boolean z) {
        for (WeakReference<SplitLifecycleAware> weakReference : this.mComponents) {
            SplitLifecycleAware splitLifecycleAware = (SplitLifecycleAware) weakReference.get();
            if (splitLifecycleAware != null) {
                if (z) {
                    splitLifecycleAware.resume();
                } else {
                    splitLifecycleAware.pause();
                }
            }
        }
    }

    public void destroy() {
        IStaticKeyEncryptComponent.runInMainThread(new Runnable() {
            public final void run() {
                needsDividerBefore.setMin().getLifecycle().length(SplitLifecycleManager.this);
            }
        });
    }
}
