package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.i;
import java.util.List;

final class am extends ak<List<String>> {
    final /* synthetic */ ar c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    am(ar arVar, i<List<String>> iVar) {
        super(arVar, iVar);
        this.c = arVar;
    }

    public final void a(List<Bundle> list) {
        super.a(list);
        this.f10846a.b(ar.a(this.c, (List) list));
    }
}
