package com.google.android.gms.internal.firebase_ml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class zzvq extends zztk<String> implements zzvp, RandomAccess {
    private static final zzvq zzcbj;
    private static final zzvp zzcbk = zzcbj;
    private final List<Object> zzcbl;

    public zzvq() {
        this(10);
    }

    public zzvq(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private zzvq(ArrayList<Object> arrayList) {
        this.zzcbl = arrayList;
    }

    public final int size() {
        return this.zzcbl.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-719429527, oncanceled);
            onCancelLoad.getMin(-719429527, oncanceled);
        }
        zzrw();
        if (collection instanceof zzvp) {
            collection = ((zzvp) collection).zzty();
        }
        boolean addAll = this.zzcbl.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zzrw();
        this.zzcbl.clear();
        this.modCount++;
    }

    public final void zze(zztq zztq) {
        zzrw();
        this.zzcbl.add(zztq);
        this.modCount++;
    }

    public final Object getRaw(int i) {
        return this.zzcbl.get(i);
    }

    private static String zzs(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zztq) {
            return ((zztq) obj).zzsa();
        }
        return zzva.zzj((byte[]) obj);
    }

    public final List<?> zzty() {
        return Collections.unmodifiableList(this.zzcbl);
    }

    public final zzvp zztz() {
        return zzru() ? new zzxv(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        zzrw();
        return zzs(this.zzcbl.set(i, (String) obj));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* synthetic */ Object remove(int i) {
        zzrw();
        Object remove = this.zzcbl.remove(i);
        this.modCount++;
        return zzs(remove);
    }

    public final /* bridge */ /* synthetic */ boolean zzru() {
        return super.zzru();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzrw();
        this.zzcbl.add(i, (String) obj);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ zzvf zzcp(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzcbl);
            return new zzvq((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzcbl.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zztq) {
            zztq zztq = (zztq) obj;
            String zzsa = zztq.zzsa();
            if (zztq.zzsb()) {
                this.zzcbl.set(i, zzsa);
            }
            return zzsa;
        }
        byte[] bArr = (byte[]) obj;
        String zzj = zzva.zzj(bArr);
        if (zzva.zzi(bArr)) {
            this.zzcbl.set(i, zzj);
        }
        return zzj;
    }

    static {
        zzvq zzvq = new zzvq();
        zzcbj = zzvq;
        zzvq.zzrv();
    }
}
