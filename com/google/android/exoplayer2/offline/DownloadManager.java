package com.google.android.exoplayer2.offline;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import o.getAllowEnterTransitionOverlap;
import o.getReenterTransition;
import o.getSharedElementEnterTransition;
import o.getSharedElementReturnTransition;
import o.setSharedElementEnterTransition;
import o.setSharedElementReturnTransition;

public final class DownloadManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_MAX_SIMULTANEOUS_DOWNLOADS = 1;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    private static final String TAG = "DownloadManager";
    private final ActionFile actionFile;
    private final ArrayList<Task> activeDownloadTasks;
    private final DownloadAction.Deserializer[] deserializers;
    /* access modifiers changed from: private */
    public final DownloaderConstructorHelper downloaderConstructorHelper;
    private boolean downloadsStopped;
    private final Handler fileIOHandler;
    private final HandlerThread fileIOThread;
    /* access modifiers changed from: private */
    public final Handler handler;
    private boolean initialized;
    private final CopyOnWriteArraySet<Listener> listeners;
    private final int maxActiveDownloadTasks;
    private final int minRetryCount;
    private int nextTaskId;
    private boolean released;
    private final ArrayList<Task> tasks;

    public interface Listener {
        void onIdle(DownloadManager downloadManager);

        void onInitialized(DownloadManager downloadManager);

        void onTaskStateChanged(DownloadManager downloadManager, TaskState taskState);
    }

    private static void logd(String str) {
    }

    public DownloadManager(Cache cache, DataSource.Factory factory, File file, DownloadAction.Deserializer... deserializerArr) {
        this(new DownloaderConstructorHelper(cache, factory), file, deserializerArr);
    }

    public DownloadManager(DownloaderConstructorHelper downloaderConstructorHelper2, File file, DownloadAction.Deserializer... deserializerArr) {
        this(downloaderConstructorHelper2, 1, 5, file, deserializerArr);
    }

    public DownloadManager(DownloaderConstructorHelper downloaderConstructorHelper2, int i, int i2, File file, DownloadAction.Deserializer... deserializerArr) {
        this.downloaderConstructorHelper = downloaderConstructorHelper2;
        this.maxActiveDownloadTasks = i;
        this.minRetryCount = i2;
        this.actionFile = new ActionFile(file);
        this.deserializers = deserializerArr.length <= 0 ? DownloadAction.getDefaultDeserializers() : deserializerArr;
        this.downloadsStopped = true;
        this.tasks = new ArrayList<>();
        this.activeDownloadTasks = new ArrayList<>();
        Looper myLooper = Looper.myLooper();
        this.handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        HandlerThread handlerThread = new HandlerThread("DownloadManager file i/o");
        this.fileIOThread = handlerThread;
        handlerThread.start();
        this.fileIOHandler = new Handler(this.fileIOThread.getLooper());
        this.listeners = new CopyOnWriteArraySet<>();
        loadActions();
        logd("Created");
    }

    public final void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    public final void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public final void startDownloads() {
        Assertions.checkState(!this.released);
        if (this.downloadsStopped) {
            this.downloadsStopped = false;
            maybeStartTasks();
            logd("Downloads are started");
        }
    }

    public final void stopDownloads() {
        Assertions.checkState(!this.released);
        if (!this.downloadsStopped) {
            this.downloadsStopped = true;
            for (int i = 0; i < this.activeDownloadTasks.size(); i++) {
                this.activeDownloadTasks.get(i).stop();
            }
            logd("Downloads are stopping");
        }
    }

    public final int handleAction(byte[] bArr) throws IOException {
        Assertions.checkState(!this.released);
        return handleAction(DownloadAction.deserializeFromStream(this.deserializers, new ByteArrayInputStream(bArr)));
    }

    public final int handleAction(DownloadAction downloadAction) {
        Assertions.checkState(!this.released);
        Task addTaskForAction = addTaskForAction(downloadAction);
        if (this.initialized) {
            saveActions();
            maybeStartTasks();
            if (addTaskForAction.currentState == 0) {
                notifyListenersTaskStateChange(addTaskForAction);
            }
        }
        return addTaskForAction.f10788id;
    }

    public final int getTaskCount() {
        Assertions.checkState(!this.released);
        return this.tasks.size();
    }

    public final int getDownloadCount() {
        int i = 0;
        for (int i2 = 0; i2 < this.tasks.size(); i2++) {
            if (!this.tasks.get(i2).action.isRemoveAction) {
                i++;
            }
        }
        return i;
    }

    @Nullable
    public final TaskState getTaskState(int i) {
        Assertions.checkState(!this.released);
        for (int i2 = 0; i2 < this.tasks.size(); i2++) {
            Task task = this.tasks.get(i2);
            if (task.f10788id == i) {
                return task.getDownloadState();
            }
        }
        return null;
    }

    public final TaskState[] getAllTaskStates() {
        Assertions.checkState(!this.released);
        int size = this.tasks.size();
        TaskState[] taskStateArr = new TaskState[size];
        for (int i = 0; i < size; i++) {
            taskStateArr[i] = this.tasks.get(i).getDownloadState();
        }
        return taskStateArr;
    }

    public final boolean isInitialized() {
        Assertions.checkState(!this.released);
        return this.initialized;
    }

    public final boolean isIdle() {
        Assertions.checkState(!this.released);
        if (!this.initialized) {
            return false;
        }
        for (int i = 0; i < this.tasks.size(); i++) {
            if (this.tasks.get(i).isActive()) {
                return false;
            }
        }
        return true;
    }

    public final void release() {
        if (!this.released) {
            this.released = true;
            for (int i = 0; i < this.tasks.size(); i++) {
                this.tasks.get(i).stop();
            }
            ConditionVariable conditionVariable = new ConditionVariable();
            this.fileIOHandler.post(new setSharedElementEnterTransition(conditionVariable));
            conditionVariable.block();
            this.fileIOThread.quit();
            logd("Released");
        }
    }

    private Task addTaskForAction(DownloadAction downloadAction) {
        int i = this.nextTaskId;
        this.nextTaskId = i + 1;
        Task task = new Task(i, this, downloadAction, this.minRetryCount);
        this.tasks.add(task);
        logd("Task is added", task);
        return task;
    }

    private void maybeStartTasks() {
        DownloadAction access$300;
        boolean z;
        if (this.initialized && !this.released) {
            boolean z2 = this.downloadsStopped || this.activeDownloadTasks.size() == this.maxActiveDownloadTasks;
            for (int i = 0; i < this.tasks.size(); i++) {
                Task task = this.tasks.get(i);
                if (task.canStart() && ((z = access$300.isRemoveAction) || !z2)) {
                    int i2 = 0;
                    boolean z3 = true;
                    while (true) {
                        if (i2 >= i) {
                            break;
                        }
                        Task task2 = this.tasks.get(i2);
                        if (task2.action.isSameMedia((access$300 = task.action))) {
                            if (z) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(task);
                                sb.append(" clashes with ");
                                sb.append(task2);
                                logd(sb.toString());
                                task2.cancel();
                                z3 = false;
                            } else if (task2.action.isRemoveAction) {
                                z2 = true;
                                z3 = false;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (z3) {
                        task.start();
                        if (!z) {
                            this.activeDownloadTasks.add(task);
                            z2 = this.activeDownloadTasks.size() == this.maxActiveDownloadTasks;
                        }
                    }
                }
            }
        }
    }

    private void maybeNotifyListenersIdle() {
        if (isIdle()) {
            logd("Notify idle state");
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onIdle(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void onTaskStateChange(Task task) {
        if (!this.released) {
            boolean z = !task.isActive();
            if (z) {
                this.activeDownloadTasks.remove(task);
            }
            notifyListenersTaskStateChange(task);
            if (task.isFinished()) {
                this.tasks.remove(task);
                saveActions();
            }
            if (z) {
                maybeStartTasks();
                maybeNotifyListenersIdle();
            }
        }
    }

    private void notifyListenersTaskStateChange(Task task) {
        logd("Task state is changed", task);
        TaskState downloadState = task.getDownloadState();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onTaskStateChanged(this, downloadState);
        }
    }

    private void loadActions() {
        this.fileIOHandler.post(new getSharedElementEnterTransition(this));
    }

    public final /* synthetic */ void lambda$loadActions$1() {
        DownloadAction[] downloadActionArr;
        try {
            downloadActionArr = this.actionFile.load(this.deserializers);
            logd("Action file is loaded.");
        } catch (Throwable th) {
            Log.e(TAG, "Action file loading failed.", th);
            downloadActionArr = new DownloadAction[0];
        }
        this.handler.post(new setSharedElementReturnTransition(this, downloadActionArr));
    }

    public final /* synthetic */ void lambda$null$0(DownloadAction[] downloadActionArr) {
        if (!this.released) {
            ArrayList arrayList = new ArrayList(this.tasks);
            this.tasks.clear();
            for (DownloadAction addTaskForAction : downloadActionArr) {
                addTaskForAction(addTaskForAction);
            }
            logd("Tasks are created.");
            this.initialized = true;
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onInitialized(this);
            }
            if (!arrayList.isEmpty()) {
                this.tasks.addAll(arrayList);
                saveActions();
            }
            maybeStartTasks();
            for (int i = 0; i < this.tasks.size(); i++) {
                Task task = this.tasks.get(i);
                if (task.currentState == 0) {
                    notifyListenersTaskStateChange(task);
                }
            }
        }
    }

    private void saveActions() {
        if (!this.released) {
            DownloadAction[] downloadActionArr = new DownloadAction[this.tasks.size()];
            for (int i = 0; i < this.tasks.size(); i++) {
                downloadActionArr[i] = this.tasks.get(i).action;
            }
            this.fileIOHandler.post(new getReenterTransition(this, downloadActionArr));
        }
    }

    public final /* synthetic */ void lambda$saveActions$2(DownloadAction[] downloadActionArr) {
        try {
            this.actionFile.store(downloadActionArr);
            logd("Actions persisted.");
        } catch (IOException e) {
            Log.e(TAG, "Persisting actions failed.", e);
        }
    }

    /* access modifiers changed from: private */
    public static void logd(String str, Task task) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(task);
        logd(sb.toString());
    }

    public static final class TaskState {
        public static final int STATE_CANCELED = 3;
        public static final int STATE_COMPLETED = 2;
        public static final int STATE_FAILED = 4;
        public static final int STATE_QUEUED = 0;
        public static final int STATE_STARTED = 1;
        public final DownloadAction action;
        public final float downloadPercentage;
        public final long downloadedBytes;
        public final Throwable error;
        public final int state;
        public final int taskId;

        @Retention(RetentionPolicy.SOURCE)
        public @interface State {
        }

        public static String getStateString(int i) {
            if (i == 0) {
                return "QUEUED";
            }
            if (i == 1) {
                return "STARTED";
            }
            if (i == 2) {
                return "COMPLETED";
            }
            if (i == 3) {
                return "CANCELED";
            }
            if (i == 4) {
                return "FAILED";
            }
            throw new IllegalStateException();
        }

        private TaskState(int i, DownloadAction downloadAction, int i2, float f, long j, Throwable th) {
            this.taskId = i;
            this.action = downloadAction;
            this.state = i2;
            this.downloadPercentage = f;
            this.downloadedBytes = j;
            this.error = th;
        }
    }

    public static final class Task implements Runnable {
        public static final int STATE_QUEUED_CANCELING = 5;
        public static final int STATE_STARTED_CANCELING = 6;
        public static final int STATE_STARTED_STOPPING = 7;
        /* access modifiers changed from: private */
        public final DownloadAction action;
        /* access modifiers changed from: private */
        public volatile int currentState;
        private final DownloadManager downloadManager;
        private volatile Downloader downloader;
        private Throwable error;
        /* access modifiers changed from: private */

        /* renamed from: id  reason: collision with root package name */
        public final int f10788id;
        private final int minRetryCount;
        private Thread thread;

        @Retention(RetentionPolicy.SOURCE)
        public @interface InternalState {
        }

        private Task(int i, DownloadManager downloadManager2, DownloadAction downloadAction, int i2) {
            this.f10788id = i;
            this.downloadManager = downloadManager2;
            this.action = downloadAction;
            this.currentState = 0;
            this.minRetryCount = i2;
        }

        public final TaskState getDownloadState() {
            return new TaskState(this.f10788id, this.action, getExternalState(), getDownloadPercentage(), getDownloadedBytes(), this.error);
        }

        public final boolean isFinished() {
            return this.currentState == 4 || this.currentState == 2 || this.currentState == 3;
        }

        public final boolean isActive() {
            return this.currentState == 5 || this.currentState == 1 || this.currentState == 7 || this.currentState == 6;
        }

        public final float getDownloadPercentage() {
            if (this.downloader != null) {
                return this.downloader.getDownloadPercentage();
            }
            return -1.0f;
        }

        public final long getDownloadedBytes() {
            if (this.downloader != null) {
                return this.downloader.getDownloadedBytes();
            }
            return 0;
        }

        public final String toString() {
            return super.toString();
        }

        private static String toString(byte[] bArr) {
            if (bArr.length > 100) {
                return "<data is too long>";
            }
            StringBuilder sb = new StringBuilder("'");
            sb.append(Util.fromUtf8Bytes(bArr));
            sb.append('\'');
            return sb.toString();
        }

        private String getStateString() {
            int i = this.currentState;
            if (i == 5 || i == 6) {
                return "CANCELING";
            }
            return i != 7 ? TaskState.getStateString(this.currentState) : "STOPPING";
        }

        private int getExternalState() {
            int i = this.currentState;
            if (i == 5) {
                return 0;
            }
            if (i == 6 || i == 7) {
                return 1;
            }
            return this.currentState;
        }

        /* access modifiers changed from: private */
        public void start() {
            if (changeStateAndNotify(0, 1)) {
                Thread thread2 = new Thread(this);
                this.thread = thread2;
                thread2.start();
            }
        }

        /* access modifiers changed from: private */
        public boolean canStart() {
            return this.currentState == 0;
        }

        /* access modifiers changed from: private */
        public void cancel() {
            if (changeStateAndNotify(0, 5)) {
                this.downloadManager.handler.post(new getSharedElementReturnTransition(this));
            } else if (changeStateAndNotify(1, 6)) {
                cancelDownload();
            }
        }

        public final /* synthetic */ void lambda$cancel$0() {
            changeStateAndNotify(5, 3);
        }

        /* access modifiers changed from: private */
        public void stop() {
            if (changeStateAndNotify(1, 7)) {
                DownloadManager.logd("Stopping", this);
                cancelDownload();
            }
        }

        private boolean changeStateAndNotify(int i, int i2) {
            return changeStateAndNotify(i, i2, (Throwable) null);
        }

        private boolean changeStateAndNotify(int i, int i2, Throwable th) {
            boolean z = false;
            if (this.currentState != i) {
                return false;
            }
            this.currentState = i2;
            this.error = th;
            if (this.currentState != getExternalState()) {
                z = true;
            }
            if (!z) {
                this.downloadManager.onTaskStateChange(this);
            }
            return true;
        }

        private void cancelDownload() {
            if (this.downloader != null) {
                this.downloader.cancel();
            }
            this.thread.interrupt();
        }

        public final void run() {
            long j;
            int i;
            DownloadManager.logd("Task is started", this);
            try {
                this.downloader = this.action.createDownloader(this.downloadManager.downloaderConstructorHelper);
                if (this.action.isRemoveAction) {
                    this.downloader.remove();
                } else {
                    j = -1;
                    i = 0;
                    while (!Thread.interrupted()) {
                        this.downloader.download();
                    }
                }
                th = null;
            } catch (IOException e) {
                long downloadedBytes = this.downloader.getDownloadedBytes();
                if (downloadedBytes != j) {
                    DownloadManager.logd("Reset error count. downloadedBytes = ".concat(String.valueOf(downloadedBytes)), this);
                    j = downloadedBytes;
                    i = 0;
                }
                if (this.currentState != 1 || (i = i + 1) > this.minRetryCount) {
                    throw e;
                }
                DownloadManager.logd("Download error. Retry ".concat(String.valueOf(i)), this);
                Thread.sleep((long) getRetryDelayMillis(i));
            } catch (Throwable th) {
                th = th;
            }
            this.downloadManager.handler.post(new getAllowEnterTransitionOverlap(this, th));
        }

        public final /* synthetic */ void lambda$run$1(Throwable th) {
            if (!changeStateAndNotify(1, th != null ? 4 : 2, th) && !changeStateAndNotify(6, 3) && !changeStateAndNotify(7, 0)) {
                throw new IllegalStateException();
            }
        }

        private int getRetryDelayMillis(int i) {
            return Math.min((i - 1) * 1000, 5000);
        }
    }
}
