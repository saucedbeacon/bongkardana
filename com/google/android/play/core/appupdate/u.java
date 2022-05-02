package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.AppUpdateOptions;

final class u extends AppUpdateOptions.Builder {

    /* renamed from: a  reason: collision with root package name */
    private Integer f9560a;
    private Boolean b;

    u() {
    }

    public final AppUpdateOptions build() {
        String str = "";
        if (this.f9560a == null) {
            str = str.concat(" appUpdateType");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" allowAssetPackDeletion");
        }
        if (str.isEmpty()) {
            return new v(this.f9560a.intValue(), this.b.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    public final AppUpdateOptions.Builder setAllowAssetPackDeletion(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public final AppUpdateOptions.Builder setAppUpdateType(int i) {
        this.f9560a = Integer.valueOf(i);
        return this;
    }
}
