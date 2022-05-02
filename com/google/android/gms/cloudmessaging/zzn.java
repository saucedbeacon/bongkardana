package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

final class zzn extends zzq<Void> {
    zzn(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: package-private */
    public final boolean zza() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void zza(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            zza(null);
        } else {
            zza(new zzp(4, "Invalid response to one way request"));
        }
    }
}
