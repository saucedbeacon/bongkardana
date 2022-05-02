package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzti;
import com.google.android.gms.internal.firebase_ml.zztj;

public abstract class zzti<MessageType extends zztj<MessageType, BuilderType>, BuilderType extends zzti<MessageType, BuilderType>> implements zzwh {
    /* access modifiers changed from: protected */
    public abstract BuilderType zza(MessageType messagetype);

    /* renamed from: zzrr */
    public abstract BuilderType clone();

    public final /* synthetic */ zzwh zza(zzwi zzwi) {
        if (zztf().getClass().isInstance(zzwi)) {
            return zza((zztj) zzwi);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
