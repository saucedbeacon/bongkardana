package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public final class zzid {
    private static final Boolean zzabo = new Boolean(true);
    private static final String zzabp = new String();
    private static final Character zzabq = new Character(0);
    private static final Byte zzabr = new Byte((byte) 0);
    private static final Short zzabs = new Short(0);
    private static final Integer zzabt = new Integer(0);
    private static final Float zzabu = new Float(0.0f);
    private static final Long zzabv = new Long(0);
    private static final Double zzabw = new Double(0.0d);
    private static final BigInteger zzabx = new BigInteger("0");
    private static final BigDecimal zzaby = new BigDecimal("0");
    private static final zzig zzabz = new zzig(0);
    private static final ConcurrentHashMap<Class<?>, Object> zzaca;

    public static <T> T zzd(Class<?> cls) {
        T t;
        T t2 = zzaca.get(cls);
        if (t2 != null) {
            return t2;
        }
        int i = 0;
        if (cls.isArray()) {
            Class<?> cls2 = cls;
            do {
                cls2 = cls2.getComponentType();
                i++;
            } while (cls2.isArray());
            t = Array.newInstance(cls2, new int[i]);
        } else if (cls.isEnum()) {
            zzij zzal = zzib.zzc(cls).zzal((String) null);
            Object[] objArr = {cls};
            if (zzal != null) {
                t = zzal.zzhr();
            } else {
                throw new NullPointerException(zzlx.zzb("enum missing constant with @NullValue annotation: %s", objArr));
            }
        } else {
            t = zziy.zzf(cls);
        }
        T putIfAbsent = zzaca.putIfAbsent(cls, t);
        return putIfAbsent == null ? t : putIfAbsent;
    }

    public static boolean isNull(Object obj) {
        return obj != null && obj == zzaca.get(obj.getClass());
    }

    public static Map<String, Object> zzf(Object obj) {
        if (obj == null || isNull(obj)) {
            return Collections.emptyMap();
        }
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return new zzic(obj, false);
    }

    public static <T> T clone(T t) {
        T t2;
        if (t == null || zza(t.getClass())) {
            return t;
        }
        if (t instanceof zzii) {
            return (zzii) ((zzii) t).clone();
        }
        Class<?> cls = t.getClass();
        if (cls.isArray()) {
            t2 = Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof zzhv) {
            t2 = (zzhv) ((zzhv) t).clone();
        } else if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
            Object[] array = ((List) t).toArray();
            zza((Object) array, (Object) array);
            return Arrays.asList(array);
        } else {
            t2 = zziy.zzf(cls);
        }
        zza((Object) t, (Object) t2);
        return t2;
    }

    public static void zza(Object obj, Object obj2) {
        Object zzh;
        Class<?> cls = obj.getClass();
        boolean z = true;
        int i = 0;
        zzlp.checkArgument(cls == obj2.getClass());
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z = false;
            }
            zzlp.checkArgument(z);
            for (Object clone : zziy.zzi(obj)) {
                Array.set(obj2, i, clone(clone));
                i++;
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object clone2 : collection) {
                collection2.add(clone(clone2));
            }
        } else {
            boolean isAssignableFrom = zzii.class.isAssignableFrom(cls);
            if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
                zzib zzc = isAssignableFrom ? ((zzii) obj).zzwv : zzib.zzc(cls);
                for (String zzal : zzc.zzabn) {
                    zzij zzal2 = zzc.zzal(zzal);
                    if (!zzal2.zzhq() && ((!isAssignableFrom || !zzal2.isPrimitive()) && (zzh = zzal2.zzh(obj)) != null)) {
                        zzal2.zzb(obj2, clone(zzh));
                    }
                }
            } else if (zzhv.class.isAssignableFrom(cls)) {
                zzhv zzhv = (zzhv) obj2;
                zzhv zzhv2 = (zzhv) obj;
                int size = zzhv2.size();
                while (i < size) {
                    zzhv.set(i, clone(zzhv2.zzah(i)));
                    i++;
                }
            } else {
                Map map = (Map) obj2;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    map.put((String) entry.getKey(), clone(entry.getValue()));
                }
            }
        }
    }

    public static boolean zza(Type type) {
        if (type instanceof WildcardType) {
            type = zziy.zza((WildcardType) type);
        }
        if (!(type instanceof Class)) {
            return false;
        }
        Class<Boolean> cls = (Class) type;
        if (cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == zzig.class || cls == Boolean.class) {
            return true;
        }
        return false;
    }

    public static boolean zzg(Object obj) {
        return obj == null || zza(obj.getClass());
    }

    public static Object zza(Type type, String str) {
        Class<BigDecimal> cls = type instanceof Class ? (Class) type : null;
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                String valueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append("expected type Character/char but got ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            } else {
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(str);
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(str);
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(str);
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(str);
                }
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(str);
                }
                if (cls == Double.class || cls == Double.TYPE) {
                    return Double.valueOf(str);
                }
                if (cls == zzig.class) {
                    return zzig.zzam(str);
                }
                if (cls == BigInteger.class) {
                    return new BigInteger(str);
                }
                if (cls == BigDecimal.class) {
                    return new BigDecimal(str);
                }
                if (cls.isEnum()) {
                    if (zzib.zzc(cls).zzabn.contains(str)) {
                        return zzib.zzc(cls).zzal(str).zzhr();
                    }
                    throw new IllegalArgumentException(String.format("given enum name %s not part of enumeration", new Object[]{str}));
                }
            }
        }
        String valueOf2 = String.valueOf(type);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
        sb2.append("expected primitive class, but got: ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static Collection<Object> zzb(Type type) {
        if (type instanceof WildcardType) {
            type = zziy.zza((WildcardType) type);
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || (type instanceof GenericArrayType) || (cls != null && (cls.isArray() || cls.isAssignableFrom(ArrayList.class)))) {
            return new ArrayList();
        }
        if (cls == null) {
            String valueOf = String.valueOf(type);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("unable to create new instance of type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        } else {
            if (cls.isAssignableFrom(TreeSet.class)) {
                return new TreeSet();
            }
            return (Collection) zziy.zzf(cls);
        }
    }

    public static Map<String, Object> zze(Class<?> cls) {
        if (cls == null || cls.isAssignableFrom(zzhv.class)) {
            return new zzhv();
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new TreeMap();
        }
        return (Map) zziy.zzf(cls);
    }

    public static Type zza(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = zziy.zza((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type zza = zziy.zza(list, (TypeVariable<?>) (TypeVariable) type);
            if (zza != null) {
                type = zza;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }

    static {
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        zzaca = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, zzabo);
        zzaca.put(String.class, zzabp);
        zzaca.put(Character.class, zzabq);
        zzaca.put(Byte.class, zzabr);
        zzaca.put(Short.class, zzabs);
        zzaca.put(Integer.class, zzabt);
        zzaca.put(Float.class, zzabu);
        zzaca.put(Long.class, zzabv);
        zzaca.put(Double.class, zzabw);
        zzaca.put(BigInteger.class, zzabx);
        zzaca.put(BigDecimal.class, zzaby);
        zzaca.put(zzig.class, zzabz);
    }
}
