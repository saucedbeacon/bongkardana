package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.listener.b;

public final class t extends b<SplitInstallSessionState> {
    @Nullable
    private static t c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private final e e;

    public t(Context context, e eVar) {
        super(new af("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.e = eVar;
    }

    public static synchronized t a(Context context) {
        t tVar;
        synchronized (t.class) {
            if (c == null) {
                c = new t(context, l.f9621a);
            }
            tVar = c;
        }
        return tVar;
    }

    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra != null) {
            SplitInstallSessionState a2 = SplitInstallSessionState.a(bundleExtra);
            this.f9596a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", a2);
            f a3 = this.e.a();
            if (a2.status() != 3 || a3 == null) {
                a(a2);
            } else {
                a3.a(a2.c(), new r(this, a2, intent, context));
            }
        }
    }
}
