package com.mixpanel.android.mpmetrics;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import o.convertFocusDirectionToLayoutDirection;
import o.dispatchOnCancelled;
import o.findFirstVisibleChildClosestToStart;
import o.findOnePartiallyOrCompletelyInvisibleChild;
import o.onCancelLoad;
import o.onCanceled;

public class MixpanelFCMMessagingService extends FirebaseMessagingService {
    protected static final int NOTIFICATION_ID = 1;

    public static void init() {
        FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
            public final void onComplete(Task<InstanceIdResult> task) {
                if (task.isSuccessful()) {
                    MixpanelFCMMessagingService.addToken(task.getResult().getToken());
                }
            }
        });
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        findOnePartiallyOrCompletelyInvisibleChild.length();
        onMessageReceived(getApplicationContext(), remoteMessage.toIntent());
    }

    public void onNewToken(String str) {
        super.onNewToken(str);
        findOnePartiallyOrCompletelyInvisibleChild.length();
        addToken(str);
    }

    /* access modifiers changed from: protected */
    public void onMessageReceived(Context context, Intent intent) {
        showPushNotification(context, intent);
    }

    public static void addToken(final String str) {
        convertFocusDirectionToLayoutDirection.getMax((convertFocusDirectionToLayoutDirection.length) new convertFocusDirectionToLayoutDirection.length() {
            public final void getMin(convertFocusDirectionToLayoutDirection convertfocusdirectiontolayoutdirection) {
                convertfocusdirectiontolayoutdirection.setMax.getMax(str);
            }
        });
    }

    public static void showPushNotification(Context context, Intent intent) {
        showPushNotification(context, intent, new findFirstVisibleChildClosestToStart(context.getApplicationContext()));
    }

    public static void showPushNotification(Context context, Intent intent, findFirstVisibleChildClosestToStart findfirstvisiblechildclosesttostart) {
        Notification min = findfirstvisiblechildclosesttostart.setMin(intent);
        MixpanelNotificationData mixpanelNotificationData = findfirstvisiblechildclosesttostart.getMax;
        findOnePartiallyOrCompletelyInvisibleChild.length();
        if (min != null) {
            if (!findfirstvisiblechildclosesttostart.setMin()) {
                findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (mixpanelNotificationData.hashCode != null) {
                notificationManager.notify(mixpanelNotificationData.hashCode, 1, min);
            } else {
                notificationManager.notify(findfirstvisiblechildclosesttostart.getMin, min);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void cancelNotification(Bundle bundle, NotificationManager notificationManager) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -14725519 == (max = dispatchOnCancelled.getMax(applicationContext, -14725519)))) {
            onCanceled oncanceled = new onCanceled(-14725519, max, 512);
            onCancelLoad.setMax(-14725519, oncanceled);
            onCancelLoad.getMin(-14725519, oncanceled);
        }
        int i = bundle.getInt("mp_notification_id");
        String string = bundle.getString("mp_tag");
        if (string != null) {
            notificationManager.cancel(string, 1);
        } else {
            notificationManager.cancel(i);
        }
    }
}
