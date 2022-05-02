package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import o.PlaybackStateCompat;

public final class zzhk {
    @GuardedBy("PhenotypeConstants.class")
    private static final PlaybackStateCompat<String, Uri> zza = new PlaybackStateCompat<>();

    public static synchronized Uri zza(String str) {
        Uri uri;
        synchronized (zzhk.class) {
            uri = zza.get("com.google.android.gms.measurement");
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                zza.put("com.google.android.gms.measurement", uri);
            }
        }
        return uri;
    }
}
