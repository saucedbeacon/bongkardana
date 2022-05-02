package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.OnFailureListener;

final /* synthetic */ class h implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    static final OnFailureListener f10933a = new h();

    private h() {
    }

    public final void onFailure(Exception exc) {
        j.f10935a.d(String.format("Could not sync active asset packs. %s", new Object[]{exc}), new Object[0]);
    }
}
