package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;

final class zza extends AsyncTask<Void, Void, Integer> {
    private final /* synthetic */ Context zza;
    private final /* synthetic */ ProviderInstaller.ProviderInstallListener zzb;

    zza(Context context, ProviderInstaller.ProviderInstallListener providerInstallListener) {
        this.zza = context;
        this.zzb = providerInstallListener;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final Integer doInBackground(Void... voidArr) {
        try {
            ProviderInstaller.installIfNeeded(this.zza);
            return 0;
        } catch (GooglePlayServicesRepairableException e) {
            return Integer.valueOf(e.getConnectionStatusCode());
        } catch (GooglePlayServicesNotAvailableException e2) {
            return Integer.valueOf(e2.errorCode);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.zzb.onProviderInstalled();
            return;
        }
        this.zzb.onProviderInstallFailed(num.intValue(), ProviderInstaller.zza.getErrorResolutionIntent(this.zza, num.intValue(), "pi"));
    }
}
