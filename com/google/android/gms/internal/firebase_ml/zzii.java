package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class zzii extends AbstractMap<String, Object> implements Cloneable {
    Map<String, Object> zzacn;
    final zzib zzwv;

    public enum zzc {
        IGNORE_CASE
    }

    public zzii() {
        this(EnumSet.noneOf(zzc.class));
    }

    final class zza extends AbstractSet<Map.Entry<String, Object>> {
        private final zzih zzacr;

        zza() {
            this.zzacr = (zzih) new zzic(zzii.this, zzii.this.zzwv.zzhl()).entrySet();
        }

        public final Iterator<Map.Entry<String, Object>> iterator() {
            return new zzb(zzii.this, this.zzacr);
        }

        public final int size() {
            return zzii.this.zzacn.size() + this.zzacr.size();
        }

        public final void clear() {
            zzii.this.zzacn.clear();
            this.zzacr.clear();
        }
    }

    public zzii(EnumSet<zzc> enumSet) {
        this.zzacn = new zzhv();
        this.zzwv = zzib.zza(getClass(), enumSet.contains(zzc.IGNORE_CASE));
    }

    final class zzb implements Iterator<Map.Entry<String, Object>> {
        private boolean zzact;
        private final Iterator<Map.Entry<String, Object>> zzacu;
        private final Iterator<Map.Entry<String, Object>> zzacv;

        zzb(zzii zzii, zzih zzih) {
            this.zzacu = (zzie) zzih.iterator();
            this.zzacv = zzii.zzacn.entrySet().iterator();
        }

        public final boolean hasNext() {
            return this.zzacu.hasNext() || this.zzacv.hasNext();
        }

        public final void remove() {
            if (this.zzact) {
                this.zzacv.remove();
            }
            this.zzacu.remove();
        }

        public final /* synthetic */ Object next() {
            if (!this.zzact) {
                if (this.zzacu.hasNext()) {
                    return this.zzacu.next();
                }
                this.zzact = true;
            }
            return this.zzacv.next();
        }
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        zzij zzal = this.zzwv.zzal(str);
        if (zzal != null) {
            return zzal.zzh(this);
        }
        if (this.zzwv.zzhl()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.zzacn.get(str);
    }

    /* renamed from: zzf */
    public final Object put(String str, Object obj) {
        zzij zzal = this.zzwv.zzal(str);
        if (zzal != null) {
            Object zzh = zzal.zzh(this);
            zzal.zzb(this, obj);
            return zzh;
        }
        if (this.zzwv.zzhl()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.zzacn.put(str, obj);
    }

    public zzii zzb(String str, Object obj) {
        zzij zzal = this.zzwv.zzal(str);
        if (zzal != null) {
            zzal.zzb(this, obj);
        } else {
            if (this.zzwv.zzhl()) {
                str = str.toLowerCase(Locale.US);
            }
            this.zzacn.put(str, obj);
        }
        return this;
    }

    public final void putAll(Map<? extends String, ?> map) {
        for (Map.Entry next : map.entrySet()) {
            zzb((String) next.getKey(), next.getValue());
        }
    }

    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.zzwv.zzal(str) == null) {
            if (this.zzwv.zzhl()) {
                str = str.toLowerCase(Locale.US);
            }
            return this.zzacn.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        return new zza();
    }

    /* renamed from: zzer */
    public zzii clone() {
        try {
            zzii zzii = (zzii) super.clone();
            zzid.zza((Object) this, (Object) zzii);
            zzii.zzacn = (Map) zzid.clone(this.zzacn);
            return zzii;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final zzib zzho() {
        return this.zzwv;
    }
}
