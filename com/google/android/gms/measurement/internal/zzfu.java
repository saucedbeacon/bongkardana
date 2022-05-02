package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.wireless.security.SecExceptionCode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzht;
import com.google.android.gms.internal.measurement.zzoa;
import com.google.android.gms.internal.measurement.zzod;
import com.google.firebase.messaging.Constants;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfu implements zzgp {
    private static volatile zzfu zzd;
    private zzee zzA;
    private zzfe zzB;
    private boolean zzC = false;
    private Boolean zzD;
    private long zzE;
    private volatile Boolean zzF;
    private volatile boolean zzG;
    private int zzH;
    private final AtomicInteger zzI = new AtomicInteger(0);
    @VisibleForTesting
    protected Boolean zza;
    @VisibleForTesting
    protected Boolean zzb;
    @VisibleForTesting
    final long zzc;
    private final Context zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private final zzz zzj;
    private final zzae zzk;
    private final zzfb zzl;
    private final zzem zzm;
    private final zzfr zzn;
    private final zzjz zzo;
    private final zzku zzp;
    private final zzeh zzq;
    private final Clock zzr;
    private final zzik zzs;
    private final zzhw zzt;
    private final zzd zzu;
    private final zzia zzv;
    private final String zzw;
    private zzeg zzx;
    private zzjk zzy;
    private zzam zzz;

    zzfu(zzgw zzgw) {
        long j;
        Bundle bundle;
        boolean z = false;
        Preconditions.checkNotNull(zzgw);
        zzz zzz2 = new zzz(zzgw.zza);
        this.zzj = zzz2;
        zzdy.zza = zzz2;
        this.zze = zzgw.zza;
        this.zzf = zzgw.zzb;
        this.zzg = zzgw.zzc;
        this.zzh = zzgw.zzd;
        this.zzi = zzgw.zzh;
        this.zzF = zzgw.zze;
        this.zzw = zzgw.zzj;
        this.zzG = true;
        zzcl zzcl = zzgw.zzg;
        if (!(zzcl == null || (bundle = zzcl.zzg) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zza = (Boolean) obj;
            }
            Object obj2 = zzcl.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzb = (Boolean) obj2;
            }
        }
        zzht.zzb(this.zze);
        this.zzr = DefaultClock.getInstance();
        Long l = zzgw.zzi;
        if (l != null) {
            j = l.longValue();
        } else {
            j = this.zzr.currentTimeMillis();
        }
        this.zzc = j;
        this.zzk = new zzae(this);
        zzfb zzfb = new zzfb(this);
        zzfb.zzx();
        this.zzl = zzfb;
        zzem zzem = new zzem(this);
        zzem.zzx();
        this.zzm = zzem;
        zzku zzku = new zzku(this);
        zzku.zzx();
        this.zzp = zzku;
        zzeh zzeh = new zzeh(this);
        zzeh.zzx();
        this.zzq = zzeh;
        this.zzu = new zzd(this);
        zzik zzik = new zzik(this);
        zzik.zzc();
        this.zzs = zzik;
        zzhw zzhw = new zzhw(this);
        zzhw.zzc();
        this.zzt = zzhw;
        zzjz zzjz = new zzjz(this);
        zzjz.zzc();
        this.zzo = zzjz;
        zzia zzia = new zzia(this);
        zzia.zzx();
        this.zzv = zzia;
        zzfr zzfr = new zzfr(this);
        zzfr.zzx();
        this.zzn = zzfr;
        zzcl zzcl2 = zzgw.zzg;
        z = (zzcl2 == null || zzcl2.zzb == 0) ? true : z;
        if (this.zze.getApplicationContext() instanceof Application) {
            zzhw zzk2 = zzk();
            if (zzk2.zzs.zze.getApplicationContext() instanceof Application) {
                Application application = (Application) zzk2.zzs.zze.getApplicationContext();
                if (zzk2.zza == null) {
                    zzk2.zza = new zzhv(zzk2, (zzhi) null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(zzk2.zza);
                    application.registerActivityLifecycleCallbacks(zzk2.zza);
                    zzk2.zzs.zzau().zzk().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzau().zze().zza("Application context is not an Application");
        }
        this.zzn.zzh(new zzft(this, zzgw));
    }

    public static zzfu zzC(Context context, zzcl zzcl, Long l) {
        Bundle bundle;
        if (zzcl != null && (zzcl.zze == null || zzcl.zzf == null)) {
            zzcl = new zzcl(zzcl.zza, zzcl.zzb, zzcl.zzc, zzcl.zzd, (String) null, (String) null, zzcl.zzg, (String) null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzd == null) {
            synchronized (zzfu.class) {
                if (zzd == null) {
                    zzd = new zzfu(new zzgw(context, zzcl, l));
                }
            }
        } else if (!(zzcl == null || (bundle = zzcl.zzg) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            Preconditions.checkNotNull(zzd);
            zzd.zzF = Boolean.valueOf(zzcl.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzd);
        return zzd;
    }

    static /* synthetic */ void zzO(zzfu zzfu, zzgw zzgw) {
        zzfu.zzav().zzg();
        zzfu.zzk.zzb();
        zzam zzam = new zzam(zzfu);
        zzam.zzx();
        zzfu.zzz = zzam;
        zzee zzee = new zzee(zzfu, zzgw.zzf);
        zzee.zzc();
        zzfu.zzA = zzee;
        zzeg zzeg = new zzeg(zzfu);
        zzeg.zzc();
        zzfu.zzx = zzeg;
        zzjk zzjk = new zzjk(zzfu);
        zzjk.zzc();
        zzfu.zzy = zzjk;
        zzfu.zzp.zzy();
        zzfu.zzl.zzy();
        zzfu.zzB = new zzfe(zzfu);
        zzfu.zzA.zzd();
        zzek zzi2 = zzfu.zzau().zzi();
        zzfu.zzk.zzf();
        zzi2.zzb("App measurement initialized, version", 42004L);
        zzfu.zzau().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzi3 = zzee.zzi();
        if (TextUtils.isEmpty(zzfu.zzf)) {
            if (zzfu.zzl().zzT(zzi3)) {
                zzfu.zzau().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzek zzi4 = zzfu.zzau().zzi();
                String valueOf = String.valueOf(zzi3);
                zzi4.zza(valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "));
            }
        }
        zzfu.zzau().zzj().zza("Debug-level message logging enabled");
        if (zzfu.zzH != zzfu.zzI.get()) {
            zzfu.zzau().zzb().zzc("Not all components initialized", Integer.valueOf(zzfu.zzH), Integer.valueOf(zzfu.zzI.get()));
        }
        zzfu.zzC = true;
    }

    static final void zzP() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void zzQ(zzgn zzgn) {
        if (zzgn == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void zzR(zzf zzf2) {
        if (zzf2 == null) {
            throw new IllegalStateException("Component not created");
        } else if (!zzf2.zza()) {
            String valueOf = String.valueOf(zzf2.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private static final void zzS(zzgo zzgo) {
        if (zzgo == null) {
            throw new IllegalStateException("Component not created");
        } else if (!zzgo.zzu()) {
            String valueOf = String.valueOf(zzgo.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    @Pure
    public final zzee zzA() {
        zzR(this.zzA);
        return this.zzA;
    }

    @Pure
    public final zzd zzB() {
        zzd zzd2 = this.zzu;
        if (zzd2 != null) {
            return zzd2;
        }
        throw new IllegalStateException("Component not created");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzD(boolean z) {
        this.zzF = Boolean.valueOf(z);
    }

    @WorkerThread
    public final boolean zzE() {
        return this.zzF != null && this.zzF.booleanValue();
    }

    @WorkerThread
    public final boolean zzF() {
        return zzG() == 0;
    }

    @WorkerThread
    public final int zzG() {
        zzav().zzg();
        if (this.zzk.zzr()) {
            return 1;
        }
        Boolean bool = this.zzb;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        zzav().zzg();
        if (!this.zzG) {
            return 8;
        }
        Boolean zzf2 = zzd().zzf();
        if (zzf2 == null) {
            zzae zzae = this.zzk;
            zzz zzz2 = zzae.zzs.zzj;
            Boolean zzp2 = zzae.zzp("firebase_analytics_collection_enabled");
            if (zzp2 == null) {
                Boolean bool2 = this.zza;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (!this.zzk.zzn((String) null, zzea.zzS) || this.zzF == null || this.zzF.booleanValue()) {
                    return 0;
                } else {
                    return 7;
                }
            } else if (zzp2.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (zzf2.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    @WorkerThread
    public final void zzH(boolean z) {
        zzav().zzg();
        this.zzG = z;
    }

    @WorkerThread
    public final boolean zzI() {
        zzav().zzg();
        return this.zzG;
    }

    /* access modifiers changed from: package-private */
    public final void zzJ() {
        this.zzH++;
    }

    /* access modifiers changed from: package-private */
    public final void zzK() {
        this.zzI.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public final boolean zzL() {
        if (this.zzC) {
            zzav().zzg();
            Boolean bool = this.zzD;
            if (bool == null || this.zzE == 0 || (!bool.booleanValue() && Math.abs(this.zzr.elapsedRealtime() - this.zzE) > 1000)) {
                this.zzE = this.zzr.elapsedRealtime();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(zzl().zzQ("android.permission.INTERNET") && zzl().zzQ("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zze).isCallerInstantApp() || this.zzk.zzy() || (zzku.zzam(this.zze) && zzku.zzP(this.zze, false))));
                this.zzD = valueOf;
                if (valueOf.booleanValue()) {
                    if (!zzl().zzA(zzA().zzj(), zzA().zzk(), zzA().zzl()) && TextUtils.isEmpty(zzA().zzk())) {
                        z = false;
                    }
                    this.zzD = Boolean.valueOf(z);
                }
            }
            return this.zzD.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @WorkerThread
    public final void zzM() {
        zzav().zzg();
        zzS(zzo());
        String zzi2 = zzA().zzi();
        Pair<String, Boolean> zzb2 = zzd().zzb(zzi2);
        if (!this.zzk.zzs() || ((Boolean) zzb2.second).booleanValue() || TextUtils.isEmpty((CharSequence) zzb2.first)) {
            zzau().zzj().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        zzia zzo2 = zzo();
        zzo2.zzv();
        ConnectivityManager connectivityManager = (ConnectivityManager) zzo2.zzs.zze.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            zzau().zze().zza("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        zzku zzl2 = zzl();
        zzA().zzs.zzk.zzf();
        URL zzal = zzl2.zzal(42004, zzi2, (String) zzb2.first, zzd().zzn.zza() - 1);
        if (zzal != null) {
            zzia zzo3 = zzo();
            zzfs zzfs = new zzfs(this);
            zzo3.zzg();
            zzo3.zzv();
            Preconditions.checkNotNull(zzal);
            Preconditions.checkNotNull(zzfs);
            zzo3.zzs.zzav().zzk(new zzhz(zzo3, zzi2, zzal, (byte[]) null, (Map) null, zzfs, (byte[]) null));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzN(String str, int i, Throwable th, byte[] bArr, Map map) {
        if (!(i == 200 || i == 204)) {
            if (i == 304) {
                i = SecExceptionCode.SEC_ERROR_STA_INCORRECT_DATA_FILE;
            }
            zzau().zze().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            zzd().zzm.zzb(true);
            if (bArr == null || bArr.length == 0) {
                zzau().zzj().zza("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP, 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    zzau().zzj().zza("Deferred Deep Link is empty.");
                    return;
                }
                zzku zzl2 = zzl();
                zzfu zzfu = zzl2.zzs;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = zzl2.zzs.zze.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.zzt.zzs("auto", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle);
                        zzku zzl3 = zzl();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = zzl3.zzs.zze.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP, Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    zzl3.zzs.zze.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                zzl3.zzs.zzau().zzb().zzb("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                zzau().zze().zzc("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                zzau().zzb().zzb("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        zzau().zze().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public final void zza(zzcl zzcl) {
        zzaf zzaf;
        zzav().zzg();
        zzaf zzi2 = zzd().zzi();
        zzfb zzd2 = zzd();
        zzfu zzfu = zzd2.zzs;
        zzd2.zzg();
        int i = 100;
        int i2 = zzd2.zzd().getInt("consent_source", 100);
        zzae zzae = this.zzk;
        zzfu zzfu2 = zzae.zzs;
        Boolean zzp2 = zzae.zzp("google_analytics_default_allow_ad_storage");
        zzae zzae2 = this.zzk;
        zzfu zzfu3 = zzae2.zzs;
        Boolean zzp3 = zzae2.zzp("google_analytics_default_allow_analytics_storage");
        if (!(zzp2 == null && zzp3 == null) && zzd().zzh(-10)) {
            zzaf = new zzaf(zzp2, zzp3);
            i = -10;
        } else {
            if (TextUtils.isEmpty(zzA().zzj()) || !(i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                zzod.zzb();
                if ((!this.zzk.zzn((String) null, zzea.zzaC) || TextUtils.isEmpty(zzA().zzj())) && zzcl != null && zzcl.zzg != null && zzd().zzh(30)) {
                    zzaf = zzaf.zzb(zzcl.zzg);
                    if (!zzaf.equals(zzaf.zza)) {
                        i = 30;
                    }
                }
            } else {
                zzk().zzq(zzaf.zza, -10, this.zzc);
            }
            zzaf = null;
        }
        if (zzaf != null) {
            zzk().zzq(zzaf, i, this.zzc);
            zzi2 = zzaf;
        }
        zzk().zzr(zzi2);
        if (zzd().zzc.zza() == 0) {
            zzau().zzk().zzb("Persisting first open", Long.valueOf(this.zzc));
            zzd().zzc.zzb(this.zzc);
        }
        zzk().zzb.zzc();
        if (zzL()) {
            if (!TextUtils.isEmpty(zzA().zzj()) || !TextUtils.isEmpty(zzA().zzk())) {
                zzku zzl2 = zzl();
                String zzj2 = zzA().zzj();
                zzfb zzd3 = zzd();
                zzd3.zzg();
                String string = zzd3.zzd().getString("gmp_app_id", (String) null);
                String zzk2 = zzA().zzk();
                zzfb zzd4 = zzd();
                zzd4.zzg();
                if (zzl2.zzB(zzj2, string, zzk2, zzd4.zzd().getString("admob_app_id", (String) null))) {
                    zzau().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    zzfb zzd5 = zzd();
                    zzd5.zzg();
                    Boolean zzf2 = zzd5.zzf();
                    SharedPreferences.Editor edit = zzd5.zzd().edit();
                    edit.clear();
                    edit.apply();
                    if (zzf2 != null) {
                        zzd5.zze(zzf2);
                    }
                    zzn().zzh();
                    this.zzy.zzF();
                    this.zzy.zzB();
                    zzd().zzc.zzb(this.zzc);
                    zzd().zze.zzb((String) null);
                }
                zzfb zzd6 = zzd();
                String zzj3 = zzA().zzj();
                zzd6.zzg();
                SharedPreferences.Editor edit2 = zzd6.zzd().edit();
                edit2.putString("gmp_app_id", zzj3);
                edit2.apply();
                zzfb zzd7 = zzd();
                String zzk3 = zzA().zzk();
                zzd7.zzg();
                SharedPreferences.Editor edit3 = zzd7.zzd().edit();
                edit3.putString("admob_app_id", zzk3);
                edit3.apply();
            }
            if (!zzd().zzi().zzh()) {
                zzd().zze.zzb((String) null);
            }
            zzk().zzE(zzd().zze.zza());
            zzoa.zzb();
            if (this.zzk.zzn((String) null, zzea.zzam)) {
                try {
                    zzl().zzs.zze.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(zzd().zzo.zza())) {
                        zzau().zze().zza("Remote config removed with active feature rollouts");
                        zzd().zzo.zzb((String) null);
                    }
                }
            }
            if (!TextUtils.isEmpty(zzA().zzj()) || !TextUtils.isEmpty(zzA().zzk())) {
                boolean zzF2 = zzF();
                if (!zzd().zzk() && !this.zzk.zzr()) {
                    zzd().zzj(!zzF2);
                }
                if (zzF2) {
                    zzk().zzH();
                }
                zzh().zza.zza();
                zzy().zzv(new AtomicReference());
                zzy().zzA(zzd().zzr.zza());
            }
        } else if (zzF()) {
            if (!zzl().zzQ("android.permission.INTERNET")) {
                zzau().zzb().zza("App is missing INTERNET permission");
            }
            if (!zzl().zzQ("android.permission.ACCESS_NETWORK_STATE")) {
                zzau().zzb().zza("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!Wrappers.packageManager(this.zze).isCallerInstantApp() && !this.zzk.zzy()) {
                if (!zzku.zzam(this.zze)) {
                    zzau().zzb().zza("AppMeasurementReceiver not registered/enabled");
                }
                if (!zzku.zzP(this.zze, false)) {
                    zzau().zzb().zza("AppMeasurementService not registered/enabled");
                }
            }
            zzau().zzb().zza("Uploading is not possible. App measurement disabled");
        }
        zzd().zzi.zzb(true);
    }

    @Pure
    public final zzz zzat() {
        return this.zzj;
    }

    @Pure
    public final zzem zzau() {
        zzS(this.zzm);
        return this.zzm;
    }

    @Pure
    public final zzfr zzav() {
        zzS(this.zzn);
        return this.zzn;
    }

    @Pure
    public final Context zzax() {
        return this.zze;
    }

    @Pure
    public final Clock zzay() {
        return this.zzr;
    }

    @Pure
    public final zzae zzc() {
        return this.zzk;
    }

    @Pure
    public final zzfb zzd() {
        zzQ(this.zzl);
        return this.zzl;
    }

    public final zzem zzf() {
        zzem zzem = this.zzm;
        if (zzem == null || !zzem.zzu()) {
            return null;
        }
        return this.zzm;
    }

    @Pure
    public final zzjz zzh() {
        zzR(this.zzo);
        return this.zzo;
    }

    @SideEffectFree
    public final zzfe zzi() {
        return this.zzB;
    }

    /* access modifiers changed from: package-private */
    @SideEffectFree
    public final zzfr zzj() {
        return this.zzn;
    }

    @Pure
    public final zzhw zzk() {
        zzR(this.zzt);
        return this.zzt;
    }

    @Pure
    public final zzku zzl() {
        zzQ(this.zzp);
        return this.zzp;
    }

    @Pure
    public final zzeh zzm() {
        zzQ(this.zzq);
        return this.zzq;
    }

    @Pure
    public final zzeg zzn() {
        zzR(this.zzx);
        return this.zzx;
    }

    @Pure
    public final zzia zzo() {
        zzS(this.zzv);
        return this.zzv;
    }

    @Pure
    public final boolean zzq() {
        return TextUtils.isEmpty(this.zzf);
    }

    @Pure
    public final String zzr() {
        return this.zzf;
    }

    @Pure
    public final String zzs() {
        return this.zzg;
    }

    @Pure
    public final String zzt() {
        return this.zzh;
    }

    @Pure
    public final boolean zzu() {
        return this.zzi;
    }

    @Pure
    public final String zzv() {
        return this.zzw;
    }

    @Pure
    public final zzik zzx() {
        zzR(this.zzs);
        return this.zzs;
    }

    @Pure
    public final zzjk zzy() {
        zzR(this.zzy);
        return this.zzy;
    }

    @Pure
    public final zzam zzz() {
        zzS(this.zzz);
        return this.zzz;
    }
}
