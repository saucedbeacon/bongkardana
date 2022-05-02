package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.firebase.messaging.Constants;

final class zzfc implements Runnable {
    final /* synthetic */ zzbr zza;
    final /* synthetic */ ServiceConnection zzb;
    final /* synthetic */ zzfd zzc;

    zzfc(zzfd zzfd, zzbr zzbr, ServiceConnection serviceConnection) {
        this.zzc = zzfd;
        this.zza = zzbr;
        this.zzb = serviceConnection;
    }

    public final void run() {
        String str;
        zzfd zzfd = this.zzc;
        zzfe zzfe = zzfd.zza;
        String zza2 = zzfd.zzb;
        zzbr zzbr = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        zzfe.zza.zzav().zzg();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", zza2);
        Bundle bundle2 = null;
        try {
            Bundle zzd = zzbr.zzd(bundle);
            if (zzd == null) {
                zzfe.zza.zzau().zzb().zza("Install Referrer Service returned a null response");
            } else {
                bundle2 = zzd;
            }
        } catch (Exception e) {
            zzfe.zza.zzau().zzb().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        zzfe.zza.zzav().zzg();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                zzfe.zza.zzau().zze().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzfe.zza.zzau().zzb().zza("No referrer defined in Install Referrer response");
                } else {
                    zzfe.zza.zzau().zzk().zzb("InstallReferrer API result", string);
                    zzku zzl = zzfe.zza.zzl();
                    if (string.length() != 0) {
                        str = "?".concat(string);
                    } else {
                        str = new String("?");
                    }
                    Bundle zzi = zzl.zzi(Uri.parse(str));
                    if (zzi == null) {
                        zzfe.zza.zzau().zzb().zza("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = zzi.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                zzfe.zza.zzau().zzb().zza("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                zzi.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == zzfe.zza.zzd().zzd.zza()) {
                            zzfe.zza.zzau().zzk().zza("Install Referrer campaign has already been logged");
                        } else if (zzfe.zza.zzF()) {
                            zzfe.zza.zzd().zzd.zzb(j);
                            zzfe.zza.zzau().zzk().zzb("Logging Install Referrer campaign from sdk with ", "referrer API");
                            zzi.putString("_cis", "referrer API");
                            zzfe.zza.zzk().zzs("auto", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zzi);
                        }
                    }
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzfe.zza.zzax(), serviceConnection);
    }
}
