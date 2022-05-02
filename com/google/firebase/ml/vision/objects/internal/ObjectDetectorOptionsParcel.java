package com.google.firebase.ml.vision.objects.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ObjectDetectorOptionsParcelCreator")
public class ObjectDetectorOptionsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ObjectDetectorOptionsParcel> CREATOR = new zzf();
    @SafeParcelable.Field(id = 1)
    public final int zzbjr;
    @SafeParcelable.Field(id = 2)
    public final boolean zzbjs;
    @SafeParcelable.Field(id = 3)
    public final boolean zzbjt;

    @SafeParcelable.Constructor
    public ObjectDetectorOptionsParcel(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2) {
        this.zzbjr = i;
        this.zzbjs = z;
        this.zzbjt = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzbjr);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzbjs);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzbjt);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
