package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzio;

public abstract class zzin<MessageType extends zzio<MessageType, BuilderType>, BuilderType extends zzin<MessageType, BuilderType>> implements zzlh {
    /* renamed from: zzaq */
    public abstract BuilderType clone();

    public BuilderType zzar(byte[] bArr, int i, int i2) throws zzkn {
        throw null;
    }

    public BuilderType zzas(byte[] bArr, int i, int i2, zzjp zzjp) throws zzkn {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract BuilderType zzat(MessageType messagetype);

    public final /* synthetic */ zzlh zzau(zzli zzli) {
        if (zzbL().getClass().isInstance(zzli)) {
            return zzat((zzio) zzli);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public final /* synthetic */ zzlh zzav(byte[] bArr, zzjp zzjp) throws zzkn {
        return zzas(bArr, 0, bArr.length, zzjp);
    }

    public final /* synthetic */ zzlh zzaw(byte[] bArr) throws zzkn {
        return zzar(bArr, 0, bArr.length);
    }
}
