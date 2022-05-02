package com.google.firebase.remoteconfig.internal;

import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.GridLayout;
import o.WakefulBroadcastReceiver;
import o.completeWakefulIntent;
import o.pack;

@AnyThread
public class ConfigCacheClient {
    private static final Executor DIRECT_EXECUTOR = GridLayout.LayoutParams.length;
    static final long DISK_READ_TIMEOUT_IN_SECONDS = 5;
    @GuardedBy("ConfigCacheClient.class")
    private static final Map<String, ConfigCacheClient> clientInstances = new HashMap();
    @GuardedBy("this")
    @Nullable
    private Task<ConfigContainer> cachedContainerTask = null;
    private final ExecutorService executorService;
    private final ConfigStorageClient storageClient;

    private ConfigCacheClient(ExecutorService executorService2, ConfigStorageClient configStorageClient) {
        this.executorService = executorService2;
        this.storageClient = configStorageClient;
    }

    @Nullable
    public ConfigContainer getBlocking() {
        return getBlocking(DISK_READ_TIMEOUT_IN_SECONDS);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return (com.google.firebase.remoteconfig.internal.ConfigContainer) await(get(), r3, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        return null;
     */
    @androidx.annotation.VisibleForTesting
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.ConfigContainer getBlocking(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> r0 = r2.cachedContainerTask     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> r0 = r2.cachedContainerTask     // Catch:{ all -> 0x0027 }
            boolean r0 = r0.isSuccessful()     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> r3 = r2.cachedContainerTask     // Catch:{ all -> 0x0027 }
            java.lang.Object r3 = r3.getResult()     // Catch:{ all -> 0x0027 }
            com.google.firebase.remoteconfig.internal.ConfigContainer r3 = (com.google.firebase.remoteconfig.internal.ConfigContainer) r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            return r3
        L_0x0017:
            monitor-exit(r2)
            com.google.android.gms.tasks.Task r0 = r2.get()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0025 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0025 }
            java.lang.Object r3 = await(r0, r3, r1)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0025 }
            com.google.firebase.remoteconfig.internal.ConfigContainer r3 = (com.google.firebase.remoteconfig.internal.ConfigContainer) r3     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0025 }
            return r3
        L_0x0025:
            r3 = 0
            return r3
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigCacheClient.getBlocking(long):com.google.firebase.remoteconfig.internal.ConfigContainer");
    }

    public Task<ConfigContainer> put(ConfigContainer configContainer) {
        return put(configContainer, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void lambda$put$0(ConfigContainer configContainer) throws Exception {
        return this.storageClient.write(configContainer);
    }

    public Task<ConfigContainer> put(ConfigContainer configContainer, boolean z) {
        return Tasks.call(this.executorService, new completeWakefulIntent(this, configContainer)).onSuccessTask(this.executorService, new WakefulBroadcastReceiver(this, z, configContainer));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task lambda$put$1(boolean z, ConfigContainer configContainer, Void voidR) throws Exception {
        if (z) {
            updateInMemoryConfigContainer(configContainer);
        }
        return Tasks.forResult(configContainer);
    }

    public synchronized Task<ConfigContainer> get() {
        if (this.cachedContainerTask == null || (this.cachedContainerTask.isComplete() && !this.cachedContainerTask.isSuccessful())) {
            ExecutorService executorService2 = this.executorService;
            ConfigStorageClient configStorageClient = this.storageClient;
            Objects.requireNonNull(configStorageClient);
            this.cachedContainerTask = Tasks.call(executorService2, new pack(configStorageClient));
        }
        return this.cachedContainerTask;
    }

    public void clear() {
        synchronized (this) {
            this.cachedContainerTask = Tasks.forResult(null);
        }
        this.storageClient.clear();
    }

    private synchronized void updateInMemoryConfigContainer(ConfigContainer configContainer) {
        this.cachedContainerTask = Tasks.forResult(configContainer);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    @Nullable
    public synchronized Task<ConfigContainer> getCachedContainerTask() {
        return this.cachedContainerTask;
    }

    public static synchronized ConfigCacheClient getInstance(ExecutorService executorService2, ConfigStorageClient configStorageClient) {
        ConfigCacheClient configCacheClient;
        synchronized (ConfigCacheClient.class) {
            String fileName = configStorageClient.getFileName();
            if (!clientInstances.containsKey(fileName)) {
                clientInstances.put(fileName, new ConfigCacheClient(executorService2, configStorageClient));
            }
            configCacheClient = clientInstances.get(fileName);
        }
        return configCacheClient;
    }

    @VisibleForTesting
    public static synchronized void clearInstancesForTest() {
        synchronized (ConfigCacheClient.class) {
            clientInstances.clear();
        }
    }

    private static <TResult> TResult await(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        AwaitListener awaitListener = new AwaitListener();
        task.addOnSuccessListener(DIRECT_EXECUTOR, (OnSuccessListener<? super TResult>) awaitListener);
        task.addOnFailureListener(DIRECT_EXECUTOR, (OnFailureListener) awaitListener);
        task.addOnCanceledListener(DIRECT_EXECUTOR, (OnCanceledListener) awaitListener);
        if (!awaitListener.await(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (task.isSuccessful()) {
            return task.getResult();
        } else {
            throw new ExecutionException(task.getException());
        }
    }

    static class AwaitListener<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {
        private final CountDownLatch latch;

        private AwaitListener() {
            this.latch = new CountDownLatch(1);
        }

        public void onSuccess(TResult tresult) {
            this.latch.countDown();
        }

        public void onFailure(@NonNull Exception exc) {
            this.latch.countDown();
        }

        public void onCanceled() {
            this.latch.countDown();
        }

        public void await() throws InterruptedException {
            this.latch.await();
        }

        public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.latch.await(j, timeUnit);
        }
    }
}
