package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.OnSuccessListener;
import java.util.List;

final /* synthetic */ class g implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    private final bb f10932a;

    private g(bb bbVar) {
        this.f10932a = bbVar;
    }

    static OnSuccessListener a(bb bbVar) {
        return new g(bbVar);
    }

    public final void onSuccess(Object obj) {
        this.f10932a.a((List<String>) (List) obj);
    }
}
