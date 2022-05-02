package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public class zzfm implements zzfp {
    private final String key;
    private final String zzwg;

    public zzfm() {
        this((String) null);
    }

    public zzfm(String str) {
        this(str, (String) null);
    }

    private zzfm(String str, String str2) {
        this.key = str;
        this.zzwg = null;
    }

    public void zza(zzfl<?> zzfl) throws IOException {
        String str = this.key;
        if (str != null) {
            zzfl.put("key", str);
        }
    }
}
