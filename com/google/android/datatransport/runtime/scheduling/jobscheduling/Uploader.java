package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import o.getParentFragment;
import o.requireFragmentManager;
import o.requireParentFragment;

public class Uploader {
    private static final String LOG_TAG = "Uploader";
    private final BackendRegistry backendRegistry;
    private final Clock clock;
    private final Context context;
    private final EventStore eventStore;
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler workScheduler;

    @Inject
    public Uploader(Context context2, BackendRegistry backendRegistry2, EventStore eventStore2, WorkScheduler workScheduler2, Executor executor2, SynchronizationGuard synchronizationGuard, @WallTime Clock clock2) {
        this.context = context2;
        this.backendRegistry = backendRegistry2;
        this.eventStore = eventStore2;
        this.workScheduler = workScheduler2;
        this.executor = executor2;
        this.guard = synchronizationGuard;
        this.clock = clock2;
    }

    /* access modifiers changed from: package-private */
    public boolean isNetworkAvailable() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void upload(TransportContext transportContext, int i, Runnable runnable) {
        this.executor.execute(new requireParentFragment(this, transportContext, i, runnable));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r3.workScheduler.schedule(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void lambda$upload$1(com.google.android.datatransport.runtime.TransportContext r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r0 = r3.guard     // Catch:{ SynchronizationException -> 0x0029 }
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r1 = r3.eventStore     // Catch:{ SynchronizationException -> 0x0029 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ SynchronizationException -> 0x0029 }
            o.getParentFragmentManager r2 = new o.getParentFragmentManager     // Catch:{ SynchronizationException -> 0x0029 }
            r2.<init>(r1)     // Catch:{ SynchronizationException -> 0x0029 }
            r0.runCriticalSection(r2)     // Catch:{ SynchronizationException -> 0x0029 }
            boolean r0 = r3.isNetworkAvailable()     // Catch:{ SynchronizationException -> 0x0029 }
            if (r0 != 0) goto L_0x0020
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r0 = r3.guard     // Catch:{ SynchronizationException -> 0x0029 }
            o.isRemovingParent r1 = new o.isRemovingParent     // Catch:{ SynchronizationException -> 0x0029 }
            r1.<init>(r3, r4, r5)     // Catch:{ SynchronizationException -> 0x0029 }
            r0.runCriticalSection(r1)     // Catch:{ SynchronizationException -> 0x0029 }
            goto L_0x0023
        L_0x0020:
            r3.logAndUpdateState(r4, r5)     // Catch:{ SynchronizationException -> 0x0029 }
        L_0x0023:
            r6.run()
            return
        L_0x0027:
            r4 = move-exception
            goto L_0x0034
        L_0x0029:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r0 = r3.workScheduler     // Catch:{ all -> 0x0027 }
            int r5 = r5 + 1
            r0.schedule(r4, r5)     // Catch:{ all -> 0x0027 }
            r6.run()
            return
        L_0x0034:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader.lambda$upload$1(com.google.android.datatransport.runtime.TransportContext, int, java.lang.Runnable):void");
    }

    public /* synthetic */ Object lambda$upload$0(TransportContext transportContext, int i) {
        this.workScheduler.schedule(transportContext, i + 1);
        return null;
    }

    /* access modifiers changed from: package-private */
    public void logAndUpdateState(TransportContext transportContext, int i) {
        BackendResponse send;
        TransportBackend transportBackend = this.backendRegistry.get(transportContext.getBackendName());
        Iterable<PersistedEvent> iterable = (Iterable) this.guard.runCriticalSection(new requireFragmentManager(this, transportContext));
        if (iterable.iterator().hasNext()) {
            if (transportBackend == null) {
                Logging.d(LOG_TAG, "Unknown backend for %s, deleting event batch for it...", (Object) transportContext);
                send = BackendResponse.fatalError();
            } else {
                ArrayList arrayList = new ArrayList();
                for (PersistedEvent event : iterable) {
                    arrayList.add(event.getEvent());
                }
                send = transportBackend.send(BackendRequest.builder().setEvents(arrayList).setExtras(transportContext.getExtras()).build());
            }
            this.guard.runCriticalSection(new getParentFragment(this, send, iterable, transportContext, i));
        }
    }

    public /* synthetic */ Iterable lambda$logAndUpdateState$2(TransportContext transportContext) {
        return this.eventStore.loadBatch(transportContext);
    }

    public /* synthetic */ Object lambda$logAndUpdateState$3(BackendResponse backendResponse, Iterable iterable, TransportContext transportContext, int i) {
        if (backendResponse.getStatus() == BackendResponse.Status.TRANSIENT_ERROR) {
            this.eventStore.recordFailure(iterable);
            this.workScheduler.schedule(transportContext, i + 1);
            return null;
        }
        this.eventStore.recordSuccess(iterable);
        if (backendResponse.getStatus() == BackendResponse.Status.OK) {
            this.eventStore.recordNextCallTime(transportContext, this.clock.getTime() + backendResponse.getNextRequestWaitMillis());
        }
        if (!this.eventStore.hasPendingEventsFor(transportContext)) {
            return null;
        }
        this.workScheduler.schedule(transportContext, 1, true);
        return null;
    }
}
