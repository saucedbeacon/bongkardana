package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzkr extends zzip<String> implements RandomAccess, zzks {
    public static final zzks zza = zzb;
    private static final zzkr zzb;
    private final List<Object> zzc;

    static {
        zzkr zzkr = new zzkr(10);
        zzb = zzkr;
        zzkr.zzb();
    }

    public zzkr() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzjd) {
            return ((zzjd) obj).zzl(zzkl.zza);
        }
        return zzkl.zzd((byte[]) obj);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzbM();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzbM();
        if (collection instanceof zzks) {
            collection = ((zzks) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zzbM();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* synthetic */ Object remove(int i) {
        zzbM();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzj(remove);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        zzbM();
        return zzj(this.zzc.set(i, (String) obj));
    }

    public final int size() {
        return this.zzc.size();
    }

    /* renamed from: zzd */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzjd) {
            zzjd zzjd = (zzjd) obj;
            String zzl = zzjd.zzl(zzkl.zza);
            if (zzjd.zzh()) {
                this.zzc.set(i, zzl);
            }
            return zzl;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzkl.zzd(bArr);
        if (zzkl.zzc(bArr)) {
            this.zzc.set(i, zzd);
        }
        return zzd;
    }

    public final /* synthetic */ zzkk zze(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzc);
            return new zzkr((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void zzf(zzjd zzjd) {
        zzbM();
        this.zzc.add(zzjd);
        this.modCount++;
    }

    public final Object zzg(int i) {
        return this.zzc.get(i);
    }

    public final List<?> zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final zzks zzi() {
        return zza() ? new zzmm(this) : this;
    }

    public zzkr(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzkr(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
