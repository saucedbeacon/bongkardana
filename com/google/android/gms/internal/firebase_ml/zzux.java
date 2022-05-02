package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzux;
import com.google.android.gms.internal.firebase_ml.zzux.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzux<MessageType extends zzux<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zztj<MessageType, BuilderType> {
    private static Map<Object, zzux<?, ?>> zzbzu = new ConcurrentHashMap();
    protected zzxt zzbzs = zzxt.zzvj();
    private int zzbzt = -1;

    public static class zzc<T extends zzux<T, ?>> extends zztl<T> {
        private final T zzbzp;

        public zzc(T t) {
            this.zzbzp = t;
        }
    }

    public static class zzd<ContainingType extends zzwi, Type> extends zzul<ContainingType, Type> {
    }

    /* 'enum' modifier removed */
    public static final class zzf {
        public static final int zzbzy = 1;
        public static final int zzbzz = 2;
        public static final int zzcaa = 3;
        public static final int zzcab = 4;
        public static final int zzcac = 5;
        public static final int zzcad = 6;
        public static final int zzcae = 7;
        private static final /* synthetic */ int[] zzcaf = {1, 2, 3, 4, 5, 6, 7};
        public static final int zzcag = 1;
        public static final int zzcah = 2;
        private static final /* synthetic */ int[] zzcai = {1, 2};
        public static final int zzcaj = 1;
        public static final int zzcak = 2;
        private static final /* synthetic */ int[] zzcal = {1, 2};

        public static int[] values$50KLMJ33DTMIUPRFDTJMOP9FE1P6UT3FC9QMCBQ7CLN6ASJ1EHIM8JB5EDPM2PR59HKN8P949LIN8Q3FCHA6UIBEEPNMMP9R0() {
            return (int[]) zzcaf.clone();
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    public static abstract class zzb<MessageType extends zze<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zza<MessageType, BuilderType> implements zzwk {
        protected zzb(MessageType messagetype) {
            super(messagetype);
        }

        /* access modifiers changed from: protected */
        public final void zzta() {
            if (this.zzbzr) {
                super.zzta();
                ((zze) this.zzbzq).zzbzv = (zzuq) ((zze) this.zzbzq).zzbzv.clone();
            }
        }

        public /* synthetic */ zzux zztb() {
            return (zze) zztd();
        }

        public /* synthetic */ zzwi zztd() {
            if (this.zzbzr) {
                return (zze) this.zzbzq;
            }
            ((zze) this.zzbzq).zzbzv.zzrv();
            return (zze) super.zztd();
        }
    }

    public static abstract class zze<MessageType extends zze<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzux<MessageType, BuilderType> implements zzwk {
        protected zzuq<Object> zzbzv = zzuq.zzss();

        /* access modifiers changed from: package-private */
        public final zzuq<Object> zztn() {
            if (this.zzbzv.isImmutable()) {
                this.zzbzv = (zzuq) this.zzbzv.clone();
            }
            return this.zzbzv;
        }
    }

    public String toString() {
        return zzwj.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zzbvi != 0) {
            return this.zzbvi;
        }
        this.zzbvi = zzwt.zzur().zzad(this).hashCode(this);
        return this.zzbvi;
    }

    public static abstract class zza<MessageType extends zzux<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzti<MessageType, BuilderType> {
        private final MessageType zzbzp;
        protected MessageType zzbzq;
        protected boolean zzbzr = false;

        protected zza(MessageType messagetype) {
            this.zzbzp = messagetype;
            this.zzbzq = (zzux) messagetype.zza(zzf.zzcab, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        public void zzta() {
            if (this.zzbzr) {
                MessageType messagetype = (zzux) this.zzbzq.zza(zzf.zzcab, (Object) null, (Object) null);
                zza(messagetype, this.zzbzq);
                this.zzbzq = messagetype;
                this.zzbzr = false;
            }
        }

        public final boolean isInitialized() {
            return zzux.zza(this.zzbzq, false);
        }

        /* renamed from: zztb */
        public MessageType zztd() {
            if (this.zzbzr) {
                return this.zzbzq;
            }
            MessageType messagetype = this.zzbzq;
            zzwt.zzur().zzad(messagetype).zzq(messagetype);
            this.zzbzr = true;
            return this.zzbzq;
        }

        /* renamed from: zztc */
        public final MessageType zzte() {
            MessageType messagetype = (zzux) zztd();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new zzxr(messagetype);
        }

        public final BuilderType zza(MessageType messagetype) {
            zzta();
            zza(this.zzbzq, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzwt.zzur().zzad(messagetype).zze(messagetype, messagetype2);
        }

        public final /* synthetic */ zzti zzrr() {
            return (zza) clone();
        }

        public final /* synthetic */ zzwi zztf() {
            return this.zzbzp;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zza = (zza) ((zzux) this.zzbzp).zza(zzf.zzcac, (Object) null, (Object) null);
            zza.zza((zzux) zztd());
            return zza;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((zzux) zza(zzf.zzcad, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return zzwt.zzur().zzad(this).equals(this, (zzux) obj);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzux<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zztg() {
        return (zza) zza(zzf.zzcac, (Object) null, (Object) null);
    }

    public final boolean isInitialized() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    /* access modifiers changed from: package-private */
    public final int zzrt() {
        return this.zzbzt;
    }

    /* access modifiers changed from: package-private */
    public final void zzcm(int i) {
        this.zzbzt = i;
    }

    public final void zzb(zzuh zzuh) throws IOException {
        zzwt.zzur().zzad(this).zza(this, zzuj.zza(zzuh));
    }

    public final int zzth() {
        if (this.zzbzt == -1) {
            this.zzbzt = zzwt.zzur().zzad(this).zzaa(this);
        }
        return this.zzbzt;
    }

    static <T extends zzux<?, ?>> T zzi(Class<T> cls) {
        T t = (zzux) zzbzu.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzux) zzbzu.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzux) ((zzux) zzya.zzm(cls)).zza(zzf.zzcad, (Object) null, (Object) null);
            if (t != null) {
                zzbzu.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <T extends zzux<?, ?>> void zza(Class<T> cls, T t) {
        zzbzu.put(cls, t);
    }

    protected static Object zza(zzwi zzwi, String str, Object[] objArr) {
        return new zzwv(zzwi, str, objArr);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
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

    protected static final <T extends zzux<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzf.zzbzy, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzac = zzwt.zzur().zzad(t).zzac(t);
        if (z) {
            t.zza(zzf.zzbzz, (Object) zzac ? t : null, (Object) null);
        }
        return zzac;
    }

    protected static zzvd zzti() {
        return zzuy.zzto();
    }

    protected static zzvd zza(zzvd zzvd) {
        int size = zzvd.size();
        return zzvd.zzdl(size == 0 ? 10 : size << 1);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.firebase_ml.zzve, com.google.android.gms.internal.firebase_ml.zzuw] */
    protected static zzve zztj() {
        return zzuw.zzsz();
    }

    protected static <E> zzvf<E> zztk() {
        return zzww.zzuu();
    }

    protected static <E> zzvf<E> zza(zzvf<E> zzvf) {
        int size = zzvf.size();
        return zzvf.zzcp(size == 0 ? 10 : size << 1);
    }

    private static <T extends zzux<T, ?>> T zza(T t, byte[] bArr, int i, int i2, zzuk zzuk) throws zzvi {
        T t2 = (zzux) t.zza(zzf.zzcab, (Object) null, (Object) null);
        try {
            zzxc zzad = zzwt.zzur().zzad(t2);
            zzad.zza(t2, bArr, 0, i2, new zztp(zzuk));
            zzad.zzq(t2);
            if (t2.zzbvi == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzvi) {
                throw ((zzvi) e.getCause());
            }
            throw new zzvi(e.getMessage()).zzg(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzvi.zztp().zzg(t2);
        }
    }

    protected static <T extends zzux<T, ?>> T zza(T t, byte[] bArr, zzuk zzuk) throws zzvi {
        T zza2 = zza(t, bArr, 0, bArr.length, zzuk);
        if (zza2 == null || zza2.isInitialized()) {
            return zza2;
        }
        throw new zzvi(new zzxr(zza2).getMessage()).zzg(zza2);
    }

    public final /* synthetic */ zzwh zztl() {
        zza zza2 = (zza) zza(zzf.zzcac, (Object) null, (Object) null);
        zza2.zza(this);
        return zza2;
    }

    public final /* synthetic */ zzwh zztm() {
        return (zza) zza(zzf.zzcac, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzwi zztf() {
        return (zzux) zza(zzf.zzcad, (Object) null, (Object) null);
    }
}
