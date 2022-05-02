package com.google.android.gms.internal.firebase_messaging;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

public final class zzd implements Configurator {
    public static final Configurator zza = new zzd();

    private zzd() {
    }

    public final void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder((Class<U>) zze.class, (ObjectEncoder<? super U>) zzc.zza);
        encoderConfig.registerEncoder((Class<U>) MessagingClientEventExtension.class, (ObjectEncoder<? super U>) zzb.zza);
        encoderConfig.registerEncoder((Class<U>) MessagingClientEvent.class, (ObjectEncoder<? super U>) zza.zza);
    }
}
