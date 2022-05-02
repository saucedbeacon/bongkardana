package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjz;
import com.google.android.gms.internal.measurement.zzkd;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzkd<MessageType extends zzkd<MessageType, BuilderType>, BuilderType extends zzjz<MessageType, BuilderType>> extends zzio<MessageType, BuilderType> {
    private static final Map<Object, zzkd<?, ?>> zza = new ConcurrentHashMap();
    protected zzmi zzc = zzmi.zza();
    protected int zzd = -1;

    static Object zzbA(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static zzki zzbB() {
        return zzke.zzd();
    }

    protected static zzkj zzbC() {
        return zzkx.zzf();
    }

    protected static zzkj zzbD(zzkj zzkj) {
        int size = zzkj.size();
        return zzkj.zzd(size == 0 ? 10 : size + size);
    }

    protected static <E> zzkk<E> zzbE() {
        return zzlr.zzd();
    }

    protected static <E> zzkk<E> zzbF(zzkk<E> zzkk) {
        int size = zzkk.size();
        return zzkk.zze(size == 0 ? 10 : size + size);
    }

    static <T extends zzkd> T zzbx(Class<T> cls) {
        T t = (zzkd) zza.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzkd) zza.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzkd) ((zzkd) zzmr.zzc(cls)).zzl(6, (Object) null, (Object) null);
            if (t != null) {
                zza.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <T extends zzkd> void zzby(Class<T> cls, T t) {
        zza.put(cls, t);
    }

    protected static Object zzbz(zzli zzli, String str, Object[] objArr) {
        return new zzls(zzli, str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzlq.zza().zzb(getClass()).zzb(this, (zzkd) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int zzc2 = zzlq.zza().zzb(getClass()).zzc(this);
        this.zzb = zzc2;
        return zzc2;
    }

    public final String toString() {
        return zzlk.zza(this, super.toString());
    }

    public final /* synthetic */ zzlh zzbG() {
        zzjz zzjz = (zzjz) zzl(5, (Object) null, (Object) null);
        zzjz.zzaB(this);
        return zzjz;
    }

    public final /* synthetic */ zzlh zzbH() {
        return (zzjz) zzl(5, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzli zzbL() {
        return (zzkd) zzl(6, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final int zzbq() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final void zzbr(int i) {
        this.zzd = i;
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzkd<MessageType, BuilderType>, BuilderType extends zzjz<MessageType, BuilderType>> BuilderType zzbt() {
        return (zzjz) zzl(5, (Object) null, (Object) null);
    }

    public final BuilderType zzbu() {
        BuilderType buildertype = (zzjz) zzl(5, (Object) null, (Object) null);
        buildertype.zzaB(this);
        return buildertype;
    }

    public final void zzbv(zzjk zzjk) throws IOException {
        zzlq.zza().zzb(getClass()).zzm(this, zzjl.zza(zzjk));
    }

    public final int zzbw() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zze = zzlq.zza().zzb(getClass()).zze(this);
        this.zzd = zze;
        return zze;
    }

    /* access modifiers changed from: protected */
    public abstract Object zzl(int i, Object obj, Object obj2);
}
