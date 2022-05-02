package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.i;

final class ap extends ak<AssetPackStates> {
    private final bz c;
    private final az d;

    ap(ar arVar, i<AssetPackStates> iVar, bz bzVar, az azVar) {
        super(arVar, iVar);
        this.c = bzVar;
        this.d = azVar;
    }

    public final void c(Bundle bundle, Bundle bundle2) {
        super.c(bundle, bundle2);
        this.f10846a.b(AssetPackStates.a(bundle, this.c, this.d));
    }
}
