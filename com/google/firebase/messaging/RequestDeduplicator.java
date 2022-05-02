package com.google.firebase.messaging;

import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import o.PlaybackStateCompat;

class RequestDeduplicator {
    private final Executor executor;
    @GuardedBy("this")
    private final Map<String, Task<String>> getTokenRequests = new PlaybackStateCompat();

    interface GetTokenRequest {
        Task<String> start();
    }

    RequestDeduplicator(Executor executor2) {
        this.executor = executor2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.android.gms.tasks.Task<java.lang.String> getOrStartGetTokenRequest(java.lang.String r3, com.google.firebase.messaging.RequestDeduplicator.GetTokenRequest r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, com.google.android.gms.tasks.Task<java.lang.String>> r0 = r2.getTokenRequests     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0044 }
            com.google.android.gms.tasks.Task r0 = (com.google.android.gms.tasks.Task) r0     // Catch:{ all -> 0x0044 }
            r1 = 3
            if (r0 == 0) goto L_0x001e
            java.lang.String r4 = "FirebaseMessaging"
            boolean r4 = android.util.Log.isLoggable(r4, r1)     // Catch:{ all -> 0x0044 }
            if (r4 == 0) goto L_0x001c
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0044 }
            int r3 = r3.length()     // Catch:{ all -> 0x0044 }
        L_0x001c:
            monitor-exit(r2)
            return r0
        L_0x001e:
            java.lang.String r0 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0044 }
            int r0 = r0.length()     // Catch:{ all -> 0x0044 }
        L_0x002e:
            com.google.android.gms.tasks.Task r4 = r4.start()     // Catch:{ all -> 0x0044 }
            java.util.concurrent.Executor r0 = r2.executor     // Catch:{ all -> 0x0044 }
            com.google.firebase.messaging.RequestDeduplicator$$Lambda$0 r1 = new com.google.firebase.messaging.RequestDeduplicator$$Lambda$0     // Catch:{ all -> 0x0044 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0044 }
            com.google.android.gms.tasks.Task r4 = r4.continueWithTask(r0, r1)     // Catch:{ all -> 0x0044 }
            java.util.Map<java.lang.String, com.google.android.gms.tasks.Task<java.lang.String>> r0 = r2.getTokenRequests     // Catch:{ all -> 0x0044 }
            r0.put(r3, r4)     // Catch:{ all -> 0x0044 }
            monitor-exit(r2)
            return r4
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.RequestDeduplicator.getOrStartGetTokenRequest(java.lang.String, com.google.firebase.messaging.RequestDeduplicator$GetTokenRequest):com.google.android.gms.tasks.Task");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task lambda$getOrStartGetTokenRequest$0$RequestDeduplicator(String str, Task task) throws Exception {
        synchronized (this) {
            this.getTokenRequests.remove(str);
        }
        return task;
    }
}
