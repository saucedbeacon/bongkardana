package com.google.android.gms.internal.measurement;

import com.google.android.exoplayer2.C;
import java.util.List;

public final class zzfw extends zzkd<zzfw, zzfv> implements zzlj {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final zzfw zzaa;
    private String zzA = "";
    private long zzB;
    private int zzC;
    private String zzD = "";
    private String zzE = "";
    private boolean zzF;
    /* access modifiers changed from: private */
    public zzkk<zzfk> zzG = zzbE();
    private String zzH = "";
    private int zzI;
    private int zzJ;
    private int zzK;
    private String zzL = "";
    private long zzM;
    private long zzN;
    private String zzO = "";
    private String zzP = "";
    private int zzQ;
    private String zzR = "";
    private zzgb zzS;
    private zzki zzT = zzbB();
    private long zzU;
    private long zzV;
    private String zzW = "";
    private String zzX = "";
    private int zzY;
    private boolean zzZ;
    private int zze;
    private int zzf;
    private int zzg;
    /* access modifiers changed from: private */
    public zzkk<zzfo> zzh = zzbE();
    private zzkk<zzgh> zzi = zzbE();
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private int zzs;
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private long zzw;
    private long zzx;
    private String zzy = "";
    private boolean zzz;

    static {
        zzfw zzfw = new zzfw();
        zzaa = zzfw;
        zzkd.zzby(zzfw.class, zzfw);
    }

    private zzfw() {
    }

    static /* synthetic */ void zzaA(zzfw zzfw, long j) {
        zzfw.zze |= 32;
        zzfw.zzn = j;
    }

    static /* synthetic */ void zzaB(zzfw zzfw) {
        zzfw.zze &= -33;
        zzfw.zzn = 0;
    }

    static /* synthetic */ void zzaC(zzfw zzfw, String str) {
        zzfw.zze |= 64;
        zzfw.zzo = "android";
    }

    static /* synthetic */ void zzaD(zzfw zzfw, String str) {
        str.getClass();
        zzfw.zze |= 128;
        zzfw.zzp = str;
    }

    static /* synthetic */ void zzaE(zzfw zzfw, String str) {
        str.getClass();
        zzfw.zze |= 256;
        zzfw.zzq = str;
    }

    static /* synthetic */ void zzaF(zzfw zzfw, String str) {
        str.getClass();
        zzfw.zze |= 512;
        zzfw.zzr = str;
    }

    static /* synthetic */ void zzaG(zzfw zzfw, int i) {
        zzfw.zze |= 1024;
        zzfw.zzs = i;
    }

    static /* synthetic */ void zzaH(zzfw zzfw, String str) {
        str.getClass();
        zzfw.zze |= 2048;
        zzfw.zzt = str;
    }

    static /* synthetic */ void zzaI(zzfw zzfw, String str) {
        str.getClass();
        zzfw.zze |= 4096;
        zzfw.zzu = str;
    }

    static /* synthetic */ void zzaJ(zzfw zzfw, String str) {
        str.getClass();
        zzfw.zze |= 8192;
        zzfw.zzv = str;
    }

    static /* synthetic */ void zzaK(zzfw zzfw, long j) {
        zzfw.zze |= 16384;
        zzfw.zzw = j;
    }

    static /* synthetic */ void zzaL(zzfw zzfw, long j) {
        zzfw.zze |= 32768;
        zzfw.zzx = 42004;
    }

    static /* synthetic */ void zzaM(zzfw zzfw, String str) {
        str.getClass();
        zzfw.zze |= 65536;
        zzfw.zzy = str;
    }

    static /* synthetic */ void zzaN(zzfw zzfw) {
        zzfw.zze &= -65537;
        zzfw.zzy = zzaa.zzy;
    }

    static /* synthetic */ void zzaO(zzfw zzfw, boolean z) {
        zzfw.zze |= 131072;
        zzfw.zzz = z;
    }

    static /* synthetic */ void zzaP(zzfw zzfw) {
        zzfw.zze &= -131073;
        zzfw.zzz = false;
    }

    static /* synthetic */ void zzaQ(zzfw zzfw, String str) {
        str.getClass();
        zzfw.zze |= 262144;
        zzfw.zzA = str;
    }

    static /* synthetic */ void zzaR(zzfw zzfw) {
        zzfw.zze &= -262145;
        zzfw.zzA = zzaa.zzA;
    }

    static /* synthetic */ void zzaS(zzfw zzfw, long j) {
        zzfw.zze |= 524288;
        zzfw.zzB = j;
    }

    static /* synthetic */ void zzaT(zzfw zzfw, int i) {
        zzfw.zze |= 1048576;
        zzfw.zzC = i;
    }

    static /* synthetic */ void zzaU(zzfw zzfw, String str) {
        zzfw.zze |= 2097152;
        zzfw.zzD = str;
    }

    static /* synthetic */ void zzaV(zzfw zzfw) {
        zzfw.zze &= -2097153;
        zzfw.zzD = zzaa.zzD;
    }

    static /* synthetic */ void zzaW(zzfw zzfw, String str) {
        str.getClass();
        zzfw.zze |= 4194304;
        zzfw.zzE = str;
    }

