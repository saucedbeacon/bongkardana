package o;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.Recreator;

public final class getSubtitle {
    private final onInitializeAccessibilityEvent getMax;
    public final initForMode getMin = new initForMode();

    private getSubtitle(onInitializeAccessibilityEvent oninitializeaccessibilityevent) {
        this.getMax = oninitializeaccessibilityevent;
    }

    @NonNull
    public final initForMode setMin() {
        return this.getMin;
    }

    @MainThread
    public final void getMin(@Nullable Bundle bundle) {
        Lifecycle lifecycle = this.getMax.getLifecycle();
        if (lifecycle.length() == Lifecycle.State.INITIALIZED) {
            lifecycle.setMax(new Recreator(this.getMax));
            this.getMin.setMin(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    @MainThread
    public final void length(@NonNull Bundle bundle) {
        this.getMin.setMin(bundle);
    }

    @NonNull
    public static getSubtitle getMin(@NonNull onInitializeAccessibilityEvent oninitializeaccessibilityevent) {
        return new getSubtitle(oninitializeaccessibilityevent);
    }
}
