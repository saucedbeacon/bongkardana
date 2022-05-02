package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class zziy {
    private static ParameterizedType zza(Type type, Class<?> cls) {
        Class<?> cls2;
        if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
            return null;
        }
        while (type != null && type != Object.class) {
            if (type instanceof Class) {
                cls2 = (Class) type;
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class<?> zza = zza(parameterizedType);
                if (zza == cls) {
                    return parameterizedType;
                }
                if (cls.isInterface()) {
                    for (Type type2 : zza.getGenericInterfaces()) {
                        if (cls.isAssignableFrom(type2 instanceof Class ? (Class) type2 : zza((ParameterizedType) type2))) {
                            type = type2;
                            break;
                        }
                    }
                }
                cls2 = zza;
            }
            type = cls2.getGenericSuperclass();
        }
        return null;
    }

    public static boolean zza(Class<?> cls, Class<?> cls2) {
        return cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    public static <T> T zzf(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw zza((Exception) e, (Class<?>) cls);
        } catch (InstantiationException e2) {
            throw zza((Exception) e2, (Class<?>) cls);
        }
    }

    private static IllegalArgumentException zza(Exception exc, Class<?> cls) {
        StringBuilder sb = new StringBuilder("unable to create new instance of class ");
        sb.append(cls.getName());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (!Modifier.isPublic(cls.getModifiers())) {
                arrayList.add("possibly because it is not public");
            } else {
                try {
                    cls.getConstructor(new Class[0]);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        boolean z = false;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str = (String) obj;
            if (z) {
                sb.append(" and");
            } else {
                z = true;
            }
            sb.append(" ");
            sb.append(str);
        }
        return new IllegalArgumentException(sb.toString(), exc);
    }

    public static boolean zzc(Type type) {
        if (!(type instanceof GenericArrayType)) {
            return (type instanceof Class) && ((Class) type).isArray();
        }
        return true;
    }

    public static Type zzd(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static Class<?> zza(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    public static Type zza(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length != 0) {
            return lowerBounds[0];
        }
        return wildcardType.getUpperBounds()[0];
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.reflect.TypeVariable, java.lang.reflect.TypeVariable<?>, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        r5 = zza(r5, (java.lang.reflect.TypeVariable<?>) (java.lang.reflect.TypeVariable) r6);
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type zza(java.util.List<java.lang.reflect.Type> r5, java.lang.reflect.TypeVariable<?> r6) {
        /*
            java.lang.reflect.GenericDeclaration r0 = r6.getGenericDeclaration()
            boolean r1 = r0 instanceof java.lang.Class
            r2 = 0
            if (r1 == 0) goto L_0x004c
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            int r3 = r5.size()
            r4 = r2
        L_0x0011:
            if (r4 != 0) goto L_0x0022
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0022
            java.lang.Object r4 = r5.get(r3)
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            java.lang.reflect.ParameterizedType r4 = zza((java.lang.reflect.Type) r4, (java.lang.Class<?>) r1)
            goto L_0x0011
        L_0x0022:
            if (r4 == 0) goto L_0x004c
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            r1 = 0
        L_0x0029:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x0037
            r2 = r0[r1]
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x0037
            int r1 = r1 + 1
            goto L_0x0029
        L_0x0037:
            java.lang.reflect.Type[] r6 = r4.getActualTypeArguments()
            r6 = r6[r1]
            boolean r0 = r6 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x004b
            r0 = r6
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            java.lang.reflect.Type r5 = zza((java.util.List<java.lang.reflect.Type>) r5, (java.lang.reflect.TypeVariable<?>) r0)
            if (r5 == 0) goto L_0x004b
            return r5
        L_0x004b:
            return r6
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zziy.zza(java.util.List, java.lang.reflect.TypeVariable):java.lang.reflect.Type");
    }

    public static Class<?> zzb(List<Type> list, Type type) {
        if (type instanceof TypeVariable) {
            type = zza(list, (TypeVariable<?>) (TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(zzb(list, zzd(type)), 0).getClass();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return zza((ParameterizedType) type);
        }
        zzir.checkArgument(type == null, "wildcard type is not supported: %s", type);
        return Object.class;
    }

    public static Type zze(Type type) {
        return zza(type, Iterable.class, 0);
    }

    public static Type zzf(Type type) {
        return zza(type, Map.class, 1);
    }

    private static Type zza(Type type, Class<?> cls, int i) {
        ParameterizedType zza = zza(type, cls);
        if (zza == null) {
            return null;
        }
        Type type2 = zza.getActualTypeArguments()[i];
        if (type2 instanceof TypeVariable) {
            Type zza2 = zza((List<Type>) Arrays.asList(new Type[]{type}), (TypeVariable<?>) (TypeVariable) type2);
            if (zza2 != null) {
                return zza2;
            }
        }
        return type2;
    }

    public static <T> Iterable<T> zzi(Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        zzir.checkArgument(cls.isArray(), "not an array or Iterable: %s", cls);
        if (!cls.getComponentType().isPrimitive()) {
            return Arrays.asList((Object[]) obj);
        }
        return new zzix(obj);
    }

    public static Object zza(Collection<?> collection, Class<?> cls) {
        if (!cls.isPrimitive()) {
            return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
        }
        Object newInstance = Array.newInstance(cls, collection.size());
        int i = 0;
        for (Object obj : collection) {
            Array.set(newInstance, i, obj);
            i++;
        }
        return newInstance;
    }
}
