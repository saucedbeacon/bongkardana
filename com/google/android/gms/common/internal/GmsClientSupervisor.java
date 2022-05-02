package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract class GmsClientSupervisor {
    private static int zza = 129;
    private static final Object zzb = new Object();
    private static GmsClientSupervisor zzc;

    /* access modifiers changed from: protected */
    public abstract boolean zza(zza zza2, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    public abstract void zzb(zza zza2, ServiceConnection serviceConnection, String str);

    protected static final class zza {
        private static final Uri zzf = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
        @Nullable
        private final String zza;
        @Nullable
        private final String zzb;
        @Nullable
        private final ComponentName zzc;
        private final int zzd;
        private final boolean zze;

        public zza(String str, int i) {
            this(str, "com.google.android.gms", i);
        }

        private zza(String str, String str2, int i) {
            this(str, str2, i, false);
        }

        public zza(String str, String str2, int i, boolean z) {
            this.zza = Preconditions.checkNotEmpty(str);
            this.zzb = Preconditions.checkNotEmpty(str2);
            this.zzc = null;
            this.zzd = i;
            this.zze = z;
        }

        public zza(ComponentName componentName, int i) {
            this.zza = null;
            this.zzb = null;
            this.zzc = (ComponentName) Preconditions.checkNotNull(componentName);
            this.zzd = i;
            this.zze = false;
        }

        public final String toString() {
            String str = this.zza;
            if (str != null) {
                return str;
            }
            Preconditions.checkNotNull(this.zzc);
            return this.zzc.flattenToString();
        }

        @Nullable
        public final String zza() {
            return this.zzb;
        }

        @Nullable
        public final ComponentName zzb() {
            return this.zzc;
        }

        public final int zzc() {
            return this.zzd;
        }

        public final Intent zza(Context context) {
            if (this.zza == null) {
                return new Intent().setComponent(this.zzc);
            }
            Intent zzb2 = this.zze ? zzb(context) : null;
            if (zzb2 == null) {
                return new Intent(this.zza).setPackage(this.zzb);
            }
            return zzb2;
        }

        @Nullable
        private final Intent zzb(Context context) {
            Bundle bundle;
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.zza);
            try {
                bundle = context.getContentResolver().call(zzf, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException unused) {
                bundle = null;
            }
            if (bundle == null) {
                return null;
            }
            return (Intent) bundle.getParcelable("serviceResponseIntentKey");
        }

        public final int hashCode() {
            return Objects.hashCode(this.zza, this.zzb, this.zzc, Integer.valueOf(this.zzd), Boolean.valueOf(this.zze));
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza2 = (zza) obj;
            return Objects.equal(this.zza, zza2.zza) && Objects.equal(this.zzb, zza2.zzb) && Objects.equal(this.zzc, zza2.zzc) && this.zzd == zza2.zzd && this.zze == zza2.zze;
        }
    }

    @KeepForSdk
    public static int getDefaultBindFlags() {
        return zza;
    }

    @KeepForSdk
    public static GmsClientSupervisor getInstance(Context context) {
        synchronized (zzb) {
            if (zzc == null) {
                zzc = new zzf(context.getApplicationContext());
            }
        }
        return zzc;
    }

    @KeepForSdk
    public boolean bindService(String str, ServiceConnection serviceConnection, String str2) {
        return zza(new zza(str, getDefaultBindFlags()), serviceConnection, str2);
    }

    @KeepForSdk
    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return zza(new zza(componentName, getDefaultBindFlags()), serviceConnection, str);
    }

    @KeepForSdk
    public void unbindService(String str, ServiceConnection serviceConnection, String str2) {
        zzb(new zza(str, getDefaultBindFlags()), serviceConnection, str2);
    }

    public final void zza(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        zzb(new zza(str, str2, i, z), serviceConnection, str3);
    }

    @KeepForSdk
    public void unbindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        zzb(new zza(componentName, getDefaultBindFlags()), serviceConnection, str);
    }
}
