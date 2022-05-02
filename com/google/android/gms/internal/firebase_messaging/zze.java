package com.google.android.gms.internal.firebase_messaging;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@Encodable
public abstract class zze {
    private static final zzae zza;

    static {
        zzad zzad = new zzad();
        zzd.zza.configure(zzad);
        zza = zzad.zza();
    }

    private zze() {
    }

    public static byte[] zza(Object obj) {
        zzae zzae = zza;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            zzae.zza(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void zzb(Object obj, OutputStream outputStream) throws IOException {
        zza.zza(obj, outputStream);
    }

    public abstract MessagingClientEventExtension zzc();
}
