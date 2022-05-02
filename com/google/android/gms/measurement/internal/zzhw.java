package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzom;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.PlaybackStateCompat;

public final class zzhw extends zzf {
    @VisibleForTesting
    protected zzhv zza;
    final zzr zzb;
    @VisibleForTesting
    protected boolean zzc = true;
    private zzgu zzd;
    private final Set<zzgv> zze = new CopyOnWriteArraySet();
    private boolean zzf;
    private final AtomicReference<String> zzg = new AtomicReference<>();
    private final Object zzh = new Object();
    @GuardedBy("consentLock")
    private zzaf zzi = new zzaf((Boolean) null, (Boolean) null);
    @GuardedBy("consentLock")
    private int zzj = 100;
    private final AtomicLong zzk = new AtomicLong(0);
    private long zzl = -1;
    private int zzm = 100;
    private final zzkt zzn = new zzhl(this);

    protected zzhw(zzfu zzfu) {
        super(zzfu);
        this.zzb = new zzr(zzfu);
    }

    static /* synthetic */ void zzW(zzhw zzhw, zzaf zzaf, int i, long j, boolean z, boolean z2) {
        zzhw.zzg();
        zzhw.zzb();
        if (j > zzhw.zzl || !zzaf.zzm(zzhw.zzm, i)) {
            zzfb zzd2 = zzhw.zzs.zzd();
            zzfu zzfu = zzd2.zzs;
            zzd2.zzg();
            if (zzd2.zzh(i)) {
                SharedPreferences.Editor edit = zzd2.zzd().edit();
                edit.putString("consent_settings", zzaf.zzd());
                edit.putInt("consent_source", i);
                edit.apply();
                zzhw.zzl = j;
                zzhw.zzm = i;
                zzhw.zzs.zzy().zzj(z);
                if (z2) {
                    zzhw.zzs.zzy().zzv(new AtomicReference());
                    return;
                }
                return;
            }
            zzhw.zzs.zzau().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        zzhw.zzs.zzau().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzaf);
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zzY(Boolean bool, boolean z) {
        zzg();
        zzb();
        this.zzs.zzau().zzj().zzb("Setting app measurement enabled (FE)", bool);
        this.zzs.zzd().zze(bool);
        if (z) {
            zzfb zzd2 = this.zzs.zzd();
            zzfu zzfu = zzd2.zzs;
            zzd2.zzg();
            SharedPreferences.Editor edit = zzd2.zzd().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.zzs.zzI() || (bool != null && !bool.booleanValue())) {
            zzZ();
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zzZ() {
        zzg();
        String zza2 = this.zzs.zzd().zzh.zza();
        if (zza2 != null) {
            if ("unset".equals(zza2)) {
                zzB("app", "_npa", (Object) null, this.zzs.zzay().currentTimeMillis());
            } else {
                zzB("app", "_npa", Long.valueOf(true != SummaryActivity.CHECKED.equals(zza2) ? 0 : 1), this.zzs.zzay().currentTimeMillis());
            }
        }
        if (!this.zzs.zzF() || !this.zzc) {
            this.zzs.zzau().zzj().zza("Updating Scion state (FE)");
            this.zzs.zzy().zzi();
            return;
        }
        this.zzs.zzau().zzj().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzH();
        zzom.zzb();
        if (this.zzs.zzc().zzn((String) null, zzea.zzan)) {
            this.zzs.zzh().zza.zza();
        }
        this.zzs.zzav().zzh(new zzha(this));
    }

    /* access modifiers changed from: package-private */
    public final void zzA(String str, String str2, long j, Object obj) {
        this.zzs.zzav().zzh(new zzhd(this, str, str2, obj, j));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzB(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.zzg()
            r8.zzb()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0064
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0052
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0052
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L_0x0037
            r10 = 0
            goto L_0x0038
        L_0x0037:
            r10 = r2
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.zzfu r10 = r8.zzs
            com.google.android.gms.measurement.internal.zzfb r10 = r10.zzd()
            com.google.android.gms.measurement.internal.zzfa r10 = r10.zzh
            long r4 = r11.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x004e
            java.lang.String r0 = "true"
        L_0x004e:
            r10.zzb(r0)
            goto L_0x0061
        L_0x0052:
            if (r11 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.zzfu r10 = r8.zzs
            com.google.android.gms.measurement.internal.zzfb r10 = r10.zzd()
            com.google.android.gms.measurement.internal.zzfa r10 = r10.zzh
            java.lang.String r0 = "unset"
            r10.zzb(r0)
        L_0x0061:
            r6 = r11
            r3 = r1
            goto L_0x0066
        L_0x0064:
            r3 = r10
            r6 = r11
        L_0x0066:
            com.google.android.gms.measurement.internal.zzfu r10 = r8.zzs
            boolean r10 = r10.zzF()
            if (r10 != 0) goto L_0x007e
            com.google.android.gms.measurement.internal.zzfu r9 = r8.zzs
            com.google.android.gms.measurement.internal.zzem r9 = r9.zzau()
            com.google.android.gms.measurement.internal.zzek r9 = r9.zzk()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.zza(r10)
            return
        L_0x007e:
            com.google.android.gms.measurement.internal.zzfu r10 = r8.zzs
            boolean r10 = r10.zzL()
            if (r10 != 0) goto L_0x0087
            return
        L_0x0087:
            com.google.android.gms.measurement.internal.zzkq r10 = new com.google.android.gms.measurement.internal.zzkq
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzfu r9 = r8.zzs
            com.google.android.gms.measurement.internal.zzjk r9 = r9.zzy()
            r9.zzs(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhw.zzB(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final List<zzkq> zzC(boolean z) {
        zzb();
        this.zzs.zzau().zzk().zza("Getting user properties (FE)");
        if (!this.zzs.zzav().zzd()) {
            this.zzs.zzat();
            if (zzz.zza()) {
                this.zzs.zzau().zzb().zza("Cannot get all user properties from main thread");
                return Collections.emptyList();
            }
            AtomicReference atomicReference = new AtomicReference();
            this.zzs.zzav().zzi(atomicReference, 5000, "get user properties", new zzhe(this, atomicReference, z));
            List<zzkq> list = (List) atomicReference.get();
            if (list != null) {
                return list;
            }
            this.zzs.zzau().zzb().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyList();
        }
        this.zzs.zzau().zzb().zza("Cannot get all user properties from analytics worker thread");
        return Collections.emptyList();
    }

    public final String zzD() {
        return this.zzg.get();
    }

    /* access modifiers changed from: package-private */
    public final void zzE(String str) {
        this.zzg.set(str);
    }

    public final void zzF(long j) {
        this.zzg.set((Object) null);
        this.zzs.zzav().zzh(new zzhf(this, j));
    }

    /* access modifiers changed from: package-private */
    public final void zzG(long j, boolean z) {
        zzg();
        zzb();
        this.zzs.zzau().zzj().zza("Resetting analytics data (FE)");
        zzjz zzh2 = this.zzs.zzh();
        zzh2.zzg();
        zzjy zzjy = zzh2.zza;
        zzh2.zzb.zzc();
        boolean zzF = this.zzs.zzF();
        zzfb zzd2 = this.zzs.zzd();
        zzd2.zzc.zzb(j);
        if (!TextUtils.isEmpty(zzd2.zzs.zzd().zzo.zza())) {
            zzd2.zzo.zzb((String) null);
        }
        zzom.zzb();
        if (zzd2.zzs.zzc().zzn((String) null, zzea.zzan)) {
            zzd2.zzj.zzb(0);
        }
        if (!zzd2.zzs.zzc().zzr()) {
            zzd2.zzj(!zzF);
        }
        zzd2.zzp.zzb((String) null);
        zzd2.zzq.zzb(0);
        zzd2.zzr.zzb((Bundle) null);
        if (z) {
            this.zzs.zzy().zzu();
        }
        zzom.zzb();
        if (this.zzs.zzc().zzn((String) null, zzea.zzan)) {
            this.zzs.zzh().zza.zza();
        }
        this.zzc = !zzF;
    }

    @WorkerThread
    public final void zzH() {
        zzg();
        zzb();
        if (this.zzs.zzL()) {
            if (this.zzs.zzc().zzn((String) null, zzea.zzaa)) {
                zzae zzc2 = this.zzs.zzc();
                zzc2.zzs.zzat();
                Boolean zzp = zzc2.zzp("google_analytics_deferred_deep_link_enabled");
                if (zzp != null && zzp.booleanValue()) {
                    this.zzs.zzau().zzj().zza("Deferred Deep Link feature enabled.");
                    this.zzs.zzav().zzh(new zzgy(this));
                }
            }
            this.zzs.zzy().zzy();
            this.zzc = false;
            zzfb zzd2 = this.zzs.zzd();
            zzd2.zzg();
            String string = zzd2.zzd().getString("previous_os_version", (String) null);
            zzd2.zzs.zzz().zzv();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzd2.zzd().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.zzs.zzz().zzv();
                if (!string.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    zzs("auto", "_ou", bundle);
                }
            }
        }
    }

    @WorkerThread
    public final void zzI(zzgu zzgu) {
        zzgu zzgu2;
        zzg();
        zzb();
        if (!(zzgu == null || zzgu == (zzgu2 = this.zzd))) {
            Preconditions.checkState(zzgu2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzgu;
    }

    public final void zzJ(zzgv zzgv) {
        zzb();
        Preconditions.checkNotNull(zzgv);
        if (!this.zze.add(zzgv)) {
            this.zzs.zzau().zze().zza("OnEventListener already registered");
        }
    }

    public final void zzK(zzgv zzgv) {
        zzb();
        Preconditions.checkNotNull(zzgv);
        if (!this.zze.remove(zzgv)) {
            this.zzs.zzau().zze().zza("OnEventListener had not been registered");
        }
    }

    public final int zzL(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzs.zzc();
        return 25;
    }

    public final void zzM(Bundle bundle) {
        zzN(bundle, this.zzs.zzay().currentTimeMillis());
    }

    public final void zzN(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.zzs.zzau().zze().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgq.zzb(bundle2, "app_id", String.class, null);
        zzgq.zzb(bundle2, "origin", String.class, null);
        zzgq.zzb(bundle2, "name", String.class, null);
        zzgq.zzb(bundle2, "value", Object.class, null);
        zzgq.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgq.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgq.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgq.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgq.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgq.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgq.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgq.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgq.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.zzs.zzl().zzo(string) != 0) {
            this.zzs.zzau().zzb().zzb("Invalid conditional user property name", this.zzs.zzm().zze(string));
        } else if (this.zzs.zzl().zzJ(string, obj) == 0) {
            Object zzK = this.zzs.zzl().zzK(string, obj);
            if (zzK == null) {
                this.zzs.zzau().zzb().zzc("Unable to normalize conditional user property value", this.zzs.zzm().zze(string), obj);
                return;
            }
            zzgq.zza(bundle2, zzK);
            long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
            if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
                this.zzs.zzc();
                if (j2 > 15552000000L || j2 < 1) {
                    this.zzs.zzau().zzb().zzc("Invalid conditional user property timeout", this.zzs.zzm().zze(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
            this.zzs.zzc();
            if (j3 > 15552000000L || j3 < 1) {
                this.zzs.zzau().zzb().zzc("Invalid conditional user property time to live", this.zzs.zzm().zze(string), Long.valueOf(j3));
            } else {
                this.zzs.zzav().zzh(new zzhg(this, bundle2));
            }
        } else {
            this.zzs.zzau().zzb().zzc("Invalid conditional user property value", this.zzs.zzm().zze(string), obj);
        }
    }

    public final void zzO(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.zzs.zzay().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzs.zzav().zzh(new zzhh(this, bundle2));
    }

    public final ArrayList<Bundle> zzP(String str, String str2) {
        if (this.zzs.zzav().zzd()) {
            this.zzs.zzau().zzb().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        this.zzs.zzat();
        if (zzz.zza()) {
            this.zzs.zzau().zzb().zza("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzav().zzi(atomicReference, 5000, "get conditional user properties", new zzhj(this, atomicReference, (String) null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzku.zzak(list);
        }
        this.zzs.zzau().zzb().zzb("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList<>();
    }

    public final Map<String, Object> zzQ(String str, String str2, boolean z) {
        if (this.zzs.zzav().zzd()) {
            this.zzs.zzau().zzb().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.zzs.zzat();
        if (zzz.zza()) {
            this.zzs.zzau().zzb().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzav().zzi(atomicReference, 5000, "get user properties", new zzhk(this, atomicReference, (String) null, str, str2, z));
        List<zzkq> list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzau().zzb().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(list.size());
        for (zzkq zzkq : list) {
            Object zza2 = zzkq.zza();
            if (zza2 != null) {
                playbackStateCompat.put(zzkq.zzb, zza2);
            }
        }
        return playbackStateCompat;
    }

    public final String zzR() {
        zzid zzl2 = this.zzs.zzx().zzl();
        if (zzl2 != null) {
            return zzl2.zza;
        }
        return null;
    }

    public final String zzS() {
        zzid zzl2 = this.zzs.zzx().zzl();
        if (zzl2 != null) {
            return zzl2.zzb;
        }
        return null;
    }

    public final String zzT() {
        if (this.zzs.zzr() != null) {
            return this.zzs.zzr();
        }
        try {
            return zzic.zza(this.zzs.zzax(), "google_app_id", this.zzs.zzv());
        } catch (IllegalStateException e) {
            this.zzs.zzau().zzb().zzb("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzU(Bundle bundle) {
        if (bundle == null) {
            this.zzs.zzd().zzr.zzb(new Bundle());
            return;
        }
        Bundle zza2 = this.zzs.zzd().zzr.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzs.zzl().zzs(obj)) {
                    this.zzs.zzl().zzM(this.zzn, (String) null, 27, (String) null, (String) null, 0, this.zzs.zzc().zzn((String) null, zzea.zzaw));
                }
                this.zzs.zzau().zzh().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzku.zzR(str)) {
                this.zzs.zzau().zzh().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza2.remove(str);
            } else {
                zzku zzl2 = this.zzs.zzl();
                this.zzs.zzc();
                if (zzl2.zzt("param", str, 100, obj)) {
                    this.zzs.zzl().zzL(zza2, str, obj);
                }
            }
        }
        this.zzs.zzl();
        int zzc2 = this.zzs.zzc().zzc();
        if (zza2.size() > zzc2) {
            int i = 0;
            for (String str2 : new TreeSet(zza2.keySet())) {
                i++;
                if (i > zzc2) {
                    zza2.remove(str2);
                }
            }
            this.zzs.zzl().zzM(this.zzn, (String) null, 26, (String) null, (String) null, 0, this.zzs.zzc().zzn((String) null, zzea.zzaw));
            this.zzs.zzau().zzh().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzs.zzd().zzr.zzb(zza2);
        this.zzs.zzy().zzA(zza2);
    }

    /* access modifiers changed from: protected */
    public final boolean zze() {
        return false;
    }

    public final void zzh() {
        if ((this.zzs.zzax().getApplicationContext() instanceof Application) && this.zza != null) {
            ((Application) this.zzs.zzax().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
        }
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzs.zzav().zzi(atomicReference, 15000, "boolean test flag value", new zzhi(this, atomicReference));
    }

    public final String zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzs.zzav().zzi(atomicReference, 15000, "String test flag value", new zzhm(this, atomicReference));
    }

    public final Long zzk() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzs.zzav().zzi(atomicReference, 15000, "long test flag value", new zzhn(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzs.zzav().zzi(atomicReference, 15000, "int test flag value", new zzho(this, atomicReference));
    }

    public final Double zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzs.zzav().zzi(atomicReference, 15000, "double test flag value", new zzhp(this, atomicReference));
    }

    public final void zzn(Boolean bool) {
        zzb();
        this.zzs.zzav().zzh(new zzhq(this, bool));
    }

    public final void zzo(Bundle bundle, int i, long j) {
        zzb();
        String zza2 = zzaf.zza(bundle);
        if (zza2 != null) {
            this.zzs.zzau().zzh().zzb("Ignoring invalid consent setting", zza2);
            this.zzs.zzau().zzh().zza("Valid consent values are 'granted', 'denied'");
        }
        zzq(zzaf.zzb(bundle), i, j);
    }

    public final void zzq(zzaf zzaf, int i, long j) {
        boolean z;
        boolean z2;
        zzaf zzaf2;
        boolean z3;
        zzaf zzaf3 = zzaf;
        int i2 = i;
        zzb();
        if (i2 != -10 && zzaf.zze() == null && zzaf.zzg() == null) {
            this.zzs.zzau().zzh().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            z = true;
            z2 = false;
            if (zzaf.zzm(i2, this.zzj)) {
                boolean zzi2 = zzaf.zzi(this.zzi);
                if (zzaf.zzh() && !this.zzi.zzh()) {
                    z2 = true;
                }
                zzaf zzl2 = zzaf.zzl(this.zzi);
                this.zzi = zzl2;
                this.zzj = i2;
                boolean z4 = zzi2;
                zzaf2 = zzl2;
                z3 = z2;
                z2 = z4;
            } else {
                zzaf2 = zzaf3;
                z3 = false;
                z = false;
            }
        }
        if (!z) {
            this.zzs.zzau().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzaf2);
            return;
        }
        long andIncrement = this.zzk.getAndIncrement();
        if (z2) {
            this.zzg.set((Object) null);
            this.zzs.zzav().zzj(new zzhr(this, zzaf2, j, i, andIncrement, z3));
        } else if (i2 == 30 || i2 == -10) {
            this.zzs.zzav().zzj(new zzhs(this, zzaf2, i, andIncrement, z3));
        } else {
            this.zzs.zzav().zzh(new zzht(this, zzaf2, i, andIncrement, z3));
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzr(zzaf zzaf) {
        zzg();
        boolean z = (zzaf.zzh() && zzaf.zzf()) || this.zzs.zzy().zzH();
        if (z != this.zzs.zzI()) {
            this.zzs.zzH(z);
            zzfb zzd2 = this.zzs.zzd();
            zzfu zzfu = zzd2.zzs;
            zzd2.zzg();
            Boolean valueOf = zzd2.zzd().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzd2.zzd().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                zzY(Boolean.valueOf(z), false);
            }
        }
    }

    public final void zzs(String str, String str2, Bundle bundle) {
        zzv(str, str2, bundle, true, true, this.zzs.zzay().currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzt(String str, String str2, long j, Bundle bundle) {
        zzg();
        zzu(str, str2, j, bundle, true, this.zzd == null || zzku.zzR(str2), false, (String) null);
    }

    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzu(java.lang.String r21, java.lang.String r22, long r23, android.os.Bundle r25, boolean r26, boolean r27, boolean r28, java.lang.String r29) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r12 = r25
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r21)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r25)
            r20.zzg()
            r20.zzb()
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            boolean r0 = r0.zzF()
            if (r0 == 0) goto L_0x052a
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzee r0 = r0.zzA()
            java.util.List r0 = r0.zzo()
            if (r0 == 0) goto L_0x0041
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0031
            goto L_0x0041
        L_0x0031:
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzj()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.zzc(r1, r9, r8)
            return
        L_0x0041:
            boolean r0 = r7.zzf
            r13 = 0
            r14 = 0
            r15 = 1
            if (r0 != 0) goto L_0x00a1
            r7.zzf = r15
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs     // Catch:{ ClassNotFoundException -> 0x0092 }
            boolean r0 = r0.zzu()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r1 = "com.google.android.gms.tagmanager.TagManagerService"
            if (r0 != 0) goto L_0x0063
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs     // Catch:{ ClassNotFoundException -> 0x0092 }
            android.content.Context r0 = r0.zzax()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class r0 = java.lang.Class.forName(r1, r15, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0067
        L_0x0063:
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0067:
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0081 }
            com.google.android.gms.measurement.internal.zzfu r2 = r7.zzs     // Catch:{ Exception -> 0x0081 }
            android.content.Context r2 = r2.zzax()     // Catch:{ Exception -> 0x0081 }
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0081 }
            goto L_0x00a1
        L_0x0081:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.zzem r1 = r1.zzau()     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.zzek r1 = r1.zze()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.zzb(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x00a1
        L_0x0092:
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzi()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.zza(r1)
        L_0x00a1:
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzae r0 = r0.zzc()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzea.zzab
            boolean r0 = r0.zzn(r13, r1)
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00db
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            r1.zzat()
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            com.google.android.gms.common.util.Clock r0 = r0.zzay()
            long r5 = r0.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r20
            r1.zzB(r2, r3, r4, r5)
        L_0x00db:
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            r0.zzat()
            if (r26 == 0) goto L_0x00fd
            boolean r0 = com.google.android.gms.measurement.internal.zzku.zzY(r22)
            if (r0 == 0) goto L_0x00fd
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzku r0 = r0.zzl()
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzfb r1 = r1.zzd()
            com.google.android.gms.measurement.internal.zzex r1 = r1.zzr
            android.os.Bundle r1 = r1.zza()
            r0.zzH(r12, r1)
        L_0x00fd:
            r0 = 40
            if (r28 == 0) goto L_0x0193
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            r1.zzat()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0193
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzku r1 = r1.zzl()
            java.lang.String r2 = "event"
            boolean r3 = r1.zzj(r2, r9)
            r4 = 2
            if (r3 != 0) goto L_0x011e
            goto L_0x0138
        L_0x011e:
            java.lang.String[] r3 = com.google.android.gms.measurement.internal.zzgr.zza
            java.lang.String[] r5 = com.google.android.gms.measurement.internal.zzgr.zzb
            boolean r3 = r1.zzl(r2, r3, r5, r9)
            if (r3 != 0) goto L_0x012b
            r4 = 13
            goto L_0x0138
        L_0x012b:
            com.google.android.gms.measurement.internal.zzfu r3 = r1.zzs
            r3.zzc()
            boolean r1 = r1.zzm(r2, r0, r9)
            if (r1 != 0) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r4 = 0
        L_0x0138:
            if (r4 == 0) goto L_0x0193
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzem r1 = r1.zzau()
            com.google.android.gms.measurement.internal.zzek r1 = r1.zzd()
            com.google.android.gms.measurement.internal.zzfu r2 = r7.zzs
            com.google.android.gms.measurement.internal.zzeh r2 = r2.zzm()
            java.lang.String r2 = r2.zzc(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.zzb(r3, r2)
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzku r1 = r1.zzl()
            com.google.android.gms.measurement.internal.zzfu r2 = r7.zzs
            r2.zzc()
            java.lang.String r0 = r1.zzC(r9, r0, r15)
            if (r9 == 0) goto L_0x0168
            int r14 = r22.length()
        L_0x0168:
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzku r1 = r1.zzl()
            com.google.android.gms.measurement.internal.zzkt r2 = r7.zzn
            r3 = 0
            com.google.android.gms.measurement.internal.zzfu r5 = r7.zzs
            com.google.android.gms.measurement.internal.zzae r5 = r5.zzc()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.zzea.zzaw
            boolean r5 = r5.zzn(r13, r6)
            java.lang.String r6 = "_ev"
            r21 = r1
            r22 = r2
            r23 = r3
            r24 = r4
            r25 = r6
            r26 = r0
            r27 = r14
            r28 = r5
            r21.zzM(r22, r23, r24, r25, r26, r27, r28)
            return
        L_0x0193:
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            r1.zzat()
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzik r1 = r1.zzx()
            com.google.android.gms.measurement.internal.zzid r1 = r1.zzh(r14)
            java.lang.String r6 = "_sc"
            if (r1 == 0) goto L_0x01ae
            boolean r2 = r12.containsKey(r6)
            if (r2 != 0) goto L_0x01ae
            r1.zzd = r15
        L_0x01ae:
            if (r26 == 0) goto L_0x01b4
            if (r28 == 0) goto L_0x01b4
            r2 = 1
            goto L_0x01b5
        L_0x01b4:
            r2 = 0
        L_0x01b5:
            com.google.android.gms.measurement.internal.zzik.zzm(r1, r12, r2)
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r2 = com.google.android.gms.measurement.internal.zzku.zzR(r22)
            if (r26 == 0) goto L_0x0205
            com.google.android.gms.measurement.internal.zzgu r3 = r7.zzd
            if (r3 == 0) goto L_0x0205
            if (r2 != 0) goto L_0x0205
            if (r1 == 0) goto L_0x01cf
            r16 = 1
            goto L_0x0207
        L_0x01cf:
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzj()
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzeh r1 = r1.zzm()
            java.lang.String r1 = r1.zzc(r9)
            com.google.android.gms.measurement.internal.zzfu r2 = r7.zzs
            com.google.android.gms.measurement.internal.zzeh r2 = r2.zzm()
            java.lang.String r2 = r2.zzf(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.zzc(r3, r1, r2)
            com.google.android.gms.measurement.internal.zzgu r0 = r7.zzd
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzgu r1 = r7.zzd
            r2 = r21
            r3 = r22
            r4 = r25
            r5 = r23
            r1.interceptEvent(r2, r3, r4, r5)
            return
        L_0x0205:
            r16 = r1
        L_0x0207:
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            boolean r1 = r1.zzL()
            if (r1 == 0) goto L_0x0529
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzku r1 = r1.zzl()
            int r1 = r1.zzn(r9)
            if (r1 == 0) goto L_0x0273
            com.google.android.gms.measurement.internal.zzfu r2 = r7.zzs
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzau()
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzd()
            com.google.android.gms.measurement.internal.zzfu r3 = r7.zzs
            com.google.android.gms.measurement.internal.zzeh r3 = r3.zzm()
            java.lang.String r3 = r3.zzc(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.zzb(r4, r3)
            com.google.android.gms.measurement.internal.zzfu r2 = r7.zzs
            com.google.android.gms.measurement.internal.zzku r2 = r2.zzl()
            com.google.android.gms.measurement.internal.zzfu r3 = r7.zzs
            r3.zzc()
            java.lang.String r0 = r2.zzC(r9, r0, r15)
            if (r9 == 0) goto L_0x0249
            int r14 = r22.length()
        L_0x0249:
            com.google.android.gms.measurement.internal.zzfu r2 = r7.zzs
            com.google.android.gms.measurement.internal.zzku r2 = r2.zzl()
            com.google.android.gms.measurement.internal.zzkt r3 = r7.zzn
            com.google.android.gms.measurement.internal.zzfu r4 = r7.zzs
            com.google.android.gms.measurement.internal.zzae r4 = r4.zzc()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.zzea.zzaw
            boolean r4 = r4.zzn(r13, r5)
            java.lang.String r5 = "_ev"
            r21 = r2
            r22 = r3
            r23 = r29
            r24 = r1
            r25 = r5
            r26 = r0
            r27 = r14
            r28 = r4
            r21.zzM(r22, r23, r24, r25, r26, r27, r28)
            return
        L_0x0273:
            java.lang.String r0 = "_sn"
            java.lang.String r5 = "_o"
            java.lang.String r4 = "_si"
            java.lang.String[] r1 = new java.lang.String[]{r5, r0, r6, r4}
            java.util.List r17 = com.google.android.gms.common.util.CollectionUtils.listOf((T[]) r1)
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzku r1 = r1.zzl()
            r2 = r29
            r3 = r22
            r15 = r4
            r4 = r25
            r12 = r5
            r5 = r17
            r13 = r6
            r6 = r28
            android.os.Bundle r5 = r1.zzF(r2, r3, r4, r5, r6)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            boolean r1 = r5.containsKey(r13)
            if (r1 == 0) goto L_0x02b8
            boolean r1 = r5.containsKey(r15)
            if (r1 == 0) goto L_0x02b8
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r1 = r5.getString(r13)
            long r2 = r5.getLong(r15)
            com.google.android.gms.measurement.internal.zzid r4 = new com.google.android.gms.measurement.internal.zzid
            r4.<init>(r0, r1, r2)
        L_0x02b8:
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            r0.zzat()
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzik r0 = r0.zzx()
            com.google.android.gms.measurement.internal.zzid r0 = r0.zzh(r14)
            r3 = 0
            java.lang.String r13 = "_ae"
            if (r0 == 0) goto L_0x02fa
            boolean r0 = r13.equals(r9)
            if (r0 == 0) goto L_0x02fa
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzjz r0 = r0.zzh()
            com.google.android.gms.measurement.internal.zzjx r0 = r0.zzb
            com.google.android.gms.measurement.internal.zzjz r1 = r0.zzc
            com.google.android.gms.measurement.internal.zzfu r1 = r1.zzs
            com.google.android.gms.common.util.Clock r1 = r1.zzay()
            long r1 = r1.elapsedRealtime()
            long r14 = r0.zzb
            long r14 = r1 - r14
            r0.zzb = r1
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x02fa
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzku r0 = r0.zzl()
            r0.zzac(r5, r14)
        L_0x02fa:
            com.google.android.gms.internal.measurement.zzoa.zzb()
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzae r0 = r0.zzc()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzea.zzam
            r14 = 0
            boolean r0 = r0.zzn(r14, r1)
            if (r0 == 0) goto L_0x0385
            java.lang.String r0 = "auto"
            boolean r0 = r0.equals(r8)
            java.lang.String r1 = "_ffr"
            if (r0 != 0) goto L_0x0364
            java.lang.String r0 = "_ssr"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0364
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzku r0 = r0.zzl()
            java.lang.String r1 = r5.getString(r1)
            boolean r2 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r1)
            if (r2 == 0) goto L_0x0330
            r1 = r14
            goto L_0x0336
        L_0x0330:
            if (r1 == 0) goto L_0x0336
            java.lang.String r1 = r1.trim()
        L_0x0336:
            com.google.android.gms.measurement.internal.zzfu r2 = r0.zzs
            com.google.android.gms.measurement.internal.zzfb r2 = r2.zzd()
            com.google.android.gms.measurement.internal.zzfa r2 = r2.zzo
            java.lang.String r2 = r2.zza()
            boolean r2 = com.google.android.gms.measurement.internal.zzku.zzS(r1, r2)
            if (r2 != 0) goto L_0x0354
            com.google.android.gms.measurement.internal.zzfu r0 = r0.zzs
            com.google.android.gms.measurement.internal.zzfb r0 = r0.zzd()
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzo
            r0.zzb(r1)
            goto L_0x0385
        L_0x0354:
            com.google.android.gms.measurement.internal.zzfu r0 = r0.zzs
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzj()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.zza(r1)
            return
        L_0x0364:
            boolean r0 = r13.equals(r9)
            if (r0 == 0) goto L_0x0385
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzku r0 = r0.zzl()
            com.google.android.gms.measurement.internal.zzfu r0 = r0.zzs
            com.google.android.gms.measurement.internal.zzfb r0 = r0.zzd()
            com.google.android.gms.measurement.internal.zzfa r0 = r0.zzo
            java.lang.String r0 = r0.zza()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0385
            r5.putString(r1, r0)
        L_0x0385:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r5)
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzfb r1 = r1.zzd()
            com.google.android.gms.measurement.internal.zzey r1 = r1.zzj
            long r1 = r1.zza()
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x040a
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzfb r1 = r1.zzd()
            boolean r1 = r1.zzl(r10)
            if (r1 == 0) goto L_0x040a
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzfb r1 = r1.zzd()
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzl
            boolean r1 = r1.zza()
            if (r1 == 0) goto L_0x040a
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzem r1 = r1.zzau()
            com.google.android.gms.measurement.internal.zzek r1 = r1.zzk()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.zza(r2)
            r6 = 0
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.common.util.Clock r1 = r1.zzay()
            long r18 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r15 = "_sid"
            r1 = r20
            r25 = r13
            r13 = r3
            r3 = r15
            r4 = r6
            r15 = r5
            r5 = r18
            r1.zzB(r2, r3, r4, r5)
            r4 = 0
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.common.util.Clock r1 = r1.zzay()
            long r5 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r20
            r1.zzB(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.common.util.Clock r1 = r1.zzay()
            long r5 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r20
            r1.zzB(r2, r3, r4, r5)
            goto L_0x040e
        L_0x040a:
            r15 = r5
            r25 = r13
            r13 = r3
        L_0x040e:
            java.lang.String r1 = "extend_session"
            long r1 = r15.getLong(r1, r13)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0435
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzem r1 = r1.zzau()
            com.google.android.gms.measurement.internal.zzek r1 = r1.zzk()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzjz r1 = r1.zzh()
            com.google.android.gms.measurement.internal.zzjy r1 = r1.zza
            r2 = 1
            r1.zzb(r10, r2)
        L_0x0435:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r15.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x0446:
            if (r3 >= r2) goto L_0x0494
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0491
            com.google.android.gms.measurement.internal.zzfu r5 = r7.zzs
            r5.zzl()
            java.lang.Object r5 = r15.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0466
            r6 = 1
            android.os.Bundle[] r13 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r13[r6] = r5
            goto L_0x048c
        L_0x0466:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x0477
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r13 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r13)
            r13 = r5
            android.os.Bundle[] r13 = (android.os.Bundle[]) r13
            goto L_0x048c
        L_0x0477:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x048b
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            r13 = r5
            android.os.Bundle[] r13 = (android.os.Bundle[]) r13
            goto L_0x048c
        L_0x048b:
            r13 = 0
        L_0x048c:
            if (r13 == 0) goto L_0x0491
            r15.putParcelableArray(r4, r13)
        L_0x0491:
            int r3 = r3 + 1
            goto L_0x0446
        L_0x0494:
            r13 = 0
        L_0x0495:
            int r1 = r0.size()
            if (r13 >= r1) goto L_0x04f9
            java.lang.Object r1 = r0.get(r13)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r13 == 0) goto L_0x04a6
            java.lang.String r2 = "_ep"
            goto L_0x04a7
        L_0x04a6:
            r2 = r9
        L_0x04a7:
            r1.putString(r12, r8)
            if (r27 == 0) goto L_0x04b6
            com.google.android.gms.measurement.internal.zzfu r3 = r7.zzs
            com.google.android.gms.measurement.internal.zzku r3 = r3.zzl()
            android.os.Bundle r1 = r3.zzU(r1)
        L_0x04b6:
            r14 = r1
            com.google.android.gms.measurement.internal.zzas r15 = new com.google.android.gms.measurement.internal.zzas
            com.google.android.gms.measurement.internal.zzaq r3 = new com.google.android.gms.measurement.internal.zzaq
            r3.<init>(r14)
            r1 = r15
            r4 = r21
            r5 = r23
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.measurement.internal.zzjk r1 = r1.zzy()
            r5 = r29
            r1.zzl(r15, r5)
            if (r16 != 0) goto L_0x04f6
            java.util.Set<com.google.android.gms.measurement.internal.zzgv> r1 = r7.zze
            java.util.Iterator r15 = r1.iterator()
        L_0x04d9:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x04f6
            java.lang.Object r1 = r15.next()
            com.google.android.gms.measurement.internal.zzgv r1 = (com.google.android.gms.measurement.internal.zzgv) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r14)
            r2 = r21
            r3 = r22
            r5 = r23
            r1.onEvent(r2, r3, r4, r5)
            r5 = r29
            goto L_0x04d9
        L_0x04f6:
            int r13 = r13 + 1
            goto L_0x0495
        L_0x04f9:
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            r0.zzat()
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzik r0 = r0.zzx()
            r1 = 0
            com.google.android.gms.measurement.internal.zzid r0 = r0.zzh(r1)
            if (r0 == 0) goto L_0x0529
            r0 = r25
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0529
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzjz r0 = r0.zzh()
            com.google.android.gms.measurement.internal.zzfu r1 = r7.zzs
            com.google.android.gms.common.util.Clock r1 = r1.zzay()
            long r1 = r1.elapsedRealtime()
            com.google.android.gms.measurement.internal.zzjx r0 = r0.zzb
            r3 = 1
            r0.zzd(r3, r3, r1)
        L_0x0529:
            return
        L_0x052a:
            com.google.android.gms.measurement.internal.zzfu r0 = r7.zzs
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzj()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.zza(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhw.zzu(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void zzv(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (this.zzs.zzc().zzn((String) null, zzea.zzar)) {
            String str4 = str2;
            if (zzku.zzS(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
                this.zzs.zzx().zzj(bundle2, j);
                return;
            }
        } else {
            String str5 = str2;
        }
        long j2 = j;
        zzx(str3, str2, j, bundle2, z2, !z2 || this.zzd == null || zzku.zzR(str2), !z, (String) null);
    }

    /* access modifiers changed from: protected */
    public final void zzx(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.zzs.zzav().zzh(new zzhc(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    public final void zzy(String str, String str2, Object obj, boolean z) {
        zzz("auto", str2, obj, true, this.zzs.zzay().currentTimeMillis());
    }

    public final void zzz(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int i2;
        String str3 = str2;
        Object obj2 = obj;
        String str4 = str == null ? "app" : str;
        if (z) {
            i = this.zzs.zzl().zzo(str3);
        } else {
            zzku zzl2 = this.zzs.zzl();
            if (zzl2.zzj("user property", str3)) {
                if (!zzl2.zzl("user property", zzgt.zza, (String[]) null, str3)) {
                    i = 15;
                } else {
                    zzl2.zzs.zzc();
                    if (zzl2.zzm("user property", 24, str3)) {
                        i = 0;
                    }
                }
            }
            i = 6;
        }
        if (i != 0) {
            zzku zzl3 = this.zzs.zzl();
            this.zzs.zzc();
            this.zzs.zzl().zzM(this.zzn, (String) null, i, "_ev", zzl3.zzC(str3, 24, true), str3 != null ? str2.length() : 0, this.zzs.zzc().zzn((String) null, zzea.zzaw));
        } else if (obj2 != null) {
            int zzJ = this.zzs.zzl().zzJ(str3, obj2);
            if (zzJ != 0) {
                zzku zzl4 = this.zzs.zzl();
                this.zzs.zzc();
                String zzC = zzl4.zzC(str3, 24, true);
                if ((obj2 instanceof String) || (obj2 instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                } else {
                    i2 = 0;
                }
                this.zzs.zzl().zzM(this.zzn, (String) null, zzJ, "_ev", zzC, i2, this.zzs.zzc().zzn((String) null, zzea.zzaw));
                return;
            }
            Object zzK = this.zzs.zzl().zzK(str3, obj2);
            if (zzK != null) {
                zzA(str4, str2, j, zzK);
            }
        } else {
            zzA(str4, str2, j, (Object) null);
        }
    }
}
