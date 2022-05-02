package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zap;

final class zabb extends zap {
    private final /* synthetic */ zaaz zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zabb(zaaz zaaz, Looper looper) {
        super(looper);
        this.zaa = zaaz;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((zaay) message.obj).zaa(this.zaa);
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
