package com.google.android.gms.internal.firebase_ml;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzxd<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzbwv;
    private final int zzcdo;
    /* access modifiers changed from: private */
    public List<zzxm> zzcdp;
    /* access modifiers changed from: private */
    public Map<K, V> zzcdq;
    private volatile zzxo zzcdr;
    /* access modifiers changed from: private */
    public Map<K, V> zzcds;
    private volatile zzxi zzcdt;

    static <FieldDescriptorType extends zzus<FieldDescriptorType>> zzxd<FieldDescriptorType, Object> zzdu(int i) {
        return new zzxg(i);
    }

    private zzxd(int i) {
        this.zzcdo = i;
        this.zzcdp = Collections.emptyList();
        this.zzcdq = Collections.emptyMap();
        this.zzcds = Collections.emptyMap();
    }

    public void zzrv() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.zzbwv) {
            if (this.zzcdq.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.zzcdq);
            }
            this.zzcdq = map;
            if (this.zzcds.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.zzcds);
            }
            this.zzcds = map2;
            this.zzbwv = true;
        }
    }

    public final boolean isImmutable() {
        return this.zzbwv;
    }

    public final int zzuw() {
        return this.zzcdp.size();
    }

    public final Map.Entry<K, V> zzdv(int i) {
        return this.zzcdp.get(i);
    }

    public final Iterable<Map.Entry<K, V>> zzux() {
        if (this.zzcdq.isEmpty()) {
            return zzxh.zzvh();
        }
        return this.zzcdq.entrySet();
    }

    public int size() {
        return this.zzcdp.size() + this.zzcdq.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzcdq.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return this.zzcdp.get(zza).getValue();
        }
        return this.zzcdq.get(comparable);
    }

    /* renamed from: zza */
    public final V put(K k, V v) {
        zzuz();
        int zza = zza(k);
        if (zza >= 0) {
            return this.zzcdp.get(zza).setValue(v);
        }
        zzuz();
        if (this.zzcdp.isEmpty() && !(this.zzcdp instanceof ArrayList)) {
            this.zzcdp = new ArrayList(this.zzcdo);
        }
        int i = -(zza + 1);
        if (i >= this.zzcdo) {
            return zzva().put(k, v);
        }
        int size = this.zzcdp.size();
        int i2 = this.zzcdo;
        if (size == i2) {
            zzxm remove = this.zzcdp.remove(i2 - 1);
            zzva().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.zzcdp.add(i, new zzxm(this, k, v));
        return null;
    }

    public void clear() {
        zzuz();
        if (!this.zzcdp.isEmpty()) {
            this.zzcdp.clear();
        }
        if (!this.zzcdq.isEmpty()) {
            this.zzcdq.clear();
        }
    }

    public V remove(Object obj) {
        zzuz();
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return zzdw(zza);
        }
        if (this.zzcdq.isEmpty()) {
            return null;
        }
        return this.zzcdq.remove(comparable);
    }

    /* access modifiers changed from: private */
    public final V zzdw(int i) {
        zzuz();
        V value = this.zzcdp.remove(i).getValue();
        if (!this.zzcdq.isEmpty()) {
            Iterator it = zzva().entrySet().iterator();
            this.zzcdp.add(new zzxm(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private final int zza(K k) {
        int size = this.zzcdp.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzcdp.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zzcdp.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzcdr == null) {
            this.zzcdr = new zzxo(this, (zzxg) null);
        }
        return this.zzcdr;
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzuy() {
        if (this.zzcdt == null) {
            this.zzcdt = new zzxi(this, (zzxg) null);
        }
        return this.zzcdt;
    }

    /* access modifiers changed from: private */
    public final void zzuz() {
        if (this.zzbwv) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzva() {
        zzuz();
        if (this.zzcdq.isEmpty() && !(this.zzcdq instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzcdq = treeMap;
            this.zzcds = treeMap.descendingMap();
        }
        return (SortedMap) this.zzcdq;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxd)) {
            return super.equals(obj);
        }
        zzxd zzxd = (zzxd) obj;
        int size = size();
        if (size != zzxd.size()) {
            return false;
        }
        int zzuw = zzuw();
        if (zzuw != zzxd.zzuw()) {
            return entrySet().equals(zzxd.entrySet());
        }
        for (int i = 0; i < zzuw; i++) {
            if (!zzdv(i).equals(zzxd.zzdv(i))) {
                return false;
            }
        }
        if (zzuw != size) {
            return this.zzcdq.equals(zzxd.zzcdq);
        }
        return true;
    }

    public int hashCode() {
        int zzuw = zzuw();
        int i = 0;
        for (int i2 = 0; i2 < zzuw; i2++) {
            i += this.zzcdp.get(i2).hashCode();
        }
        return this.zzcdq.size() > 0 ? i + this.zzcdq.hashCode() : i;
    }

    /* synthetic */ zzxd(int i, zzxg zzxg) {
        this(i);
    }
}
