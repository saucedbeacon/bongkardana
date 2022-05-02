package io.split.android.client.service.executor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import o.loadLibraryAsync;

public interface SplitTaskExecutor {
    void executeSerially(List<loadLibraryAsync> list);

    void pause();

    void resume();

    String schedule(@NonNull SplitTask splitTask, long j, long j2, @Nullable SplitTaskExecutionListener splitTaskExecutionListener);

    String schedule(@NonNull SplitTask splitTask, long j, @Nullable SplitTaskExecutionListener splitTaskExecutionListener);

    void stop();

    void stopTask(String str);

    void submit(@NonNull SplitTask splitTask, @Nullable SplitTaskExecutionListener splitTaskExecutionListener);
}
