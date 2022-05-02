package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class zzgm extends zzec {
    /* access modifiers changed from: private */
    public final zzkn zza;
    private Boolean zzb;
    private String zzc = null;

    public zzgm(zzkn zzkn, String str) {
        Preconditions.checkNotNull(zzkn);
        this.zza = zzkn;
    }

    @BinderThread
    private final void zzA(zzp zzp, boolean z) {
        Preconditions.checkNotNull(zzp);
        Preconditions.checkNotEmpty(zzp.zza);
        zzB(zzp.zza, false);
        this.zza.zzq().zzA(zzp.zzb, zzp.zzq, zzp.zzu);
    }

    @BinderThread
    private final void zzB(String str, boolean z) {
        boolean z2;
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1726140319, oncanceled);
            onCancelLoad.getMin(-1726140319, oncanceled);
        }
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.zzb == null) {
                        if (!"com.google.android.gms".equals(this.zzc) && !UidVerifier.isGooglePlayServicesUid(this.zza.zzax(), Binder.getCallingUid())) {
                            if (!GoogleSignatureVerifier.getInstance(this.zza.zzax()).isUidGoogleSigned(Binder.getCallingUid())) {
                                z2 = false;
                                this.zzb = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.zzb = Boolean.valueOf(z2);
                    }
                    if (this.zzb.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.zza.zzau().zzb().zzb("Measurement Service called with invalid calling package. appId", zzem.zzl(str));
                    throw e;
                }
            }
            if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzax(), Binder.getCallingUid(), str)) {
                this.zzc = str;
            }
            if (!str.equals(this.zzc)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.zza.zzau().zzb().zza("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* access modifiers changed from: private */
    public final void zzz(zzas zzas, zzp zzp) {
        this.zza.zzG();
        this.zza.zzy(zzas, zzp);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzas zzas, zzp zzp) {
        if (!this.zza.zzf().zzh(zzp.zza)) {
            zzz(zzas, zzp);
            return;
        }
        this.zza.zzau().zzk().zzb("EES config found for", zzp.zza);
        zzfl zzf = this.zza.zzf();
        String str = zzp.zza;
        zzpt.zzb();
        zzc zzc2 = null;
        if (zzf.zzs.zzc().zzn((String) null, zzea.zzaD) && !TextUtils.isEmpty(str)) {
            zzc2 = zzf.zza.get(str);
        }
        if (zzc2 != null) {
            try {
                Bundle zzf2 = zzas.zzb.zzf();
                HashMap hashMap = new HashMap();
                for (String str2 : zzf2.keySet()) {
                    Object obj = zzf2.get(str2);
                    if (obj != null) {
                        hashMap.put(str2, obj);
                    }
                }
                String zza2 = zzgr.zza(zzas.zza);
                if (zza2 == null) {
                    zza2 = zzas.zza;
                }
                if (zzc2.zzb(new zzaa(zza2, zzas.zzd, hashMap))) {
                    if (zzc2.zzc()) {
                        this.zza.zzau().zzk().zzb("EES edited event", zzas.zza);
                        zzz(zzkp.zzx(zzc2.zze().zzc()), zzp);
                    } else {
                        zzz(zzas, zzp);
                    }
                    if (zzc2.zzd()) {
                        for (zzaa next : zzc2.zze().zzf()) {
                            this.zza.zzau().zzk().zzb("EES logging created event", next.zzb());
                            zzz(zzkp.zzx(next), zzp);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd unused) {
                this.zza.zzau().zzb().zzc("EES error. appId, eventName", zzp.zzb, zzas.zza);
            }
            this.zza.zzau().zzk().zzb("EES was not applied to event", zzas.zza);
            zzz(zzas, zzp);
            return;
        }
        this.zza.zzau().zzk().zzb("EES not loaded for", zzp.zza);
        zzz(zzas, zzp);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final zzas zzc(zzas zzas, zzp zzp) {
        zzaq zzaq;
        if (!(!Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzas.zza) || (zzaq = zzas.zzb) == null || zzaq.zze() == 0)) {
            String zzd = zzas.zzb.zzd("_cis");
            if ("referrer broadcast".equals(zzd) || "referrer API".equals(zzd)) {
                this.zza.zzau().zzi().zzb("Event has been filtered ", zzas.toString());
                return new zzas("_cmpx", zzas.zzb, zzas.zzc, zzas.zzd);
            }
        }
        return zzas;
    }

    @BinderThread
    public final void zzd(zzas zzas, zzp zzp) {
        Preconditions.checkNotNull(zzas);
        zzA(zzp, false);
        zzv(new zzgf(this, zzas, zzp));
    }

    @BinderThread
    public final void zze(zzkq zzkq, zzp zzp) {
        Preconditions.checkNotNull(zzkq);
        zzA(zzp, false);
        zzv(new zzgi(this, zzkq, zzp));
    }

    @BinderThread
    public final void zzf(zzp zzp) {
        zzA(zzp, false);
        zzv(new zzgk(this, zzp));
    }

    @BinderThread
    public final void zzg(zzas zzas, String str, String str2) {
        Preconditions.checkNotNull(zzas);
        Preconditions.checkNotEmpty(str);
        zzB(str, true);
        zzv(new zzgg(this, zzas, str));
    }

    @BinderThread
    public final void zzh(zzp zzp) {
        zzA(zzp, false);
        zzv(new zzgd(this, zzp));
    }

    @BinderThread
    public final List<zzkq> zzi(zzp zzp, boolean z) {
        zzA(zzp, false);
        String str = zzp.zza;
        Preconditions.checkNotNull(str);
        try {
            List<zzks> list = (List) this.zza.zzav().zze(new zzgj(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzks zzks : list) {
                if (z || !zzku.zzR(zzks.zzc)) {
                    arrayList.add(new zzkq(zzks));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzau().zzb().zzc("Failed to get user properties. appId", zzem.zzl(zzp.zza), e);
            return null;
        }
    }

    @BinderThread
    public final byte[] zzj(zzas zzas, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzas);
        zzB(str, true);
        this.zza.zzau().zzj().zzb("Log and bundle. event", this.zza.zzo().zzc(zzas.zza));
        long nanoTime = this.zza.zzay().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zza.zzav().zzf(new zzgh(this, zzas, str)).get();
            if (bArr == null) {
                this.zza.zzau().zzb().zzb("Log and bundle returned null. appId", zzem.zzl(str));
                bArr = new byte[0];
            }
            this.zza.zzau().zzj().zzd("Log and bundle processed. event, size, time_ms", this.zza.zzo().zzc(zzas.zza), Integer.valueOf(bArr.length), Long.valueOf((this.zza.zzay().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzau().zzb().zzd("Failed to log and bundle. appId, event, error", zzem.zzl(str), this.zza.zzo().zzc(zzas.zza), e);
            return null;
        }
    }

    @BinderThread
    public final void zzk(long j, String str, String str2, String str3) {
        zzv(new zzgl(this, str2, str3, str, j));
    }

    @BinderThread
    public final String zzl(zzp zzp) {
        zzA(zzp, false);
        return this.zza.zzU(zzp);
    }

    @BinderThread
    public final void zzm(zzaa zzaa, zzp zzp) {
        Preconditions.checkNotNull(zzaa);
        Preconditions.checkNotNull(zzaa.zzc);
        zzA(zzp, false);
        zzaa zzaa2 = new zzaa(zzaa);
        zzaa2.zza = zzp.zza;
        zzv(new zzfw(this, zzaa2, zzp));
    }

    @BinderThread
    public final void zzn(zzaa zzaa) {
        Preconditions.checkNotNull(zzaa);
        Preconditions.checkNotNull(zzaa.zzc);
        Preconditions.checkNotEmpty(zzaa.zza);
        zzB(zzaa.zza, true);
        zzv(new zzfx(this, new zzaa(zzaa)));
    }

    @BinderThread
    public final List<zzkq> zzo(String str, String str2, boolean z, zzp zzp) {
        zzA(zzp, false);
        String str3 = zzp.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<zzks> list = (List) this.zza.zzav().zze(new zzfy(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzks zzks : list) {
                if (z || !zzku.zzR(zzks.zzc)) {
                    arrayList.add(new zzkq(zzks));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzau().zzb().zzc("Failed to query user properties. appId", zzem.zzl(zzp.zza), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    public final List<zzkq> zzp(String str, String str2, String str3, boolean z) {
        zzB(str, true);
        try {
            List<zzks> list = (List) this.zza.zzav().zze(new zzfz(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzks zzks : list) {
                if (z || !zzku.zzR(zzks.zzc)) {
                    arrayList.add(new zzkq(zzks));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzau().zzb().zzc("Failed to get user properties as. appId", zzem.zzl(str), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    public final List<zzaa> zzq(String str, String str2, zzp zzp) {
        zzA(zzp, false);
        String str3 = zzp.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.zza.zzav().zze(new zzga(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzau().zzb().zzb("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    public final List<zzaa> zzr(String str, String str2, String str3) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(633661844, oncanceled);
            onCancelLoad.getMin(633661844, oncanceled);
        }
        zzB(str, true);
        try {
            return (List) this.zza.zzav().zze(new zzgb(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzau().zzb().zzb("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    public final void zzs(zzp zzp) {
        Preconditions.checkNotEmpty(zzp.zza);
        zzB(zzp.zza, false);
        zzv(new zzgc(this, zzp));
    }

    @BinderThread
    public final void zzt(Bundle bundle, zzp zzp) {
        zzA(zzp, false);
        String str = zzp.zza;
        Preconditions.checkNotNull(str);
        zzv(new zzfv(this, str, bundle));
    }

    @BinderThread
    public final void zzu(zzp zzp) {
        Preconditions.checkNotEmpty(zzp.zza);
        Preconditions.checkNotNull(zzp.zzv);
        zzge zzge = new zzge(this, zzp);
        Preconditions.checkNotNull(zzge);
        if (this.zza.zzav().zzd()) {
            zzge.run();
        } else {
            this.zza.zzav().zzj(zzge);
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzv(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.zza.zzav().zzd()) {
            runnable.run();
        } else {
            this.zza.zzav().zzh(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzw(String str, Bundle bundle) {
        zzai zzi = this.zza.zzi();
        zzi.zzg();
        zzi.zzZ();
        byte[] zzbp = zzi.zzf.zzm().zzf(new zzan(zzi.zzs, "", str, "dep", 0, 0, bundle)).zzbp();
        zzi.zzs.zzau().zzk().zzc("Saving default event parameters, appId, data size", zzi.zzs.zzm().zzc(str), Integer.valueOf(zzbp.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzbp);
        try {
            if (zzi.zze().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                zzi.zzs.zzau().zzb().zzb("Failed to insert default event parameters (got -1). appId", zzem.zzl(str));
            }
        } catch (SQLiteException e) {
            zzi.zzs.zzau().zzb().zzc("Error storing default event parameters. appId", zzem.zzl(str), e);
        }
    }
}
