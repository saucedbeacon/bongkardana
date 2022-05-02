package com.alipay.plus.push.core.util;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.core.app.NotificationCompat;

public class NotificationUtils {
    public static void showNotification(Context context, String str, String str2, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) context.getSystemService("notification")).notify(1, new NotificationCompat.setMax(context, "chat").setMin((CharSequence) str).getMin((CharSequence) str2).getMin(System.currentTimeMillis()).getMin(i).setMin(BitmapFactory.decodeResource(context.getResources(), i2)).getMax(true).setMin());
        }
    }

    public static void initNotification(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            createNotificationChannel(context, "chat", "chat", 4);
            createNotificationChannel(context, "subscribe", "subscribe", 3);
        }
    }

    @TargetApi(26)
    private static void createNotificationChannel(Context context, String str, String str2, int i) {
        ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(new NotificationChannel(str, str2, i));
    }
}
