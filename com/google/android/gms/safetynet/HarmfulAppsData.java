package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "HarmfulAppsDataCreator")
@SafeParcelable.Reserved({1})
public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HarmfulAppsData> CREATOR = new zzc();
    @SafeParcelable.Field(id = 4)
    public final int apkCategory;
    @SafeParcelable.Field(id = 2)
    public final String apkPackageName;
    @SafeParcelable.Field(id = 3)
    public final byte[] apkSha256;

    @SafeParcelable.Constructor
    public HarmfulAppsData(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) int i) {
        this.apkPackageName = str;
        this.apkSha256 = bArr;
        this.apkCategory = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.apkPackageName, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.apkSha256, false);
        SafeParcelWriter.writeInt(parcel, 4, this.apkCategory);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
