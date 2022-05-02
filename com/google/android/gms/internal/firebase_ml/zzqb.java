package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.firebase_ml.zzfg;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.Immutable;

@Immutable
public final class zzqb implements zzok<zzjn, zzqa> {
    private static final Map<FirebaseApp, zzqb> zzaya = new HashMap();
    private static final GmsLogger zzayb = new GmsLogger("ImageAnnotatorTask", "");
    private static final zzgn zzbgs = new zzgz();
    private static final zzhd zzbgt = zzhm.zzhg();
    /* access modifiers changed from: private */
    public String zzbgu;
    private final boolean zzbgv;
    private final GoogleApiClient zzbgw;
    private final zzjl zzbgx;
    private final String zzvq;

    public static synchronized zzqb zza(@NonNull FirebaseApp firebaseApp, boolean z, @Nullable GoogleApiClient googleApiClient) {
        zzqb zzqb;
        synchronized (zzqb.class) {
            zzqb = zzaya.get(firebaseApp);
            if (zzqb == null) {
                zzqb = new zzqb(firebaseApp, z, googleApiClient);
                zzaya.put(firebaseApp, zzqb);
            }
        }
        return zzqb;
    }

    public final zzpd zzmv() {
        return null;
    }

    private zzqb(FirebaseApp firebaseApp, boolean z, GoogleApiClient googleApiClient) {
        this.zzbgv = z;
        if (z) {
            this.zzbgw = googleApiClient;
            this.zzbgx = new zzqe(this);
        } else {
            this.zzbgw = null;
            this.zzbgx = new zzqd(this, zzd(firebaseApp), firebaseApp);
        }
        this.zzvq = String.format("FirebaseML_%s", new Object[]{firebaseApp.getName()});
    }

    private static String zzd(FirebaseApp firebaseApp) {
        Bundle bundle;
        String apiKey = firebaseApp.getOptions().getApiKey();
        Context applicationContext = firebaseApp.getApplicationContext();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return apiKey;
            }
            String string = bundle.getString("com.firebase.ml.cloud.ApiKeyForDebug");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            return apiKey;
        } catch (PackageManager.NameNotFoundException e) {
            GmsLogger gmsLogger = zzayb;
            String valueOf = String.valueOf(applicationContext.getPackageName());
            gmsLogger.e("ImageAnnotatorTask", valueOf.length() != 0 ? "No such package: ".concat(valueOf) : new String("No such package: "), e);
            return apiKey;
        }
    }

    /* access modifiers changed from: private */
    public static String zzc(Context context, String str) {
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, str);
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            GmsLogger gmsLogger = zzayb;
            String valueOf = String.valueOf(str);
            gmsLogger.e("ImageAnnotatorTask", valueOf.length() != 0 ? "Could not get fingerprint hash: ".concat(valueOf) : new String("Could not get fingerprint hash: "));
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            GmsLogger gmsLogger2 = zzayb;
            String valueOf2 = String.valueOf(str);
            gmsLogger2.e("ImageAnnotatorTask", valueOf2.length() != 0 ? "No such package: ".concat(valueOf2) : new String("No such package: "), e);
            return null;
        }
    }

    @WorkerThread
    private final String getSpatulaHeader() throws FirebaseMLException {
        if (!this.zzbgw.isConnected()) {
            this.zzbgw.blockingConnect(3, TimeUnit.SECONDS);
        }
        try {
            return AuthProxy.ProxyApi.getSpatulaHeader(this.zzbgw).await(3, TimeUnit.SECONDS).getSpatulaHeader();
        } catch (SecurityException unused) {
            return null;
        }
    }

    @WorkerThread
    public final zzjn zza(zzqa zzqa) throws FirebaseMLException {
        zzjq zzc = new zzjq().zzc(Collections.singletonList(new zzjo().zzb(zzqa.features).zza(new zzjz().zze(zzqa.zzbgq)).zza(zzqa.imageContext)));
        int i = 14;
        try {
            zzji zzhu = ((zzjh) new zzjh(zzbgs, zzbgt, new zzqf(this)).zzi(this.zzvq)).zza(this.zzbgx).zzhu();
            if (this.zzbgv) {
                String spatulaHeader = getSpatulaHeader();
                this.zzbgu = spatulaHeader;
                if (TextUtils.isEmpty(spatulaHeader)) {
                    zzayb.e("ImageAnnotatorTask", "Failed to contact Google Play services for certificate fingerprint matching. Please ensure you have latest Google Play services installed");
                    throw new FirebaseMLException("Failed to contact Google Play services for certificate fingerprint matching. Please ensure you have latest Google Play services installed", 14);
                }
            }
            List<zzjn> zzhy = ((zzjp) new zzjk(zzhu).zza(zzc).zzez()).zzhy();
            if (zzhy != null && !zzhy.isEmpty()) {
                return zzhy.get(0);
            }
            throw new FirebaseMLException("Empty response from cloud vision api.", 13);
        } catch (zzfi e) {
            GmsLogger gmsLogger = zzayb;
            String valueOf = String.valueOf(e.zzes());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("batchAnnotateImages call failed with error: ");
            sb.append(valueOf);
            gmsLogger.e("ImageAnnotatorTask", sb.toString());
            if (this.zzbgv) {
                Log.d("ImageAnnotatorTask", "If you are developing / testing on a simulator, either register your development app on Firebase console or turn off enforceCertFingerprintMatch()");
            }
            String message = e.getMessage();
            if (e.getStatusCode() != 400) {
                if (e.zzes() != null && e.zzes().zzep() != null) {
                    i = 13;
                    for (zzfg.zza reason : e.zzes().zzep()) {
                        String reason2 = reason.getReason();
                        if (reason2 != null) {
                            if (reason2.equals("rateLimitExceeded") || reason2.equals("dailyLimitExceeded") || reason2.equals("userRateLimitExceeded")) {
                                i = 8;
                                continue;
                            } else {
                                if (!reason2.equals("accessNotConfigured")) {
                                    if (reason2.equals("forbidden") || reason2.equals("inactiveBillingState")) {
                                        message = String.format("If you haven't set up billing, please go to Firebase console to set up billing: %s. If you are specifying a debug Api Key override and turned on Api Key restrictions, make sure the restrictions are set up correctly", new Object[]{"https://console.firebase.google.com/u/0/project/_/overview?purchaseBillingPlan=true"});
                                    }
                                }
                                i = 7;
                                continue;
                            }
                        }
                        if (i != 13) {
                            break;
                        }
                    }
                } else {
                    i = 13;
                }
            }
            throw new FirebaseMLException(message, i);
        } catch (IOException e2) {
            zzayb.e("ImageAnnotatorTask", "batchAnnotateImages call failed with exception: ", e2);
            throw new FirebaseMLException("Cloud Vision batchAnnotateImages call failure", 13, e2);
        }
    }
}
