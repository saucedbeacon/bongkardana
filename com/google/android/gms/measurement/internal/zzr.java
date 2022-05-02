package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.google.firebase.messaging.Constants;
import o.onEmbedViewParamChanged;

public final class zzr {
    private final zzfu zza;

    public zzr(zzfu zzfu) {
        this.zza = zzfu;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zza() {
        this.zza.zzav().zzg();
        if (zze()) {
            if (zzd()) {
                this.zza.zzd().zzp.zzb((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", IpcMessageConstants.EXTRA_INTENT);
                bundle.putLong("_cc", 1);
                this.zza.zzk().zzs("auto", "_cmpx", bundle);
            } else {
                String zza2 = this.zza.zzd().zzp.zza();
                if (TextUtils.isEmpty(zza2)) {
                    this.zza.zzau().zzc().zza("Cache still valid but referrer not found");
                } else {
                    long zza3 = ((this.zza.zzd().zzq.zza() / onEmbedViewParamChanged.HOUR_IN_MILLIS) - 1) * onEmbedViewParamChanged.HOUR_IN_MILLIS;
                    Uri parse = Uri.parse(zza2);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", zza3);
                    this.zza.zzk().zzs((String) pair.first, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, (Bundle) pair.second);
                }
                this.zza.zzd().zzp.zzb((String) null);
            }
            this.zza.zzd().zzq.zzb(0);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzb(String str, Bundle bundle) {
        String str2;
        this.zza.zzav().zzg();
        if (!this.zza.zzF()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.zza.zzd().zzp.zzb(str2);
                this.zza.zzd().zzq.zzb(this.zza.zzay().currentTimeMillis());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        if (zze() && zzd()) {
            this.zza.zzd().zzp.zzb((String) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzd() {
        if (zze() && this.zza.zzay().currentTimeMillis() - this.zza.zzd().zzq.zza() > this.zza.zzc().zzj((String) null, zzea.zzQ)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean zze() {
        return this.zza.zzd().zzq.zza() > 0;
    }
}
