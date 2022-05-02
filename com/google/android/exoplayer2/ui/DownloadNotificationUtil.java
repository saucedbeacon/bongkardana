package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;

public final class DownloadNotificationUtil {
    @StringRes
    private static final int NULL_STRING_ID = 0;

    private DownloadNotificationUtil() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Notification buildProgressNotification(android.content.Context r17, @androidx.annotation.DrawableRes int r18, java.lang.String r19, @androidx.annotation.Nullable android.app.PendingIntent r20, @androidx.annotation.Nullable java.lang.String r21, com.google.android.exoplayer2.offline.DownloadManager.TaskState[] r22) {
        /*
            r0 = r22
            int r1 = r0.length
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            r10 = 0
        L_0x000c:
            if (r5 >= r1) goto L_0x003f
            r11 = r0[r5]
            int r12 = r11.state
            if (r12 == r2) goto L_0x0019
            int r12 = r11.state
            r13 = 2
            if (r12 != r13) goto L_0x003c
        L_0x0019:
            com.google.android.exoplayer2.offline.DownloadAction r12 = r11.action
            boolean r12 = r12.isRemoveAction
            if (r12 == 0) goto L_0x0021
            r7 = 1
            goto L_0x003c
        L_0x0021:
            float r6 = r11.downloadPercentage
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x002d
            float r6 = r11.downloadPercentage
            float r4 = r4 + r6
            r9 = 0
        L_0x002d:
            long r11 = r11.downloadedBytes
            r13 = 0
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x0037
            r6 = 1
            goto L_0x0038
        L_0x0037:
            r6 = 0
        L_0x0038:
            r10 = r10 | r6
            int r8 = r8 + 1
            r6 = 1
        L_0x003c:
            int r5 = r5 + 1
            goto L_0x000c
        L_0x003f:
            if (r6 == 0) goto L_0x0046
            int r0 = com.google.android.exoplayer2.ui.R.string.exo_download_downloading
        L_0x0043:
            r16 = r0
            goto L_0x004d
        L_0x0046:
            if (r7 == 0) goto L_0x004b
            int r0 = com.google.android.exoplayer2.ui.R.string.exo_download_removing
            goto L_0x0043
        L_0x004b:
            r16 = 0
        L_0x004d:
            r11 = r17
            r12 = r18
            r13 = r19
            r14 = r20
            r15 = r21
            androidx.core.app.NotificationCompat$setMax r0 = newNotificationBuilder(r11, r12, r13, r14, r15, r16)
            if (r6 == 0) goto L_0x0067
            float r1 = (float) r8
            float r4 = r4 / r1
            int r1 = (int) r4
            if (r9 == 0) goto L_0x0065
            if (r10 == 0) goto L_0x0065
            goto L_0x0068
        L_0x0065:
            r4 = 0
            goto L_0x0069
        L_0x0067:
            r1 = 0
        L_0x0068:
            r4 = 1
        L_0x0069:
            r5 = 100
            r0.getMax(r5, r1, r4)
            r0.length((boolean) r2)
            r0.setMax((boolean) r3)
            android.app.Notification r0 = r0.setMin()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DownloadNotificationUtil.buildProgressNotification(android.content.Context, int, java.lang.String, android.app.PendingIntent, java.lang.String, com.google.android.exoplayer2.offline.DownloadManager$TaskState[]):android.app.Notification");
    }

    public static Notification buildDownloadCompletedNotification(Context context, @DrawableRes int i, String str, @Nullable PendingIntent pendingIntent, @Nullable String str2) {
        return newNotificationBuilder(context, i, str, pendingIntent, str2, R.string.exo_download_completed).setMin();
    }

    public static Notification buildDownloadFailedNotification(Context context, @DrawableRes int i, String str, @Nullable PendingIntent pendingIntent, @Nullable String str2) {
        return newNotificationBuilder(context, i, str, pendingIntent, str2, R.string.exo_download_failed).setMin();
    }

    private static NotificationCompat.setMax newNotificationBuilder(Context context, @DrawableRes int i, String str, @Nullable PendingIntent pendingIntent, @Nullable String str2, @StringRes int i2) {
        NotificationCompat.setMax min = new NotificationCompat.setMax(context, str).getMin(i);
        if (i2 != 0) {
            min.setMin((CharSequence) context.getResources().getString(i2));
        }
        if (pendingIntent != null) {
            min.setMin(pendingIntent);
        }
        if (str2 != null) {
            min.setMax((NotificationCompat.getMax) new NotificationCompat.setMin().getMin(str2));
        }
        return min;
    }
}
