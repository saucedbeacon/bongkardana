package o;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class invokeItem extends Fragment {
    setMin getMin;

    interface setMin {
        void length();

        void setMax();
    }

    public static void setMin(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            getMin.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new invokeItem(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    static void setMax(@NonNull Activity activity, @NonNull Lifecycle.Event event) {
        if (activity instanceof setShortcut) {
            hasText max = ((setShortcut) activity).setMax();
            max.getMin("handleLifecycleEvent");
            max.getMax(event.getTargetState());
        } else if (activity instanceof setChecked) {
            Lifecycle lifecycle = ((setChecked) activity).getLifecycle();
            if (lifecycle instanceof hasText) {
                hasText hastext = (hasText) lifecycle;
                hastext.getMin("handleLifecycleEvent");
                hastext.getMax(event.getTargetState());
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Lifecycle.Event event = Lifecycle.Event.ON_CREATE;
        if (Build.VERSION.SDK_INT < 29) {
            setMax(getActivity(), event);
        }
    }

    public final void onStart() {
        super.onStart();
        setMin setmin = this.getMin;
        if (setmin != null) {
            setmin.setMax();
        }
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        if (Build.VERSION.SDK_INT < 29) {
            setMax(getActivity(), event);
        }
    }

    public final void onResume() {
        super.onResume();
        setMin setmin = this.getMin;
        if (setmin != null) {
            setmin.length();
        }
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        if (Build.VERSION.SDK_INT < 29) {
            setMax(getActivity(), event);
        }
    }

    public final void onPause() {
        super.onPause();
        Lifecycle.Event event = Lifecycle.Event.ON_PAUSE;
        if (Build.VERSION.SDK_INT < 29) {
            setMax(getActivity(), event);
        }
    }

    public final void onStop() {
        super.onStop();
        Lifecycle.Event event = Lifecycle.Event.ON_STOP;
        if (Build.VERSION.SDK_INT < 29) {
            setMax(getActivity(), event);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        Lifecycle.Event event = Lifecycle.Event.ON_DESTROY;
        if (Build.VERSION.SDK_INT < 29) {
            setMax(getActivity(), event);
        }
        this.getMin = null;
    }

    @RequiresApi(29)
    static class getMin implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        public void onActivityPaused(@NonNull Activity activity) {
        }

        public void onActivityResumed(@NonNull Activity activity) {
        }

        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        public void onActivityStarted(@NonNull Activity activity) {
        }

        public void onActivityStopped(@NonNull Activity activity) {
        }

        getMin() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new getMin());
        }

        public void onActivityPostCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            invokeItem.setMax(activity, Lifecycle.Event.ON_CREATE);
        }

        public void onActivityPostStarted(@NonNull Activity activity) {
            invokeItem.setMax(activity, Lifecycle.Event.ON_START);
        }

        public void onActivityPostResumed(@NonNull Activity activity) {
            invokeItem.setMax(activity, Lifecycle.Event.ON_RESUME);
        }

        public void onActivityPrePaused(@NonNull Activity activity) {
            invokeItem.setMax(activity, Lifecycle.Event.ON_PAUSE);
        }

        public void onActivityPreStopped(@NonNull Activity activity) {
            invokeItem.setMax(activity, Lifecycle.Event.ON_STOP);
        }

        public void onActivityPreDestroyed(@NonNull Activity activity) {
            invokeItem.setMax(activity, Lifecycle.Event.ON_DESTROY);
        }
    }
}
