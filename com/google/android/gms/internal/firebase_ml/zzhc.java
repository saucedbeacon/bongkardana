package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

public abstract class zzhc {
    public abstract void flush() throws IOException;

    public abstract void writeBoolean(boolean z) throws IOException;

    public abstract void writeString(String str) throws IOException;

    public abstract void zza(double d) throws IOException;

    public abstract void zza(BigDecimal bigDecimal) throws IOException;

    public abstract void zza(BigInteger bigInteger) throws IOException;

    public abstract void zzaf(int i) throws IOException;

    public abstract void zzaj(String str) throws IOException;

    public abstract void zze(long j) throws IOException;

    public abstract void zzgh() throws IOException;

    public abstract void zzgi() throws IOException;

    public abstract void zzgj() throws IOException;

    public abstract void zzgk() throws IOException;

    public abstract void zzgl() throws IOException;

    public void zzgm() throws IOException {
    }

    public abstract void zzj(float f) throws IOException;

    public final void zzc(Object obj) throws IOException {
        zza(false, obj);
    }

    private final void zza(boolean z, Object obj) throws IOException {
        zzib zzib;
        boolean z2;
        Field field;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (zzid.isNull(obj)) {
                zzgl();
            } else if (obj instanceof String) {
                writeString((String) obj);
            } else {
                boolean z3 = true;
                if (obj instanceof Number) {
                    if (z) {
                        writeString(obj.toString());
                    } else if (obj instanceof BigDecimal) {
                        zza((BigDecimal) obj);
                    } else if (obj instanceof BigInteger) {
                        zza((BigInteger) obj);
                    } else if (obj instanceof Long) {
                        zze(((Long) obj).longValue());
                    } else if (obj instanceof Float) {
                        float floatValue = ((Number) obj).floatValue();
                        if (Float.isInfinite(floatValue) || Float.isNaN(floatValue)) {
                            z3 = false;
                        }
                        zzlp.checkArgument(z3);
                        zzj(floatValue);
                    } else if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                        zzaf(((Number) obj).intValue());
                    } else {
                        double doubleValue = ((Number) obj).doubleValue();
                        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                            z3 = false;
                        }
                        zzlp.checkArgument(z3);
                        zza(doubleValue);
                    }
                } else if (obj instanceof Boolean) {
                    writeBoolean(((Boolean) obj).booleanValue());
                } else if (obj instanceof zzig) {
                    writeString(((zzig) obj).zzhn());
                } else if ((obj instanceof Iterable) || cls.isArray()) {
                    zzgh();
                    for (Object zza : zziy.zzi(obj)) {
                        zza(z, zza);
                    }
                    zzgi();
                } else if (cls.isEnum()) {
                    String name = zzij.zza((Enum<?>) (Enum) obj).getName();
                    if (name == null) {
                        zzgl();
                    } else {
                        writeString(name);
                    }
                } else {
                    zzgj();
                    boolean z4 = (obj instanceof Map) && !(obj instanceof zzii);
                    if (z4) {
                        zzib = null;
                    } else {
                        zzib = zzib.zzc(cls);
                    }
                    for (Map.Entry next : zzid.zzf(obj).entrySet()) {
                        Object value = next.getValue();
                        if (value != null) {
                            String str = (String) next.getKey();
                            if (z4) {
                                z2 = z;
                            } else {
                                zzij zzal = zzib.zzal(str);
                                if (zzal == null) {
                                    field = null;
                                } else {
                                    field = zzal.zzhp();
                                }
                                z2 = (field == null || field.getAnnotation(zzhk.class) == null) ? false : true;
                            }
                            zzaj(str);
                            zza(z2, value);
                        }
                    }
                    zzgk();
                }
            }
        }
    }
}
