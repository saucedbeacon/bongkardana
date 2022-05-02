package o;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

public final class onActivityStarted implements SuccessContinuation {
    private final ConfigFetchHandler.FetchResponse length;

    public onActivityStarted(ConfigFetchHandler.FetchResponse fetchResponse) {
        this.length = fetchResponse;
    }

    public final Task then(Object obj) {
        return Tasks.forResult(this.length);
    }
}
