package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import java.util.Iterator;
import java.util.Map;
import o.PlaybackStateCompat;

public final class zzhu implements zzhe {
    @GuardedBy("SharedPreferencesLoader.class")
    private static final Map<String, zzhu> zza = new PlaybackStateCompat();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    static zzhu zza(Context context, String str) {
        zzhu zzhu;
        if (!zzgw.zza()) {
            synchronized (zzhu.class) {
                zzhu = zza.get((Object) null);
                if (zzhu == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return zzhu;
        }
        throw null;
    }

    static synchronized void zzb() {
        synchronized (zzhu.class) {
            Iterator<zzhu> it = zza.values().iterator();
            if (!it.hasNext()) {
                zza.clear();
            } else {
                zzhu next = it.next();
                SharedPreferences sharedPreferences = next.zzb;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = next.zzc;
                throw null;
            }
        }
    }

    public final Object zze(String str) {
        throw null;
    }
}
