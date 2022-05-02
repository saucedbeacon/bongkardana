package com.google.android.gms.internal.firebase_messaging;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.util.HashMap;
import java.util.Map;

public final class zzad implements EncoderConfig<zzad> {
    public static final /* synthetic */ int zza = 0;
    private static final ObjectEncoder<Object> zzb = zzac.zza;
    private final Map<Class<?>, ObjectEncoder<?>> zzc = new HashMap();
    private final Map<Class<?>, ValueEncoder<?>> zzd = new HashMap();
    private final ObjectEncoder<Object> zze = zzb;

    @NonNull
    public final /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ObjectEncoder objectEncoder) {
        this.zzc.put(cls, objectEncoder);
        this.zzd.remove(cls);
        return this;
    }

    public final zzae zza() {
        return new zzae(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    @NonNull
    public final /* synthetic */ EncoderConfig registerEncoder(@NonNull Class cls, @NonNull ValueEncoder valueEncoder) {
        this.zzd.put(cls, valueEncoder);
        this.zzc.remove(cls);
        return this;
    }
}