    static /* synthetic */ void zzaX(zzfw zzfw, boolean z) {
        zzfw.zze |= 8388608;
        zzfw.zzF = z;
    }

    static /* synthetic */ void zzaY(zzfw zzfw, Iterable iterable) {
        zzkk<zzfk> zzkk = zzfw.zzG;
        if (!zzkk.zza()) {
            zzfw.zzG = zzkd.zzbF(zzkk);
        }
        zzio.zzbs(iterable, zzfw.zzG);
    }

    public static zzfv zzaj() {
        return (zzfv) zzaa.zzbt();
    }

    static /* synthetic */ void zzal(zzfw zzfw, int i) {
        zzfw.zze |= 1;
        zzfw.zzg = 1;
    }

    static /* synthetic */ void zzam(zzfw zzfw, int i, zzfo zzfo) {
        zzfo.getClass();
        zzfw.zzbI();
        zzfw.zzh.set(i, zzfo);
    }

    static /* synthetic */ void zzan(zzfw zzfw, zzfo zzfo) {
        zzfo.getClass();
        zzfw.zzbI();
        zzfw.zzh.add(zzfo);
    }

    static /* synthetic */ void zzao(zzfw zzfw, Iterable iterable) {
        zzfw.zzbI();
        zzio.zzbs(iterable, zzfw.zzh);
    }

    static /* synthetic */ void zzaq(zzfw zzfw, int i) {
        zzfw.zzbI();
        zzfw.zzh.remove(i);
    }

    static /* synthetic */ void zzar(zzfw zzfw, int i, zzgh zzgh) {
        zzgh.getClass();
        zzfw.zzbJ();
        zzfw.zzi.set(i, zzgh);
    }

    static /* synthetic */ void zzas(zzfw zzfw, zzgh zzgh) {
        zzgh.getClass();
        zzfw.zzbJ();
        zzfw.zzi.add(zzgh);
    }

    static /* synthetic */ void zzat(zzfw zzfw, Iterable iterable) {
        zzfw.zzbJ();
        zzio.zzbs(iterable, zzfw.zzi);
    }

    static /* synthetic */ void zzau(zzfw zzfw, int i) {
        zzfw.zzbJ();
        zzfw.zzi.remove(i);
    }

    static /* synthetic */ void zzav(zzfw zzfw, long j) {
        zzfw.zze |= 2;
        zzfw.zzj = j;
    }

    static /* synthetic */ void zzaw(zzfw zzfw, long j) {
        zzfw.zze |= 4;
        zzfw.zzk = j;
    }

    static /* synthetic */ void zzax(zzfw zzfw, long j) {
        zzfw.zze |= 8;
        zzfw.zzl = j;
    }

    static /* synthetic */ void zzay(zzfw zzfw, long j) {
        zzfw.zze |= 16;
        zzfw.zzm = j;
    }

    static /* synthetic */ void zzaz(zzfw zzfw) {
        zzfw.zze &= -17;
        zzfw.zzm = 0;
    }

    private final void zzbI() {
        zzkk<zzfo> zzkk = this.zzh;
        if (!zzkk.zza()) {
            this.zzh = zzkd.zzbF(zzkk);
        }
    }

    private final void zzbJ() {
        zzkk<zzgh> zzkk = this.zzi;
        if (!zzkk.zza()) {
            this.zzi = zzkd.zzbF(zzkk);
        }
    }

    static /* synthetic */ void zzba(zzfw zzfw, String str) {
        str.getClass();
        zzfw.zze |= C.DEFAULT_MUXED_BUFFER_SIZE;
        zzfw.zzH = str;
    }

    static /* synthetic */ void zzbb(zzfw zzfw, int i) {
        zzfw.zze |= 33554432;
        zzfw.zzI = i;
    }

    static /* synthetic */ void zzbc(zzfw zzfw) {
        zzfw.zze &= -268435457;
        zzfw.zzL = zzaa.zzL;
    }

    static /* synthetic */ void zzbd(zzfw zzfw, long j) {
        zzfw.zze |= C.ENCODING_PCM_A_LAW;
        zzfw.zzM = j;
    }

    static /* synthetic */ void zzbe(zzfw zzfw, long j) {
        zzfw.zze |= 1073741824;
        zzfw.zzN = j;
    }

    static /* synthetic */ void zzbf(zzfw zzfw) {
        zzfw.zze &= Integer.MAX_VALUE;
        zzfw.zzO = zzaa.zzO;
    }

    static /* synthetic */ void zzbg(zzfw zzfw, int i) {
        zzfw.zzf |= 2;
        zzfw.zzQ = i;
    }

    static /* synthetic */ void zzbh(zzfw zzfw, String str) {
        str.getClass();
        zzfw.zzf |= 4;
        zzfw.zzR = str;
    }

    static /* synthetic */ void zzbi(zzfw zzfw, zzgb zzgb) {
        zzgb.getClass();
        zzfw.zzS = zzgb;
        zzfw.zzf |= 8;
    }

