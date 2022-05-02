package o;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

public interface onInitializeAccessibilityNodeInfo {
    void length(@NonNull Runnable runnable);

    void setMin(@IntRange(from = 0) long j, @NonNull Runnable runnable);
}
