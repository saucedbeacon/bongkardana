package com.google.android.play.core.review;

import android.app.PendingIntent;

final class a extends ReviewInfo {

    /* renamed from: a  reason: collision with root package name */
    private final PendingIntent f9597a;

    a(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.f9597a = pendingIntent;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent a() {
        return this.f9597a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            return this.f9597a.equals(((ReviewInfo) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f9597a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9597a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("ReviewInfo{pendingIntent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
