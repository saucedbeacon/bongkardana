package o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import javax.inject.Singleton;

@Singleton
public class isAttachedToTransitionOverlay implements Application.ActivityLifecycleCallbacks {
    public Activity getMin;

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (CornerMarkingDataProvider.isInside()) {
            activity.setRequestedOrientation(1);
        }
    }

    public void onActivityResumed(Activity activity) {
        this.getMin = activity;
    }
}
