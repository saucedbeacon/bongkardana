package com.google.firebase.ml.vision.barcode.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BarcodeDetectorOptionsParcelCreator")
public class BarcodeDetectorOptionsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BarcodeDetectorOptionsParcel> CREATOR = new zza();
    @SafeParcelable.Field(id = 1)
    public final int zzbgb;

    @SafeParcelable.Constructor
    public BarcodeDetectorOptionsParcel(@SafeParcelable.Param(id = 1) int i) {
        this.zzbgb = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzbgb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
