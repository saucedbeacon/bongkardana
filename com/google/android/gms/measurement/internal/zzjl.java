package com.google.android.gms.measurement.internal;

import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

public final class zzjl extends zzke {
    public final zzey zza;
    public final zzey zzb;
    public final zzey zzc;
    public final zzey zzd;
    public final zzey zze;
    private String zzg;
    private boolean zzh;
    private long zzi;

    zzjl(zzkn zzkn) {
        super(zzkn);
        zzfb zzd2 = this.zzs.zzd();
        zzd2.getClass();
        this.zza = new zzey(zzd2, "last_delete_stale", 0);
        zzfb zzd3 = this.zzs.zzd();
        zzd3.getClass();
        this.zzb = new zzey(zzd3, "backoff", 0);
        zzfb zzd4 = this.zzs.zzd();
        zzd4.getClass();
        this.zzc = new zzey(zzd4, "last_upload", 0);
        zzfb zzd5 = this.zzs.zzd();
        zzd5.getClass();
        this.zzd = new zzey(zzd5, "last_upload_attempt", 0);
        zzfb zzd6 = this.zzs.zzd();
        zzd6.getClass();
        this.zze = new zzey(zzd6, "midnight_offset", 0);
    }

    /* access modifiers changed from: protected */
    public final boolean zzaA() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final Pair<String, Boolean> zzc(String str, zzaf zzaf) {
        if (zzaf.zzf()) {
            return zzd(str);
        }
        return new Pair<>("", false);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @Deprecated
    public final Pair<String, Boolean> zzd(String str) {
        zzg();
        long elapsedRealtime = this.zzs.zzay().elapsedRealtime();
        String str2 = this.zzg;
        if (str2 != null && elapsedRealtime < this.zzi) {
            return new Pair<>(str2, Boolean.valueOf(this.zzh));
        }
        this.zzi = elapsedRealtime + this.zzs.zzc().zzj(str, zzea.zza);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzax());
            this.zzg = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.zzg = id2;
            }
            this.zzh = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            this.zzs.zzau().zzj().zzb("Unable to get advertising id", e);
            this.zzg = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.zzg, Boolean.valueOf(this.zzh));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @Deprecated
    public final String zzf(String str) {
        zzg();
        String str2 = (String) zzd(str).first;
        MessageDigest zzN = zzku.zzN();
        if (zzN == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, zzN.digest(str2.getBytes()))});
    }
}