    static /* synthetic */ void zzbj(zzfw zzfw, Iterable iterable) {
        zzki zzki = zzfw.zzT;
        if (!zzki.zza()) {
            int size = zzki.size();
            zzfw.zzT = zzki.zzf(size == 0 ? 10 : size + size);
        }
        zzio.zzbs(iterable, zzfw.zzT);
    }

    static /* synthetic */ void zzbk(zzfw zzfw, long j) {
        zzfw.zzf |= 16;
        zzfw.zzU = j;
    }

    static /* synthetic */ void zzbl(zzfw zzfw, long j) {
        zzfw.zzf |= 32;
        zzfw.zzV = j;
    }

    static /* synthetic */ void zzbm(zzfw zzfw, String str) {
        str.getClass();
        zzfw.zzf |= 64;
        zzfw.zzW = str;
    }

    static /* synthetic */ void zzbn(zzfw zzfw, String str) {
        str.getClass();
        zzfw.zzf |= 128;
        zzfw.zzX = str;
    }

    public final String zzA() {
        return this.zzu;
    }

    public final String zzB() {
        return this.zzv;
    }

    public final boolean zzC() {
        return (this.zze & 16384) != 0;
    }

    public final long zzD() {
        return this.zzw;
    }

    public final boolean zzE() {
        return (this.zze & 32768) != 0;
    }

    public final long zzF() {
        return this.zzx;
    }

    public final String zzG() {
        return this.zzy;
    }

    public final boolean zzH() {
        return (this.zze & 131072) != 0;
    }

    public final boolean zzI() {
        return this.zzz;
    }

    public final String zzJ() {
        return this.zzA;
    }

    public final boolean zzK() {
        return (this.zze & 524288) != 0;
    }

    public final long zzL() {
        return this.zzB;
    }

    public final boolean zzM() {
        return (this.zze & 1048576) != 0;
    }

    public final int zzN() {
        return this.zzC;
    }

    public final String zzO() {
        return this.zzD;
    }

    public final String zzP() {
        return this.zzE;
    }

    public final boolean zzQ() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean zzR() {
        return this.zzF;
    }

    public final List<zzfk> zzS() {
        return this.zzG;
    }

    public final String zzT() {
        return this.zzH;
    }

    public final boolean zzU() {
        return (this.zze & 33554432) != 0;
    }

    public final int zzV() {
        return this.zzI;
    }

    public final boolean zzW() {
        return (this.zze & C.ENCODING_PCM_A_LAW) != 0;
    }

    public final long zzX() {
        return this.zzM;
    }

    public final boolean zzY() {
        return (this.zze & 1073741824) != 0;
    }

    public final long zzZ() {
        return this.zzN;
    }

    public final boolean zza() {
        return (this.zze & 1) != 0;
    }

    public final String zzaa() {
        return this.zzO;
    }

    public final boolean zzab() {
        return (this.zzf & 2) != 0;
    }

    public final int zzac() {
        return this.zzQ;
    }

    public final String zzad() {
        return this.zzR;
    }

    public final boolean zzae() {
        return (this.zzf & 16) != 0;
    }

    public final long zzaf() {
        return this.zzU;
    }

    public final String zzag() {
        return this.zzW;
    }

    public final boolean zzah() {
        return (this.zzf & 128) != 0;
    }

    public final String zzai() {
        return this.zzX;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final List<zzfo> zzc() {
        return this.zzh;
    }

    public final int zzd() {
        return this.zzh.size();
    }

    public final zzfo zze(int i) {
        return (zzfo) this.zzh.get(i);
    }

    public final List<zzgh> zzf() {
        return this.zzi;
    }

    public final int zzg() {
        return this.zzi.size();
    }

    public final zzgh zzh(int i) {
        return (zzgh) this.zzi.get(i);
    }

    public final boolean zzi() {
        return (this.zze & 2) != 0;
    }

    public final long zzj() {
        return this.zzj;
    }

    public final boolean zzk() {
        return (this.zze & 4) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbz(zzaa, "\u0001.\u0000\u0002\u00017.\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)", new Object[]{"zze", "zzf", "zzg", "zzh", zzfo.class, "zzi", zzgh.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", zzfk.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", zzfi.zzb(), "zzZ"});
        } else if (i2 == 3) {
            return new zzfw();
        } else {
            if (i2 == 4) {
                return new zzfv((zzff) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzaa;
        }
    }

    public final long zzm() {
        return this.zzk;
    }

    public final boolean zzn() {
        return (this.zze & 8) != 0;
    }

    public final long zzo() {
        return this.zzl;
    }

    public final boolean zzp() {
        return (this.zze & 16) != 0;
    }

    public final long zzq() {
        return this.zzm;
    }

    public final boolean zzr() {
        return (this.zze & 32) != 0;
    }

    public final long zzs() {
        return this.zzn;
    }

    public final String zzt() {
        return this.zzo;
    }

    public final String zzu() {
        return this.zzp;
    }

    public final String zzv() {
        return this.zzq;
    }

    public final String zzw() {
        return this.zzr;
    }

    public final boolean zzx() {
        return (this.zze & 1024) != 0;
    }

    public final int zzy() {
        return this.zzs;
    }

    public final String zzz() {
        return this.zzt;
    }
}
