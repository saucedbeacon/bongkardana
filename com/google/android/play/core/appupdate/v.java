package com.google.android.play.core.appupdate;

import com.google.android.play.core.install.model.AppUpdateType;

final class v extends AppUpdateOptions {

    /* renamed from: a  reason: collision with root package name */
    private final int f9561a;
    private final boolean b;

    /* synthetic */ v(int i, boolean z) {
        this.f9561a = i;
        this.b = z;
    }

    public final boolean allowAssetPackDeletion() {
        return this.b;
    }

    @AppUpdateType
    public final int appUpdateType() {
        return this.f9561a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppUpdateOptions) {
            AppUpdateOptions appUpdateOptions = (AppUpdateOptions) obj;
            return this.f9561a == appUpdateOptions.appUpdateType() && this.b == appUpdateOptions.allowAssetPackDeletion();
        }
    }

    public final int hashCode() {
        return ((this.f9561a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f9561a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
