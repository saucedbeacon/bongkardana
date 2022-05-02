package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzij {
    private static final Map<Field, zzij> zzaco = new WeakHashMap();
    private final String name;
    private final boolean zzacp;
    private final Field zzacq;

    public static zzij zza(Enum<?> enumR) {
        try {
            zzij zza = zza(enumR.getClass().getField(enumR.name()));
            Object[] objArr = {enumR};
            if (zza != null) {
                return zza;
            }
            throw new IllegalArgumentException(zzlx.zzb("enum constant missing @Value or @NullValue annotation: %s", objArr));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.firebase_ml.zzij zza(java.lang.reflect.Field r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Map<java.lang.reflect.Field, com.google.android.gms.internal.firebase_ml.zzij> r1 = zzaco
            monitor-enter(r1)
            java.util.Map<java.lang.reflect.Field, com.google.android.gms.internal.firebase_ml.zzij> r2 = zzaco     // Catch:{ all -> 0x006b }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x006b }
            com.google.android.gms.internal.firebase_ml.zzij r2 = (com.google.android.gms.internal.firebase_ml.zzij) r2     // Catch:{ all -> 0x006b }
            boolean r3 = r5.isEnumConstant()     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x0069
            if (r3 != 0) goto L_0x0021
            int r4 = r5.getModifiers()     // Catch:{ all -> 0x006b }
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch:{ all -> 0x006b }
            if (r4 != 0) goto L_0x0069
        L_0x0021:
            if (r3 == 0) goto L_0x003f
            java.lang.Class<com.google.android.gms.internal.firebase_ml.zziz> r2 = com.google.android.gms.internal.firebase_ml.zziz.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x006b }
            com.google.android.gms.internal.firebase_ml.zziz r2 = (com.google.android.gms.internal.firebase_ml.zziz) r2     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x0032
            java.lang.String r0 = r2.value()     // Catch:{ all -> 0x006b }
            goto L_0x0053
        L_0x0032:
            java.lang.Class<com.google.android.gms.internal.firebase_ml.zzip> r2 = com.google.android.gms.internal.firebase_ml.zzip.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x006b }
            com.google.android.gms.internal.firebase_ml.zzip r2 = (com.google.android.gms.internal.firebase_ml.zzip) r2     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x003d
            goto L_0x0053
        L_0x003d:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            return r0
        L_0x003f:
            java.lang.Class<com.google.android.gms.internal.firebase_ml.zzim> r2 = com.google.android.gms.internal.firebase_ml.zzim.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x006b }
            com.google.android.gms.internal.firebase_ml.zzim r2 = (com.google.android.gms.internal.firebase_ml.zzim) r2     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x004b
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            return r0
        L_0x004b:
            java.lang.String r0 = r2.value()     // Catch:{ all -> 0x006b }
            r2 = 1
            r5.setAccessible(r2)     // Catch:{ all -> 0x006b }
        L_0x0053:
            java.lang.String r2 = "##default"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x005f
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x006b }
        L_0x005f:
            com.google.android.gms.internal.firebase_ml.zzij r2 = new com.google.android.gms.internal.firebase_ml.zzij     // Catch:{ all -> 0x006b }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x006b }
            java.util.Map<java.lang.reflect.Field, com.google.android.gms.internal.firebase_ml.zzij> r0 = zzaco     // Catch:{ all -> 0x006b }
            r0.put(r5, r2)     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            return r2
        L_0x006b:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzij.zza(java.lang.reflect.Field):com.google.android.gms.internal.firebase_ml.zzij");
    }

    private zzij(Field field, String str) {
        String str2;
        this.zzacq = field;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.intern();
        }
        this.name = str2;
        this.zzacp = zzid.zza(this.zzacq.getType());
    }

    public final Field zzhp() {
        return this.zzacq;
    }

    public final String getName() {
        return this.name;
    }

    public final Type getGenericType() {
        return this.zzacq.getGenericType();
    }

    public final boolean zzhq() {
        return Modifier.isFinal(this.zzacq.getModifiers());
    }

    public final boolean isPrimitive() {
        return this.zzacp;
    }

    public final Object zzh(Object obj) {
        return zza(this.zzacq, obj);
    }

    public final void zzb(Object obj, Object obj2) {
        zza(this.zzacq, obj, obj2);
    }

    public final <T extends Enum<T>> T zzhr() {
        return Enum.valueOf(this.zzacq.getDeclaringClass(), this.zzacq.getName());
    }

    private static Object zza(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void zza(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object zza = zza(field, obj);
            if (obj2 == null) {
                if (zza == null) {
                    return;
                }
            } else if (obj2.equals(zza)) {
                return;
            }
            String valueOf = String.valueOf(zza);
            String valueOf2 = String.valueOf(obj2);
            String name2 = field.getName();
            String name3 = obj.getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length() + String.valueOf(name2).length() + String.valueOf(name3).length());
            sb.append("expected final value <");
            sb.append(valueOf);
            sb.append("> but was <");
            sb.append(valueOf2);
            sb.append("> on ");
            sb.append(name2);
            sb.append(" field in ");
            sb.append(name3);
            throw new IllegalArgumentException(sb.toString());
        }
        try {
            field.set(obj, obj2);
        } catch (SecurityException e) {
            throw new IllegalArgumentException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
