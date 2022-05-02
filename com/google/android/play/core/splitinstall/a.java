package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus;
import java.util.List;

final class a extends SplitInstallSessionState {

    /* renamed from: a  reason: collision with root package name */
    private final int f9619a;
    private final int b;
    private final int c;
    private final long d;
    private final long e;
    private final List<String> f;
    private final List<String> g;
    private final PendingIntent h;
    private final List<Intent> i;

    a(int i2, int i3, int i4, long j, long j2, @Nullable List<String> list, @Nullable List<String> list2, @Nullable PendingIntent pendingIntent, @Nullable List<Intent> list3) {
        this.f9619a = i2;
        this.b = i3;
        this.c = i4;
        this.d = j;
        this.e = j2;
        this.f = list;
        this.g = list2;
        this.h = pendingIntent;
        this.i = list3;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final List<String> a() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final List<String> b() {
        return this.g;
    }

    public final long bytesDownloaded() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final List<Intent> c() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        List<String> list;
        List<String> list2;
        PendingIntent pendingIntent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SplitInstallSessionState) {
            SplitInstallSessionState splitInstallSessionState = (SplitInstallSessionState) obj;
            if (this.f9619a == splitInstallSessionState.sessionId() && this.b == splitInstallSessionState.status() && this.c == splitInstallSessionState.errorCode() && this.d == splitInstallSessionState.bytesDownloaded() && this.e == splitInstallSessionState.totalBytesToDownload() && ((list = this.f) != null ? list.equals(splitInstallSessionState.a()) : splitInstallSessionState.a() == null) && ((list2 = this.g) != null ? list2.equals(splitInstallSessionState.b()) : splitInstallSessionState.b() == null) && ((pendingIntent = this.h) != null ? pendingIntent.equals(splitInstallSessionState.resolutionIntent()) : splitInstallSessionState.resolutionIntent() == null)) {
                List<Intent> list3 = this.i;
                List<Intent> c2 = splitInstallSessionState.c();
                if (list3 != null ? list3.equals(c2) : c2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @SplitInstallErrorCode
    public final int errorCode() {
        return this.c;
    }

    public final int hashCode() {
        int i2 = this.f9619a;
        int i3 = this.b;
        int i4 = this.c;
        long j = this.d;
        long j2 = this.e;
        int i5 = (((((((((i2 ^ 1000003) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        List<String> list = this.f;
        int i6 = 0;
        int hashCode = (i5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<String> list2 = this.g;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.h;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List<Intent> list3 = this.i;
        if (list3 != null) {
            i6 = list3.hashCode();
        }
        return hashCode3 ^ i6;
    }

    @Deprecated
    @Nullable
    public final PendingIntent resolutionIntent() {
        return this.h;
    }

    public final int sessionId() {
        return this.f9619a;
    }

    @SplitInstallSessionStatus
    public final int status() {
        return this.b;
    }

    public final String toString() {
        int i2 = this.f9619a;
        int i3 = this.b;
        int i4 = this.c;
        long j = this.d;
        long j2 = this.e;
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i2);
        sb.append(", status=");
        sb.append(i3);
        sb.append(", errorCode=");
        sb.append(i4);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        sb.append(", languagesNullable=");
        sb.append(valueOf2);
        sb.append(", resolutionIntent=");
        sb.append(valueOf3);
        sb.append(", splitFileIntents=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    public final long totalBytesToDownload() {
        return this.e;
    }
}
