package com.google.firebase.ml.vision.automl.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ImageLabelParcelCreator")
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzg();
    @SafeParcelable.Field(id = 2)
    public final String text;
    @SafeParcelable.Field(id = 1)
    public final String zzbfj;
    @SafeParcelable.Field(id = 3)
    public final float zzbfk;

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) float f) {
        this.zzbfj = str;
        this.text = str2;
        this.zzbfk = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzbfj, false);
        SafeParcelWriter.writeString(parcel, 2, this.text, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.zzbfk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzh = (zzh) obj;
        return Objects.equal(this.zzbfj, zzh.zzbfj) && Objects.equal(this.text, zzh.text) && Float.compare(this.zzbfk, zzh.zzbfk) == 0;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzbfj, this.text, Float.valueOf(this.zzbfk));
    }
}
