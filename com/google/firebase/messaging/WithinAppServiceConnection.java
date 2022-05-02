package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.iid.ServiceStarter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class WithinAppServiceConnection implements ServiceConnection {
    @Nullable
    private WithinAppServiceBinder binder;
    @GuardedBy("this")
    private boolean connectionInProgress;
    private final Intent connectionIntent;
    private final Context context;
    private final Queue<BindRequest> intentQueue;
    private final ScheduledExecutorService scheduledExecutorService;

    static class BindRequest {
        final Intent intent;
        private final TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();

        BindRequest(Intent intent2) {
            this.intent = intent2;
        }

        /* access modifiers changed from: package-private */
        public void arrangeTimeout(ScheduledExecutorService scheduledExecutorService) {
            getTask().addOnCompleteListener((Executor) scheduledExecutorService, new WithinAppServiceConnection$BindRequest$$Lambda$1(scheduledExecutorService.schedule(new WithinAppServiceConnection$BindRequest$$Lambda$0(this), 9000, TimeUnit.MILLISECONDS)));
        }

        /* access modifiers changed from: package-private */
        public void finish() {
            this.taskCompletionSource.trySetResult(null);
        }

        /* access modifiers changed from: package-private */
        public Task<Void> getTask() {
            return this.taskCompletionSource.getTask();
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$arrangeTimeout$0$WithinAppServiceConnection$BindRequest() {
            this.intent.getAction();
            finish();
        }
    }

    WithinAppServiceConnection(Context context2, String str) {
        this(context2, ServiceStarter.ACTION_MESSAGING_EVENT, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @GuardedBy("this")
    private void finishAllInQueue() {
        while (!this.intentQueue.isEmpty()) {
            this.intentQueue.poll().finish();
        }
    }

    private synchronized void flushQueue() {
        boolean isLoggable = Log.isLoggable(Constants.TAG, 3);
        while (!this.intentQueue.isEmpty()) {
            WithinAppServiceBinder withinAppServiceBinder = this.binder;
            if (withinAppServiceBinder == null || !withinAppServiceBinder.isBinderAlive()) {
                startConnectionIfNeeded();
                return;
            } else {
                this.binder.send(this.intentQueue.poll());
            }
        }
    }

    @VisibleForTesting
    WithinAppServiceConnection(Context context2, String str, ScheduledExecutorService scheduledExecutorService2) {
        this.intentQueue = new ArrayDeque();
        this.connectionInProgress = false;
        this.context = context2.getApplicationContext();
        this.connectionIntent = new Intent(ServiceStarter.ACTION_MESSAGING_EVENT).setPackage(this.context.getPackageName());
        this.scheduledExecutorService = scheduledExecutorService2;
    }

    @GuardedBy("this")
    private void startConnectionIfNeeded() {
        if (!this.connectionInProgress) {
            this.connectionInProgress = true;
            try {
                if (ConnectionTracker.getInstance().bindService(this.context, this.connectionIntent, this, 65)) {
                    return;
                }
            } catch (SecurityException unused) {
            }
            this.connectionInProgress = false;
            finishAllInQueue();
        }
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.connectionInProgress = false;
        if (!(iBinder instanceof WithinAppServiceBinder)) {
            finishAllInQueue();
            return;
        }
        this.binder = (WithinAppServiceBinder) iBinder;
        flushQueue();
    }

    /* access modifiers changed from: package-private */
    public synchronized Task<Void> sendIntent(Intent intent) {
        BindRequest bindRequest;
        bindRequest = new BindRequest(intent);
        bindRequest.arrangeTimeout(this.scheduledExecutorService);
        this.intentQueue.add(bindRequest);
        flushQueue();
        return bindRequest.getTask();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        flushQueue();
    }
}
