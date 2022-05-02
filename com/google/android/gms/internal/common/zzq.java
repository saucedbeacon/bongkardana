package com.google.android.gms.internal.common;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzq<T> implements zzo<T>, Serializable {
    private final zzo<T> zza;
    private volatile transient boolean zzb;
    @NullableDecl
    private transient T zzc;

    zzq(zzo<T> zzo) {
        this.zza = (zzo) zzl.zza(zzo);
    }

    public final T zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    T zza2 = this.zza.zza();
                    this.zzc = zza2;
                    this.zzb = true;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            String valueOf = String.valueOf(this.zzc);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(SimpleComparison.GREATER_THAN_OPERATION);
            obj = sb.toString();
        } else {
            obj = this.zza;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
