package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.otaliastudios.cameraview.CameraLogger;

public abstract class onEnterLayoutOrScroll<T extends View, Output> {
    protected static final CameraLogger setMin = CameraLogger.setMin(onEnterLayoutOrScroll.class.getSimpleName());
    public int IsOverlapping;
    int equals;
    public T getMax;
    @VisibleForTesting
    getMax getMin;
    int isInside;
    boolean length;
    setMax setMax;
    int toFloatRange;
    public int toIntRange;

    protected interface getMax {
    }

    public interface setMax {
        void ITrustedWebActivityCallback();

        void cancelNotification();

        void getActiveNotifications();
    }

    public void IsOverlapping() {
    }

    @NonNull
    public abstract Class<Output> getMax();

    @NonNull
    public abstract Output getMin();

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    @NonNull
    public abstract View length();

    /* access modifiers changed from: protected */
    public void length(@Nullable getMax getmax) {
    }

    /* access modifiers changed from: protected */
    @NonNull
    public abstract T setMin(@NonNull Context context, @NonNull ViewGroup viewGroup);

    public void setMin() {
    }

    public boolean toFloatRange() {
        return false;
    }

    public onEnterLayoutOrScroll(@NonNull Context context, @NonNull ViewGroup viewGroup) {
        this.getMax = setMin(context, viewGroup);
    }

    public final void length(@Nullable setMax setmax) {
        setMax setmax2;
        setMax setmax3;
        if (setMax() && (setmax3 = this.setMax) != null) {
            setmax3.cancelNotification();
        }
        this.setMax = setmax;
        if (setMax() && (setmax2 = this.setMax) != null) {
            setmax2.getActiveNotifications();
        }
    }

    public final void setMax(int i, int i2) {
        setMin.getMax(1, "setStreamSize:", "desiredW=", Integer.valueOf(i), "desiredH=", Integer.valueOf(i2));
        this.equals = i;
        this.isInside = i2;
        if (i > 0 && i2 > 0) {
            length(this.getMin);
        }
    }

    public final boolean setMax() {
        return this.toIntRange > 0 && this.IsOverlapping > 0;
    }

    /* access modifiers changed from: protected */
    public final void getMax(int i, int i2) {
        setMin.getMax(1, "dispatchOnSurfaceAvailable:", "w=", Integer.valueOf(i), "h=", Integer.valueOf(i2));
        this.toIntRange = i;
        this.IsOverlapping = i2;
        if (i > 0 && i2 > 0) {
            length(this.getMin);
        }
        setMax setmax = this.setMax;
        if (setmax != null) {
            setmax.getActiveNotifications();
        }
    }

    /* access modifiers changed from: protected */
    public final void length(int i, int i2) {
        setMin.getMax(1, "dispatchOnSurfaceSizeChanged:", "w=", Integer.valueOf(i), "h=", Integer.valueOf(i2));
        if (i != this.toIntRange || i2 != this.IsOverlapping) {
            this.toIntRange = i;
            this.IsOverlapping = i2;
            if (i > 0 && i2 > 0) {
                length(this.getMin);
            }
            setMax setmax = this.setMax;
            if (setmax != null) {
                setmax.ITrustedWebActivityCallback();
            }
        }
    }

    @CallSuper
    public void isInside() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            View length2 = length();
            ViewParent parent = length2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(length2);
                return;
            }
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        handler.post(new Runnable() {
            public final void run() {
                View length = onEnterLayoutOrScroll.this.length();
                ViewParent parent = length.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(length);
                }
                taskCompletionSource.setResult(null);
            }
        });
        try {
            Tasks.await(taskCompletionSource.getTask());
        } catch (Exception unused) {
        }
    }

    public final boolean toIntRange() {
        return this.length;
    }

    public void getMax(int i) {
        this.toFloatRange = i;
    }
}
