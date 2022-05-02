package com.google.android.gms.internal.firebase_ml;

import com.alibaba.wireless.security.SecExceptionCode;
import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.firebase_ml.zzro;
import com.google.android.gms.internal.firebase_ml.zzux;
import com.j256.ormlite.stmt.query.SimpleComparison;
import kotlin.text.Typography;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class zzmn {

    public static final class zza extends zzux<zza, zzb> implements zzwk {
        /* access modifiers changed from: private */
        public static final zza zzagk;
        private static volatile zzwr<zza> zzj;
        private C0082zza zzagh;
        private int zzagi;
        private zzy zzagj;
        private int zzf;

        /* renamed from: com.google.android.gms.internal.firebase_ml.zzmn$zza$zza  reason: collision with other inner class name */
        public static final class C0082zza extends zzux<C0082zza, C0083zza> implements zzwk {
            /* access modifiers changed from: private */
            public static final C0082zza zzagp;
            private static volatile zzwr<C0082zza> zzj;
            private int zzagl;
            private boolean zzagm;
            private zzab zzagn;
            private zzag zzago;
            private int zzf;

            private C0082zza() {
            }

            /* renamed from: com.google.android.gms.internal.firebase_ml.zzmn$zza$zza$zza  reason: collision with other inner class name */
            public static final class C0083zza extends zzux.zza<C0082zza, C0083zza> implements zzwk {
                private C0083zza() {
                    super(C0082zza.zzagp);
                }

                public final C0083zza zzb(zzmy zzmy) {
                    zzta();
                    ((C0082zza) this.zzbzq).zza(zzmy);
                    return this;
                }

                public final C0083zza zzn(boolean z) {
                    zzta();
                    ((C0082zza) this.zzbzq).zzm(z);
                    return this;
                }

                public final C0083zza zzb(zzab zzab) {
                    zzta();
                    ((C0082zza) this.zzbzq).zza(zzab);
                    return this;
                }

                /* synthetic */ C0083zza(zzmp zzmp) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zza(zzmy zzmy) {
                if (zzmy != null) {
                    this.zzf |= 1;
                    this.zzagl = zzmy.zzb();
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            public final void zzm(boolean z) {
                this.zzf |= 2;
                this.zzagm = z;
            }

            /* access modifiers changed from: private */
            public final void zza(zzab zzab) {
                if (zzab != null) {
                    this.zzagn = zzab;
                    this.zzf |= 4;
                    return;
                }
                throw null;
            }

            public static C0083zza zzjb() {
                return (C0083zza) zzagp.zztg();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzmp.zzk[i - 1]) {
                    case 1:
                        return new C0082zza();
                    case 2:
                        return new C0083zza((zzmp) null);
                    case 3:
                        return zza((zzwi) zzagp, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{"zzf", "zzagl", zzmy.zzd(), "zzagm", "zzagn", "zzago"});
                    case 4:
                        return zzagp;
                    case 5:
                        zzwr<C0082zza> zzwr = zzj;
                        if (zzwr == null) {
                            synchronized (C0082zza.class) {
                                zzwr = zzj;
                                if (zzwr == null) {
                                    zzwr = new zzux.zzc<>(zzagp);
                                    zzj = zzwr;
                                }
                            }
                        }
                        return zzwr;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                C0082zza zza = new C0082zza();
                zzagp = zza;
                zzux.zza(C0082zza.class, zza);
            }
        }

        private zza() {
        }

        public static final class zzb extends zzux.zza<zza, zzb> implements zzwk {
            private zzb() {
                super(zza.zzagk);
            }

            /* synthetic */ zzb(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb((zzmp) null);
                case 3:
                    return zza((zzwi) zzagk, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\u000b\u0001\u0003\t\u0002", new Object[]{"zzf", "zzagh", "zzagi", "zzagj"});
                case 4:
                    return zzagk;
                case 5:
                    zzwr<zza> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zza.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzagk);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zza zza = new zza();
            zzagk = zza;
            zzux.zza(zza.class, zza);
        }
    }

    public static final class zzaa extends zzux<zzaa, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzaa zzaqa;
        private static volatile zzwr<zzaa> zzj;
        private int zzaoo;
        private zzau zzaop;
        private int zzaoq;
        private boolean zzaor;
        private zzae zzaos;
        private zzx zzaot;
        private zzw zzaou;
        private zzv zzaov;
        private zzaj zzaow;
        private zzas zzaox;
        private zzai zzaoy;
        private zzak zzaoz;
        private zzan zzapa;
        private zzaq zzapb;
        private zzap zzapc;
        private zzar zzapd;
        private zzam zzape;
        private zzat zzapf;
        private zzn zzapg;
        private zzk zzaph;
        private zzm zzapi;
        private zzp zzapj;
        private zzo zzapk;
        private zzq zzapl;
        private zzr zzapm;
        private zzs zzapn;
        private zzt zzapo;
        private zzu zzapp;
        private zzh zzapq;
        private zzj zzapr;
        private zzi zzaps;
        private zza zzapt;
        private zzb zzapu;
        private zzd zzapv;
        private zzc zzapw;
        private zze zzapx;
        private zzf zzapy;
        private zzg zzapz;
        private int zzf;

        private zzaa() {
        }

        public static final class zza extends zzux.zza<zzaa, zza> implements zzwk {
            private zza() {
                super(zzaa.zzaqa);
            }

            public final zzau zzkx() {
                return ((zzaa) this.zzbzq).zzkx();
            }

            public final zza zzb(zzau.zza zza) {
                zzta();
                ((zzaa) this.zzbzq).zza(zza);
                return this;
            }

            public final zza zzb(zznc zznc) {
                zzta();
                ((zzaa) this.zzbzq).zza(zznc);
                return this;
            }

            public final zza zzab(boolean z) {
                zzta();
                ((zzaa) this.zzbzq).zzaa(z);
                return this;
            }

            public final zza zzb(zzae.zza zza) {
                zzta();
                ((zzaa) this.zzbzq).zza(zza);
                return this;
            }

            public final zza zzb(zzx.zza zza) {
                zzta();
                ((zzaa) this.zzbzq).zza(zza);
                return this;
            }

            public final zza zzb(zzw zzw) {
                zzta();
                ((zzaa) this.zzbzq).zza(zzw);
                return this;
            }

            public final zza zzb(zzv zzv) {
                zzta();
                ((zzaa) this.zzbzq).zza(zzv);
                return this;
            }

            public final zza zzb(zzaj zzaj) {
                zzta();
                ((zzaa) this.zzbzq).zza(zzaj);
                return this;
            }

            public final zza zzb(zzas zzas) {
                zzta();
                ((zzaa) this.zzbzq).zza(zzas);
                return this;
            }

            public final zza zzb(zzai zzai) {
                zzta();
                ((zzaa) this.zzbzq).zza(zzai);
                return this;
            }

            public final zza zzb(zzai.zzc zzc) {
                zzta();
                ((zzaa) this.zzbzq).zza(zzc);
                return this;
            }

            public final zza zzb(zzak zzak) {
                zzta();
                ((zzaa) this.zzbzq).zza(zzak);
                return this;
            }

            public final zza zzb(zzan.zza zza) {
                zzta();
                ((zzaa) this.zzbzq).zza(zza);
                return this;
            }

            public final zza zzb(zzaq.zza zza) {
                zzta();
                ((zzaa) this.zzbzq).zza(zza);
                return this;
            }

            public final zza zzb(zzap.zza zza) {
                zzta();
                ((zzaa) this.zzbzq).zza(zza);
                return this;
            }

            public final zza zzb(zzh zzh) {
                zzta();
                ((zzaa) this.zzbzq).zza(zzh);
                return this;
            }

            public final zza zzb(zzj.zza zza) {
                zzta();
                ((zzaa) this.zzbzq).zza(zza);
                return this;
            }

            public final zza zzb(zzi.zza zza) {
                zzta();
                ((zzaa) this.zzbzq).zza(zza);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        public final zzau zzkx() {
            zzau zzau = this.zzaop;
            return zzau == null ? zzau.zzms() : zzau;
        }

        /* access modifiers changed from: private */
        public final void zza(zzau.zza zza2) {
            this.zzaop = (zzau) ((zzux) zza2.zzte());
            this.zzf |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zznc zznc) {
            if (zznc != null) {
                this.zzf |= 2;
                this.zzaoq = zznc.zzb();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzaa(boolean z) {
            this.zzf |= 4;
            this.zzaor = z;
        }

        /* access modifiers changed from: private */
        public final void zza(zzae.zza zza2) {
            this.zzaos = (zzae) ((zzux) zza2.zzte());
            this.zzf |= 8;
        }

        /* access modifiers changed from: private */
        public final void zza(zzx.zza zza2) {
            this.zzaot = (zzx) ((zzux) zza2.zzte());
            this.zzf |= 16;
        }

        /* access modifiers changed from: private */
        public final void zza(zzw zzw) {
            if (zzw != null) {
                this.zzaou = zzw;
                this.zzf |= 32;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzv zzv) {
            if (zzv != null) {
                this.zzaov = zzv;
                this.zzf |= 64;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzaj zzaj) {
            if (zzaj != null) {
                this.zzaow = zzaj;
                this.zzf |= 128;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzas zzas) {
            if (zzas != null) {
                this.zzaox = zzas;
                this.zzf |= 256;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzai zzai) {
            if (zzai != null) {
                this.zzaoy = zzai;
                this.zzf |= 512;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzai.zzc zzc) {
            this.zzaoy = (zzai) ((zzux) zzc.zzte());
            this.zzf |= 512;
        }

        /* access modifiers changed from: private */
        public final void zza(zzak zzak) {
            if (zzak != null) {
                this.zzaoz = zzak;
                this.zzf |= 1024;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzan.zza zza2) {
            this.zzapa = (zzan) ((zzux) zza2.zzte());
            this.zzf |= 2048;
        }

        /* access modifiers changed from: private */
        public final void zza(zzaq.zza zza2) {
            this.zzapb = (zzaq) ((zzux) zza2.zzte());
            this.zzf |= 4096;
        }

        /* access modifiers changed from: private */
        public final void zza(zzap.zza zza2) {
            this.zzapc = (zzap) ((zzux) zza2.zzte());
            this.zzf |= 8192;
        }

        /* access modifiers changed from: private */
        public final void zza(zzh zzh) {
            if (zzh != null) {
                this.zzapq = zzh;
                this.zzf |= 134217728;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzj.zza zza2) {
            this.zzapr = (zzj) ((zzux) zza2.zzte());
            this.zzf |= 268435456;
        }

        /* access modifiers changed from: private */
        public final void zza(zzi.zza zza2) {
            this.zzaps = (zzi) ((zzux) zza2.zzte());
            this.zzf |= C.ENCODING_PCM_A_LAW;
        }

        public static zza zzky() {
            return (zza) zzaqa.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzaa();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzaqa, "\u0001%\u0000\u0002\u0001%%\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\t\u0003\u0004\t\u0005\u0005\t\u0007\u0006\t\b\u0007\t\t\b\t\u0011\t\t\u0012\n\t\u0013\u000b\t\u0014\f\t\u0015\r\t\u0016\u000e\t\u0017\u000f\t\u0018\u0010\t\u0019\u0011\t\u001a\u0012\t\n\u0013\t\u000e\u0014\t\u0004\u0015\t\u000f\u0016\t\u0010\u0017\t\u001b\u0018\t\u001c\u0019\t\u001d\u001a\t\u000b\u001b\t\f\u001c\t\r\u001d\t\u0006\u001e\t\u001e\u001f\t\u001f \t !\t!\"\t\"#\t#$\t$%\u0007\u0002", new Object[]{"zzf", "zzaoo", "zzaop", "zzaoq", zznc.zzd(), "zzaos", "zzaou", "zzaow", "zzaox", "zzaoy", "zzapg", "zzaph", "zzapi", "zzapj", "zzapk", "zzapl", "zzapm", "zzapn", "zzapo", "zzapp", "zzaoz", "zzapd", "zzaot", "zzape", "zzapf", "zzapq", "zzapr", "zzaps", "zzapa", "zzapb", "zzapc", "zzaov", "zzapt", "zzapu", "zzapv", "zzapw", "zzapx", "zzapy", "zzapz", "zzaor"});
                case 4:
                    return zzaqa;
                case 5:
                    zzwr<zzaa> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzaa.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaqa);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzaa zzaa = new zzaa();
            zzaqa = zzaa;
            zzux.zza(zzaa.class, zzaa);
        }
    }

    public static final class zzab extends zzux<zzab, zzb> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzab zzaqe;
        private static volatile zzwr<zzab> zzj;
        private int zzaqb;
        private int zzaqc;
        private int zzaqd;
        private int zzf;

        public enum zza implements zzuz {
            UNKNOWN_FORMAT(0),
            NV16(1),
            NV21(2),
            YV12(3),
            BITMAP(4),
            CM_SAMPLE_BUFFER_REF(5),
            UI_IMAGE(6);
            
            private static final zzvc<zza> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zza zzba(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_FORMAT;
                    case 1:
                        return NV16;
                    case 2:
                        return NV21;
                    case 3:
                        return YV12;
                    case 4:
                        return BITMAP;
                    case 5:
                        return CM_SAMPLE_BUFFER_REF;
                    case 6:
                        return UI_IMAGE;
                    default:
                        return null;
                }
            }

            public static zzvb zzd() {
                return zznm.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zza(int i) {
                this.value = i;
            }

            static {
                zzq = new zznn();
            }
        }

        private zzab() {
        }

        public static final class zzb extends zzux.zza<zzab, zzb> implements zzwk {
            private zzb() {
                super(zzab.zzaqe);
            }

            public final zzb zzb(zza zza) {
                zzta();
                ((zzab) this.zzbzq).zza(zza);
                return this;
            }

            public final zzb zzbb(int i) {
                zzta();
                ((zzab) this.zzbzq).zzaz(i);
                return this;
            }

            /* synthetic */ zzb(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zza zza2) {
            if (zza2 != null) {
                this.zzf |= 1;
                this.zzaqb = zza2.zzb();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzaz(int i) {
            this.zzf |= 2;
            this.zzaqc = i;
        }

        public static zzb zzla() {
            return (zzb) zzaqe.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzab();
                case 2:
                    return new zzb((zzmp) null);
                case 3:
                    return zza((zzwi) zzaqe, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u000b\u0001\u0003\u000b\u0002", new Object[]{"zzf", "zzaqb", zza.zzd(), "zzaqc", "zzaqd"});
                case 4:
                    return zzaqe;
                case 5:
                    zzwr<zzab> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzab.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaqe);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzab zzab = new zzab();
            zzaqe = zzab;
            zzux.zza(zzab.class, zzab);
        }
    }

    public static final class zzac extends zzux<zzac, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzac zzaqr;
        private static volatile zzwr<zzac> zzj;
        private int zzagl;
        private boolean zzagm;
        private boolean zzajg;
        private long zzaqn;
        private boolean zzaqo;
        private boolean zzaqp;
        private int zzaqq;
        private int zzf;

        private zzac() {
        }

        public static final class zza extends zzux.zza<zzac, zza> implements zzwk {
            private zza() {
                super(zzac.zzaqr);
            }

            public final zza zzj(long j) {
                zzta();
                ((zzac) this.zzbzq).zzk(j);
                return this;
            }

            public final zza zzk(zzmy zzmy) {
                zzta();
                ((zzac) this.zzbzq).zza(zzmy);
                return this;
            }

            public final zza zzac(boolean z) {
                zzta();
                ((zzac) this.zzbzq).zzm(z);
                return this;
            }

            public final zza zzad(boolean z) {
                zzta();
                ((zzac) this.zzbzq).zzag(true);
                return this;
            }

            public final zza zzae(boolean z) {
                zzta();
                ((zzac) this.zzbzq).zzah(true);
                return this;
            }

            public final zza zzaf(boolean z) {
                zzta();
                ((zzac) this.zzbzq).zzw(z);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzk(long j) {
            this.zzf |= 1;
            this.zzaqn = j;
        }

        /* access modifiers changed from: private */
        public final void zza(zzmy zzmy) {
            if (zzmy != null) {
                this.zzf |= 2;
                this.zzagl = zzmy.zzb();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzm(boolean z) {
            this.zzf |= 4;
            this.zzagm = z;
        }

        /* access modifiers changed from: private */
        public final void zzag(boolean z) {
            this.zzf |= 8;
            this.zzaqo = z;
        }

        /* access modifiers changed from: private */
        public final void zzah(boolean z) {
            this.zzf |= 16;
            this.zzaqp = z;
        }

        /* access modifiers changed from: private */
        public final void zzw(boolean z) {
            this.zzf |= 32;
            this.zzajg = z;
        }

        public static zza zzlc() {
            return (zza) zzaqr.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzac();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzaqr, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0003\u0000\u0002\f\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005\u0007\u000b\u0006", new Object[]{"zzf", "zzaqn", "zzagl", zzmy.zzd(), "zzagm", "zzaqo", "zzaqp", "zzajg", "zzaqq"});
                case 4:
                    return zzaqr;
                case 5:
                    zzwr<zzac> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzac.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaqr);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzac zzac = new zzac();
            zzaqr = zzac;
            zzux.zza(zzac.class, zzac);
        }
    }

    public static final class zzad extends zzux<zzad, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzad zzaqu;
        private static volatile zzwr<zzad> zzj;
        private float zzai;
        private float zzaqs;
        private float zzaqt;
        private int zzf;

        private zzad() {
        }

        public static final class zza extends zzux.zza<zzad, zza> implements zzwk {
            private zza() {
                super(zzad.zzaqu);
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzad();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzaqu, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002", new Object[]{"zzf", "zzaqs", "zzaqt", "zzai"});
                case 4:
                    return zzaqu;
                case 5:
                    zzwr<zzad> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzad.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaqu);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzad zzad = new zzad();
            zzaqu = zzad;
            zzux.zza(zzad.class, zzad);
        }
    }

    public static final class zzae extends zzux<zzae, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzae zzaqz;
        private static volatile zzwr<zzae> zzj;
        private int zzagl;
        private zzag zzago;
        private long zzaqv;
        private long zzaqw;
        private int zzaqx;
        private long zzaqy;
        private int zzf;

        public enum zzb implements zzuz {
            UNKNOWN_STATUS(0),
            EXPLICITLY_REQUESTED(1),
            IMPLICITLY_REQUESTED(2),
            MODEL_INFO_RETRIEVAL_SUCCEEDED(3),
            MODEL_INFO_RETRIEVAL_FAILED(4),
            SCHEDULED(5),
            DOWNLOADING(6),
            SUCCEEDED(7),
            FAILED(8),
            LIVE(9),
            UPDATE_AVAILABLE(10),
            DOWNLOADED(11);
            
            private static final zzvc<zzb> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zzb zzbc(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_STATUS;
                    case 1:
                        return EXPLICITLY_REQUESTED;
                    case 2:
                        return IMPLICITLY_REQUESTED;
                    case 3:
                        return MODEL_INFO_RETRIEVAL_SUCCEEDED;
                    case 4:
                        return MODEL_INFO_RETRIEVAL_FAILED;
                    case 5:
                        return SCHEDULED;
                    case 6:
                        return DOWNLOADING;
                    case 7:
                        return SUCCEEDED;
                    case 8:
                        return FAILED;
                    case 9:
                        return LIVE;
                    case 10:
                        return UPDATE_AVAILABLE;
                    case 11:
                        return DOWNLOADED;
                    default:
                        return null;
                }
            }

            public static zzvb zzd() {
                return zznp.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzq = new zzno();
            }
        }

        private zzae() {
        }

        public static final class zza extends zzux.zza<zzae, zza> implements zzwk {
            private zza() {
                super(zzae.zzaqz);
            }

            public final zza zzk(zzag zzag) {
                zzta();
                ((zzae) this.zzbzq).zza(zzag);
                return this;
            }

            public final zza zzl(long j) {
                zzta();
                ((zzae) this.zzbzq).zzo(j);
                return this;
            }

            public final zza zzl(zzmy zzmy) {
                zzta();
                ((zzae) this.zzbzq).zza(zzmy);
                return this;
            }

            public final zza zzm(long j) {
                zzta();
                ((zzae) this.zzbzq).zzp(j);
                return this;
            }

            public final zza zza(zzb zzb) {
                zzta();
                ((zzae) this.zzbzq).zzb(zzb);
                return this;
            }

            public final zza zzn(long j) {
                zzta();
                ((zzae) this.zzbzq).zzq(j);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzag zzag) {
            if (zzag != null) {
                this.zzago = zzag;
                this.zzf |= 1;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzo(long j) {
            this.zzf |= 2;
            this.zzaqv = j;
        }

        /* access modifiers changed from: private */
        public final void zza(zzmy zzmy) {
            if (zzmy != null) {
                this.zzf |= 4;
                this.zzagl = zzmy.zzb();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzp(long j) {
            this.zzf |= 8;
            this.zzaqw = j;
        }

        /* access modifiers changed from: private */
        public final void zzb(zzb zzb2) {
            if (zzb2 != null) {
                this.zzf |= 16;
                this.zzaqx = zzb2.zzb();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzq(long j) {
            this.zzf |= 32;
            this.zzaqy = j;
        }

        public static zza zzlf() {
            return (zza) zzaqz.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzae();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzaqz, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0000\u0002\u0003\u0001\u0003\f\u0002\u0004\u0003\u0003\u0005\f\u0004\u0006\u0002\u0005", new Object[]{"zzf", "zzago", "zzaqv", "zzagl", zzmy.zzd(), "zzaqw", "zzaqx", zzb.zzd(), "zzaqy"});
                case 4:
                    return zzaqz;
                case 5:
                    zzwr<zzae> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzae.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaqz);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzae zzae = new zzae();
            zzaqz = zzae;
            zzux.zza(zzae.class, zzae);
        }
    }

    public static final class zzaf extends zzux<zzaf, zzb> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzaf zzars;
        private static volatile zzwr<zzaf> zzj;
        private int zzaig;
        private String zzarn = "";
        private String zzaro = "";
        private int zzarp;
        private String zzarq = "";
        private String zzarr = "";
        private int zzf;

        public enum zza implements zzuz {
            TYPE_UNKNOWN(0),
            CUSTOM(1),
            AUTOML_IMAGE_LABELING(2),
            BASE_TRANSLATE(3);
            
            private static final zzvc<zza> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zza zzbd(int i) {
                if (i == 0) {
                    return TYPE_UNKNOWN;
                }
                if (i == 1) {
                    return CUSTOM;
                }
                if (i == 2) {
                    return AUTOML_IMAGE_LABELING;
                }
                if (i != 3) {
                    return null;
                }
                return BASE_TRANSLATE;
            }

            public static zzvb zzd() {
                return zznq.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zza(int i) {
                this.value = i;
            }

            static {
                zzq = new zznr();
            }
        }

        public enum zzc implements zzuz {
            SOURCE_UNKNOWN(0),
            APP_ASSET(1),
            zzasa(2),
            CLOUD(3),
            SDK_BUILT_IN(4);
            
            private static final zzvc<zzc> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zzc zzbe(int i) {
                if (i == 0) {
                    return SOURCE_UNKNOWN;
                }
                if (i == 1) {
                    return APP_ASSET;
                }
                if (i == 2) {
                    return zzasa;
                }
                if (i == 3) {
                    return CLOUD;
                }
                if (i != 4) {
                    return null;
                }
                return SDK_BUILT_IN;
            }

            public static zzvb zzd() {
                return zznt.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzq = new zzns();
            }
        }

        private zzaf() {
        }

        public static final class zzb extends zzux.zza<zzaf, zzb> implements zzwk {
            private zzb() {
                super(zzaf.zzars);
            }

            public final zzb zzbc(String str) {
                zzta();
                ((zzaf) this.zzbzq).setName(str);
                return this;
            }

            public final zzb zzb(zzc zzc) {
                zzta();
                ((zzaf) this.zzbzq).zza(zzc);
                return this;
            }

            public final zzb zzbd(String str) {
                zzta();
                ((zzaf) this.zzbzq).zzba(str);
                return this;
            }

            public final zzb zzbe(String str) {
                zzta();
                ((zzaf) this.zzbzq).zzbb(str);
                return this;
            }

            public final zzb zzb(zza zza) {
                zzta();
                ((zzaf) this.zzbzq).zza(zza);
                return this;
            }

            /* synthetic */ zzb(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void setName(String str) {
            if (str != null) {
                this.zzf |= 1;
                this.zzarn = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzc zzc2) {
            if (zzc2 != null) {
                this.zzf |= 4;
                this.zzarp = zzc2.zzb();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzba(String str) {
            if (str != null) {
                this.zzf |= 8;
                this.zzarq = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzbb(String str) {
            if (str != null) {
                this.zzf |= 16;
                this.zzarr = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zza zza2) {
            if (zza2 != null) {
                this.zzf |= 32;
                this.zzaig = zza2.zzb();
                return;
            }
            throw null;
        }

        public static zzb zzlh() {
            return (zzb) zzars.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzaf();
                case 2:
                    return new zzb((zzmp) null);
                case 3:
                    return zza((zzwi) zzars, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002\u0004\b\u0003\u0005\b\u0004\u0006\f\u0005", new Object[]{"zzf", "zzarn", "zzaro", "zzarp", zzc.zzd(), "zzarq", "zzarr", "zzaig", zza.zzd()});
                case 4:
                    return zzars;
                case 5:
                    zzwr<zzaf> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzaf.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzars);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzaf zzaf = new zzaf();
            zzars = zzaf;
            zzux.zza(zzaf.class, zzaf);
        }
    }

    public static final class zzag extends zzux<zzag, zzb> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzag zzasi;
        private static volatile zzwr<zzag> zzj;
        private zzaf zzase;
        private zza zzasf;
        private zza zzasg;
        private boolean zzash;
        private int zzf;

        public static final class zza extends zzux<zza, C0084zza> implements zzwk {
            /* access modifiers changed from: private */
            public static final zza zzasn;
            private static volatile zzwr<zza> zzj;
            private boolean zzasj;
            private boolean zzask;
            private boolean zzasl;
            private boolean zzasm;
            private int zzf;

            private zza() {
            }

            /* renamed from: com.google.android.gms.internal.firebase_ml.zzmn$zzag$zza$zza  reason: collision with other inner class name */
            public static final class C0084zza extends zzux.zza<zza, C0084zza> implements zzwk {
                private C0084zza() {
                    super(zza.zzasn);
                }

                public final C0084zza zzan(boolean z) {
                    zzta();
                    ((zza) this.zzbzq).zzaj(z);
                    return this;
                }

                public final C0084zza zzao(boolean z) {
                    zzta();
                    ((zza) this.zzbzq).zzak(z);
                    return this;
                }

                public final C0084zza zzap(boolean z) {
                    zzta();
                    ((zza) this.zzbzq).zzal(z);
                    return this;
                }

                /* synthetic */ C0084zza(zzmp zzmp) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zzaj(boolean z) {
                this.zzf |= 1;
                this.zzasj = z;
            }

            /* access modifiers changed from: private */
            public final void zzak(boolean z) {
                this.zzf |= 2;
                this.zzask = z;
            }

            /* access modifiers changed from: private */
            public final void zzal(boolean z) {
                this.zzf |= 4;
                this.zzasl = z;
            }

            public static C0084zza zzlm() {
                return (C0084zza) zzasn.zztg();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzmp.zzk[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0084zza((zzmp) null);
                    case 3:
                        return zza((zzwi) zzasn, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003", new Object[]{"zzf", "zzasj", "zzask", "zzasl", "zzasm"});
                    case 4:
                        return zzasn;
                    case 5:
                        zzwr<zza> zzwr = zzj;
                        if (zzwr == null) {
                            synchronized (zza.class) {
                                zzwr = zzj;
                                if (zzwr == null) {
                                    zzwr = new zzux.zzc<>(zzasn);
                                    zzj = zzwr;
                                }
                            }
                        }
                        return zzwr;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zza zza = new zza();
                zzasn = zza;
                zzux.zza(zza.class, zza);
            }
        }

        private zzag() {
        }

        public static final class zzb extends zzux.zza<zzag, zzb> implements zzwk {
            private zzb() {
                super(zzag.zzasi);
            }

            public final zzb zzb(zzaf.zzb zzb) {
                zzta();
                ((zzag) this.zzbzq).zza(zzb);
                return this;
            }

            public final zzb zzc(zza zza) {
                zzta();
                ((zzag) this.zzbzq).zza(zza);
                return this;
            }

            public final zzb zzd(zza zza) {
                zzta();
                ((zzag) this.zzbzq).zzb(zza);
                return this;
            }

            public final zzb zzam(boolean z) {
                zzta();
                ((zzag) this.zzbzq).zzai(z);
                return this;
            }

            /* synthetic */ zzb(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzaf.zzb zzb2) {
            this.zzase = (zzaf) ((zzux) zzb2.zzte());
            this.zzf |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zza zza2) {
            if (zza2 != null) {
                this.zzasf = zza2;
                this.zzf |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzb(zza zza2) {
            if (zza2 != null) {
                this.zzasg = zza2;
                this.zzf |= 4;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzai(boolean z) {
            this.zzf |= 8;
            this.zzash = z;
        }

        public static zzb zzlj() {
            return (zzb) zzasi.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzag();
                case 2:
                    return new zzb((zzmp) null);
                case 3:
                    return zza((zzwi) zzasi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u0007\u0003", new Object[]{"zzf", "zzase", "zzasf", "zzasg", "zzash"});
                case 4:
                    return zzasi;
                case 5:
                    zzwr<zzag> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzag.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzasi);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static zzag zzlk() {
            return zzasi;
        }

        static {
            zzag zzag = new zzag();
            zzasi = zzag;
            zzux.zza(zzag.class, zzag);
        }
    }

    public static final class zzah extends zzux<zzah, zzb> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzah zzasr;
        private static volatile zzwr<zzah> zzj;
        private int zzaso;
        private float zzasp;
        private int zzasq;
        private int zzf;

        public enum zza implements zzuz {
            CATEGORY_UNKNOWN(0),
            CATEGORY_HOME_GOOD(1),
            CATEGORY_FASHION_GOOD(2),
            CATEGORY_ANIMAL(3),
            CATEGORY_FOOD(4),
            CATEGORY_PLACE(5),
            CATEGORY_PLANT(6);
            
            private static final zzvc<zza> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zza zzbg(int i) {
                switch (i) {
                    case 0:
                        return CATEGORY_UNKNOWN;
                    case 1:
                        return CATEGORY_HOME_GOOD;
                    case 2:
                        return CATEGORY_FASHION_GOOD;
                    case 3:
                        return CATEGORY_ANIMAL;
                    case 4:
                        return CATEGORY_FOOD;
                    case 5:
                        return CATEGORY_PLACE;
                    case 6:
                        return CATEGORY_PLANT;
                    default:
                        return null;
                }
            }

            public static zzvb zzd() {
                return zznu.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zza(int i) {
                this.value = i;
            }

            static {
                zzq = new zznv();
            }
        }

        private zzah() {
        }

        public static final class zzb extends zzux.zza<zzah, zzb> implements zzwk {
            private zzb() {
                super(zzah.zzasr);
            }

            public final zzb zzb(zza zza) {
                zzta();
                ((zzah) this.zzbzq).zza(zza);
                return this;
            }

            public final zzb zzn(float f) {
                zzta();
                ((zzah) this.zzbzq).zzm(f);
                return this;
            }

            public final zzb zzbh(int i) {
                zzta();
                ((zzah) this.zzbzq).zzbf(i);
                return this;
            }

            /* synthetic */ zzb(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zza zza2) {
            if (zza2 != null) {
                this.zzf |= 1;
                this.zzaso = zza2.zzb();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzm(float f) {
            this.zzf |= 2;
            this.zzasp = f;
        }

        /* access modifiers changed from: private */
        public final void zzbf(int i) {
            this.zzf |= 4;
            this.zzasq = i;
        }

        public static zzb zzlo() {
            return (zzb) zzasr.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzah();
                case 2:
                    return new zzb((zzmp) null);
                case 3:
                    return zza((zzwi) zzasr, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0001\u0001\u0003\u0004\u0002", new Object[]{"zzf", "zzaso", zza.zzd(), "zzasp", "zzasq"});
                case 4:
                    return zzasr;
                case 5:
                    zzwr<zzah> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzah.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzasr);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzah zzah = new zzah();
            zzasr = zzah;
            zzux.zza(zzah.class, zzah);
        }
    }

    public static final class zzai extends zzux<zzai, zzc> implements zzwk {
        private static final zzvg<Integer, zza> zzaha = new zznw();
        private static final zzvg<Integer, zzb> zzahc = new zznx();
        /* access modifiers changed from: private */
        public static final zzai zzata;
        private static volatile zzwr<zzai> zzj;
        private zzab zzagn;
        private zzro.zza zzagy;
        private zzvd zzagz = zzti();
        private zzvd zzahb = zzti();
        private zzac zzahw;
        private int zzf;

        public enum zza implements zzuz {
            FORMAT_UNKNOWN(0),
            FORMAT_CODE_128(1),
            FORMAT_CODE_39(2),
            FORMAT_CODE_93(4),
            FORMAT_CODABAR(8),
            FORMAT_DATA_MATRIX(16),
            FORMAT_EAN_13(32),
            FORMAT_EAN_8(64),
            FORMAT_ITF(128),
            FORMAT_QR_CODE(256),
            FORMAT_UPC_A(512),
            FORMAT_UPC_E(1024),
            FORMAT_PDF417(2048),
            FORMAT_AZTEC(4096);
            
            private static final zzvc<zza> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zza zzbi(int i) {
                if (i == 0) {
                    return FORMAT_UNKNOWN;
                }
                if (i == 1) {
                    return FORMAT_CODE_128;
                }
                if (i == 2) {
                    return FORMAT_CODE_39;
                }
                switch (i) {
                    case 4:
                        return FORMAT_CODE_93;
                    case 8:
                        return FORMAT_CODABAR;
                    case 16:
                        return FORMAT_DATA_MATRIX;
                    case 32:
                        return FORMAT_EAN_13;
                    case 64:
                        return FORMAT_EAN_8;
                    case 128:
                        return FORMAT_ITF;
                    case 256:
                        return FORMAT_QR_CODE;
                    case 512:
                        return FORMAT_UPC_A;
                    case 1024:
                        return FORMAT_UPC_E;
                    case 2048:
                        return FORMAT_PDF417;
                    case 4096:
                        return FORMAT_AZTEC;
                    default:
                        return null;
                }
            }

            public static zzvb zzd() {
                return zzny.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zza(int i) {
                this.value = i;
            }

            static {
                zzq = new zznz();
            }
        }

        public enum zzb implements zzuz {
            TYPE_UNKNOWN(0),
            TYPE_CONTACT_INFO(1),
            TYPE_EMAIL(2),
            TYPE_ISBN(3),
            TYPE_PHONE(4),
            TYPE_PRODUCT(5),
            TYPE_SMS(6),
            TYPE_TEXT(7),
            TYPE_URL(8),
            TYPE_WIFI(9),
            TYPE_GEO(10),
            TYPE_CALENDAR_EVENT(11),
            TYPE_DRIVER_LICENSE(12);
            
            private static final zzvc<zzb> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zzb zzbj(int i) {
                switch (i) {
                    case 0:
                        return TYPE_UNKNOWN;
                    case 1:
                        return TYPE_CONTACT_INFO;
                    case 2:
                        return TYPE_EMAIL;
                    case 3:
                        return TYPE_ISBN;
                    case 4:
                        return TYPE_PHONE;
                    case 5:
                        return TYPE_PRODUCT;
                    case 6:
                        return TYPE_SMS;
                    case 7:
                        return TYPE_TEXT;
                    case 8:
                        return TYPE_URL;
                    case 9:
                        return TYPE_WIFI;
                    case 10:
                        return TYPE_GEO;
                    case 11:
                        return TYPE_CALENDAR_EVENT;
                    case 12:
                        return TYPE_DRIVER_LICENSE;
                    default:
                        return null;
                }
            }

            public static zzvb zzd() {
                return zzob.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzq = new zzoa();
            }
        }

        private zzai() {
        }

        public static final class zzc extends zzux.zza<zzai, zzc> implements zzwk {
            private zzc() {
                super(zzai.zzata);
            }

            public final zzc zzd(zzac.zza zza) {
                zzta();
                ((zzai) this.zzbzq).zza(zza);
                return this;
            }

            public final zzc zzc(zzro.zza zza) {
                zzta();
                ((zzai) this.zzbzq).zza(zza);
                return this;
            }

            public final zzc zzs(Iterable<? extends zza> iterable) {
                zzta();
                ((zzai) this.zzbzq).zzh(iterable);
                return this;
            }

            public final zzc zzt(Iterable<? extends zzb> iterable) {
                zzta();
                ((zzai) this.zzbzq).zzi(iterable);
                return this;
            }

            public final zzc zzi(zzab zzab) {
                zzta();
                ((zzai) this.zzbzq).zza(zzab);
                return this;
            }

            /* synthetic */ zzc(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzac.zza zza2) {
            this.zzahw = (zzac) ((zzux) zza2.zzte());
            this.zzf |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zzro.zza zza2) {
            if (zza2 != null) {
                this.zzagy = zza2;
                this.zzf |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzh(Iterable<? extends zza> iterable) {
            if (!this.zzagz.zzru()) {
                this.zzagz = zzux.zza(this.zzagz);
            }
            for (zza zzb2 : iterable) {
                this.zzagz.zzdm(zzb2.zzb());
            }
        }

        /* access modifiers changed from: private */
        public final void zzi(Iterable<? extends zzb> iterable) {
            if (!this.zzahb.zzru()) {
                this.zzahb = zzux.zza(this.zzahb);
            }
            for (zzb zzb2 : iterable) {
                this.zzahb.zzdm(zzb2.zzb());
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzab zzab) {
            if (zzab != null) {
                this.zzagn = zzab;
                this.zzf |= 4;
                return;
            }
            throw null;
        }

        public static zzc zzlq() {
            return (zzc) zzata.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzai();
                case 2:
                    return new zzc((zzmp) null);
                case 3:
                    return zza((zzwi) zzata, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u001e\u0004\u001e\u0005\t\u0002", new Object[]{"zzf", "zzahw", "zzagy", "zzagz", zza.zzd(), "zzahb", zzb.zzd(), "zzagn"});
                case 4:
                    return zzata;
                case 5:
                    zzwr<zzai> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzai.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzata);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzai zzai = new zzai();
            zzata = zzai;
            zzux.zza(zzai.class, zzai);
        }
    }

    public static final class zzaj extends zzux<zzaj, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzaj zzauf;
        private static volatile zzwr<zzaj> zzj;
        private zzab zzagn;
        private zzz zzahg;
        private int zzahh;
        private int zzahi;
        private zzac zzahw;
        private zzro.zzb zzaue;
        private int zzf;

        private zzaj() {
        }

        public static final class zza extends zzux.zza<zzaj, zza> implements zzwk {
            private zza() {
                super(zzaj.zzauf);
            }

            public final zza zze(zzac.zza zza) {
                zzta();
                ((zzaj) this.zzbzq).zza(zza);
                return this;
            }

            public final zza zzj(zzab zzab) {
                zzta();
                ((zzaj) this.zzbzq).zza(zzab);
                return this;
            }

            public final zza zzc(zzz zzz) {
                zzta();
                ((zzaj) this.zzbzq).zza(zzz);
                return this;
            }

            public final zza zzbk(int i) {
                zzta();
                ((zzaj) this.zzbzq).zzan(i);
                return this;
            }

            public final zza zzbl(int i) {
                zzta();
                ((zzaj) this.zzbzq).zzao(i);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzac.zza zza2) {
            this.zzahw = (zzac) ((zzux) zza2.zzte());
            this.zzf |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zzab zzab) {
            if (zzab != null) {
                this.zzagn = zzab;
                this.zzf |= 4;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzz zzz) {
            if (zzz != null) {
                this.zzahg = zzz;
                this.zzf |= 8;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzan(int i) {
            this.zzf |= 16;
            this.zzahh = i;
        }

        /* access modifiers changed from: private */
        public final void zzao(int i) {
            this.zzf |= 32;
            this.zzahi = i;
        }

        public static zza zzls() {
            return (zza) zzauf.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzaj();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzauf, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\u000b\u0004\u0006\u000b\u0005", new Object[]{"zzf", "zzahw", "zzaue", "zzagn", "zzahg", "zzahh", "zzahi"});
                case 4:
                    return zzauf;
                case 5:
                    zzwr<zzaj> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzaj.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzauf);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzaj zzaj = new zzaj();
            zzauf = zzaj;
            zzux.zza(zzaj.class, zzaj);
        }
    }

    public static final class zzak extends zzux<zzak, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzak zzauh;
        private static volatile zzwr<zzak> zzj;
        private zzab zzagn;
        private zzac zzahw;
        private zzal zzaug;
        private int zzf;

        private zzak() {
        }

        public static final class zza extends zzux.zza<zzak, zza> implements zzwk {
            private zza() {
                super(zzak.zzauh);
            }

            public final zza zzf(zzac.zza zza) {
                zzta();
                ((zzak) this.zzbzq).zza(zza);
                return this;
            }

            public final zza zzc(zzal zzal) {
                zzta();
                ((zzak) this.zzbzq).zzd(zzal);
                return this;
            }

            public final zza zzk(zzab zzab) {
                zzta();
                ((zzak) this.zzbzq).zza(zzab);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzac.zza zza2) {
            this.zzahw = (zzac) ((zzux) zza2.zzte());
            this.zzf |= 1;
        }

        /* access modifiers changed from: private */
        public final void zzd(zzal zzal) {
            if (zzal != null) {
                this.zzaug = zzal;
                this.zzf |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzab zzab) {
            if (zzab != null) {
                this.zzagn = zzab;
                this.zzf |= 4;
                return;
            }
            throw null;
        }

        public static zza zzlu() {
            return (zza) zzauh.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzak();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzauh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzf", "zzahw", "zzaug", "zzagn"});
                case 4:
                    return zzauh;
                case 5:
                    zzwr<zzak> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzak.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzauh);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzak zzak = new zzak();
            zzauh = zzak;
            zzux.zza(zzak.class, zzak);
        }
    }

    public static final class zzal extends zzux<zzal, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzal zzauj;
        private static volatile zzwr<zzal> zzj;
        private float zzai;
        private int zzaui;
        private int zzf;

        private zzal() {
        }

        public static final class zza extends zzux.zza<zzal, zza> implements zzwk {
            private zza() {
                super(zzal.zzauj);
            }

            public final zza zzo(float f) {
                zzta();
                ((zzal) this.zzbzq).zzp(f);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzp(float f) {
            this.zzf |= 2;
            this.zzai = f;
        }

        public static zza zzlw() {
            return (zza) zzauj.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzal();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzauj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0000\u0002\u0001\u0001", new Object[]{"zzf", "zzaui", "zzai"});
                case 4:
                    return zzauj;
                case 5:
                    zzwr<zzal> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzal.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzauj);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzal zzal = new zzal();
            zzauj = zzal;
            zzux.zza(zzal.class, zzal);
        }
    }

    public static final class zzam extends zzux<zzam, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzam zzaun;
        private static volatile zzwr<zzam> zzj;
        private zzac zzahw;
        private zzad zzauk;
        private zzc zzaul;
        private zzd zzaum;
        private int zzf;

        public static final class zzb extends zzux<zzb, zza> implements zzwk {
            /* access modifiers changed from: private */
            public static final zzb zzaup;
            private static volatile zzwr<zzb> zzj;
            private float zzaf;
            private String zzauo = "";
            private int zzf;

            private zzb() {
            }

            public static final class zza extends zzux.zza<zzb, zza> implements zzwk {
                private zza() {
                    super(zzb.zzaup);
                }

                /* synthetic */ zza(zzmp zzmp) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzmp.zzk[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new zza((zzmp) null);
                    case 3:
                        return zza((zzwi) zzaup, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0000\u0002\b\u0001", new Object[]{"zzf", "zzaf", "zzauo"});
                    case 4:
                        return zzaup;
                    case 5:
                        zzwr<zzb> zzwr = zzj;
                        if (zzwr == null) {
                            synchronized (zzb.class) {
                                zzwr = zzj;
                                if (zzwr == null) {
                                    zzwr = new zzux.zzc<>(zzaup);
                                    zzj = zzwr;
                                }
                            }
                        }
                        return zzwr;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzb zzb = new zzb();
                zzaup = zzb;
                zzux.zza(zzb.class, zzb);
            }
        }

        public static final class zzc extends zzux<zzc, zza> implements zzwk {
            /* access modifiers changed from: private */
            public static final zzc zzaur;
            private static volatile zzwr<zzc> zzj;
            private zzb zzauq;
            private int zzf;

            private zzc() {
            }

            public static final class zza extends zzux.zza<zzc, zza> implements zzwk {
                private zza() {
                    super(zzc.zzaur);
                }

                /* synthetic */ zza(zzmp zzmp) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzmp.zzk[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza((zzmp) null);
                    case 3:
                        return zza((zzwi) zzaur, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{"zzf", "zzauq"});
                    case 4:
                        return zzaur;
                    case 5:
                        zzwr<zzc> zzwr = zzj;
                        if (zzwr == null) {
                            synchronized (zzc.class) {
                                zzwr = zzj;
                                if (zzwr == null) {
                                    zzwr = new zzux.zzc<>(zzaur);
                                    zzj = zzwr;
                                }
                            }
                        }
                        return zzwr;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzc zzc = new zzc();
                zzaur = zzc;
                zzux.zza(zzc.class, zzc);
            }
        }

        public static final class zzd extends zzux<zzd, zza> implements zzwk {
            /* access modifiers changed from: private */
            public static final zzd zzaut;
            private static volatile zzwr<zzd> zzj;
            private zzvf<zzb> zzaus = zztk();

            private zzd() {
            }

            public static final class zza extends zzux.zza<zzd, zza> implements zzwk {
                private zza() {
                    super(zzd.zzaut);
                }

                /* synthetic */ zza(zzmp zzmp) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzmp.zzk[i - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new zza((zzmp) null);
                    case 3:
                        return zza((zzwi) zzaut, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzaus", zzb.class});
                    case 4:
                        return zzaut;
                    case 5:
                        zzwr<zzd> zzwr = zzj;
                        if (zzwr == null) {
                            synchronized (zzd.class) {
                                zzwr = zzj;
                                if (zzwr == null) {
                                    zzwr = new zzux.zzc<>(zzaut);
                                    zzj = zzwr;
                                }
                            }
                        }
                        return zzwr;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzd zzd = new zzd();
                zzaut = zzd;
                zzux.zza(zzd.class, zzd);
            }
        }

        private zzam() {
        }

        public static final class zza extends zzux.zza<zzam, zza> implements zzwk {
            private zza() {
                super(zzam.zzaun);
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzam();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzaun, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{"zzf", "zzahw", "zzauk", "zzaul", "zzaum"});
                case 4:
                    return zzaun;
                case 5:
                    zzwr<zzam> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzam.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaun);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzam zzam = new zzam();
            zzaun = zzam;
            zzux.zza(zzam.class, zzam);
        }
    }

    public static final class zzan extends zzux<zzan, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzan zzauu;
        private static volatile zzwr<zzan> zzj;
        private int zzagl;
        private zzao zzahq;
        private int zzf;

        private zzan() {
        }

        public static final class zza extends zzux.zza<zzan, zza> implements zzwk {
            private zza() {
                super(zzan.zzauu);
            }

            public final zza zzc(zzao zzao) {
                zzta();
                ((zzan) this.zzbzq).zza(zzao);
                return this;
            }

            public final zza zzm(zzmy zzmy) {
                zzta();
                ((zzan) this.zzbzq).zza(zzmy);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzao zzao) {
            if (zzao != null) {
                this.zzahq = zzao;
                this.zzf |= 1;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzmy zzmy) {
            if (zzmy != null) {
                this.zzf |= 2;
                this.zzagl = zzmy.zzb();
                return;
            }
            throw null;
        }

        public static zza zzmc() {
            return (zza) zzauu.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzan();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzauu, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001", new Object[]{"zzf", "zzahq", "zzagl", zzmy.zzd()});
                case 4:
                    return zzauu;
                case 5:
                    zzwr<zzan> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzan.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzauu);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzan zzan = new zzan();
            zzauu = zzan;
            zzux.zza(zzan.class, zzan);
        }
    }

    public static final class zzao extends zzux<zzao, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzao zzauy;
        private static volatile zzwr<zzao> zzj;
        private int zzauv;
        private boolean zzauw;
        private boolean zzaux;
        private int zzf;

        public enum zzb implements zzuz {
            MODE_UNSPECIFIED(0),
            STREAM(1),
            SINGLE_IMAGE(2);
            
            private static final zzvc<zzb> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zzb zzbm(int i) {
                if (i == 0) {
                    return MODE_UNSPECIFIED;
                }
                if (i == 1) {
                    return STREAM;
                }
                if (i != 2) {
                    return null;
                }
                return SINGLE_IMAGE;
            }

            public static zzvb zzd() {
                return zzod.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzq = new zzoc();
            }
        }

        private zzao() {
        }

        public static final class zza extends zzux.zza<zzao, zza> implements zzwk {
            private zza() {
                super(zzao.zzauy);
            }

            public final zza zza(zzb zzb) {
                zzta();
                ((zzao) this.zzbzq).zzb(zzb);
                return this;
            }

            public final zza zzaq(boolean z) {
                zzta();
                ((zzao) this.zzbzq).zzas(z);
                return this;
            }

            public final zza zzar(boolean z) {
                zzta();
                ((zzao) this.zzbzq).zzat(z);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzb(zzb zzb2) {
            if (zzb2 != null) {
                this.zzf |= 1;
                this.zzauv = zzb2.zzb();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzas(boolean z) {
            this.zzf |= 2;
            this.zzauw = z;
        }

        /* access modifiers changed from: private */
        public final void zzat(boolean z) {
            this.zzf |= 4;
            this.zzaux = z;
        }

        public static zza zzme() {
            return (zza) zzauy.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzao();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzauy, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\u0007\u0002", new Object[]{"zzf", "zzauv", zzb.zzd(), "zzauw", "zzaux"});
                case 4:
                    return zzauy;
                case 5:
                    zzwr<zzao> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzao.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzauy);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzao zzao = new zzao();
            zzauy = zzao;
            zzux.zza(zzao.class, zzao);
        }
    }

    public static final class zzap extends zzux<zzap, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzap zzave;
        private static volatile zzwr<zzap> zzj;
        private zzab zzagn;
        private zzao zzahq;
        private zzac zzahw;
        private zzvf<zzah> zzavd = zztk();
        private int zzf;

        private zzap() {
        }

        public static final class zza extends zzux.zza<zzap, zza> implements zzwk {
            private zza() {
                super(zzap.zzave);
            }

            public final zza zzg(zzac.zza zza) {
                zzta();
                ((zzap) this.zzbzq).zza(zza);
                return this;
            }

            public final zza zzl(zzab zzab) {
                zzta();
                ((zzap) this.zzbzq).zza(zzab);
                return this;
            }

            public final zza zzd(zzao zzao) {
                zzta();
                ((zzap) this.zzbzq).zza(zzao);
                return this;
            }

            public final zza zzv(Iterable<? extends zzah> iterable) {
                zzta();
                ((zzap) this.zzbzq).zzu(iterable);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzac.zza zza2) {
            this.zzahw = (zzac) ((zzux) zza2.zzte());
            this.zzf |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zzab zzab) {
            if (zzab != null) {
                this.zzagn = zzab;
                this.zzf |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzao zzao) {
            if (zzao != null) {
                this.zzahq = zzao;
                this.zzf |= 4;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzu(Iterable<? extends zzah> iterable) {
            if (!this.zzavd.zzru()) {
                this.zzavd = zzux.zza(this.zzavd);
            }
            zztj.zza(iterable, this.zzavd);
        }

        public static zza zzmg() {
            return (zza) zzave.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzap();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzave, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u001b", new Object[]{"zzf", "zzahw", "zzagn", "zzahq", "zzavd", zzah.class});
                case 4:
                    return zzave;
                case 5:
                    zzwr<zzap> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzap.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzave);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzap zzap = new zzap();
            zzave = zzap;
            zzux.zza(zzap.class, zzap);
        }
    }

    public static final class zzaq extends zzux<zzaq, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzaq zzavf;
        private static volatile zzwr<zzaq> zzj;
        private int zzagl;
        private zzao zzahq;
        private int zzf;

        private zzaq() {
        }

        public static final class zza extends zzux.zza<zzaq, zza> implements zzwk {
            private zza() {
                super(zzaq.zzavf);
            }

            public final zza zze(zzao zzao) {
                zzta();
                ((zzaq) this.zzbzq).zza(zzao);
                return this;
            }

            public final zza zzn(zzmy zzmy) {
                zzta();
                ((zzaq) this.zzbzq).zza(zzmy);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzao zzao) {
            if (zzao != null) {
                this.zzahq = zzao;
                this.zzf |= 1;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzmy zzmy) {
            if (zzmy != null) {
                this.zzf |= 2;
                this.zzagl = zzmy.zzb();
                return;
            }
            throw null;
        }

        public static zza zzmi() {
            return (zza) zzavf.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzaq();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzavf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001", new Object[]{"zzf", "zzahq", "zzagl", zzmy.zzd()});
                case 4:
                    return zzavf;
                case 5:
                    zzwr<zzaq> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzaq.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzavf);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzaq zzaq = new zzaq();
            zzavf = zzaq;
            zzux.zza(zzaq.class, zzaq);
        }
    }

    public static final class zzar extends zzux<zzar, zzb> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzar zzavk;
        private static volatile zzwr<zzar> zzj;
        private zzac zzahw;
        private zzvf<zzc> zzavg = zztk();
        private int zzavh;
        private int zzavi;
        private int zzavj;
        private int zzf;

        public enum zza implements zzuz {
            NO_ERROR(0),
            STATUS_SENSITIVE_TOPIC(1),
            STATUS_QUALITY_THRESHOLDED(2),
            STATUS_INTERNAL_ERROR(3),
            STATUS_NOT_SUPPORTED_LANGUAGE(101),
            STATUS_32_BIT_CPU(1001),
            STATUS_32_BIT_APP(1002);
            
            private static final zzvc<zza> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zza zzbn(int i) {
                if (i == 0) {
                    return NO_ERROR;
                }
                if (i == 1) {
                    return STATUS_SENSITIVE_TOPIC;
                }
                if (i == 2) {
                    return STATUS_QUALITY_THRESHOLDED;
                }
                if (i == 3) {
                    return STATUS_INTERNAL_ERROR;
                }
                if (i == 101) {
                    return STATUS_NOT_SUPPORTED_LANGUAGE;
                }
                if (i == 1001) {
                    return STATUS_32_BIT_CPU;
                }
                if (i != 1002) {
                    return null;
                }
                return STATUS_32_BIT_APP;
            }

            public static zzvb zzd() {
                return zzoe.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zza(int i) {
                this.value = i;
            }

            static {
                zzq = new zzof();
            }
        }

        public static final class zzc extends zzux<zzc, zza> implements zzwk {
            /* access modifiers changed from: private */
            public static final zzc zzavt;
            private static volatile zzwr<zzc> zzj;
            private float zzaf;
            private int zzf;

            private zzc() {
            }

            public static final class zza extends zzux.zza<zzc, zza> implements zzwk {
                private zza() {
                    super(zzc.zzavt);
                }

                /* synthetic */ zza(zzmp zzmp) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzmp.zzk[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza((zzmp) null);
                    case 3:
                        return zza((zzwi) zzavt, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000", new Object[]{"zzf", "zzaf"});
                    case 4:
                        return zzavt;
                    case 5:
                        zzwr<zzc> zzwr = zzj;
                        if (zzwr == null) {
                            synchronized (zzc.class) {
                                zzwr = zzj;
                                if (zzwr == null) {
                                    zzwr = new zzux.zzc<>(zzavt);
                                    zzj = zzwr;
                                }
                            }
                        }
                        return zzwr;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzc zzc = new zzc();
                zzavt = zzc;
                zzux.zza(zzc.class, zzc);
            }
        }

        private zzar() {
        }

        public static final class zzb extends zzux.zza<zzar, zzb> implements zzwk {
            private zzb() {
                super(zzar.zzavk);
            }

            /* synthetic */ zzb(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzar();
                case 2:
                    return new zzb((zzmp) null);
                case 3:
                    return zza((zzwi) zzavk, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\f\u0001\u0004\u0004\u0002\u0005\u0004\u0003", new Object[]{"zzf", "zzahw", "zzavg", zzc.class, "zzavh", zza.zzd(), "zzavi", "zzavj"});
                case 4:
                    return zzavk;
                case 5:
                    zzwr<zzar> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzar.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzavk);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzar zzar = new zzar();
            zzavk = zzar;
            zzux.zza(zzar.class, zzar);
        }
    }

    public static final class zzas extends zzux<zzas, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzas zzavu;
        private static volatile zzwr<zzas> zzj;
        private zzab zzagn;
        private zzac zzahw;
        private int zzf;

        private zzas() {
        }

        public static final class zza extends zzux.zza<zzas, zza> implements zzwk {
            private zza() {
                super(zzas.zzavu);
            }

            public final zza zzh(zzac.zza zza) {
                zzta();
                ((zzas) this.zzbzq).zza(zza);
                return this;
            }

            public final zza zzm(zzab zzab) {
                zzta();
                ((zzas) this.zzbzq).zza(zzab);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzac.zza zza2) {
            this.zzahw = (zzac) ((zzux) zza2.zzte());
            this.zzf |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zzab zzab) {
            if (zzab != null) {
                this.zzagn = zzab;
                this.zzf |= 2;
                return;
            }
            throw null;
        }

        public static zza zzmm() {
            return (zza) zzavu.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzas();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzavu, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"zzf", "zzahw", "zzagn"});
                case 4:
                    return zzavu;
                case 5:
                    zzwr<zzas> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzas.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzavu);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static zzas zzmn() {
            return zzavu;
        }

        static {
            zzas zzas = new zzas();
            zzavu = zzas;
            zzux.zza(zzas.class, zzas);
        }
    }

    public static final class zzat extends zzux<zzat, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzat zzawc;
        private static volatile zzwr<zzat> zzj;
        private zzac zzahw;
        private zzav zzavv;
        private int zzavw;
        private int zzavx;
        private int zzavy;
        private int zzavz;
        private int zzawa;
        private int zzawb;
        private int zzf;

        public enum zzb implements zzuz {
            NO_ERROR(0),
            METADATA_FILE_UNAVAILABLE(1),
            METADATA_ENTRY_NOT_FOUND(2),
            METADATA_JSON_INVALID(3),
            METADATA_HASH_NOT_FOUND(4),
            DOWNLOAD_MANAGER_SERVICE_MISSING(5),
            DOWNLOAD_MANAGER_HTTP_UNKNOWN_STATUS(6),
            DOWNLOAD_MANAGER_HTTP_BAD_REQUEST(400),
            DOWNLOAD_MANAGER_HTTP_UNAUTHORIZED(401),
            DOWNLOAD_MANAGER_HTTP_FORBIDDEN(403),
            DOWNLOAD_MANAGER_HTTP_NOT_FOUND(404),
            DOWNLOAD_MANAGER_HTTP_REQUEST_TIMEOUT(408),
            DOWNLOAD_MANAGER_HTTP_ABORTED(409),
            DOWNLOAD_MANAGER_HTTP_TOO_MANY_REQUESTS(429),
            DOWNLOAD_MANAGER_HTTP_CANCELLED(SecExceptionCode.SEC_ERROR_DYN_ENC_UNKNOWN_ERROR),
            DOWNLOAD_MANAGER_HTTP_UNIMPLEMENTED(501),
            DOWNLOAD_MANAGER_HTTP_INTERNAL_SERVICE_ERROR(500),
            DOWNLOAD_MANAGER_HTTP_SERVICE_UNAVAILABLE(503),
            DOWNLOAD_MANAGER_HTTP_DEADLINE_EXCEEDED(SecExceptionCode.SEC_ERROR_DYN_STORE_GET_DATA_FILE_KEY_FAILED),
            DOWNLOAD_MANAGER_HTTP_NETWORK_AUTHENTICATION_REQUIRED(511),
            DOWNLOAD_MANAGER_FILE_ERROR(7),
            DOWNLOAD_MANAGER_UNHANDLED_HTTP_CODE(8),
            DOWNLOAD_MANAGER_HTTP_DATA_ERROR(9),
            DOWNLOAD_MANAGER_TOO_MANY_REDIRECTS(10),
            DOWNLOAD_MANAGER_INSUFFICIENT_SPACE(11),
            DOWNLOAD_MANAGER_DEVICE_NOT_FOUND(12),
            DOWNLOAD_MANAGER_CANNOT_RESUME(13),
            DOWNLOAD_MANAGER_FILE_ALREADY_EXISTS(14),
            DOWNLOAD_MANAGER_UNKNOWN_ERROR(15),
            POST_DOWNLOAD_FILE_NOT_FOUND(16),
            POST_DOWNLOAD_MOVE_FILE_FAILED(17),
            POST_DOWNLOAD_UNZIP_FAILED(18),
            RAPID_RESPONSE_COULD_NOT_BE_WRITTEN(19),
            DRIVER_OBJECT_DEALLOCATED(20);
            
            private static final zzvc<zzb> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zzb zzbo(int i) {
                if (i == 400) {
                    return DOWNLOAD_MANAGER_HTTP_BAD_REQUEST;
                }
                if (i == 401) {
                    return DOWNLOAD_MANAGER_HTTP_UNAUTHORIZED;
                }
                if (i == 403) {
                    return DOWNLOAD_MANAGER_HTTP_FORBIDDEN;
                }
                if (i == 404) {
                    return DOWNLOAD_MANAGER_HTTP_NOT_FOUND;
                }
                if (i == 408) {
                    return DOWNLOAD_MANAGER_HTTP_REQUEST_TIMEOUT;
                }
                if (i == 409) {
                    return DOWNLOAD_MANAGER_HTTP_ABORTED;
                }
                if (i == 429) {
                    return DOWNLOAD_MANAGER_HTTP_TOO_MANY_REQUESTS;
                }
                if (i == 511) {
                    return DOWNLOAD_MANAGER_HTTP_NETWORK_AUTHENTICATION_REQUIRED;
                }
                if (i == 503) {
                    return DOWNLOAD_MANAGER_HTTP_SERVICE_UNAVAILABLE;
                }
                if (i == 504) {
                    return DOWNLOAD_MANAGER_HTTP_DEADLINE_EXCEEDED;
                }
                switch (i) {
                    case 0:
                        return NO_ERROR;
                    case 1:
                        return METADATA_FILE_UNAVAILABLE;
                    case 2:
                        return METADATA_ENTRY_NOT_FOUND;
                    case 3:
                        return METADATA_JSON_INVALID;
                    case 4:
                        return METADATA_HASH_NOT_FOUND;
                    case 5:
                        return DOWNLOAD_MANAGER_SERVICE_MISSING;
                    case 6:
                        return DOWNLOAD_MANAGER_HTTP_UNKNOWN_STATUS;
                    case 7:
                        return DOWNLOAD_MANAGER_FILE_ERROR;
                    case 8:
                        return DOWNLOAD_MANAGER_UNHANDLED_HTTP_CODE;
                    case 9:
                        return DOWNLOAD_MANAGER_HTTP_DATA_ERROR;
                    case 10:
                        return DOWNLOAD_MANAGER_TOO_MANY_REDIRECTS;
                    case 11:
                        return DOWNLOAD_MANAGER_INSUFFICIENT_SPACE;
                    case 12:
                        return DOWNLOAD_MANAGER_DEVICE_NOT_FOUND;
                    case 13:
                        return DOWNLOAD_MANAGER_CANNOT_RESUME;
                    case 14:
                        return DOWNLOAD_MANAGER_FILE_ALREADY_EXISTS;
                    case 15:
                        return DOWNLOAD_MANAGER_UNKNOWN_ERROR;
                    case 16:
                        return POST_DOWNLOAD_FILE_NOT_FOUND;
                    case 17:
                        return POST_DOWNLOAD_MOVE_FILE_FAILED;
                    case 18:
                        return POST_DOWNLOAD_UNZIP_FAILED;
                    case 19:
                        return RAPID_RESPONSE_COULD_NOT_BE_WRITTEN;
                    case 20:
                        return DRIVER_OBJECT_DEALLOCATED;
                    default:
                        switch (i) {
                            case SecExceptionCode.SEC_ERROR_DYN_ENC_UNKNOWN_ERROR:
                                return DOWNLOAD_MANAGER_HTTP_CANCELLED;
                            case 500:
                                return DOWNLOAD_MANAGER_HTTP_INTERNAL_SERVICE_ERROR;
                            case 501:
                                return DOWNLOAD_MANAGER_HTTP_UNIMPLEMENTED;
                            default:
                                return null;
                        }
                }
            }

            public static zzvb zzd() {
                return zzoh.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzq = new zzog();
            }
        }

        private zzat() {
        }

        public static final class zza extends zzux.zza<zzat, zza> implements zzwk {
            private zza() {
                super(zzat.zzawc);
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzat();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzawc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\f\u0006\b\u0004\u0007", new Object[]{"zzf", "zzahw", "zzavv", "zzavw", "zzavx", "zzavy", "zzavz", "zzawa", zzb.zzd(), "zzawb"});
                case 4:
                    return zzawc;
                case 5:
                    zzwr<zzat> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzat.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzawc);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzat zzat = new zzat();
            zzawc = zzat;
            zzux.zza(zzat.class, zzat);
        }
    }

    public static final class zzau extends zzux<zzau, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzau zzaxv;
        private static volatile zzwr<zzau> zzj;
        private String zzaxm = "";
        private String zzaxn = "";
        private String zzaxo = "";
        private String zzaxp = "";
        private String zzaxq = "";
        private String zzaxr = "";
        private String zzaxs = "";
        private zzvf<String> zzaxt = zzux.zztk();
        private String zzaxu = "";
        private int zzf;

        private zzau() {
        }

        public static final class zza extends zzux.zza<zzau, zza> implements zzwk {
            private zza() {
                super(zzau.zzaxv);
            }

            public final zza zzbm(String str) {
                int length = str != null ? str.length() : 0;
                int max = dispatchOnCancelled.setMax(length);
                if (length != max) {
                    onCanceled oncanceled = new onCanceled(length, max, 1);
                    onCancelLoad.setMax(439360488, oncanceled);
                    onCancelLoad.getMin(439360488, oncanceled);
                }
                zzta();
                ((zzau) this.zzbzq).zzbf(str);
                return this;
            }

            public final zza zzbn(String str) {
                zzta();
                ((zzau) this.zzbzq).zzbg(str);
                return this;
            }

            public final zza zzbo(String str) {
                zzta();
                ((zzau) this.zzbzq).zzbh(str);
                return this;
            }

            public final zza zzbp(String str) {
                zzta();
                ((zzau) this.zzbzq).zzbi(str);
                return this;
            }

            public final zza zzbq(String str) {
                zzta();
                ((zzau) this.zzbzq).zzbj(str);
                return this;
            }

            public final zza zzbr(String str) {
                zzta();
                ((zzau) this.zzbzq).zzbk(str);
                return this;
            }

            public final zza zzbs(String str) {
                zzta();
                ((zzau) this.zzbzq).zzbl(str);
                return this;
            }

            public final zza zzx(Iterable<String> iterable) {
                zzta();
                ((zzau) this.zzbzq).zzw(iterable);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzbf(String str) {
            if (str != null) {
                this.zzf |= 1;
                this.zzaxm = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzbg(String str) {
            if (str != null) {
                this.zzf |= 2;
                this.zzaxn = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzbh(String str) {
            if (str != null) {
                this.zzf |= 4;
                this.zzaxo = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzbi(String str) {
            if (str != null) {
                this.zzf |= 8;
                this.zzaxp = str;
                return;
            }
            throw null;
        }

        public final String zzmq() {
            return this.zzaxq;
        }

        /* access modifiers changed from: private */
        public final void zzbj(String str) {
            if (str != null) {
                this.zzf |= 16;
                this.zzaxq = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzbk(String str) {
            if (str != null) {
                this.zzf |= 32;
                this.zzaxr = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzbl(String str) {
            if (str != null) {
                this.zzf |= 64;
                this.zzaxs = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzw(Iterable<String> iterable) {
            if (!this.zzaxt.zzru()) {
                this.zzaxt = zzux.zza(this.zzaxt);
            }
            zztj.zza(iterable, this.zzaxt);
        }

        public static zza zzmr() {
            return (zza) zzaxv.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzau();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzaxv, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005\u0007\b\u0006\b\u001a\t\b\u0007", new Object[]{"zzf", "zzaxm", "zzaxn", "zzaxo", "zzaxp", "zzaxq", "zzaxr", "zzaxs", "zzaxt", "zzaxu"});
                case 4:
                    return zzaxv;
                case 5:
                    zzwr<zzau> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzau.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaxv);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static zzau zzms() {
            return zzaxv;
        }

        static {
            zzau zzau = new zzau();
            zzaxv = zzau;
            zzux.zza(zzau.class, zzau);
        }
    }

    public static final class zzav extends zzux<zzav, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzav zzaxy;
        private static volatile zzwr<zzav> zzj;
        private String zzaxw = "";
        private String zzaxx = "";
        private int zzf;

        private zzav() {
        }

        public static final class zza extends zzux.zza<zzav, zza> implements zzwk {
            private zza() {
                super(zzav.zzaxy);
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzav();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzaxy, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzf", "zzaxw", "zzaxx"});
                case 4:
                    return zzaxy;
                case 5:
                    zzwr<zzav> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzav.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaxy);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzav zzav = new zzav();
            zzaxy = zzav;
            zzux.zza(zzav.class, zzav);
        }
    }

    public static final class zzb extends zzux<zzb, C0086zzb> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzb zzagr;
        private static volatile zzwr<zzb> zzj;
        private int zzagi;
        private zzy zzagj;
        private zza zzagq;
        private int zzf;

        public static final class zza extends zzux<zza, C0085zza> implements zzwk {
            /* access modifiers changed from: private */
            public static final zza zzagu;
            private static volatile zzwr<zza> zzj;
            private int zzagl;
            private boolean zzagm;
            private zzag zzago;
            private zzvf<zzw.zza> zzags = zztk();
            private zzvf<zzw.zza> zzagt = zztk();
            private int zzf;

            private zza() {
            }

            /* renamed from: com.google.android.gms.internal.firebase_ml.zzmn$zzb$zza$zza  reason: collision with other inner class name */
            public static final class C0085zza extends zzux.zza<zza, C0085zza> implements zzwk {
                private C0085zza() {
                    super(zza.zzagu);
                }

                public final C0085zza zzc(zzmy zzmy) {
                    zzta();
                    ((zza) this.zzbzq).zza(zzmy);
                    return this;
                }

                public final C0085zza zzo(boolean z) {
                    zzta();
                    ((zza) this.zzbzq).zzm(z);
                    return this;
                }

                public final C0085zza zzf(Iterable<? extends zzw.zza> iterable) {
                    zzta();
                    ((zza) this.zzbzq).zzd(iterable);
                    return this;
                }

                public final C0085zza zzg(Iterable<? extends zzw.zza> iterable) {
                    zzta();
                    ((zza) this.zzbzq).zze(iterable);
                    return this;
                }

                /* synthetic */ C0085zza(zzmp zzmp) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zza(zzmy zzmy) {
                if (zzmy != null) {
                    this.zzf |= 1;
                    this.zzagl = zzmy.zzb();
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            public final void zzm(boolean z) {
                this.zzf |= 2;
                this.zzagm = z;
            }

            /* access modifiers changed from: private */
            public final void zzd(Iterable<? extends zzw.zza> iterable) {
                if (!this.zzags.zzru()) {
                    this.zzags = zzux.zza(this.zzags);
                }
                zztj.zza(iterable, this.zzags);
            }

            /* access modifiers changed from: private */
            public final void zze(Iterable<? extends zzw.zza> iterable) {
                if (!this.zzagt.zzru()) {
                    this.zzagt = zzux.zza(this.zzagt);
                }
                zztj.zza(iterable, this.zzagt);
            }

            public static C0085zza zzje() {
                return (C0085zza) zzagu.zztg();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzmp.zzk[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0085zza((zzmp) null);
                    case 3:
                        return zza((zzwi) zzagu, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\u001b\u0004\u001b\u0005\t\u0002", new Object[]{"zzf", "zzagl", zzmy.zzd(), "zzagm", "zzags", zzw.zza.class, "zzagt", zzw.zza.class, "zzago"});
                    case 4:
                        return zzagu;
                    case 5:
                        zzwr<zza> zzwr = zzj;
                        if (zzwr == null) {
                            synchronized (zza.class) {
                                zzwr = zzj;
                                if (zzwr == null) {
                                    zzwr = new zzux.zzc<>(zzagu);
                                    zzj = zzwr;
                                }
                            }
                        }
                        return zzwr;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zza zza = new zza();
                zzagu = zza;
                zzux.zza(zza.class, zza);
            }
        }

        private zzb() {
        }

        /* renamed from: com.google.android.gms.internal.firebase_ml.zzmn$zzb$zzb  reason: collision with other inner class name */
        public static final class C0086zzb extends zzux.zza<zzb, C0086zzb> implements zzwk {
            private C0086zzb() {
                super(zzb.zzagr);
            }

            /* synthetic */ C0086zzb(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new C0086zzb((zzmp) null);
                case 3:
                    return zza((zzwi) zzagr, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\u000b\u0001\u0003\t\u0002", new Object[]{"zzf", "zzagq", "zzagi", "zzagj"});
                case 4:
                    return zzagr;
                case 5:
                    zzwr<zzb> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzb.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzagr);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzb zzb = new zzb();
            zzagr = zzb;
            zzux.zza(zzb.class, zzb);
        }
    }

    public static final class zzc extends zzux<zzc, zzb> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzc zzagw;
        private static volatile zzwr<zzc> zzj;
        private int zzagi;
        private zzy zzagj;
        private zza zzagv;
        private int zzf;

        public static final class zza extends zzux<zza, C0087zza> implements zzwk {
            private static final zzvg<Integer, zzai.zza> zzaha = new zzmr();
            private static final zzvg<Integer, zzai.zzb> zzahc = new zzmq();
            /* access modifiers changed from: private */
            public static final zza zzahd;
            private static volatile zzwr<zza> zzj;
            private int zzagl;
            private boolean zzagm;
            private zzab zzagn;
            private boolean zzagx;
            private zzro.zza zzagy;
            private zzvd zzagz = zzti();
            private zzvd zzahb = zzti();
            private int zzf;

            private zza() {
            }

            /* renamed from: com.google.android.gms.internal.firebase_ml.zzmn$zzc$zza$zza  reason: collision with other inner class name */
            public static final class C0087zza extends zzux.zza<zza, C0087zza> implements zzwk {
                private C0087zza() {
                    super(zza.zzahd);
                }

                public final C0087zza zzd(zzmy zzmy) {
                    zzta();
                    ((zza) this.zzbzq).zza(zzmy);
                    return this;
                }

                public final C0087zza zzp(boolean z) {
                    zzta();
                    ((zza) this.zzbzq).zzm(z);
                    return this;
                }

                public final C0087zza zzc(zzab zzab) {
                    zzta();
                    ((zza) this.zzbzq).zza(zzab);
                    return this;
                }

                public final C0087zza zzb(zzro.zza zza) {
                    zzta();
                    ((zza) this.zzbzq).zza(zza);
                    return this;
                }

                public final C0087zza zzj(Iterable<? extends zzai.zza> iterable) {
                    zzta();
                    ((zza) this.zzbzq).zzh(iterable);
                    return this;
                }

                public final C0087zza zzk(Iterable<? extends zzai.zzb> iterable) {
                    zzta();
                    ((zza) this.zzbzq).zzi(iterable);
                    return this;
                }

                /* synthetic */ C0087zza(zzmp zzmp) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zza(zzmy zzmy) {
                if (zzmy != null) {
                    this.zzf |= 1;
                    this.zzagl = zzmy.zzb();
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            public final void zzm(boolean z) {
                this.zzf |= 4;
                this.zzagm = z;
            }

            /* access modifiers changed from: private */
            public final void zza(zzab zzab) {
                if (zzab != null) {
                    this.zzagn = zzab;
                    this.zzf |= 8;
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            public final void zza(zzro.zza zza) {
                if (zza != null) {
                    this.zzagy = zza;
                    this.zzf |= 16;
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            public final void zzh(Iterable<? extends zzai.zza> iterable) {
                if (!this.zzagz.zzru()) {
                    this.zzagz = zzux.zza(this.zzagz);
                }
                for (zzai.zza zzb : iterable) {
                    this.zzagz.zzdm(zzb.zzb());
                }
            }

            /* access modifiers changed from: private */
            public final void zzi(Iterable<? extends zzai.zzb> iterable) {
                if (!this.zzahb.zzru()) {
                    this.zzahb = zzux.zza(this.zzahb);
                }
                for (zzai.zzb zzb : iterable) {
                    this.zzahb.zzdm(zzb.zzb());
                }
            }

            public static C0087zza zzjh() {
                return (C0087zza) zzahd.zztg();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzmp.zzk[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0087zza((zzmp) null);
                    case 3:
                        return zza((zzwi) zzahd, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\t\u0003\u0005\t\u0004\u0006\u001e\u0007\u001e", new Object[]{"zzf", "zzagl", zzmy.zzd(), "zzagx", "zzagm", "zzagn", "zzagy", "zzagz", zzai.zza.zzd(), "zzahb", zzai.zzb.zzd()});
                    case 4:
                        return zzahd;
                    case 5:
                        zzwr<zza> zzwr = zzj;
                        if (zzwr == null) {
                            synchronized (zza.class) {
                                zzwr = zzj;
                                if (zzwr == null) {
                                    zzwr = new zzux.zzc<>(zzahd);
                                    zzj = zzwr;
                                }
                            }
                        }
                        return zzwr;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zza zza = new zza();
                zzahd = zza;
                zzux.zza(zza.class, zza);
            }
        }

        private zzc() {
        }

        public static final class zzb extends zzux.zza<zzc, zzb> implements zzwk {
            private zzb() {
                super(zzc.zzagw);
            }

            /* synthetic */ zzb(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zzb((zzmp) null);
                case 3:
                    return zza((zzwi) zzagw, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\u000b\u0001\u0003\t\u0002", new Object[]{"zzf", "zzagv", "zzagi", "zzagj"});
                case 4:
                    return zzagw;
                case 5:
                    zzwr<zzc> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzc.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzagw);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzc zzc = new zzc();
            zzagw = zzc;
            zzux.zza(zzc.class, zzc);
        }
    }

    public static final class zzd extends zzux<zzd, zzb> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzd zzahf;
        private static volatile zzwr<zzd> zzj;
        private int zzagi;
        private zzy zzagj;
        private zza zzahe;
        private int zzf;

        public static final class zza extends zzux<zza, C0088zza> implements zzwk {
            /* access modifiers changed from: private */
            public static final zza zzahj;
            private static volatile zzwr<zza> zzj;
            private int zzagl;
            private boolean zzagm;
            private zzab zzagn;
            private zzz zzahg;
            private int zzahh;
            private int zzahi;
            private int zzf;

            private zza() {
            }

            /* renamed from: com.google.android.gms.internal.firebase_ml.zzmn$zzd$zza$zza  reason: collision with other inner class name */
            public static final class C0088zza extends zzux.zza<zza, C0088zza> implements zzwk {
                private C0088zza() {
                    super(zza.zzahj);
                }

                public final C0088zza zze(zzmy zzmy) {
                    zzta();
                    ((zza) this.zzbzq).zza(zzmy);
                    return this;
                }

                public final C0088zza zzq(boolean z) {
                    zzta();
                    ((zza) this.zzbzq).zzm(z);
                    return this;
                }

                public final C0088zza zzd(zzab zzab) {
                    zzta();
                    ((zza) this.zzbzq).zza(zzab);
                    return this;
                }

                public final C0088zza zzb(zzz zzz) {
                    zzta();
                    ((zza) this.zzbzq).zza(zzz);
                    return this;
                }

                public final C0088zza zzap(int i) {
                    zzta();
                    ((zza) this.zzbzq).zzan(i);
                    return this;
                }

                public final C0088zza zzaq(int i) {
                    zzta();
                    ((zza) this.zzbzq).zzao(i);
                    return this;
                }

                /* synthetic */ C0088zza(zzmp zzmp) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zza(zzmy zzmy) {
                if (zzmy != null) {
                    this.zzf |= 1;
                    this.zzagl = zzmy.zzb();
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            public final void zzm(boolean z) {
                this.zzf |= 2;
                this.zzagm = z;
            }

            /* access modifiers changed from: private */
            public final void zza(zzab zzab) {
                if (zzab != null) {
                    this.zzagn = zzab;
                    this.zzf |= 4;
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            public final void zza(zzz zzz) {
                if (zzz != null) {
                    this.zzahg = zzz;
                    this.zzf |= 8;
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            public final void zzan(int i) {
                this.zzf |= 16;
                this.zzahh = i;
            }

            /* access modifiers changed from: private */
            public final void zzao(int i) {
                this.zzf |= 32;
                this.zzahi = i;
            }

            public static C0088zza zzjk() {
                return (C0088zza) zzahj.zztg();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzmp.zzk[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0088zza((zzmp) null);
                    case 3:
                        return zza((zzwi) zzahj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\t\u0002\u0004\t\u0003\u0005\u000b\u0004\u0006\u000b\u0005", new Object[]{"zzf", "zzagl", zzmy.zzd(), "zzagm", "zzagn", "zzahg", "zzahh", "zzahi"});
                    case 4:
                        return zzahj;
                    case 5:
                        zzwr<zza> zzwr = zzj;
                        if (zzwr == null) {
                            synchronized (zza.class) {
                                zzwr = zzj;
                                if (zzwr == null) {
                                    zzwr = new zzux.zzc<>(zzahj);
                                    zzj = zzwr;
                                }
                            }
                        }
                        return zzwr;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zza zza = new zza();
                zzahj = zza;
                zzux.zza(zza.class, zza);
            }
        }

        private zzd() {
        }

        public static final class zzb extends zzux.zza<zzd, zzb> implements zzwk {
            private zzb() {
                super(zzd.zzahf);
            }

            /* synthetic */ zzb(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb((zzmp) null);
                case 3:
                    return zza((zzwi) zzahf, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\u000b\u0001\u0003\t\u0002", new Object[]{"zzf", "zzahe", "zzagi", "zzagj"});
                case 4:
                    return zzahf;
                case 5:
                    zzwr<zzd> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzd.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzahf);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzd zzd = new zzd();
            zzahf = zzd;
            zzux.zza(zzd.class, zzd);
        }
    }

    public static final class zze extends zzux<zze, zzb> implements zzwk {
        /* access modifiers changed from: private */
        public static final zze zzahl;
        private static volatile zzwr<zze> zzj;
        private int zzagi;
        private zzy zzagj;
        private zza zzahk;
        private int zzf;

        public static final class zza extends zzux<zza, C0089zza> implements zzwk {
            /* access modifiers changed from: private */
            public static final zza zzahn;
            private static volatile zzwr<zza> zzj;
            private int zzagl;
            private boolean zzagm;
            private zzab zzagn;
            private zzal zzahm;
            private int zzf;

            private zza() {
            }

            /* renamed from: com.google.android.gms.internal.firebase_ml.zzmn$zze$zza$zza  reason: collision with other inner class name */
            public static final class C0089zza extends zzux.zza<zza, C0089zza> implements zzwk {
                private C0089zza() {
                    super(zza.zzahn);
                }

                public final C0089zza zzf(zzmy zzmy) {
                    zzta();
                    ((zza) this.zzbzq).zza(zzmy);
                    return this;
                }

                public final C0089zza zzr(boolean z) {
                    zzta();
                    ((zza) this.zzbzq).zzm(z);
                    return this;
                }

                public final C0089zza zze(zzab zzab) {
                    zzta();
                    ((zza) this.zzbzq).zza(zzab);
                    return this;
                }

                public final C0089zza zzb(zzal zzal) {
                    zzta();
                    ((zza) this.zzbzq).zza(zzal);
                    return this;
                }

                /* synthetic */ C0089zza(zzmp zzmp) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zza(zzmy zzmy) {
                if (zzmy != null) {
                    this.zzf |= 1;
                    this.zzagl = zzmy.zzb();
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            public final void zzm(boolean z) {
                this.zzf |= 2;
                this.zzagm = z;
            }

            /* access modifiers changed from: private */
            public final void zza(zzab zzab) {
                if (zzab != null) {
                    this.zzagn = zzab;
                    this.zzf |= 4;
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            public final void zza(zzal zzal) {
                if (zzal != null) {
                    this.zzahm = zzal;
                    this.zzf |= 8;
                    return;
                }
                throw null;
            }

            public static C0089zza zzjn() {
                return (C0089zza) zzahn.zztg();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzmp.zzk[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0089zza((zzmp) null);
                    case 3:
                        return zza((zzwi) zzahn, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{"zzf", "zzagl", zzmy.zzd(), "zzagm", "zzagn", "zzahm"});
                    case 4:
                        return zzahn;
                    case 5:
                        zzwr<zza> zzwr = zzj;
                        if (zzwr == null) {
                            synchronized (zza.class) {
                                zzwr = zzj;
                                if (zzwr == null) {
                                    zzwr = new zzux.zzc<>(zzahn);
                                    zzj = zzwr;
                                }
                            }
                        }
                        return zzwr;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zza zza = new zza();
                zzahn = zza;
                zzux.zza(zza.class, zza);
            }
        }

        private zze() {
        }

        public static final class zzb extends zzux.zza<zze, zzb> implements zzwk {
            private zzb() {
                super(zze.zzahl);
            }

            /* synthetic */ zzb(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zzb((zzmp) null);
                case 3:
                    return zza((zzwi) zzahl, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\u000b\u0001\u0003\t\u0002", new Object[]{"zzf", "zzahk", "zzagi", "zzagj"});
                case 4:
                    return zzahl;
                case 5:
                    zzwr<zze> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zze.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzahl);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zze zze = new zze();
            zzahl = zze;
            zzux.zza(zze.class, zze);
        }
    }

    public static final class zzf extends zzux<zzf, zzb> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzf zzahp;
        private static volatile zzwr<zzf> zzj;
        private int zzagi;
        private zzy zzagj;
        private zza zzaho;
        private int zzf;

        public static final class zza extends zzux<zza, C0090zza> implements zzwk {
            /* access modifiers changed from: private */
            public static final zza zzahr;
            private static volatile zzwr<zza> zzj;
            private int zzagl;
            private boolean zzagm;
            private zzab zzagn;
            private boolean zzagx;
            private zzao zzahq;
            private int zzf;

            private zza() {
            }

            /* renamed from: com.google.android.gms.internal.firebase_ml.zzmn$zzf$zza$zza  reason: collision with other inner class name */
            public static final class C0090zza extends zzux.zza<zza, C0090zza> implements zzwk {
                private C0090zza() {
                    super(zza.zzahr);
                }

                public final C0090zza zzg(zzmy zzmy) {
                    zzta();
                    ((zza) this.zzbzq).zza(zzmy);
                    return this;
                }

                public final C0090zza zzt(boolean z) {
                    zzta();
                    ((zza) this.zzbzq).zzs(z);
                    return this;
                }

                public final C0090zza zzu(boolean z) {
                    zzta();
                    ((zza) this.zzbzq).zzm(z);
                    return this;
                }

                public final C0090zza zzf(zzab zzab) {
                    zzta();
                    ((zza) this.zzbzq).zza(zzab);
                    return this;
                }

                public final C0090zza zzb(zzao zzao) {
                    zzta();
                    ((zza) this.zzbzq).zza(zzao);
                    return this;
                }

                /* synthetic */ C0090zza(zzmp zzmp) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zza(zzmy zzmy) {
                if (zzmy != null) {
                    this.zzf |= 1;
                    this.zzagl = zzmy.zzb();
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            public final void zzs(boolean z) {
                this.zzf |= 2;
                this.zzagx = z;
            }

            /* access modifiers changed from: private */
            public final void zzm(boolean z) {
                this.zzf |= 4;
                this.zzagm = z;
            }

            /* access modifiers changed from: private */
            public final void zza(zzab zzab) {
                if (zzab != null) {
                    this.zzagn = zzab;
                    this.zzf |= 8;
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            public final void zza(zzao zzao) {
                if (zzao != null) {
                    this.zzahq = zzao;
                    this.zzf |= 16;
                    return;
                }
                throw null;
            }

            public static C0090zza zzjq() {
                return (C0090zza) zzahr.zztg();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzmp.zzk[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0090zza((zzmp) null);
                    case 3:
                        return zza((zzwi) zzahr, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\t\u0003\u0005\t\u0004", new Object[]{"zzf", "zzagl", zzmy.zzd(), "zzagx", "zzagm", "zzagn", "zzahq"});
                    case 4:
                        return zzahr;
                    case 5:
                        zzwr<zza> zzwr = zzj;
                        if (zzwr == null) {
                            synchronized (zza.class) {
                                zzwr = zzj;
                                if (zzwr == null) {
                                    zzwr = new zzux.zzc<>(zzahr);
                                    zzj = zzwr;
                                }
                            }
                        }
                        return zzwr;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zza zza = new zza();
                zzahr = zza;
                zzux.zza(zza.class, zza);
            }
        }

        private zzf() {
        }

        public static final class zzb extends zzux.zza<zzf, zzb> implements zzwk {
            private zzb() {
                super(zzf.zzahp);
            }

            /* synthetic */ zzb(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zzb((zzmp) null);
                case 3:
                    return zza((zzwi) zzahp, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\u000b\u0001\u0003\t\u0002", new Object[]{"zzf", "zzaho", "zzagi", "zzagj"});
                case 4:
                    return zzahp;
                case 5:
                    zzwr<zzf> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzf.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzahp);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzf zzf2 = new zzf();
            zzahp = zzf2;
            zzux.zza(zzf.class, zzf2);
        }
    }

    public static final class zzg extends zzux<zzg, zzb> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzg zzaht;
        private static volatile zzwr<zzg> zzj;
        private int zzagi;
        private zzy zzagj;
        private zza zzahs;
        private int zzf;

        public static final class zza extends zzux<zza, C0091zza> implements zzwk {
            /* access modifiers changed from: private */
            public static final zza zzahu;
            private static volatile zzwr<zza> zzj;
            private int zzagl;
            private boolean zzagm;
            private zzab zzagn;
            private boolean zzagx;
            private int zzf;

            private zza() {
            }

            /* renamed from: com.google.android.gms.internal.firebase_ml.zzmn$zzg$zza$zza  reason: collision with other inner class name */
            public static final class C0091zza extends zzux.zza<zza, C0091zza> implements zzwk {
                private C0091zza() {
                    super(zza.zzahu);
                }

                public final C0091zza zzh(zzmy zzmy) {
                    zzta();
                    ((zza) this.zzbzq).zza(zzmy);
                    return this;
                }

                public final C0091zza zzv(boolean z) {
                    zzta();
                    ((zza) this.zzbzq).zzm(z);
                    return this;
                }

                public final C0091zza zzg(zzab zzab) {
                    zzta();
                    ((zza) this.zzbzq).zza(zzab);
                    return this;
                }

                /* synthetic */ C0091zza(zzmp zzmp) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zza(zzmy zzmy) {
                if (zzmy != null) {
                    this.zzf |= 1;
                    this.zzagl = zzmy.zzb();
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            public final void zzm(boolean z) {
                this.zzf |= 4;
                this.zzagm = z;
            }

            /* access modifiers changed from: private */
            public final void zza(zzab zzab) {
                if (zzab != null) {
                    this.zzagn = zzab;
                    this.zzf |= 8;
                    return;
                }
                throw null;
            }

            public static C0091zza zzjt() {
                return (C0091zza) zzahu.zztg();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzmp.zzk[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0091zza((zzmp) null);
                    case 3:
                        return zza((zzwi) zzahu, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\t\u0003", new Object[]{"zzf", "zzagl", zzmy.zzd(), "zzagx", "zzagm", "zzagn"});
                    case 4:
                        return zzahu;
                    case 5:
                        zzwr<zza> zzwr = zzj;
                        if (zzwr == null) {
                            synchronized (zza.class) {
                                zzwr = zzj;
                                if (zzwr == null) {
                                    zzwr = new zzux.zzc<>(zzahu);
                                    zzj = zzwr;
                                }
                            }
                        }
                        return zzwr;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zza zza = new zza();
                zzahu = zza;
                zzux.zza(zza.class, zza);
            }
        }

        private zzg() {
        }

        public static final class zzb extends zzux.zza<zzg, zzb> implements zzwk {
            private zzb() {
                super(zzg.zzaht);
            }

            /* synthetic */ zzb(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zzb((zzmp) null);
                case 3:
                    return zza((zzwi) zzaht, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\u000b\u0001\u0003\t\u0002", new Object[]{"zzf", "zzahs", "zzagi", "zzagj"});
                case 4:
                    return zzaht;
                case 5:
                    zzwr<zzg> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzg.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaht);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzg zzg = new zzg();
            zzaht = zzg;
            zzux.zza(zzg.class, zzg);
        }
    }

    public static final class zzh extends zzux<zzh, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzh zzahv;
        private static volatile zzwr<zzh> zzj;
        private int zzagl;
        private int zzf;

        private zzh() {
        }

        public static final class zza extends zzux.zza<zzh, zza> implements zzwk {
            private zza() {
                super(zzh.zzahv);
            }

            public final zza zzi(zzmy zzmy) {
                zzta();
                ((zzh) this.zzbzq).zza(zzmy);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzmy zzmy) {
            if (zzmy != null) {
                this.zzf |= 1;
                this.zzagl = zzmy.zzb();
                return;
            }
            throw null;
        }

        public static zza zzjv() {
            return (zza) zzahv.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzahv, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"zzf", "zzagl", zzmy.zzd()});
                case 4:
                    return zzahv;
                case 5:
                    zzwr<zzh> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzh.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzahv);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzh zzh = new zzh();
            zzahv = zzh;
            zzux.zza(zzh.class, zzh);
        }
    }

    public static final class zzi extends zzux<zzi, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzi zzahy;
        private static volatile zzwr<zzi> zzj;
        private zzab zzagn;
        private zzag zzago;
        private zzac zzahw;
        private long zzahx;
        private float zzai;
        private int zzf;

        private zzi() {
        }

        public static final class zza extends zzux.zza<zzi, zza> implements zzwk {
            private zza() {
                super(zzi.zzahy);
            }

            public final zza zzb(zzac.zza zza) {
                zzta();
                ((zzi) this.zzbzq).zza(zza);
                return this;
            }

            public final zza zzd(zzag zzag) {
                zzta();
                ((zzi) this.zzbzq).zza(zzag);
                return this;
            }

            public final zza zzh(zzab zzab) {
                zzta();
                ((zzi) this.zzbzq).zza(zzab);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzac.zza zza2) {
            this.zzahw = (zzac) ((zzux) zza2.zzte());
            this.zzf |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zzag zzag) {
            if (zzag != null) {
                this.zzago = zzag;
                this.zzf |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzab zzab) {
            if (zzab != null) {
                this.zzagn = zzab;
                this.zzf |= 16;
                return;
            }
            throw null;
        }

        public static zza zzjx() {
            return (zza) zzahy.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzahy, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0003\u0002\u0004\u0001\u0003\u0005\t\u0004", new Object[]{"zzf", "zzahw", "zzago", "zzahx", "zzai", "zzagn"});
                case 4:
                    return zzahy;
                case 5:
                    zzwr<zzi> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzi.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzahy);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzi zzi = new zzi();
            zzahy = zzi;
            zzux.zza(zzi.class, zzi);
        }
    }

    public static final class zzj extends zzux<zzj, zza> implements zzwk {
        private static final zzvg<Integer, zzmy> zzaic = new zzms();
        /* access modifiers changed from: private */
        public static final zzj zzaid;
        private static volatile zzwr<zzj> zzj;
        private long zzahx;
        private zzag zzahz;
        private zzag zzaia;
        private zzvd zzaib = zzti();
        private int zzf;

        private zzj() {
        }

        public static final class zza extends zzux.zza<zzj, zza> implements zzwk {
            private zza() {
                super(zzj.zzaid);
            }

            public final zza zze(zzag zzag) {
                zzta();
                ((zzj) this.zzbzq).zzb(zzag);
                return this;
            }

            public final zza zzf(zzag zzag) {
                zzta();
                ((zzj) this.zzbzq).zzc(zzag);
                return this;
            }

            public final zza zzm(Iterable<? extends zzmy> iterable) {
                zzta();
                ((zzj) this.zzbzq).zzl(iterable);
                return this;
            }

            public final zza zzg(long j) {
                zzta();
                ((zzj) this.zzbzq).zzf(j);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzb(zzag zzag) {
            if (zzag != null) {
                this.zzahz = zzag;
                this.zzf |= 1;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzc(zzag zzag) {
            if (zzag != null) {
                this.zzaia = zzag;
                this.zzf |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzl(Iterable<? extends zzmy> iterable) {
            if (!this.zzaib.zzru()) {
                this.zzaib = zzux.zza(this.zzaib);
            }
            for (zzmy zzb : iterable) {
                this.zzaib.zzdm(zzb.zzb());
            }
        }

        /* access modifiers changed from: private */
        public final void zzf(long j) {
            this.zzf |= 4;
            this.zzahx = j;
        }

        public static zza zzjz() {
            return (zza) zzaid.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzaid, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u001e\u0004\u0003\u0002", new Object[]{"zzf", "zzahz", "zzaia", "zzaib", zzmy.zzd(), "zzahx"});
                case 4:
                    return zzaid;
                case 5:
                    zzwr<zzj> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzj.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaid);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzj zzj2 = new zzj();
            zzaid = zzj2;
            zzux.zza(zzj.class, zzj2);
        }
    }

    public static final class zzk extends zzux<zzk, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzk zzaif;
        private static volatile zzwr<zzk> zzj;
        private zzab zzagn;
        private zzac zzahw;
        private zzl zzaie;
        private int zzf;

        private zzk() {
        }

        public static final class zza extends zzux.zza<zzk, zza> implements zzwk {
            private zza() {
                super(zzk.zzaif);
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzaif, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzf", "zzahw", "zzaie", "zzagn"});
                case 4:
                    return zzaif;
                case 5:
                    zzwr<zzk> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzk.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaif);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzk zzk = new zzk();
            zzaif = zzk;
            zzux.zza(zzk.class, zzk);
        }
    }

    public static final class zzl extends zzux<zzl, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzl zzaih;
        private static volatile zzwr<zzl> zzj;
        private int zzaig;
        private int zzdm;
        private int zzf;

        public enum zzb implements zzuz {
            UNKNOWN_MODEL_TYPE(0),
            STABLE_MODEL(1),
            LATEST_MODEL(2);
            
            private static final zzvc<zzb> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zzb zzar(int i) {
                if (i == 0) {
                    return UNKNOWN_MODEL_TYPE;
                }
                if (i == 1) {
                    return STABLE_MODEL;
                }
                if (i != 2) {
                    return null;
                }
                return LATEST_MODEL;
            }

            public static zzvb zzd() {
                return zzmu.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzq = new zzmt();
            }
        }

        private zzl() {
        }

        public static final class zza extends zzux.zza<zzl, zza> implements zzwk {
            private zza() {
                super(zzl.zzaih);
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzaih, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\f\u0001", new Object[]{"zzf", "zzdm", "zzaig", zzb.zzd()});
                case 4:
                    return zzaih;
                case 5:
                    zzwr<zzl> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzl.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaih);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzl zzl = new zzl();
            zzaih = zzl;
            zzux.zza(zzl.class, zzl);
        }
    }

    public static final class zzm extends zzux<zzm, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzm zzaim;
        private static volatile zzwr<zzm> zzj;
        private zzab zzagn;
        private zzac zzahw;
        private zzl zzaie;
        private int zzf;

        private zzm() {
        }

        public static final class zza extends zzux.zza<zzm, zza> implements zzwk {
            private zza() {
                super(zzm.zzaim);
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-645720976, oncanceled);
                onCancelLoad.getMin(-645720976, oncanceled);
            }
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzaim, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzf", "zzahw", "zzaie", "zzagn"});
                case 4:
                    return zzaim;
                case 5:
                    zzwr<zzm> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzm.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaim);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzm zzm = new zzm();
            zzaim = zzm;
            zzux.zza(zzm.class, zzm);
        }
    }

    public static final class zzn extends zzux<zzn, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzn zzain;
        private static volatile zzwr<zzn> zzj;
        private zzab zzagn;
        private zzac zzahw;
        private zzl zzaie;
        private int zzf;

        private zzn() {
        }

        public static final class zza extends zzux.zza<zzn, zza> implements zzwk {
            private zza() {
                super(zzn.zzain);
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzain, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzf", "zzahw", "zzaie", "zzagn"});
                case 4:
                    return zzain;
                case 5:
                    zzwr<zzn> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzn.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzain);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzn zzn = new zzn();
            zzain = zzn;
            zzux.zza(zzn.class, zzn);
        }
    }

    public static final class zzo extends zzux<zzo, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzo zzaio;
        private static volatile zzwr<zzo> zzj;
        private zzab zzagn;
        private zzac zzahw;
        private zzl zzaie;
        private int zzf;

        private zzo() {
        }

        public static final class zza extends zzux.zza<zzo, zza> implements zzwk {
            private zza() {
                super(zzo.zzaio);
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzaio, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzf", "zzahw", "zzaie", "zzagn"});
                case 4:
                    return zzaio;
                case 5:
                    zzwr<zzo> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzo.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaio);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzo zzo = new zzo();
            zzaio = zzo;
            zzux.zza(zzo.class, zzo);
        }
    }

    public static final class zzp extends zzux<zzp, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzp zzaip;
        private static volatile zzwr<zzp> zzj;
        private zzab zzagn;
        private zzac zzahw;
        private zzl zzaie;
        private int zzf;

        private zzp() {
        }

        public static final class zza extends zzux.zza<zzp, zza> implements zzwk {
            private zza() {
                super(zzp.zzaip);
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzp();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzaip, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzf", "zzahw", "zzaie", "zzagn"});
                case 4:
                    return zzaip;
                case 5:
                    zzwr<zzp> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzp.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaip);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzp zzp = new zzp();
            zzaip = zzp;
            zzux.zza(zzp.class, zzp);
        }
    }

    public static final class zzq extends zzux<zzq, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzq zzaiq;
        private static volatile zzwr<zzq> zzj;
        private zzab zzagn;
        private zzac zzahw;
        private zzl zzaie;
        private int zzf;

        private zzq() {
        }

        public static final class zza extends zzux.zza<zzq, zza> implements zzwk {
            private zza() {
                super(zzq.zzaiq);
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzq();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzaiq, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzf", "zzahw", "zzaie", "zzagn"});
                case 4:
                    return zzaiq;
                case 5:
                    zzwr<zzq> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzq.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaiq);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzq zzq = new zzq();
            zzaiq = zzq;
            zzux.zza(zzq.class, zzq);
        }
    }

    public static final class zzr extends zzux<zzr, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzr zzair;
        private static volatile zzwr<zzr> zzj;
        private zzab zzagn;
        private zzac zzahw;
        private zzl zzaie;
        private int zzf;

        private zzr() {
        }

        public static final class zza extends zzux.zza<zzr, zza> implements zzwk {
            private zza() {
                super(zzr.zzair);
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzr();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzair, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzf", "zzahw", "zzaie", "zzagn"});
                case 4:
                    return zzair;
                case 5:
                    zzwr<zzr> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzr.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzair);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzr zzr = new zzr();
            zzair = zzr;
            zzux.zza(zzr.class, zzr);
        }
    }

    public static final class zzs extends zzux<zzs, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzs zzais;
        private static volatile zzwr<zzs> zzj;
        private zzab zzagn;
        private zzac zzahw;
        private zzl zzaie;
        private int zzf;

        private zzs() {
        }

        public static final class zza extends zzux.zza<zzs, zza> implements zzwk {
            private zza() {
                super(zzs.zzais);
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzs();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzais, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzf", "zzahw", "zzaie", "zzagn"});
                case 4:
                    return zzais;
                case 5:
                    zzwr<zzs> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzs.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzais);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzs zzs = new zzs();
            zzais = zzs;
            zzux.zza(zzs.class, zzs);
        }
    }

    public static final class zzt extends zzux<zzt, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzt zzait;
        private static volatile zzwr<zzt> zzj;
        private zzab zzagn;
        private zzac zzahw;
        private zzl zzaie;
        private int zzf;

        private zzt() {
        }

        public static final class zza extends zzux.zza<zzt, zza> implements zzwk {
            private zza() {
                super(zzt.zzait);
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzt();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzait, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzf", "zzahw", "zzaie", "zzagn"});
                case 4:
                    return zzait;
                case 5:
                    zzwr<zzt> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzt.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzait);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzt zzt = new zzt();
            zzait = zzt;
            zzux.zza(zzt.class, zzt);
        }
    }

    public static final class zzu extends zzux<zzu, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzu zzaiu;
        private static volatile zzwr<zzu> zzj;
        private zzab zzagn;
        private zzac zzahw;
        private zzl zzaie;
        private int zzf;

        private zzu() {
        }

        public static final class zza extends zzux.zza<zzu, zza> implements zzwk {
            private zza() {
                super(zzu.zzaiu);
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzu();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzaiu, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzf", "zzahw", "zzaie", "zzagn"});
                case 4:
                    return zzaiu;
                case 5:
                    zzwr<zzu> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzu.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaiu);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzu zzu = new zzu();
            zzaiu = zzu;
            zzux.zza(zzu.class, zzu);
        }
    }

    public static final class zzv extends zzux<zzv, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzv zzaiv;
        private static volatile zzwr<zzv> zzj;
        private int zzagl;
        private zzag zzago;
        private int zzf;

        private zzv() {
        }

        public static final class zza extends zzux.zza<zzv, zza> implements zzwk {
            private zza() {
                super(zzv.zzaiv);
            }

            public final zza zzg(zzag zzag) {
                zzta();
                ((zzv) this.zzbzq).zza(zzag);
                return this;
            }

            public final zza zzj(zzmy zzmy) {
                zzta();
                ((zzv) this.zzbzq).zza(zzmy);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzag zzag) {
            if (zzag != null) {
                this.zzago = zzag;
                this.zzf |= 1;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzmy zzmy) {
            if (zzmy != null) {
                this.zzf |= 2;
                this.zzagl = zzmy.zzb();
                return;
            }
            throw null;
        }

        public static zza zzkm() {
            return (zza) zzaiv.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-698596291, oncanceled);
                onCancelLoad.getMin(-698596291, oncanceled);
            }
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzv();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzaiv, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001", new Object[]{"zzf", "zzago", "zzagl", zzmy.zzd()});
                case 4:
                    return zzaiv;
                case 5:
                    zzwr<zzv> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzv.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaiv);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzv zzv = new zzv();
            zzaiv = zzv;
            zzux.zza(zzv.class, zzv);
        }
    }

    public static final class zzw extends zzux<zzw, zzb> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzw zzaiw;
        private static volatile zzwr<zzw> zzj;
        private zzag zzago;
        private zzvf<zza> zzags = zztk();
        private zzvf<zza> zzagt = zztk();
        private zzac zzahw;
        private long zzahx;
        private int zzf;

        public static final class zza extends zzux<zza, zzb> implements zzwk {
            /* access modifiers changed from: private */
            public static final zza zzaiz;
            private static volatile zzwr<zza> zzj;
            private int zzaix;
            private zzvd zzaiy = zzti();
            private int zzf;

            /* renamed from: com.google.android.gms.internal.firebase_ml.zzmn$zzw$zza$zza  reason: collision with other inner class name */
            public enum C0092zza implements zzuz {
                UNKNOWN_DATA_TYPE(0),
                TYPE_FLOAT32(1),
                TYPE_INT32(2),
                TYPE_BYTE(3),
                TYPE_LONG(4);
                
                private static final zzvc<C0092zza> zzq = null;
                private final int value;

                public final int zzb() {
                    return this.value;
                }

                public static C0092zza zzas(int i) {
                    if (i == 0) {
                        return UNKNOWN_DATA_TYPE;
                    }
                    if (i == 1) {
                        return TYPE_FLOAT32;
                    }
                    if (i == 2) {
                        return TYPE_INT32;
                    }
                    if (i == 3) {
                        return TYPE_BYTE;
                    }
                    if (i != 4) {
                        return null;
                    }
                    return TYPE_LONG;
                }

                public static zzvb zzd() {
                    return zzmv.zzab;
                }

                public final String toString() {
                    return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
                }

                private C0092zza(int i) {
                    this.value = i;
                }

                static {
                    zzq = new zzmw();
                }
            }

            private zza() {
            }

            public static final class zzb extends zzux.zza<zza, zzb> implements zzwk {
                private zzb() {
                    super(zza.zzaiz);
                }

                public final zzb zzb(C0092zza zza) {
                    zzta();
                    ((zza) this.zzbzq).zza(zza);
                    return this;
                }

                public final zzb zzq(Iterable<? extends Integer> iterable) {
                    zzta();
                    ((zza) this.zzbzq).zzn(iterable);
                    return this;
                }

                /* synthetic */ zzb(zzmp zzmp) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zza(C0092zza zza) {
                if (zza != null) {
                    this.zzf |= 1;
                    this.zzaix = zza.zzb();
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            public final void zzn(Iterable<? extends Integer> iterable) {
                if (!this.zzaiy.zzru()) {
                    this.zzaiy = zzux.zza(this.zzaiy);
                }
                zztj.zza(iterable, this.zzaiy);
            }

            public static zzb zzkq() {
                return (zzb) zzaiz.zztg();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzmp.zzk[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new zzb((zzmp) null);
                    case 3:
                        return zza((zzwi) zzaiz, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u0016", new Object[]{"zzf", "zzaix", C0092zza.zzd(), "zzaiy"});
                    case 4:
                        return zzaiz;
                    case 5:
                        zzwr<zza> zzwr = zzj;
                        if (zzwr == null) {
                            synchronized (zza.class) {
                                zzwr = zzj;
                                if (zzwr == null) {
                                    zzwr = new zzux.zzc<>(zzaiz);
                                    zzj = zzwr;
                                }
                            }
                        }
                        return zzwr;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zza zza = new zza();
                zzaiz = zza;
                zzux.zza(zza.class, zza);
            }
        }

        private zzw() {
        }

        public static final class zzb extends zzux.zza<zzw, zzb> implements zzwk {
            private zzb() {
                super(zzw.zzaiw);
            }

            public final zzb zzc(zzac.zza zza) {
                zzta();
                ((zzw) this.zzbzq).zza(zza);
                return this;
            }

            public final zzb zzh(zzag zzag) {
                zzta();
                ((zzw) this.zzbzq).zza(zzag);
                return this;
            }

            public final zzb zzo(Iterable<? extends zza> iterable) {
                zzta();
                ((zzw) this.zzbzq).zzd(iterable);
                return this;
            }

            public final zzb zzp(Iterable<? extends zza> iterable) {
                zzta();
                ((zzw) this.zzbzq).zze(iterable);
                return this;
            }

            public final zzb zzh(long j) {
                zzta();
                ((zzw) this.zzbzq).zzf(j);
                return this;
            }

            /* synthetic */ zzb(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzac.zza zza2) {
            this.zzahw = (zzac) ((zzux) zza2.zzte());
            this.zzf |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zzag zzag) {
            if (zzag != null) {
                this.zzago = zzag;
                this.zzf |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzd(Iterable<? extends zza> iterable) {
            if (!this.zzags.zzru()) {
                this.zzags = zzux.zza(this.zzags);
            }
            zztj.zza(iterable, this.zzags);
        }

        /* access modifiers changed from: private */
        public final void zze(Iterable<? extends zza> iterable) {
            if (!this.zzagt.zzru()) {
                this.zzagt = zzux.zza(this.zzagt);
            }
            zztj.zza(iterable, this.zzagt);
        }

        /* access modifiers changed from: private */
        public final void zzf(long j) {
            this.zzf |= 4;
            this.zzahx = j;
        }

        public static zzb zzko() {
            return (zzb) zzaiw.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzw();
                case 2:
                    return new zzb((zzmp) null);
                case 3:
                    return zza((zzwi) zzaiw, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u001b\u0004\u001b\u0005\u0003\u0002", new Object[]{"zzf", "zzahw", "zzago", "zzags", zza.class, "zzagt", zza.class, "zzahx"});
                case 4:
                    return zzaiw;
                case 5:
                    zzwr<zzw> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzw.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzaiw);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzw zzw = new zzw();
            zzaiw = zzw;
            zzux.zza(zzw.class, zzw);
        }
    }

    public static final class zzx extends zzux<zzx, zza> implements zzwk {
        private static final zzvg<Integer, zzmy> zzaic = new zzmx();
        /* access modifiers changed from: private */
        public static final zzx zzajh;
        private static volatile zzwr<zzx> zzj;
        private long zzahx;
        private zzag zzahz;
        private zzag zzaia;
        private zzvd zzaib = zzti();
        private boolean zzajg;
        private int zzf;

        private zzx() {
        }

        public static final class zza extends zzux.zza<zzx, zza> implements zzwk {
            private zza() {
                super(zzx.zzajh);
            }

            public final zza zzi(zzag zzag) {
                zzta();
                ((zzx) this.zzbzq).zzb(zzag);
                return this;
            }

            public final zza zzj(zzag zzag) {
                zzta();
                ((zzx) this.zzbzq).zzc(zzag);
                return this;
            }

            public final zza zzr(Iterable<? extends zzmy> iterable) {
                zzta();
                ((zzx) this.zzbzq).zzl(iterable);
                return this;
            }

            public final zza zzi(long j) {
                zzta();
                ((zzx) this.zzbzq).zzf(j);
                return this;
            }

            public final zza zzx(boolean z) {
                zzta();
                ((zzx) this.zzbzq).zzw(z);
                return this;
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzb(zzag zzag) {
            if (zzag != null) {
                this.zzahz = zzag;
                this.zzf |= 1;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzc(zzag zzag) {
            if (zzag != null) {
                this.zzaia = zzag;
                this.zzf |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzl(Iterable<? extends zzmy> iterable) {
            if (!this.zzaib.zzru()) {
                this.zzaib = zzux.zza(this.zzaib);
            }
            for (zzmy zzb : iterable) {
                this.zzaib.zzdm(zzb.zzb());
            }
        }

        /* access modifiers changed from: private */
        public final void zzf(long j) {
            this.zzf |= 4;
            this.zzahx = j;
        }

        /* access modifiers changed from: private */
        public final void zzw(boolean z) {
            this.zzf |= 8;
            this.zzajg = z;
        }

        public static zza zzks() {
            return (zza) zzajh.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzx();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzajh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u001e\u0004\u0003\u0002\u0005\u0007\u0003", new Object[]{"zzf", "zzahz", "zzaia", "zzaib", zzmy.zzd(), "zzahx", "zzajg"});
                case 4:
                    return zzajh;
                case 5:
                    zzwr<zzx> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzx.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzajh);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzx zzx = new zzx();
            zzajh = zzx;
            zzux.zza(zzx.class, zzx);
        }
    }

    public static final class zzy extends zzux<zzy, zza> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzy zzajo;
        private static volatile zzwr<zzy> zzj;
        private long zzaji;
        private long zzajj;
        private long zzajk;
        private long zzajl;
        private long zzajm;
        private long zzajn;
        private int zzf;

        private zzy() {
        }

        public static final class zza extends zzux.zza<zzy, zza> implements zzwk {
            private zza() {
                super(zzy.zzajo);
            }

            /* synthetic */ zza(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzy();
                case 2:
                    return new zza((zzmp) null);
                case 3:
                    return zza((zzwi) zzajo, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0003\u0000\u0002\u0003\u0001\u0003\u0003\u0002\u0004\u0003\u0003\u0005\u0003\u0004\u0006\u0003\u0005", new Object[]{"zzf", "zzaji", "zzajj", "zzajk", "zzajl", "zzajm", "zzajn"});
                case 4:
                    return zzajo;
                case 5:
                    zzwr<zzy> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzy.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzajo);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzy zzy = new zzy();
            zzajo = zzy;
            zzux.zza(zzy.class, zzy);
        }
    }

    public static final class zzz extends zzux<zzz, zzb> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzz zzanx;
        private static volatile zzwr<zzz> zzj;
        private int zzanr;
        private int zzans;
        private int zzant;
        private int zzanu;
        private boolean zzanv;
        private float zzanw;
        private int zzf;

        public enum zza implements zzuz {
            UNKNOWN_CLASSIFICATIONS(0),
            NO_CLASSIFICATIONS(1),
            ALL_CLASSIFICATIONS(2);
            
            private static final zzvc<zza> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zza zzav(int i) {
                if (i == 0) {
                    return UNKNOWN_CLASSIFICATIONS;
                }
                if (i == 1) {
                    return NO_CLASSIFICATIONS;
                }
                if (i != 2) {
                    return null;
                }
                return ALL_CLASSIFICATIONS;
            }

            public static zzvb zzd() {
                return zzne.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zza(int i) {
                this.value = i;
            }

            static {
                zzq = new zznf();
            }
        }

        public enum zzc implements zzuz {
            UNKNOWN_CONTOURS(0),
            NO_CONTOURS(1),
            ALL_CONTOURS(2);
            
            private static final zzvc<zzc> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zzc zzaw(int i) {
                if (i == 0) {
                    return UNKNOWN_CONTOURS;
                }
                if (i == 1) {
                    return NO_CONTOURS;
                }
                if (i != 2) {
                    return null;
                }
                return ALL_CONTOURS;
            }

            public static zzvb zzd() {
                return zznh.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzq = new zzng();
            }
        }

        public enum zzd implements zzuz {
            UNKNOWN_LANDMARKS(0),
            NO_LANDMARKS(1),
            ALL_LANDMARKS(2);
            
            private static final zzvc<zzd> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zzd zzax(int i) {
                if (i == 0) {
                    return UNKNOWN_LANDMARKS;
                }
                if (i == 1) {
                    return NO_LANDMARKS;
                }
                if (i != 2) {
                    return null;
                }
                return ALL_LANDMARKS;
            }

            public static zzvb zzd() {
                return zzni.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zzd(int i) {
                this.value = i;
            }

            static {
                zzq = new zznj();
            }
        }

        public enum zze implements zzuz {
            UNKNOWN_PERFORMANCE(0),
            FAST(1),
            ACCURATE(2);
            
            private static final zzvc<zze> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zze zzay(int i) {
                if (i == 0) {
                    return UNKNOWN_PERFORMANCE;
                }
                if (i == 1) {
                    return FAST;
                }
                if (i != 2) {
                    return null;
                }
                return ACCURATE;
            }

            public static zzvb zzd() {
                return zznl.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zze(int i) {
                this.value = i;
            }

            static {
                zzq = new zznk();
            }
        }

        private zzz() {
        }

        public static final class zzb extends zzux.zza<zzz, zzb> implements zzwk {
            private zzb() {
                super(zzz.zzanx);
            }

            public final zzb zzb(zzd zzd) {
                zzta();
                ((zzz) this.zzbzq).zza(zzd);
                return this;
            }

            public final zzb zzb(zza zza) {
                zzta();
                ((zzz) this.zzbzq).zza(zza);
                return this;
            }

            public final zzb zzb(zze zze) {
                zzta();
                ((zzz) this.zzbzq).zza(zze);
                return this;
            }

            public final zzb zzb(zzc zzc) {
                zzta();
                ((zzz) this.zzbzq).zza(zzc);
                return this;
            }

            public final zzb zzz(boolean z) {
                zzta();
                ((zzz) this.zzbzq).zzy(z);
                return this;
            }

            public final zzb zzl(float f) {
                zzta();
                ((zzz) this.zzbzq).zzk(f);
                return this;
            }

            /* synthetic */ zzb(zzmp zzmp) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzd zzd2) {
            if (zzd2 != null) {
                this.zzf |= 1;
                this.zzanr = zzd2.zzb();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zza zza2) {
            if (zza2 != null) {
                this.zzf |= 2;
                this.zzans = zza2.zzb();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zze zze2) {
            if (zze2 != null) {
                this.zzf |= 4;
                this.zzant = zze2.zzb();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzc zzc2) {
            if (zzc2 != null) {
                this.zzf |= 8;
                this.zzanu = zzc2.zzb();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzy(boolean z) {
            this.zzf |= 16;
            this.zzanv = z;
        }

        /* access modifiers changed from: private */
        public final void zzk(float f) {
            this.zzf |= 32;
            this.zzanw = f;
        }

        public static zzb zzkv() {
            return (zzb) zzanx.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzmp.zzk[i - 1]) {
                case 1:
                    return new zzz();
                case 2:
                    return new zzb((zzmp) null);
                case 3:
                    return zza((zzwi) zzanx, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\u0007\u0004\u0006\u0001\u0005", new Object[]{"zzf", "zzanr", zzd.zzd(), "zzans", zza.zzd(), "zzant", zze.zzd(), "zzanu", zzc.zzd(), "zzanv", "zzanw"});
                case 4:
                    return zzanx;
                case 5:
                    zzwr<zzz> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzz.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzanx);
                                zzj = zzwr;
                            }
                        }
                    }
                    return zzwr;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzz zzz = new zzz();
            zzanx = zzz;
            zzux.zza(zzz.class, zzz);
        }
    }
}
