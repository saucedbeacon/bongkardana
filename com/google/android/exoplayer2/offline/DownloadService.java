package com.google.android.exoplayer2.offline;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NotificationUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.HashMap;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class DownloadService extends Service {
    public static final String ACTION_ADD = "com.google.android.exoplayer.downloadService.action.ADD";
    public static final String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
    public static final String ACTION_RELOAD_REQUIREMENTS = "com.google.android.exoplayer.downloadService.action.RELOAD_REQUIREMENTS";
    private static final String ACTION_RESTART = "com.google.android.exoplayer.downloadService.action.RESTART";
    private static final boolean DEBUG = false;
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    private static final Requirements DEFAULT_REQUIREMENTS = new Requirements(1, false, false);
    public static final int FOREGROUND_NOTIFICATION_ID_NONE = 0;
    public static final String KEY_DOWNLOAD_ACTION = "download_action";
    public static final String KEY_FOREGROUND = "foreground";
    private static final String TAG = "DownloadService";
    private static final HashMap<Class<? extends DownloadService>, RequirementsHelper> requirementsHelpers = new HashMap<>();
    @Nullable
    private final String channelId;
    @StringRes
    private final int channelName;
    /* access modifiers changed from: private */
    public DownloadManager downloadManager;
    private DownloadManagerListener downloadManagerListener;
    /* access modifiers changed from: private */
    @Nullable
    public final ForegroundNotificationUpdater foregroundNotificationUpdater;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;

    private void logd(String str) {
    }

    /* access modifiers changed from: protected */
    public abstract DownloadManager getDownloadManager();

    /* access modifiers changed from: protected */
    @Nullable
    public abstract Scheduler getScheduler();

    @Nullable
    public IBinder onBind(Intent intent) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1816686293 == (max = dispatchOnCancelled.getMax(applicationContext, 1816686293)))) {
            onCanceled oncanceled = new onCanceled(1816686293, max, 512);
            onCancelLoad.setMax(1816686293, oncanceled);
            onCancelLoad.getMin(1816686293, oncanceled);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onTaskStateChanged(DownloadManager.TaskState taskState) {
    }

    protected DownloadService(int i) {
        this(i, 1000);
    }

    protected DownloadService(int i, long j) {
        this(i, j, (String) null, 0);
    }

    protected DownloadService(int i, long j, @Nullable String str, @StringRes int i2) {
        ForegroundNotificationUpdater foregroundNotificationUpdater2;
        if (i == 0) {
            foregroundNotificationUpdater2 = null;
        } else {
            foregroundNotificationUpdater2 = new ForegroundNotificationUpdater(i, j);
        }
        this.foregroundNotificationUpdater = foregroundNotificationUpdater2;
        this.channelId = str;
        this.channelName = i2;
    }

    public static Intent buildAddActionIntent(Context context, Class<? extends DownloadService> cls, DownloadAction downloadAction, boolean z) {
        return getIntent(context, cls, ACTION_ADD).putExtra(KEY_DOWNLOAD_ACTION, downloadAction.toByteArray()).putExtra(KEY_FOREGROUND, z);
    }

    public static void startWithAction(Context context, Class<? extends DownloadService> cls, DownloadAction downloadAction, boolean z) {
        Intent buildAddActionIntent = buildAddActionIntent(context, cls, downloadAction, z);
        if (z) {
            Util.startForegroundService(context, buildAddActionIntent);
        } else {
            context.startService(buildAddActionIntent);
        }
    }

    public static void start(Context context, Class<? extends DownloadService> cls) {
        context.startService(getIntent(context, cls, ACTION_INIT));
    }

    public static void startForeground(Context context, Class<? extends DownloadService> cls) {
        Util.startForegroundService(context, getIntent(context, cls, ACTION_INIT).putExtra(KEY_FOREGROUND, true));
    }

    public void onCreate() {
        logd("onCreate");
        String str = this.channelId;
        if (str != null) {
            NotificationUtil.createNotificationChannel(this, str, this.channelName, 2);
        }
        this.downloadManager = getDownloadManager();
        DownloadManagerListener downloadManagerListener2 = new DownloadManagerListener();
        this.downloadManagerListener = downloadManagerListener2;
        this.downloadManager.addListener(downloadManagerListener2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        if (r1.equals(ACTION_INIT) != false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r8, int r9, int r10) {
        /*
            r7 = this;
            android.content.Context r0 = r7.getBaseContext()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            if (r0 == 0) goto L_0x0025
            int r0 = o.dispatchOnCancelled.setMin(r0, r9)
            if (r9 == r0) goto L_0x0025
            o.onCanceled r2 = new o.onCanceled
            r3 = 8
            r2.<init>(r9, r0, r3)
            r9 = 41658257(0x27ba791, float:1.8488657E-37)
            o.onCancelLoad.setMax(r9, r2)
            o.onCancelLoad.getMin(r9, r2)
        L_0x0025:
            r7.lastStartId = r10
            r9 = 0
            r7.taskRemoved = r9
            java.lang.String r0 = "com.google.android.exoplayer.downloadService.action.RESTART"
            r2 = 1
            if (r8 == 0) goto L_0x004a
            java.lang.String r1 = r8.getAction()
            boolean r3 = r7.startedInForeground
            java.lang.String r4 = "foreground"
            boolean r4 = r8.getBooleanExtra(r4, r9)
            if (r4 != 0) goto L_0x0046
            boolean r4 = r0.equals(r1)
            if (r4 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r4 = 0
            goto L_0x0047
        L_0x0046:
            r4 = 1
        L_0x0047:
            r3 = r3 | r4
            r7.startedInForeground = r3
        L_0x004a:
            java.lang.String r3 = "com.google.android.exoplayer.downloadService.action.INIT"
            if (r1 != 0) goto L_0x004f
            r1 = r3
        L_0x004f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onStartCommand action: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r5 = " startId: "
            r4.append(r5)
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            r7.logd(r10)
            r10 = -1
            int r4 = r1.hashCode()
            r5 = 3
            r6 = 2
            switch(r4) {
                case -871181424: goto L_0x008e;
                case -608867945: goto L_0x0084;
                case -382886238: goto L_0x007a;
                case 1015676687: goto L_0x0073;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x0096
        L_0x0073:
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L_0x0096
            goto L_0x0097
        L_0x007a:
            java.lang.String r9 = "com.google.android.exoplayer.downloadService.action.ADD"
            boolean r9 = r1.equals(r9)
            if (r9 == 0) goto L_0x0096
            r9 = 2
            goto L_0x0097
        L_0x0084:
            java.lang.String r9 = "com.google.android.exoplayer.downloadService.action.RELOAD_REQUIREMENTS"
            boolean r9 = r1.equals(r9)
            if (r9 == 0) goto L_0x0096
            r9 = 3
            goto L_0x0097
        L_0x008e:
            boolean r9 = r1.equals(r0)
            if (r9 == 0) goto L_0x0096
            r9 = 1
            goto L_0x0097
        L_0x0096:
            r9 = -1
        L_0x0097:
            if (r9 == 0) goto L_0x00cd
            if (r9 == r2) goto L_0x00cd
            java.lang.String r10 = "DownloadService"
            if (r9 == r6) goto L_0x00b3
            if (r9 == r5) goto L_0x00af
            java.lang.String r8 = java.lang.String.valueOf(r1)
            java.lang.String r9 = "Ignoring unrecognized action: "
            java.lang.String r8 = r9.concat(r8)
            com.google.android.exoplayer2.util.Log.e(r10, r8)
            goto L_0x00cd
        L_0x00af:
            r7.stopWatchingRequirements()
            goto L_0x00cd
        L_0x00b3:
            java.lang.String r9 = "download_action"
            byte[] r8 = r8.getByteArrayExtra(r9)
            if (r8 != 0) goto L_0x00c1
            java.lang.String r8 = "Ignoring ADD action with no action data"
            com.google.android.exoplayer2.util.Log.e(r10, r8)
            goto L_0x00cd
        L_0x00c1:
            com.google.android.exoplayer2.offline.DownloadManager r9 = r7.downloadManager     // Catch:{ IOException -> 0x00c7 }
            r9.handleAction((byte[]) r8)     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00cd
        L_0x00c7:
            r8 = move-exception
            java.lang.String r9 = "Failed to handle ADD action"
            com.google.android.exoplayer2.util.Log.e(r10, r9, r8)
        L_0x00cd:
            com.google.android.exoplayer2.scheduler.Requirements r8 = r7.getRequirements()
            boolean r9 = r8.checkRequirements(r7)
            if (r9 == 0) goto L_0x00dd
            com.google.android.exoplayer2.offline.DownloadManager r9 = r7.downloadManager
            r9.startDownloads()
            goto L_0x00e2
        L_0x00dd:
            com.google.android.exoplayer2.offline.DownloadManager r9 = r7.downloadManager
            r9.stopDownloads()
        L_0x00e2:
            r7.maybeStartWatchingRequirements(r8)
            com.google.android.exoplayer2.offline.DownloadManager r8 = r7.downloadManager
            boolean r8 = r8.isIdle()
            if (r8 == 0) goto L_0x00f0
            r7.stop()
        L_0x00f0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DownloadService.onStartCommand(android.content.Intent, int, int):int");
    }

    public void onTaskRemoved(Intent intent) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-527859050, oncanceled);
            onCancelLoad.getMin(-527859050, oncanceled);
        }
        logd("onTaskRemoved rootIntent: ".concat(String.valueOf(intent)));
        this.taskRemoved = true;
    }

    public void onDestroy() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(386061220, oncanceled);
            onCancelLoad.getMin(386061220, oncanceled);
        }
        logd("onDestroy");
        ForegroundNotificationUpdater foregroundNotificationUpdater2 = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater2 != null) {
            foregroundNotificationUpdater2.stopPeriodicUpdates();
        }
        this.downloadManager.removeListener(this.downloadManagerListener);
        maybeStopWatchingRequirements();
    }

    /* access modifiers changed from: protected */
    public Requirements getRequirements() {
        return DEFAULT_REQUIREMENTS;
    }

    /* access modifiers changed from: protected */
    public Notification getForegroundNotification(DownloadManager.TaskState[] taskStateArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(" is started in the foreground but getForegroundNotification() is not implemented.");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: private */
    public void maybeStartWatchingRequirements(Requirements requirements) {
        if (this.downloadManager.getDownloadCount() != 0) {
            Class<?> cls = getClass();
            if (requirementsHelpers.get(cls) == null) {
                RequirementsHelper requirementsHelper = new RequirementsHelper(this, requirements, getScheduler(), cls);
                requirementsHelpers.put(cls, requirementsHelper);
                requirementsHelper.start();
                logd("started watching requirements");
            }
        }
    }

    private void maybeStopWatchingRequirements() {
        if (this.downloadManager.getDownloadCount() <= 0) {
            stopWatchingRequirements();
        }
    }

    private void stopWatchingRequirements() {
        RequirementsHelper remove = requirementsHelpers.remove(getClass());
        if (remove != null) {
            remove.stop();
            logd("stopped watching requirements");
        }
    }

    /* access modifiers changed from: private */
    public void stop() {
        ForegroundNotificationUpdater foregroundNotificationUpdater2 = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater2 != null) {
            foregroundNotificationUpdater2.stopPeriodicUpdates();
            if (this.startedInForeground && Util.SDK_INT >= 26) {
                this.foregroundNotificationUpdater.showNotificationIfNotAlready();
            }
        }
        if (Util.SDK_INT >= 28 || !this.taskRemoved) {
            boolean stopSelfResult = stopSelfResult(this.lastStartId);
            StringBuilder sb = new StringBuilder("stopSelf(");
            sb.append(this.lastStartId);
            sb.append(") result: ");
            sb.append(stopSelfResult);
            logd(sb.toString());
            return;
        }
        stopSelf();
        logd("stopSelf()");
    }

    /* access modifiers changed from: private */
    public static Intent getIntent(Context context, Class<? extends DownloadService> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    final class DownloadManagerListener implements DownloadManager.Listener {
        private DownloadManagerListener() {
        }

        public final void onInitialized(DownloadManager downloadManager) {
            DownloadService downloadService = DownloadService.this;
            downloadService.maybeStartWatchingRequirements(downloadService.getRequirements());
        }

        public final void onTaskStateChanged(DownloadManager downloadManager, DownloadManager.TaskState taskState) {
            DownloadService.this.onTaskStateChanged(taskState);
            if (DownloadService.this.foregroundNotificationUpdater == null) {
                return;
            }
            if (taskState.state == 1) {
                DownloadService.this.foregroundNotificationUpdater.startPeriodicUpdates();
            } else {
                DownloadService.this.foregroundNotificationUpdater.update();
            }
        }

        public final void onIdle(DownloadManager downloadManager) {
            DownloadService.this.stop();
        }
    }

    final class ForegroundNotificationUpdater implements Runnable {
        private final Handler handler = new Handler(Looper.getMainLooper());
        private boolean notificationDisplayed;
        private final int notificationId;
        private boolean periodicUpdatesStarted;
        private final long updateInterval;

        public ForegroundNotificationUpdater(int i, long j) {
            this.notificationId = i;
            this.updateInterval = j;
        }

        public final void startPeriodicUpdates() {
            this.periodicUpdatesStarted = true;
            update();
        }

        public final void stopPeriodicUpdates() {
            this.periodicUpdatesStarted = false;
            this.handler.removeCallbacks(this);
        }

        public final void update() {
            DownloadManager.TaskState[] allTaskStates = DownloadService.this.downloadManager.getAllTaskStates();
            DownloadService downloadService = DownloadService.this;
            downloadService.startForeground(this.notificationId, downloadService.getForegroundNotification(allTaskStates));
            this.notificationDisplayed = true;
            if (this.periodicUpdatesStarted) {
                this.handler.removeCallbacks(this);
                this.handler.postDelayed(this, this.updateInterval);
            }
        }

        public final void showNotificationIfNotAlready() {
            if (!this.notificationDisplayed) {
                update();
            }
        }

        public final void run() {
            update();
        }
    }

    static final class RequirementsHelper implements RequirementsWatcher.Listener {
        private final Context context;
        private final Requirements requirements;
        private final RequirementsWatcher requirementsWatcher;
        @Nullable
        private final Scheduler scheduler;
        private final Class<? extends DownloadService> serviceClass;

        private RequirementsHelper(Context context2, Requirements requirements2, @Nullable Scheduler scheduler2, Class<? extends DownloadService> cls) {
            this.context = context2;
            this.requirements = requirements2;
            this.scheduler = scheduler2;
            this.serviceClass = cls;
            this.requirementsWatcher = new RequirementsWatcher(context2, this, requirements2);
        }

        public final void start() {
            this.requirementsWatcher.start();
        }

        public final void stop() {
            this.requirementsWatcher.stop();
            Scheduler scheduler2 = this.scheduler;
            if (scheduler2 != null) {
                scheduler2.cancel();
            }
        }

        public final void requirementsMet(RequirementsWatcher requirementsWatcher2) {
            try {
                notifyService();
                Scheduler scheduler2 = this.scheduler;
                if (scheduler2 != null) {
                    scheduler2.cancel();
                }
            } catch (Exception unused) {
            }
        }

        public final void requirementsNotMet(RequirementsWatcher requirementsWatcher2) {
            try {
                notifyService();
            } catch (Exception unused) {
            }
            if (this.scheduler != null) {
                if (!this.scheduler.schedule(this.requirements, this.context.getPackageName(), DownloadService.ACTION_RESTART)) {
                    Log.e(DownloadService.TAG, "Scheduling downloads failed.");
                }
            }
        }

        private void notifyService() throws Exception {
            try {
                this.context.startService(DownloadService.getIntent(this.context, this.serviceClass, DownloadService.ACTION_INIT));
            } catch (IllegalStateException e) {
                throw new Exception(e);
            }
        }
    }
}
