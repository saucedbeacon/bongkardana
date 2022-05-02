package com.google.android.gms.measurement.internal;

import android.util.Log;

final class zzej implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzem zzf;

    zzej(zzem zzem, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzem;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    public final void run() {
        zzfb zzd2 = this.zzf.zzs.zzd();
        if (zzd2.zzu()) {
            if (this.zzf.zza == 0) {
                if (this.zzf.zzs.zzc().zzh()) {
                    zzem zzem = this.zzf;
                    zzem.zzs.zzat();
                    char unused = zzem.zza = 'C';
                } else {
                    zzem zzem2 = this.zzf;
                    zzem2.zzs.zzat();
                    char unused2 = zzem2.zza = 'c';
                }
            }
            if (this.zzf.zzb < 0) {
                zzem zzem3 = this.zzf;
                zzem3.zzs.zzc().zzf();
                long unused3 = zzem3.zzb = 42004;
            }
            char charAt = "01VDIWEA?".charAt(this.zza);
            char zzq = this.zzf.zza;
            long zzs = this.zzf.zzb;
            String zzo = zzem.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
            StringBuilder sb = new StringBuilder(String.valueOf(zzo).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(zzq);
            sb.append(zzs);
            sb.append(":");
            sb.append(zzo);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.zzb.substring(0, 1024);
            }
            zzez zzez = zzd2.zzb;
            if (zzez != null) {
                zzez.zza(sb2, 1);
                return;
            }
            return;
        }
        Log.println(6, this.zzf.zzn(), "Persisted config not initialized. Not logging error/warn");
    }
}
