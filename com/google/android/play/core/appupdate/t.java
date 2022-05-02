package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.install.model.UpdateAvailability;

final class t extends AppUpdateInfo {

    /* renamed from: a  reason: collision with root package name */
    private final String f9559a;
    private final int b;
    private final int c;
    private final int d;
    private final Integer e;
    private final int f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final PendingIntent k;
    private final PendingIntent l;
    private final PendingIntent m;
    private final PendingIntent n;

    t(String str, int i2, int i3, int i4, @Nullable Integer num, int i5, long j2, long j3, long j4, long j5, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3, @Nullable PendingIntent pendingIntent4) {
        String str2 = str;
        if (str2 != null) {
            this.f9559a = str2;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = num;
            this.f = i5;
            this.g = j2;
            this.h = j3;
            this.i = j4;
            this.j = j5;
            this.k = pendingIntent;
            this.l = pendingIntent2;
            this.m = pendingIntent3;
            this.n = pendingIntent4;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        return this.i;
    }

    public final int availableVersionCode() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final long b() {
        return this.j;
    }

    public final long bytesDownloaded() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final PendingIntent c() {
        return this.k;
    }

    @Nullable
    public final Integer clientVersionStalenessDays() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final PendingIntent d() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final PendingIntent e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        Integer num;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppUpdateInfo) {
            AppUpdateInfo appUpdateInfo = (AppUpdateInfo) obj;
            if (this.f9559a.equals(appUpdateInfo.packageName()) && this.b == appUpdateInfo.availableVersionCode() && this.c == appUpdateInfo.updateAvailability() && this.d == appUpdateInfo.installStatus() && ((num = this.e) != null ? num.equals(appUpdateInfo.clientVersionStalenessDays()) : appUpdateInfo.clientVersionStalenessDays() == null) && this.f == appUpdateInfo.updatePriority() && this.g == appUpdateInfo.bytesDownloaded() && this.h == appUpdateInfo.totalBytesToDownload() && this.i == appUpdateInfo.a() && this.j == appUpdateInfo.b() && ((pendingIntent = this.k) != null ? pendingIntent.equals(appUpdateInfo.c()) : appUpdateInfo.c() == null) && ((pendingIntent2 = this.l) != null ? pendingIntent2.equals(appUpdateInfo.d()) : appUpdateInfo.d() == null) && ((pendingIntent3 = this.m) != null ? pendingIntent3.equals(appUpdateInfo.e()) : appUpdateInfo.e() == null)) {
                PendingIntent pendingIntent4 = this.n;
                PendingIntent f2 = appUpdateInfo.f();
                if (pendingIntent4 != null ? pendingIntent4.equals(f2) : f2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final PendingIntent f() {
        return this.n;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f9559a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        Integer num = this.e;
        int i2 = 0;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int i3 = this.f;
        long j2 = this.g;
        long j3 = this.h;
        long j4 = this.i;
        long j5 = this.j;
        int i4 = (((((((((((hashCode ^ hashCode2) * 1000003) ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003;
        PendingIntent pendingIntent = this.k;
        int hashCode3 = (i4 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        PendingIntent pendingIntent2 = this.l;
        int hashCode4 = (hashCode3 ^ (pendingIntent2 == null ? 0 : pendingIntent2.hashCode())) * 1000003;
        PendingIntent pendingIntent3 = this.m;
        int hashCode5 = (hashCode4 ^ (pendingIntent3 == null ? 0 : pendingIntent3.hashCode())) * 1000003;
        PendingIntent pendingIntent4 = this.n;
        if (pendingIntent4 != null) {
            i2 = pendingIntent4.hashCode();
        }
        return hashCode5 ^ i2;
    }

    @InstallStatus
    public final int installStatus() {
        return this.d;
    }

    @NonNull
    public final String packageName() {
        return this.f9559a;
    }

    public final String toString() {
        String str = this.f9559a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        String valueOf = String.valueOf(this.e);
        int i5 = this.f;
        long j2 = this.g;
        long j3 = this.h;
        long j4 = this.i;
        long j5 = this.j;
        String valueOf2 = String.valueOf(this.k);
        long j6 = j5;
        String valueOf3 = String.valueOf(this.l);
        String valueOf4 = String.valueOf(this.m);
        long j7 = j4;
        String valueOf5 = String.valueOf(this.n);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 463 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i2);
        sb.append(", updateAvailability=");
        sb.append(i3);
        sb.append(", installStatus=");
        sb.append(i4);
        sb.append(", clientVersionStalenessDays=");
        sb.append(valueOf);
        sb.append(", updatePriority=");
        sb.append(i5);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", additionalSpaceRequired=");
        sb.append(j7);
        sb.append(", assetPackStorageSize=");
        sb.append(j6);
        sb.append(", immediateUpdateIntent=");
        sb.append(valueOf2);
        sb.append(", flexibleUpdateIntent=");
        sb.append(valueOf3);
        sb.append(", immediateDestructiveUpdateIntent=");
        sb.append(valueOf4);
        sb.append(", flexibleDestructiveUpdateIntent=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }

    public final long totalBytesToDownload() {
        return this.h;
    }

    @UpdateAvailability
    public final int updateAvailability() {
        return this.c;
    }

    public final int updatePriority() {
        return this.f;
    }
}
