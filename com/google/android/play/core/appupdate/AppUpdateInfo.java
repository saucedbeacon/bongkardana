package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.install.model.UpdateAvailability;

public abstract class AppUpdateInfo {
    public static AppUpdateInfo a(@NonNull String str, int i, @UpdateAvailability int i2, @InstallStatus int i3, @Nullable Integer num, int i4, long j, long j2, long j3, long j4, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3, @Nullable PendingIntent pendingIntent4) {
        return new t(str, i, i2, i3, num, i4, j, j2, j3, j4, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4);
    }

    private final boolean b(AppUpdateOptions appUpdateOptions) {
        return appUpdateOptions.allowAssetPackDeletion() && a() <= b();
    }

    /* access modifiers changed from: package-private */
    public abstract long a();

    /* access modifiers changed from: package-private */
    @Nullable
    public final PendingIntent a(AppUpdateOptions appUpdateOptions) {
        if (appUpdateOptions.appUpdateType() != 0) {
            if (appUpdateOptions.appUpdateType() == 1) {
                if (c() != null) {
                    return c();
                }
                if (b(appUpdateOptions)) {
                    return e();
                }
            }
            return null;
        } else if (d() != null) {
            return d();
        } else {
            if (b(appUpdateOptions)) {
                return f();
            }
            return null;
        }
    }

    public abstract int availableVersionCode();

    /* access modifiers changed from: package-private */
    public abstract long b();

    public abstract long bytesDownloaded();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract PendingIntent c();

    @Nullable
    public abstract Integer clientVersionStalenessDays();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract PendingIntent d();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract PendingIntent e();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract PendingIntent f();

    @InstallStatus
    public abstract int installStatus();

    public boolean isUpdateTypeAllowed(@AppUpdateType int i) {
        return a(AppUpdateOptions.defaultOptions(i)) != null;
    }

    public boolean isUpdateTypeAllowed(@NonNull AppUpdateOptions appUpdateOptions) {
        return a(appUpdateOptions) != null;
    }

    @NonNull
    public abstract String packageName();

    public abstract long totalBytesToDownload();

    @UpdateAvailability
    public abstract int updateAvailability();

    public abstract int updatePriority();
}
