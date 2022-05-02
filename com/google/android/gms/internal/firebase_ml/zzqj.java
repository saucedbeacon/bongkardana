package com.google.android.gms.internal.firebase_ml;

import android.graphics.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ImageMetadataParcelCreator")
public final class zzqj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqj> CREATOR = new zzqm();
    @SafeParcelable.Field(id = 2)
    public final int height;
    @SafeParcelable.Field(id = 3)

    /* renamed from: id  reason: collision with root package name */
    private final int f10798id;
    @SafeParcelable.Field(id = 5)
    public final int rotation;
    @SafeParcelable.Field(id = 1)
    public final int width;
    @SafeParcelable.Field(id = 4)
    public final long zzbht;

    @SafeParcelable.Constructor
    public zzqj(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) long j, @SafeParcelable.Param(id = 5) int i4) {
        this.width = i;
        this.height = i2;
        this.f10798id = i3;
        this.zzbht = j;
        this.rotation = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.width);
        SafeParcelWriter.writeInt(parcel, 2, this.height);
        SafeParcelWriter.writeInt(parcel, 3, this.f10798id);
        SafeParcelWriter.writeLong(parcel, 4, this.zzbht);
        SafeParcelWriter.writeInt(parcel, 5, this.rotation);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final Matrix zzpg() {
        if (this.rotation == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate(((float) (-this.width)) / 2.0f, ((float) (-this.height)) / 2.0f);
        matrix.postRotate((float) (this.rotation * 90));
        boolean z = this.rotation % 2 != 0;
        matrix.postTranslate(((float) (z ? this.height : this.width)) / 2.0f, ((float) (z ? this.width : this.height)) / 2.0f);
        return matrix;
    }
}
