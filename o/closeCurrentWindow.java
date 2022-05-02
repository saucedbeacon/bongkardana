package o;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

public interface closeCurrentWindow {
    void onContainerActivityLifecycleEvent(@NonNull Lifecycle.Event event);
}
