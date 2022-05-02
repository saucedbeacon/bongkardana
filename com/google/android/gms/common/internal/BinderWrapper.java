package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
@KeepForSdk
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new zza();
    private IBinder zza;

    public BinderWrapper() {
        this.zza = null;
    }

    public final int describeContents() {
        return 0;
    }

    @KeepForSdk
    public BinderWrapper(IBinder iBinder) {
        this.zza = null;
        this.zza = iBinder;
    }

    private BinderWrapper(Parcel parcel) {
        this.zza = null;
        this.zza = parcel.readStrongBinder();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.zza);
    }

    /* synthetic */ BinderWrapper(Parcel parcel, zza zza2) {
        this(parcel);
    }
}
