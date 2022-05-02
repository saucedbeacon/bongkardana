package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class zzib {
    private static final ConcurrentMap<Class<?>, zzib> zzabi = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, zzib> zzabj = new ConcurrentHashMap();
    private final Class<?> zzabk;
    private final boolean zzabl;
    private final IdentityHashMap<String, zzij> zzabm = new IdentityHashMap<>();
    final List<String> zzabn;

    public static zzib zzc(Class<?> cls) {
        return zza(cls, false);
    }

    public static zzib zza(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        ConcurrentMap<Class<?>, zzib> concurrentMap = z ? zzabj : zzabi;
        zzib zzib = (zzib) concurrentMap.get(cls);
        if (zzib != null) {
            return zzib;
        }
        zzib zzib2 = new zzib(cls, z);
        zzib putIfAbsent = concurrentMap.putIfAbsent(cls, zzib2);
        return putIfAbsent == null ? zzib2 : putIfAbsent;
    }

    public final boolean zzhl() {
        return this.zzabl;
    }

    public final zzij zzal(String str) {
        if (str != null) {
            if (this.zzabl) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return this.zzabm.get(str);
    }

    public final boolean isEnum() {
        return this.zzabk.isEnum();
    }

    private zzib(Class<?> cls, boolean z) {
        Field field;
        this.zzabk = cls;
        this.zzabl = z;
        boolean z2 = !z || !cls.isEnum();
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("cannot ignore case on an enum: ");
        sb.append(valueOf);
        zzlp.checkArgument(z2, sb.toString());
        TreeSet treeSet = new TreeSet(new zzia(this));
        for (Field field2 : cls.getDeclaredFields()) {
            zzij zza = zzij.zza(field2);
            if (zza != null) {
                String name = zza.getName();
                name = z ? name.toLowerCase(Locale.US).intern() : name;
                zzij zzij = this.zzabm.get(name);
                boolean z3 = zzij == null;
                Object[] objArr = new Object[4];
                objArr[0] = z ? "case-insensitive " : "";
                objArr[1] = name;
                objArr[2] = field2;
                if (zzij == null) {
                    field = null;
                } else {
                    field = zzij.zzhp();
                }
                objArr[3] = field;
                if (z3) {
                    this.zzabm.put(name, zza);
                    treeSet.add(name);
                } else {
                    throw new IllegalArgumentException(zzlx.zzb("two fields have the same %sname <%s>: %s and %s", objArr));
                }
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            zzib zza2 = zza(superclass, z);
            treeSet.addAll(zza2.zzabn);
            for (Map.Entry next : zza2.zzabm.entrySet()) {
                String str = (String) next.getKey();
                if (!this.zzabm.containsKey(str)) {
                    this.zzabm.put(str, (zzij) next.getValue());
                }
            }
        }
        this.zzabn = treeSet.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(treeSet));
    }

    public final Collection<zzij> zzhm() {
        return Collections.unmodifiableCollection(this.zzabm.values());
    }
}
