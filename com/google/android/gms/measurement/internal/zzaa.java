package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
public final class zzaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaa> CREATOR = new zzab();
    @SafeParcelable.Field(id = 2)
    @Nullable
    public String zza;
    @SafeParcelable.Field(id = 3)
    public String zzb;
    @SafeParcelable.Field(id = 4)
    public zzkq zzc;
    @SafeParcelable.Field(id = 5)
    public long zzd;
    @SafeParcelable.Field(id = 6)
    public boolean zze;
    @SafeParcelable.Field(id = 7)
    @Nullable
    public String zzf;
    @SafeParcelable.Field(id = 8)
    @Nullable
    public final zzas zzg;
    @SafeParcelable.Field(id = 9)
    public long zzh;
    @SafeParcelable.Field(id = 10)
    @Nullable
    public zzas zzi;
    @SafeParcelable.Field(id = 11)
    public final long zzj;
    @SafeParcelable.Field(id = 12)
    @Nullable
    public final zzas zzk;

    zzaa(zzaa zzaa) {
        Preconditions.checkNotNull(zzaa);
        this.zza = zzaa.zza;
        this.zzb = zzaa.zzb;
        this.zzc = zzaa.zzc;
        this.zzd = zzaa.zzd;
        this.zze = zzaa.zze;
        this.zzf = zzaa.zzf;
        this.zzg = zzaa.zzg;
        this.zzh = zzaa.zzh;
        this.zzi = zzaa.zzi;
        this.zzj = zzaa.zzj;
        this.zzk = zzaa.zzk;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzaa(@SafeParcelable.Param(id = 2) @Nullable String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zzkq zzkq, @SafeParcelable.Param(id = 5) long j, @SafeParcelable.Param(id = 6) boolean z, @SafeParcelable.Param(id = 7) @Nullable String str3, @SafeParcelable.Param(id = 8) @Nullable zzas zzas, @SafeParcelable.Param(id = 9) long j2, @SafeParcelable.Param(id = 10) @Nullable zzas zzas2, @SafeParcelable.Param(id = 11) long j3, @SafeParcelable.Param(id = 12) @Nullable zzas zzas3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzkq;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzas;
        this.zzh = j2;
        this.zzi = zzas2;
        this.zzj = j3;
        this.zzk = zzas3;
    }
}
