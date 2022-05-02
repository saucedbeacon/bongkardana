package com.google.firebase.ml.common;

import android.content.Context;
import com.google.android.gms.internal.firebase_ml.zzpi;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

final /* synthetic */ class zzb implements ComponentFactory {
    static final ComponentFactory zzaxz = new zzb();

    private zzb() {
    }

    public final Object create(ComponentContainer componentContainer) {
        return new zzpi((Context) componentContainer.get(Context.class));
    }
}
