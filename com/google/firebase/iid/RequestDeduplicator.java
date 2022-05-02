package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import o.PlaybackStateCompat;

class RequestDeduplicator {
    private final Executor executor;
    @GuardedBy("this")
    private final Map<Pair<String, String>, Task<InstanceIdResult>> getTokenRequests = new PlaybackStateCompat();

    interface GetTokenRequest {
        Task<InstanceIdResult> start();
    }

    RequestDeduplicator(Executor executor2) {
        this.executor = executor2;
    }

    /* access modifiers changed from: package-private */
    public synchronized Task<InstanceIdResult> getOrStartGetTokenRequest(String str, String str2, GetTokenRequest getTokenRequest) {
        Pair pair = new Pair(str, str2);
        Task<InstanceIdResult> task = this.getTokenRequests.get(pair);
        if (task != null) {
            return task;
        }
        Task<TContinuationResult> continueWithTask = getTokenRequest.start().continueWithTask(this.executor, new RequestDeduplicator$$Lambda$0(this, pair));
        this.getTokenRequests.put(pair, continueWithTask);
        return continueWithTask;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task lambda$getOrStartGetTokenRequest$0$RequestDeduplicator(Pair pair, Task task) throws Exception {
        synchronized (this) {
            this.getTokenRequests.remove(pair);
        }
        return task;
    }
}
