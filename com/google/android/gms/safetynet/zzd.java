package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "HarmfulAppsInfoCreator")
@SafeParcelable.Reserved({1})
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();
    @SafeParcelable.Field(id = 2)
    public final long zzf;
    @SafeParcelable.Field(id = 3)
    public final HarmfulAppsData[] zzg;
    @SafeParcelable.Field(id = 4)
    public final int zzh;
    @SafeParcelable.Field(id = 5)
    private final boolean zzi;

    @SafeParcelable.Constructor
    public zzd(@SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) HarmfulAppsData[] harmfulAppsDataArr, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) boolean z) {
        this.zzf = j;
        this.zzg = harmfulAppsDataArr;
        this.zzi = z;
        if (z) {
            this.zzh = i;
        } else {
            this.zzh = -1;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, this.zzf);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.zzg, i, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
