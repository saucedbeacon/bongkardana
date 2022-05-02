package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import o.getLastBaselineToBottomHeight;
import o.onDraw;
import o.setSupportBackgroundTintList;
import o.setSupportCompoundDrawablesTintList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemForegroundService extends LifecycleService implements onDraw.setMin {
    private static final String getMax = setSupportBackgroundTintList.length("SystemFgService");
    @Nullable
    private static SystemForegroundService length = null;
    private Handler getMin;
    onDraw mDispatcher;
    NotificationManager mNotificationManager;
    private boolean setMin;

    public void onCreate() {
        super.onCreate();
        length = this;
        setMin();
    }

    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.setMin) {
            setSupportBackgroundTintList.getMax();
            this.mDispatcher.setMax();
            setMin();
            this.setMin = false;
        }
        if (intent == null) {
            return 3;
        }
        onDraw ondraw = this.mDispatcher;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            setSupportBackgroundTintList.getMax();
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            ondraw.getMax.length(new Runnable(ondraw.getMin.setMax, stringExtra) {
                final /* synthetic */ String setMax;
                final /* synthetic */ WorkDatabase setMin;

                {
                    this.setMin = r2;
                    this.setMax = r3;
                }

                public final void run() {
                    getInternalPopup length = this.setMin.getMax().length(this.setMax);
                    if (length != null && length.setMin()) {
                        synchronized (onDraw.this.length) {
                            onDraw.this.IsOverlapping.put(this.setMax, length);
                            onDraw.this.toIntRange.add(length);
                            onDraw.this.equals.getMax(onDraw.this.toIntRange);
                        }
                    }
                }
            });
            ondraw.getMax(intent);
            return 3;
        } else if ("ACTION_NOTIFY".equals(action)) {
            ondraw.getMax(intent);
            return 3;
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            setSupportBackgroundTintList.getMax();
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = ondraw.getMin;
            setsupportcompounddrawablestintlist.length.length(new getLastBaselineToBottomHeight(UUID.fromString(stringExtra2)) {
                final /* synthetic */ UUID getMax;

                {
                    this.getMax = r2;
                }

                /* JADX INFO: finally extract failed */
                /* access modifiers changed from: package-private */
                @WorkerThread
                public final void getMin() {
                    WorkDatabase workDatabase = setSupportCompoundDrawablesTintList.this.setMax;
                    workDatabase.beginTransaction();
                    try {
                        setMin(setSupportCompoundDrawablesTintList.this, this.getMax.toString());
                        workDatabase.setTransactionSuccessful();
                        workDatabase.endTransaction();
                        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = setSupportCompoundDrawablesTintList.this;
                        getAutoSizeMinTextSize.setMax(setsupportcompounddrawablestintlist.getMax, setsupportcompounddrawablestintlist.setMax, setsupportcompounddrawablestintlist.getMin);
                    } catch (Throwable th) {
                        workDatabase.endTransaction();
                        throw th;
                    }
                }
            });
            return 3;
        } else if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        } else {
            setSupportBackgroundTintList.getMax();
            if (ondraw.isInside == null) {
                return 3;
            }
            ondraw.isInside.stop();
            return 3;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.mDispatcher.setMax();
    }

    @MainThread
    private void setMin() {
        this.getMin = new Handler(Looper.getMainLooper());
        this.mNotificationManager = (NotificationManager) getApplicationContext().getSystemService("notification");
        onDraw ondraw = new onDraw(getApplicationContext());
        this.mDispatcher = ondraw;
        if (ondraw.isInside != null) {
            setSupportBackgroundTintList.getMax();
        } else {
            ondraw.isInside = this;
        }
    }

    @MainThread
    public void stop() {
        this.setMin = true;
        setSupportBackgroundTintList.getMax();
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        length = null;
        stopSelf();
    }

    public void startForeground(final int i, final int i2, @NonNull final Notification notification) {
        this.getMin.post(new Runnable() {
            public final void run() {
                if (Build.VERSION.SDK_INT >= 29) {
                    SystemForegroundService.this.startForeground(i, notification, i2);
                } else {
                    SystemForegroundService.this.startForeground(i, notification);
                }
            }
        });
    }

    public void notify(final int i, @NonNull final Notification notification) {
        this.getMin.post(new Runnable() {
            public final void run() {
                SystemForegroundService.this.mNotificationManager.notify(i, notification);
            }
        });
    }

    public void cancelNotification(final int i) {
        this.getMin.post(new Runnable() {
            public final void run() {
                SystemForegroundService.this.mNotificationManager.cancel(i);
            }
        });
    }

    @Nullable
    public static SystemForegroundService getInstance() {
        return length;
    }
}
