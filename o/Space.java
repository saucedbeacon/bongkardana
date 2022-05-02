package o;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

public final class Space implements Continuation {
    private final ConfigFetchHandler getMax;
    private final long setMin;

    public Space(ConfigFetchHandler configFetchHandler, long j) {
        this.getMax = configFetchHandler;
        this.setMin = j;
    }

    public final Object then(Task task) {
        return this.getMax.lambda$fetch$0(this.setMin, task);
    }
}
