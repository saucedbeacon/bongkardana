package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.zzw;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class RevocationBoundService extends Service {
    public final IBinder onBind(Intent intent) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(1619581586, oncanceled);
            onCancelLoad.getMin(1619581586, oncanceled);
        }
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            if (Log.isLoggable("RevocationService", 2)) {
                intent.getAction();
            }
            return new zzw(this);
        }
        intent.getAction();
        return null;
    }
}
