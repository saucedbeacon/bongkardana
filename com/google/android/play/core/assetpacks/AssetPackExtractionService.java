package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.play.core.internal.af;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class AssetPackExtractionService extends Service {

    /* renamed from: a  reason: collision with root package name */
    Context f10834a;
    j b;
    bb c;
    private final af d = new af("AssetPackExtractionService");
    private b e;
    private NotificationManager f;

    private final synchronized void b(Bundle bundle) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1956526663, oncanceled);
            onCancelLoad.getMin(1956526663, oncanceled);
        }
        String string = bundle.getString("notification_title");
        String string2 = bundle.getString("notification_subtext");
        long j = bundle.getLong("notification_timeout");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("notification_on_click_intent");
        Notification.Builder timeoutAfter = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(this.f10834a, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j) : new Notification.Builder(this.f10834a).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(17301633).setOngoing(false).setContentTitle(string).setSubText(string2);
        if (Build.VERSION.SDK_INT >= 21) {
            timeoutAfter.setColor(bundle.getInt("notification_color")).setVisibility(-1);
        }
        Notification build = timeoutAfter.build();
        this.d.c("Starting foreground service.", new Object[0]);
        this.b.a(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", bundle.getString("notification_channel_name"), 2));
        }
        startForeground(-1883842196, build);
    }

    public final synchronized Bundle a(Bundle bundle) {
        int i = bundle.getInt("action_type");
        af afVar = this.d;
        Integer valueOf = Integer.valueOf(i);
        afVar.a("updateServiceState: %d", valueOf);
        if (i == 1) {
            b(bundle);
        } else if (i == 2) {
            a();
        } else {
            this.d.b("Unknown action type received: %d", valueOf);
        }
        return new Bundle();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1461205388, oncanceled);
            onCancelLoad.getMin(1461205388, oncanceled);
        }
        this.d.c("Stopping service.", new Object[0]);
        this.b.a(false);
        stopForeground(true);
        stopSelf();
    }

    public final IBinder onBind(Intent intent) {
        return this.e;
    }

    public final void onCreate() {
        super.onCreate();
        this.d.a("onCreate", new Object[0]);
        db.a(getApplicationContext()).a(this);
        this.e = new b(this.f10834a, this, this.c);
        this.f = (NotificationManager) this.f10834a.getSystemService("notification");
    }
}
