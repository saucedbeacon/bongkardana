package o;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class setAutoSizeTextTypeWithDefaults implements onInitializeAccessibilityNodeInfo {
    private final Handler setMax = StyleRes.setMin(Looper.getMainLooper());

    public final void setMin(long j, @NonNull Runnable runnable) {
        this.setMax.postDelayed(runnable, j);
    }

    public final void length(@NonNull Runnable runnable) {
        this.setMax.removeCallbacks(runnable);
    }
}
