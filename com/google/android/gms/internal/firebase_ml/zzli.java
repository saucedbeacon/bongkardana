package com.google.android.gms.internal.firebase_ml;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzli {
    private final String className;
    private final zzlh zzaed;
    private zzlh zzaee;
    private boolean zzaef;

    private zzli(String str) {
        zzlh zzlh = new zzlh();
        this.zzaed = zzlh;
        this.zzaee = zzlh;
        this.zzaef = false;
        this.className = (String) zzlp.checkNotNull(str);
    }

    public final zzli zzh(String str, @NullableDecl Object obj) {
        return zzi(str, obj);
    }

    public final zzli zza(String str, boolean z) {
        return zzi(str, String.valueOf(z));
    }

    public final zzli zza(String str, float f) {
        return zzi(str, String.valueOf(f));
    }

    public final zzli zzb(String str, int i) {
        return zzi(str, String.valueOf(i));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.className);
        sb.append('{');
        zzlh zzlh = this.zzaed.zzaec;
        String str = "";
        while (zzlh != null) {
            Object obj = zzlh.value;
            sb.append(str);
            if (zzlh.name != null) {
                sb.append(zzlh.name);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            zzlh = zzlh.zzaec;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    private final zzli zzi(String str, @NullableDecl Object obj) {
        zzlh zzlh = new zzlh();
        this.zzaee.zzaec = zzlh;
        this.zzaee = zzlh;
        zzlh.value = obj;
        zzlh.name = (String) zzlp.checkNotNull(str);
        return this;
    }
}
