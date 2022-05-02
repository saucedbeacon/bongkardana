package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzux;
import com.j256.ormlite.stmt.query.SimpleComparison;
import kotlin.text.Typography;

public final class zzro {

    public static final class zza extends zzux<zza, C0093zza> implements zzwk {
        private static final zzvg<Integer, zztf> zzblx = new zzrp();
        /* access modifiers changed from: private */
        public static final zza zzbly;
        private static volatile zzwr<zza> zzj;
        private zzvd zzblw = zzti();

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.firebase_ml.zzro$zza$zza  reason: collision with other inner class name */
        public static final class C0093zza extends zzux.zza<zza, C0093zza> implements zzwk {
            private C0093zza() {
                super(zza.zzbly);
            }

            public final C0093zza zzz(Iterable<? extends zztf> iterable) {
                zzta();
                ((zza) this.zzbzq).zzy(iterable);
                return this;
            }

            /* synthetic */ C0093zza(zzrn zzrn) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzy(Iterable<? extends zztf> iterable) {
            if (!this.zzblw.zzru()) {
                this.zzblw = zzux.zza(this.zzblw);
            }
            for (zztf zzb : iterable) {
                this.zzblw.zzdm(zzb.zzb());
            }
        }

        public static C0093zza zzqg() {
            return (C0093zza) zzbly.zztg();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzrn.zzk[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0093zza((zzrn) null);
                case 3:
                    return zza((zzwi) zzbly, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzblw", zztf.zzd()});
                case 4:
                    return zzbly;
                case 5:
                    zzwr<zza> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zza.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzbly);
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
            zzbly = zza;
            zzux.zza(zza.class, zza);
        }
    }

    public static final class zzb extends zzux<zzb, C0094zzb> implements zzwk {
        /* access modifiers changed from: private */
        public static final zzb zzbmd;
        private static volatile zzwr<zzb> zzj;
        private float zzanw;
        private int zzblz;
        private int zzbma;
        private boolean zzbmb;
        private boolean zzbmc;
        private int zzf;
        private int zzlm;

        public enum zza implements zzuz {
            CLASSIFICATION_UNKNOWN(0),
            CLASSIFICATION_NONE(1),
            CLASSIFICATION_ALL(2);
            
            private static final zzvc<zza> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zza zzca(int i) {
                if (i == 0) {
                    return CLASSIFICATION_UNKNOWN;
                }
                if (i == 1) {
                    return CLASSIFICATION_NONE;
                }
                if (i != 2) {
                    return null;
                }
                return CLASSIFICATION_ALL;
            }

            public static zzvb zzd() {
                return zzrq.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zza(int i) {
                this.value = i;
            }

            static {
                zzq = new zzrr();
            }
        }

        public enum zzc implements zzuz {
            LANDMARK_UNKNOWN(0),
            LANDMARK_NONE(1),
            LANDMARK_ALL(2),
            LANDMARK_CONTOUR(3);
            
            private static final zzvc<zzc> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zzc zzcb(int i) {
                if (i == 0) {
                    return LANDMARK_UNKNOWN;
                }
                if (i == 1) {
                    return LANDMARK_NONE;
                }
                if (i == 2) {
                    return LANDMARK_ALL;
                }
                if (i != 3) {
                    return null;
                }
                return LANDMARK_CONTOUR;
            }

            public static zzvb zzd() {
                return zzrt.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzq = new zzrs();
            }
        }

        public enum zzd implements zzuz {
            MODE_UNKNOWN(0),
            MODE_ACCURATE(1),
            MODE_FAST(2),
            MODE_SELFIE(3);
            
            private static final zzvc<zzd> zzq = null;
            private final int value;

            public final int zzb() {
                return this.value;
            }

            public static zzd zzcc(int i) {
                if (i == 0) {
                    return MODE_UNKNOWN;
                }
                if (i == 1) {
                    return MODE_ACCURATE;
                }
                if (i == 2) {
                    return MODE_FAST;
                }
                if (i != 3) {
                    return null;
                }
                return MODE_SELFIE;
            }

            public static zzvb zzd() {
                return zzru.zzab;
            }

            public final String toString() {
                return SimpleComparison.LESS_THAN_OPERATION + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            private zzd(int i) {
                this.value = i;
            }

            static {
                zzq = new zzrv();
            }
        }

        private zzb() {
        }

        /* renamed from: com.google.android.gms.internal.firebase_ml.zzro$zzb$zzb  reason: collision with other inner class name */
        public static final class C0094zzb extends zzux.zza<zzb, C0094zzb> implements zzwk {
            private C0094zzb() {
                super(zzb.zzbmd);
            }

            /* synthetic */ C0094zzb(zzrn zzrn) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzrn.zzk[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new C0094zzb((zzrn) null);
                case 3:
                    return zza((zzwi) zzbmd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0001\u0005", new Object[]{"zzf", "zzlm", zzd.zzd(), "zzblz", zzc.zzd(), "zzbma", zza.zzd(), "zzbmb", "zzbmc", "zzanw"});
                case 4:
                    return zzbmd;
                case 5:
                    zzwr<zzb> zzwr = zzj;
                    if (zzwr == null) {
                        synchronized (zzb.class) {
                            zzwr = zzj;
                            if (zzwr == null) {
                                zzwr = new zzux.zzc<>(zzbmd);
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
            zzbmd = zzb;
            zzux.zza(zzb.class, zzb);
        }
    }
}
