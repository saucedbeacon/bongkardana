package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import o.invokeItem;

public class needsDividerBefore implements setChecked {
    private static final needsDividerBefore toIntRange = new needsDividerBefore();
    Runnable IsOverlapping = new Runnable() {
        public final void run() {
            needsDividerBefore needsdividerbefore = needsDividerBefore.this;
            if (needsdividerbefore.getMax == 0) {
                needsdividerbefore.setMin = true;
                hasText hastext = needsdividerbefore.getMin;
                Lifecycle.Event event = Lifecycle.Event.ON_PAUSE;
                hastext.getMin("handleLifecycleEvent");
                hastext.getMax(event.getTargetState());
            }
            needsDividerBefore.this.length();
        }
    };
    invokeItem.setMin equals = new invokeItem.setMin() {
        public final void setMax() {
            needsDividerBefore.this.setMax();
        }

        public final void length() {
            needsDividerBefore.this.getMin();
        }
    };
    int getMax = 0;
    final hasText getMin = new hasText(this);
    Handler length;
    int setMax = 0;
    boolean setMin = true;
    private boolean toFloatRange = true;

    @NonNull
    public static setChecked setMin() {
        return toIntRange;
    }

    public static void getMin(Context context) {
        needsDividerBefore needsdividerbefore = toIntRange;
        needsdividerbefore.length = new Handler();
        needsdividerbefore.getMin.setMin(Lifecycle.Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new getItemData() {
            public void onActivityPreCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
                activity.registerActivityLifecycleCallbacks(new getItemData() {
                    public final void onActivityPostStarted(@NonNull Activity activity) {
                        needsDividerBefore.this.setMax();
                    }

                    public final void onActivityPostResumed(@NonNull Activity activity) {
                        needsDividerBefore.this.getMin();
                    }
                });
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (Build.VERSION.SDK_INT < 29) {
                    ((invokeItem) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).getMin = needsDividerBefore.this.equals;
                }
            }

            public void onActivityPaused(Activity activity) {
                needsDividerBefore needsdividerbefore = needsDividerBefore.this;
                needsdividerbefore.getMax--;
                if (needsdividerbefore.getMax == 0) {
                    needsdividerbefore.length.postDelayed(needsdividerbefore.IsOverlapping, 700);
                }
            }

            public void onActivityStopped(Activity activity) {
                needsDividerBefore needsdividerbefore = needsDividerBefore.this;
                needsdividerbefore.setMax--;
                needsdividerbefore.length();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void setMax() {
        int i = this.setMax + 1;
        this.setMax = i;
        if (i == 1 && this.toFloatRange) {
            hasText hastext = this.getMin;
            Lifecycle.Event event = Lifecycle.Event.ON_START;
            hastext.getMin("handleLifecycleEvent");
            hastext.getMax(event.getTargetState());
            this.toFloatRange = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMin() {
        int i = this.getMax + 1;
        this.getMax = i;
        if (i != 1) {
            return;
        }
        if (this.setMin) {
            hasText hastext = this.getMin;
            Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
            hastext.getMin("handleLifecycleEvent");
            hastext.getMax(event.getTargetState());
            this.setMin = false;
            return;
        }
        this.length.removeCallbacks(this.IsOverlapping);
    }

    /* access modifiers changed from: package-private */
    public final void length() {
        if (this.setMax == 0 && this.setMin) {
            hasText hastext = this.getMin;
            Lifecycle.Event event = Lifecycle.Event.ON_STOP;
            hastext.getMin("handleLifecycleEvent");
            hastext.getMax(event.getTargetState());
            this.toFloatRange = true;
        }
    }

    private needsDividerBefore() {
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.getMin;
    }
}
