package o;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.Date;

public final class onActivityPaused implements Continuation {
    private final Task getMax;
    private final Task getMin;
    private final Date setMax;
    private final ConfigFetchHandler setMin;

    public onActivityPaused(ConfigFetchHandler configFetchHandler, Task task, Task task2, Date date) {
        this.setMin = configFetchHandler;
        this.getMin = task;
        this.getMax = task2;
        this.setMax = date;
    }

    public final Object then(Task task) {
        return this.setMin.lambda$fetchIfCacheExpiredAndNotThrottled$1(this.getMin, this.getMax, this.setMax, task);
    }
}
