package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.i;

final class ao extends ak<Void> {
    final int c;
    final String d;
    final int e;
    final /* synthetic */ ar f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ao(ar arVar, i<Void> iVar, int i, String str, int i2) {
        super(arVar, iVar);
        this.f = arVar;
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    public final void a(Bundle bundle) {
        this.f.e.a();
        int i = bundle.getInt("error_code");
        ar.f10847a.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.e;
        if (i2 > 0) {
            this.f.a(this.c, this.d, i2 - 1);
        }
    }
}
