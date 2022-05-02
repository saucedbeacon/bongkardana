package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzod;
import com.j256.ormlite.field.FieldType;
import id.dana.data.constant.BranchLinkConstant;
import java.util.Map;
import o.PlaybackStateCompat;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@DynamiteApi
public class AppMeasurementDynamiteService extends zzcb {
    @VisibleForTesting
    zzfu zza = null;
    @GuardedBy("listenerMap")
    private final Map<Integer, zzgv> zzb = new PlaybackStateCompat();

    @EnsuresNonNull({"scion"})
    private final void zzb() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zzc(zzcf zzcf, String str) {
        zzb();
        this.zza.zzl().zzad(zzcf, str);
    }

    public void beginAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        zzb();
        this.zza.zzB().zza(str, j);
    }

    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        zzb();
        this.zza.zzk().zzO(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        this.zza.zzk().zzn((Boolean) null);
    }

    public void endAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        zzb();
        this.zza.zzB().zzb(str, j);
    }

    public void generateEventId(zzcf zzcf) throws RemoteException {
        zzb();
        long zzd = this.zza.zzl().zzd();
        zzb();
        this.zza.zzl().zzae(zzcf, zzd);
    }

    public void getAppInstanceId(zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.zzav().zzh(new zzh(this, zzcf));
    }

    public void getCachedAppInstanceId(zzcf zzcf) throws RemoteException {
        zzb();
        zzc(zzcf, this.zza.zzk().zzD());
    }

    public void getConditionalUserProperties(String str, String str2, zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.zzav().zzh(new zzl(this, zzcf, str, str2));
    }

    public void getCurrentScreenClass(zzcf zzcf) throws RemoteException {
        zzb();
        zzc(zzcf, this.zza.zzk().zzS());
    }

    public void getCurrentScreenName(zzcf zzcf) throws RemoteException {
        zzb();
        zzc(zzcf, this.zza.zzk().zzR());
    }

    public void getGmpAppId(zzcf zzcf) throws RemoteException {
        zzb();
        zzc(zzcf, this.zza.zzk().zzT());
    }

    public void getMaxUserProperties(String str, zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.zzk().zzL(str);
        zzb();
        this.zza.zzl().zzaf(zzcf, 25);
    }

    public void getTestFlag(zzcf zzcf, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            this.zza.zzl().zzad(zzcf, this.zza.zzk().zzj());
        } else if (i == 1) {
            this.zza.zzl().zzae(zzcf, this.zza.zzk().zzk().longValue());
        } else if (i == 2) {
            zzku zzl = this.zza.zzl();
            double doubleValue = this.zza.zzk().zzm().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble(BranchLinkConstant.PayloadKey.REFERRAL, doubleValue);
            try {
                zzcf.zzb(bundle);
            } catch (RemoteException e) {
                zzl.zzs.zzau().zze().zzb("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.zza.zzl().zzaf(zzcf, this.zza.zzk().zzl().intValue());
        } else if (i == 4) {
            this.zza.zzl().zzah(zzcf, this.zza.zzk().zzi().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.zzav().zzh(new zzj(this, zzcf, str, str2, z));
    }

    public void initForTests(@NonNull Map map) throws RemoteException {
        zzb();
    }

    public void initialize(IObjectWrapper iObjectWrapper, zzcl zzcl, long j) throws RemoteException {
        zzfu zzfu = this.zza;
        if (zzfu == null) {
            this.zza = zzfu.zzC((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzcl, Long.valueOf(j));
        } else {
            zzfu.zzau().zze().zza("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(zzcf zzcf) throws RemoteException {
        zzb();
        this.zza.zzav().zzh(new zzm(this, zzcf));
    }

    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        this.zza.zzk().zzv(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcf, long j) throws RemoteException {
        zzb();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.zza.zzav().zzh(new zzi(this, zzcf, new zzas(str2, new zzaq(bundle), "app", j), str));
    }

    public void logHealthData(int i, @NonNull String str, @NonNull IObjectWrapper iObjectWrapper, @NonNull IObjectWrapper iObjectWrapper2, @NonNull IObjectWrapper iObjectWrapper3) throws RemoteException {
        Object obj;
        Object obj2;
        zzb();
        Object obj3 = null;
        if (iObjectWrapper == null) {
            obj = null;
        } else {
            obj = ObjectWrapper.unwrap(iObjectWrapper);
        }
        if (iObjectWrapper2 == null) {
            obj2 = null;
        } else {
            obj2 = ObjectWrapper.unwrap(iObjectWrapper2);
        }
        if (iObjectWrapper3 != null) {
            obj3 = ObjectWrapper.unwrap(iObjectWrapper3);
        }
        this.zza.zzau().zzm(i, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(@NonNull IObjectWrapper iObjectWrapper, @NonNull Bundle bundle, long j) throws RemoteException {
        zzb();
        zzhv zzhv = this.zza.zzk().zza;
        if (zzhv != null) {
            this.zza.zzk().zzh();
            zzhv.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    public void onActivityDestroyed(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        zzhv zzhv = this.zza.zzk().zza;
        if (zzhv != null) {
            this.zza.zzk().zzh();
            zzhv.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityPaused(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        zzhv zzhv = this.zza.zzk().zza;
        if (zzhv != null) {
            this.zza.zzk().zzh();
            zzhv.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityResumed(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        zzhv zzhv = this.zza.zzk().zza;
        if (zzhv != null) {
            this.zza.zzk().zzh();
            zzhv.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcf zzcf, long j) throws RemoteException {
        zzb();
        zzhv zzhv = this.zza.zzk().zza;
        Bundle bundle = new Bundle();
        if (zzhv != null) {
            this.zza.zzk().zzh();
            zzhv.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzcf.zzb(bundle);
        } catch (RemoteException e) {
            this.zza.zzau().zze().zzb("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        if (this.zza.zzk().zza != null) {
            this.zza.zzk().zzh();
            ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    public void onActivityStopped(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        if (this.zza.zzk().zza != null) {
            this.zza.zzk().zzh();
            ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    public void performAction(Bundle bundle, zzcf zzcf, long j) throws RemoteException {
        zzb();
        zzcf.zzb((Bundle) null);
    }

    public void registerOnMeasurementEventListener(zzci zzci) throws RemoteException {
        zzgv zzgv;
        zzb();
        synchronized (this.zzb) {
            zzgv = this.zzb.get(Integer.valueOf(zzci.zze()));
            if (zzgv == null) {
                zzgv = new zzo(this, zzci);
                this.zzb.put(Integer.valueOf(zzci.zze()), zzgv);
            }
        }
        this.zza.zzk().zzJ(zzgv);
    }

    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        this.zza.zzk().zzF(j);
    }

    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) throws RemoteException {
        zzb();
        if (bundle == null) {
            this.zza.zzau().zzb().zza("Conditional user property must not be null");
        } else {
            this.zza.zzk().zzN(bundle, j);
        }
    }

    public void setConsent(@NonNull Bundle bundle, long j) throws RemoteException {
        zzb();
        zzhw zzk = this.zza.zzk();
        zzod.zzb();
        if (!zzk.zzs.zzc().zzn((String) null, zzea.zzaC) || TextUtils.isEmpty(zzk.zzs.zzA().zzj())) {
            zzk.zzo(bundle, 0, j);
        } else {
            zzk.zzs.zzau().zzh().zza("Using developer consent only; google app id found");
        }
    }

    public void setConsentThirdParty(@NonNull Bundle bundle, long j) throws RemoteException {
        zzb();
        this.zza.zzk().zzo(bundle, -20, j);
    }

    public void setCurrentScreen(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, long j) throws RemoteException {
        zzb();
        this.zza.zzx().zzk((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        zzhw zzk = this.zza.zzk();
        zzk.zzb();
        zzk.zzs.zzav().zzh(new zzgz(zzk, z));
    }

    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        Bundle bundle2;
        zzb();
        zzhw zzk = this.zza.zzk();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        zzk.zzs.zzav().zzh(new zzgx(zzk, bundle2));
    }

    public void setEventInterceptor(zzci zzci) throws RemoteException {
        zzb();
        zzn zzn = new zzn(this, zzci);
        if (this.zza.zzav().zzd()) {
            this.zza.zzk().zzI(zzn);
        } else {
            this.zza.zzav().zzh(new zzk(this, zzn));
        }
    }

    public void setInstanceIdProvider(zzck zzck) throws RemoteException {
        zzb();
    }

    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        this.zza.zzk().zzn(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        zzhw zzk = this.zza.zzk();
        zzk.zzs.zzav().zzh(new zzhb(zzk, j));
    }

    public void setUserId(@NonNull String str, long j) throws RemoteException {
        zzb();
        if (!this.zza.zzc().zzn((String) null, zzea.zzaA) || str == null || str.length() != 0) {
            this.zza.zzk().zzz((String) null, FieldType.FOREIGN_ID_FIELD_SUFFIX, str, true, j);
        } else {
            this.zza.zzau().zze().zza("User ID must be non-empty");
        }
    }

    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        zzb();
        this.zza.zzk().zzz(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    public void unregisterOnMeasurementEventListener(zzci zzci) throws RemoteException {
        zzgv remove;
        zzb();
        synchronized (this.zzb) {
            remove = this.zzb.remove(Integer.valueOf(zzci.zze()));
        }
        if (remove == null) {
            remove = new zzo(this, zzci);
        }
        this.zza.zzk().zzK(remove);
    }
}
