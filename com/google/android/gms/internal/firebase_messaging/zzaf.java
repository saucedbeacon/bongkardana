package com.google.android.gms.internal.firebase_messaging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

final class zzaf implements ValueEncoderContext {
    private boolean zza = false;
    private boolean zzb = false;
    private FieldDescriptor zzc;
    private final zzab zzd;

    zzaf(zzab zzab) {
        this.zzd = zzab;
    }

    private final void zzb() {
        if (!this.zza) {
            this.zza = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @NonNull
    public final ValueEncoderContext add(double d) throws IOException {
        zzb();
        this.zzd.zzb(this.zzc, d, this.zzb);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void zza(FieldDescriptor fieldDescriptor, boolean z) {
        this.zza = false;
        this.zzc = fieldDescriptor;
        this.zzb = z;
    }

    @NonNull
    public final ValueEncoderContext add(float f) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, f, this.zzb);
        return this;
    }

    @NonNull
    public final ValueEncoderContext add(int i) throws IOException {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1544622235, oncanceled);
            onCancelLoad.getMin(-1544622235, oncanceled);
        }
        zzb();
        this.zzd.zzd(this.zzc, i, this.zzb);
        return this;
    }

    @NonNull
    public final ValueEncoderContext add(long j) throws IOException {
        zzb();
        this.zzd.zze(this.zzc, j, this.zzb);
        return this;
    }

    @NonNull
    public final ValueEncoderContext add(@Nullable String str) throws IOException {
        zzb();
        this.zzd.zza(this.zzc, str, this.zzb);
        return this;
    }

    @NonNull
    public final ValueEncoderContext add(boolean z) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, z ? 1 : 0, this.zzb);
        return this;
    }

    @NonNull
    public final ValueEncoderContext add(@NonNull byte[] bArr) throws IOException {
        zzb();
        this.zzd.zza(this.zzc, bArr, this.zzb);
        return this;
    }
}
