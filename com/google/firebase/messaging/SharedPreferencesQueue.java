package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

final class SharedPreferencesQueue {
    @GuardedBy("internalQueue")
    private boolean bulkOperation = false;
    @GuardedBy("internalQueue")
    private final ArrayDeque<String> internalQueue = new ArrayDeque<>();
    private final String itemSeparator;
    private final String queueName;
    private final SharedPreferences sharedPreferences;
    private final Executor syncExecutor;

    private SharedPreferencesQueue(SharedPreferences sharedPreferences2, String str, String str2, Executor executor) {
        this.sharedPreferences = sharedPreferences2;
        this.queueName = "topic_operation_queue";
        this.itemSeparator = ",";
        this.syncExecutor = executor;
    }

    @GuardedBy("internalQueue")
    private boolean checkAndSyncState(boolean z) {
        if (!z || this.bulkOperation) {
            return z;
        }
        syncStateAsync();
        return true;
    }

    @WorkerThread
    static SharedPreferencesQueue createInstance(SharedPreferences sharedPreferences2, String str, String str2, Executor executor) {
        SharedPreferencesQueue sharedPreferencesQueue = new SharedPreferencesQueue(sharedPreferences2, "topic_operation_queue", ",", executor);
        sharedPreferencesQueue.initQueue();
        return sharedPreferencesQueue;
    }

    @WorkerThread
    private void initQueue() {
        synchronized (this.internalQueue) {
            this.internalQueue.clear();
            String string = this.sharedPreferences.getString(this.queueName, "");
            if (!TextUtils.isEmpty(string)) {
                if (string.contains(this.itemSeparator)) {
                    for (String str : string.split(this.itemSeparator, -1)) {
                        if (!TextUtils.isEmpty(str)) {
                            this.internalQueue.add(str);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: syncState */
    public void bridge$lambda$0$SharedPreferencesQueue() {
        synchronized (this.internalQueue) {
            this.sharedPreferences.edit().putString(this.queueName, serialize()).commit();
        }
    }

    private void syncStateAsync() {
        this.syncExecutor.execute(new SharedPreferencesQueue$$Lambda$0(this));
    }

    public final boolean add(@NonNull String str) {
        boolean add;
        if (TextUtils.isEmpty(str) || str.contains(this.itemSeparator)) {
            return false;
        }
        synchronized (this.internalQueue) {
            add = this.internalQueue.add(str);
            checkAndSyncState(add);
        }
        return add;
    }

    @Nullable
    public final String peek() {
        String peek;
        synchronized (this.internalQueue) {
            peek = this.internalQueue.peek();
        }
        return peek;
    }

    public final boolean remove(@Nullable Object obj) {
        boolean remove;
        synchronized (this.internalQueue) {
            remove = this.internalQueue.remove(obj);
            checkAndSyncState(remove);
        }
        return remove;
    }

    @GuardedBy("internalQueue")
    @NonNull
    public final String serialize() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.internalQueue.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.itemSeparator);
        }
        return sb.toString();
    }
}
