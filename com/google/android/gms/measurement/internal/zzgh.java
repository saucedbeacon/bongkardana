package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzov;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

final class zzgh implements Callable<byte[]> {
    final /* synthetic */ zzas zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgm zzc;

    zzgh(zzgm zzgm, zzas zzas, String str) {
        this.zzc = zzgm;
        this.zza = zzas;
        this.zzb = str;
    }

    public final /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        zzkn zzkn;
        zzks zzks;
        Bundle bundle;
        zzft zzft;
        String str;
        zzfv zzfv;
        zzg zzg;
        Object obj;
        long j;
        zzao zzao;
        this.zzc.zza.zzG();
        zzib zzl = this.zzc.zza.zzl();
        zzas zzas = this.zza;
        String str2 = this.zzb;
        zzl.zzg();
        zzfu.zzP();
        Preconditions.checkNotNull(zzas);
        Preconditions.checkNotEmpty(str2);
        if (!zzl.zzs.zzc().zzn(str2, zzea.zzU)) {
            zzl.zzs.zzau().zzj().zzb("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if ("_iap".equals(zzas.zza) || "_iapx".equals(zzas.zza)) {
            zzft zzc2 = zzfu.zzc();
            zzl.zzf.zzi().zzb();
            zzg zzs = zzl.zzf.zzi().zzs(str2);
            if (zzs == null) {
                zzl.zzs.zzau().zzj().zzb("Log and bundle not available. package_name", str2);
                bArr = new byte[0];
                zzkn = zzl.zzf;
            } else if (!zzs.zzF()) {
                zzl.zzs.zzau().zzj().zzb("Log and bundle disabled. package_name", str2);
                bArr = new byte[0];
                zzkn = zzl.zzf;
            } else {
                zzfv zzaj = zzfw.zzaj();
                zzaj.zza(1);
                zzaj.zzA("android");
                if (!TextUtils.isEmpty(zzs.zzc())) {
                    zzaj.zzH(zzs.zzc());
                }
                if (!TextUtils.isEmpty(zzs.zzx())) {
                    zzaj.zzF((String) Preconditions.checkNotNull(zzs.zzx()));
                }
                if (!TextUtils.isEmpty(zzs.zzt())) {
                    zzaj.zzI((String) Preconditions.checkNotNull(zzs.zzt()));
                }
                if (zzs.zzv() != -2147483648L) {
                    zzaj.zzab((int) zzs.zzv());
                }
                zzaj.zzJ(zzs.zzz());
                zzaj.zzal(zzs.zzD());
                String zzf = zzs.zzf();
                String zzh = zzs.zzh();
                zzov.zzb();
                if (zzl.zzs.zzc().zzn(zzs.zzc(), zzea.zzag)) {
                    String zzj = zzs.zzj();
                    if (!TextUtils.isEmpty(zzf)) {
                        zzaj.zzW(zzf);
                    } else if (!TextUtils.isEmpty(zzj)) {
                        zzaj.zzao(zzj);
                    } else if (!TextUtils.isEmpty(zzh)) {
                        zzaj.zzai(zzh);
                    }
                } else if (!TextUtils.isEmpty(zzf)) {
                    zzaj.zzW(zzf);
                } else if (!TextUtils.isEmpty(zzh)) {
                    zzaj.zzai(zzh);
                }
                zzaf zzt = zzl.zzf.zzt(str2);
                zzaj.zzR(zzs.zzB());
                if (zzl.zzs.zzF() && zzl.zzs.zzc().zzw(zzaj.zzG()) && zzt.zzf() && !TextUtils.isEmpty((CharSequence) null)) {
                    zzaj.zzaf((String) null);
                }
                zzaj.zzap(zzt.zzd());
                if (zzt.zzf()) {
                    Pair<String, Boolean> zzc3 = zzl.zzf.zzn().zzc(zzs.zzc(), zzt);
                    if (zzs.zzaf() && !TextUtils.isEmpty((CharSequence) zzc3.first)) {
                        try {
                            zzaj.zzL(zzib.zzc((String) zzc3.first, Long.toString(zzas.zzd)));
                            if (zzc3.second != null) {
                                zzaj.zzN(((Boolean) zzc3.second).booleanValue());
                            }
                        } catch (SecurityException e) {
                            zzl.zzs.zzau().zzj().zzb("Resettable device id encryption failed", e.getMessage());
                            bArr = new byte[0];
                            zzkn = zzl.zzf;
                        } catch (Throwable th) {
                            zzl.zzf.zzi().zzd();
                            throw th;
                        }
                    }
                }
                zzl.zzs.zzz().zzv();
                zzaj.zzC(Build.MODEL);
                zzl.zzs.zzz().zzv();
                zzaj.zzB(Build.VERSION.RELEASE);
                zzaj.zzE((int) zzl.zzs.zzz().zzb());
                zzaj.zzD(zzl.zzs.zzz().zzc());
                try {
                    if (zzt.zzh() && zzs.zzd() != null) {
                        zzaj.zzP(zzib.zzc((String) Preconditions.checkNotNull(zzs.zzd()), Long.toString(zzas.zzd)));
                    }
                    if (!TextUtils.isEmpty(zzs.zzn())) {
                        zzaj.zzaa((String) Preconditions.checkNotNull(zzs.zzn()));
                    }
                    String zzc4 = zzs.zzc();
                    List<zzks> zzl2 = zzl.zzf.zzi().zzl(zzc4);
                    Iterator<zzks> it = zzl2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zzks = null;
                            break;
                        }
                        zzks = it.next();
                        if ("_lte".equals(zzks.zzc)) {
                            break;
                        }
                    }
                    if (zzks == null || zzks.zze == null) {
                        zzks zzks2 = new zzks(zzc4, "auto", "_lte", zzl.zzs.zzay().currentTimeMillis(), 0L);
                        zzl2.add(zzks2);
                        zzl.zzf.zzi().zzj(zzks2);
                    }
                    zzkp zzm = zzl.zzf.zzm();
                    zzm.zzs.zzau().zzk().zza("Checking account type status for ad personalization signals");
                    if (zzm.zzs.zzz().zzf()) {
                        String zzc5 = zzs.zzc();
                        Preconditions.checkNotNull(zzc5);
                        if (zzs.zzaf() && zzm.zzf.zzf().zzf(zzc5)) {
                            zzm.zzs.zzau().zzj().zza("Turning off ad personalization due to account type");
                            Iterator<zzks> it2 = zzl2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if ("_npa".equals(it2.next().zzc)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            zzl2.add(new zzks(zzc5, "auto", "_npa", zzm.zzs.zzay().currentTimeMillis(), 1L));
                        }
                    }
                    com.google.android.gms.internal.measurement.zzgh[] zzghArr = new com.google.android.gms.internal.measurement.zzgh[zzl2.size()];
                    for (int i = 0; i < zzl2.size(); i++) {
                        zzgg zzj2 = com.google.android.gms.internal.measurement.zzgh.zzj();
                        zzj2.zzb(zzl2.get(i).zzc);
                        zzj2.zza(zzl2.get(i).zzd);
                        zzl.zzf.zzm().zzc(zzj2, zzl2.get(i).zze);
                        zzghArr[i] = (com.google.android.gms.internal.measurement.zzgh) zzj2.zzaA();
                    }
                    zzaj.zzp(Arrays.asList(zzghArr));
                    zzen zza2 = zzen.zza(zzas);
                    zzl.zzs.zzl().zzH(zza2.zzd, zzl.zzf.zzi().zzK(str2));
                    zzl.zzs.zzl().zzG(zza2, zzl.zzs.zzc().zzd(str2));
                    Bundle bundle2 = zza2.zzd;
                    bundle2.putLong("_c", 1);
                    zzl.zzs.zzau().zzj().zza("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1);
                    bundle2.putString("_o", zzas.zzc);
                    if (zzl.zzs.zzl().zzT(zzaj.zzG())) {
                        zzl.zzs.zzl().zzL(bundle2, "_dbg", 1L);
                        zzl.zzs.zzl().zzL(bundle2, "_r", 1L);
                    }
                    zzao zzf2 = zzl.zzf.zzi().zzf(str2, zzas.zza);
                    if (zzf2 == null) {
                        zzfv = zzaj;
                        zzg = zzs;
                        zzft = zzc2;
                        str = str2;
                        bundle = bundle2;
                        obj = null;
                        zzao = new zzao(str2, zzas.zza, 0, 0, 0, zzas.zzd, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                        j = 0;
                    } else {
                        zzg = zzs;
                        zzft = zzc2;
                        str = str2;
                        bundle = bundle2;
                        zzfv = zzaj;
                        obj = null;
                        long j2 = zzf2.zzf;
                        zzao = zzf2.zza(zzas.zzd);
                        j = j2;
                    }
                    zzl.zzf.zzi().zzh(zzao);
                    zzan zzan = new zzan(zzl.zzs, zzas.zzc, str, zzas.zza, zzas.zzd, j, bundle);
                    zzfn zzk = zzfo.zzk();
                    zzk.zzo(zzan.zzd);
                    zzk.zzl(zzan.zzb);
                    zzk.zzq(zzan.zze);
                    zzap zzap = new zzap(zzan.zzf);
                    while (zzap.hasNext()) {
                        String zza3 = zzap.next();
                        zzfr zzn = zzfs.zzn();
                        zzn.zza(zza3);
                        Object zza4 = zzan.zzf.zza(zza3);
                        if (zza4 != null) {
                            zzl.zzf.zzm().zzd(zzn, zza4);
                            zzk.zzg(zzn);
                        }
                    }
                    zzfv zzfv2 = zzfv;
                    zzfv2.zzf(zzk);
                    zzfx zza5 = zzgb.zza();
                    zzfp zza6 = zzfq.zza();
                    zza6.zzb(zzao.zzc);
                    zza6.zza(zzas.zza);
                    zza5.zza(zza6);
                    zzfv2.zzaj(zza5);
                    zzfv2.zzY(zzl.zzf.zzk().zzb(zzg.zzc(), Collections.emptyList(), zzfv2.zzj(), Long.valueOf(zzk.zzn()), Long.valueOf(zzk.zzn())));
                    if (zzk.zzm()) {
                        zzfv2.zzt(zzk.zzn());
                        zzfv2.zzv(zzk.zzn());
                    }
                    long zzr = zzg.zzr();
                    if (zzr != 0) {
                        zzfv2.zzy(zzr);
                    }
                    long zzp = zzg.zzp();
                    if (zzp != 0) {
                        zzfv2.zzw(zzp);
                    } else if (zzr != 0) {
                        zzfv2.zzw(zzr);
                    }
                    zzg.zzN();
                    zzfv2.zzS((int) zzg.zzI());
                    zzl.zzs.zzc().zzf();
                    zzfv2.zzK(42004);
                    zzfv2.zzr(zzl.zzs.zzay().currentTimeMillis());
                    zzfv2.zzX(Boolean.TRUE.booleanValue());
                    zzft zzft2 = zzft;
                    zzft2.zzb(zzfv2);
                    zzg zzg2 = zzg;
                    zzg2.zzq(zzfv2.zzs());
                    zzg2.zzs(zzfv2.zzu());
                    zzl.zzf.zzi().zzt(zzg2);
                    zzl.zzf.zzi().zzc();
                    zzl.zzf.zzi().zzd();
                    try {
                        return zzl.zzf.zzm().zzs(((zzfu) zzft2.zzaA()).zzbp());
                    } catch (IOException e2) {
                        zzl.zzs.zzau().zzb().zzc("Data loss. Failed to bundle and serialize. appId", zzem.zzl(str), e2);
                        return obj;
                    }
                } catch (SecurityException e3) {
                    zzl.zzs.zzau().zzj().zzb("app instance id encryption failed", e3.getMessage());
                    bArr = new byte[0];
                    zzkn = zzl.zzf;
                }
            }
            zzkn.zzi().zzd();
            return bArr;
        } else {
            zzl.zzs.zzau().zzj().zzc("Generating a payload for this event is not available. package_name, event_name", str2, zzas.zza);
            return null;
        }
    }
}
