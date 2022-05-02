package o;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.Date;

public final class onActivityResumed implements Continuation {
    private final ConfigFetchHandler length;
    private final Date setMin;

    public onActivityResumed(ConfigFetchHandler configFetchHandler, Date date) {
        this.length = configFetchHandler;
        this.setMin = date;
    }

    public final Object then(Task task) {
        return this.length.lambda$fetchIfCacheExpiredAndNotThrottled$2(this.setMin, task);
    }
}
