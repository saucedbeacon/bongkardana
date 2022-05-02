package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.i;

final class an extends ak<Void> {
    final /* synthetic */ ar c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    an(ar arVar, i<Void> iVar) {
        super(arVar, iVar);
        this.c = arVar;
    }

    public final void a(Bundle bundle, Bundle bundle2) {
        super.a(bundle, bundle2);
        if (!this.c.g.compareAndSet(true, false)) {
            ar.f10847a.d("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.c.a();
        }
    }
}
