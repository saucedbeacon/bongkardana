package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.split.android.client.service.executor.SplitTask;
import io.split.android.client.service.executor.SplitTaskExecutionListener;
import java.lang.ref.WeakReference;

public final class loadLibraryAsync {
    private final WeakReference<SplitTaskExecutionListener> listener;
    private final SplitTask task;

    public loadLibraryAsync(@NonNull SplitTask splitTask, @Nullable SplitTaskExecutionListener splitTaskExecutionListener) {
        if (splitTask != null) {
            this.task = splitTask;
            this.listener = new WeakReference<>(splitTaskExecutionListener);
            return;
        }
        throw null;
    }

    public final SplitTask getTask() {
        return this.task;
    }

    public final SplitTaskExecutionListener getListener() {
        return this.listener.get();
    }
}
