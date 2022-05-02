package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.a;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.cj;
import com.google.android.play.core.listener.b;
import java.util.ArrayList;
import java.util.concurrent.Executor;

final class aw extends b<AssetPackState> {
    private final cp c;
    private final bw d;
    private final cj<w> e;
    private final bn f;
    private final bz g;
    private final a h;
    private final cj<Executor> i;
    private final cj<Executor> j;
    private final Handler k = new Handler(Looper.getMainLooper());

    aw(Context context, cp cpVar, bw bwVar, cj<w> cjVar, bz bzVar, bn bnVar, a aVar, cj<Executor> cjVar2, cj<Executor> cjVar3) {
        super(new af("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.c = cpVar;
        this.d = bwVar;
        this.e = cjVar;
        this.g = bzVar;
        this.f = bnVar;
        this.h = aVar;
        this.i = cjVar2;
        this.j = cjVar3;
    }

    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f9596a.b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.play.core.FLAGS");
            if (bundleExtra2 != null) {
                this.h.a(bundleExtra2);
            }
            AssetPackState a2 = AssetPackState.a(bundleExtra, stringArrayList.get(0), this.g, ay.f10853a);
            this.f9596a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", a2);
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.f.a(pendingIntent);
            }
            this.j.a().execute(new au(this, bundleExtra, a2));
            this.i.a().execute(new av(this, bundleExtra));
            return;
        }
        this.f9596a.b("Empty bundle received from broadcast.", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle) {
        if (this.c.a(bundle)) {
            this.d.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle, AssetPackState assetPackState) {
        if (this.c.b(bundle)) {
            a(assetPackState);
            this.e.a().a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(AssetPackState assetPackState) {
        this.k.post(new at(this, assetPackState));
    }
}
